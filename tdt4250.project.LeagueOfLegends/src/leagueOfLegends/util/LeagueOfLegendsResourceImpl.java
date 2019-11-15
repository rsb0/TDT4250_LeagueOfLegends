/**
 */
package leagueOfLegends.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import leagueOfLegends.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * <!-- begin-user-doc --> The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see leagueOfLegends.util.LeagueOfLegendsResourceFactoryImpl
 * @generated
 */
public class LeagueOfLegendsResourceImpl extends XMIResourceImpl {
	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated
	 */
	public LeagueOfLegendsResourceImpl(URI uri) {
		super(uri);
	}

	public static void main(String[] args) throws IOException {
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("LeagueOfLegends",
				new LeagueOfLegendsResourceFactoryImpl());
		Resource leagueResource = resSet.createResource(URI.createURI("assets\\league.LeagueOfLegends"));

		// Create all model EClass instances needed (League, teams etc)

		League league = LeagueOfLegendsCreationUtils.createLeague();
		leagueResource.getContents().add(league);

		int autoIncrementorMatchId = 0;

		Map<String, Game> games = new HashMap<String, Game>();
		Map<String, Team> teams = new HashMap<String, Team>();
		Map<String, Season> seasons = new HashMap<String, Season>();
		Map<String, Match> matches = new HashMap<String, Match>();
		Map<String, Champion> champions = new HashMap<String, Champion>();

		// Season season = LeagueOfLegendsCreationUtils.createSeason(splitName)

		// Loop over csv content, and put it into correct instances

		String rowString;
		BufferedReader csvReader;
		try {
			csvReader = new BufferedReader(new FileReader("assets\\EULCS-2018_split_2.csv"));
			boolean hasReadFirstLine = false;
			while ((rowString = csvReader.readLine()) != null) {
				if (!hasReadFirstLine) {
					hasReadFirstLine = true;
					continue;
				}
				String[] rowData = rowString.split("\n");
				for (String row : rowData) {
					String[] cellData = row.split(",");

					// Handle season
					String split = cellData[2];
					boolean invalidConversionOfSplit = split.matches("\\d{2}\\/\\d{2}\\/\\d{4}");
					if (invalidConversionOfSplit) {
						split = cellData[2].substring(6) + "-" + cellData[2].substring(1, 2);
					}

					// set split type
					int splitType = 0;
					if (split.substring(split.length() - 1).equals("p")) {
						splitType = 1;
					} else if (split.substring(split.length() - 1).equals("q")) {
						splitType = 2;
					}

					if (!seasons.containsKey(split)) {
						seasons.put(split, LeagueOfLegendsCreationUtils.createSeason(split, league, splitType));
					}

					// Handle Champions
					String champion = cellData[11];
					if (!champions.containsKey(champion)) {
						champions.put(champion, LeagueOfLegendsCreationUtils.createChampion(champion));
						league.getChampions().add(champions.get(champion));
					}

					// Handle game
					if (!games.containsKey(cellData[0])) {
						games.put(cellData[0], LeagueOfLegendsCreationUtils.createGame(cellData[0]));
					}
					Game game = games.get(cellData[0]);
					
					// Handle teams

					if (!teams.containsKey(cellData[10])) {
						teams.put(cellData[10], LeagueOfLegendsCreationUtils.createTeam(cellData[10], league));
					}

					Team team = teams.get(cellData[10]);
					if (cellData[7].equals("Blue")) {
						game.setBlueTeam(teams.get(cellData[10]));
					} else {
						game.setRedTeam(teams.get(cellData[10]));
					}

					// Handle player
					if(!cellData[9].equals("Team")) {
						
						Optional<Player> result = team.getPlayer().stream().filter(x -> x.getName().equals(cellData[9]))
								.findAny();
						
						Player player;
						
						if (!result.isPresent()) {
							player = LeagueOfLegendsCreationUtils.createPlayer(cellData[9]);
							team.getPlayer().add(player);
						}
						else {
							player = result.get();
						}
						player.getChampionPool().add(champions.get(champion));
						
						//Handle Game Player statistics
						int cellDataIndex = 19;
						GamePlayerStats gamePlayerStats = LeagueOfLegendsCreationUtils.createGamePlayerStats(player, champions.get(champion), Integer.parseInt(cellData[cellDataIndex]), Integer.parseInt(cellData[cellDataIndex + 1]), Integer.parseInt(cellData[cellDataIndex + 2]), Integer.parseInt(cellData[cellDataIndex + 18]), Integer.parseInt(cellData[cellDataIndex + 20]), Integer.parseInt(cellData[cellDataIndex + 22]), Integer.parseInt(cellData[cellDataIndex + 23]),Integer.parseInt(cellData[cellDataIndex + 25]),Integer.parseInt(cellData[cellDataIndex + 26]));
						game.getGamePlayerStats().add(gamePlayerStats);
					}

					// Handle matches

					// Loop through matches, looking for game with same gameID
					boolean foundGame = false;
					for (Match match : matches.values()) {
						for (Game oldGame : match.getGames()) {
							if (oldGame.getGameID().equals(game.getGameID())) {
								if (oldGame.getBlueTeam() == null && cellData[7].equals("Blue")) {
									oldGame.setBlueTeam(game.getBlueTeam());
								} else if (oldGame.getRedTeam() == null && cellData[7].equals("Red")) {
									oldGame.setRedTeam(game.getRedTeam());
								}

								foundGame = true;
								break;

							}
						}
						if (foundGame) {
							break;
						}
					}

					// See if there is a match, that contains teams, and is same week,
					// and bestOf < match.games().length

					if (!foundGame) {
						for (Match match : matches.values()) {
							for (Game oldGame : match.getGames()) {
								if ((match.getGames().size() < match.getBestOF().getValue()) && match.getWeek() != null && match.getWeek().equals(cellData[4])) {
									if (oldGame.getBlueTeam() == game.getBlueTeam() || oldGame.getBlueTeam() == game.getRedTeam() 
											|| oldGame.getRedTeam() == game.getRedTeam() || oldGame.getRedTeam() == game.getBlueTeam()) {
										match.getGames().add(game);
										foundGame = true;
										break;
									}
								}
							}
							if (foundGame) {
								break;
							}
						}

					}

					// if not foundGame, game

					if (!foundGame) {
						String matchID = "" + ++autoIncrementorMatchId;
						matches.put(matchID, LeagueOfLegendsCreationUtils.createMatch(matchID, cellData[4]));
						matches.get(matchID).getGames().add(game);
						seasons.get(split).getMatches().add(matches.get(matchID));
					}
				}
			}
			csvReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Handle gameTeamStats
		
		for (Season season: league.getSeasons()) {
			for(Match match: season.getMatches()) {
				for(Game game: match.getGames()) {
					GameTeamStats gameTeamStatsRed;
					Team redTeam = game.getRedTeam();
					System.out.println(redTeam.getName());
					int redTeamKills = game.getGamePlayerStats().stream().filter(gamePlayerStats -> gamePlayerStats.getPlayer().getTeam() == game.getRedTeam()).map(gamePlayerStats -> gamePlayerStats.getKills()).reduce((0), (subtotal, increment)-> subtotal += increment);
					System.out.println();
					int redTeamDeaths = game.getGamePlayerStats().stream().filter(gamePlayerStats -> gamePlayerStats.getPlayer().getTeam() == game.getRedTeam()).map(gamePlayerStats -> gamePlayerStats.getDeaths()).reduce((0), (subtotal, increment)-> subtotal += increment);
					int redTeamAssists = game.getGamePlayerStats().stream().filter(gamePlayerStats -> gamePlayerStats.getPlayer().getTeam() == game.getRedTeam()).map(gamePlayerStats -> gamePlayerStats.getAssist()).reduce((0), (subtotal, increment)-> subtotal += increment);
					int redTeamWards = game.getGamePlayerStats().stream().filter(gamePlayerStats -> gamePlayerStats.getPlayer().getTeam() == game.getRedTeam()).map(gamePlayerStats -> gamePlayerStats.getWards()).reduce((0), (subtotal, increment)-> subtotal += increment);
					int redTeamVisionWards = game.getGamePlayerStats().stream().filter(gamePlayerStats -> gamePlayerStats.getPlayer().getTeam() == game.getRedTeam()).map(gamePlayerStats -> gamePlayerStats.getVisionWards()).reduce((0), (subtotal, increment)-> subtotal += increment);
					int redTeamWardsKilled = game.getGamePlayerStats().stream().filter(gamePlayerStats -> gamePlayerStats.getPlayer().getTeam() == game.getRedTeam()).map(gamePlayerStats -> gamePlayerStats.getWardsKilled()).reduce((0), (subtotal, increment)-> subtotal += increment);
					int redTeamGold = game.getGamePlayerStats().stream().filter(gamePlayerStats -> gamePlayerStats.getPlayer().getTeam() == game.getRedTeam()).map(gamePlayerStats -> gamePlayerStats.getGolds()).reduce((0), (subtotal, increment)-> subtotal += increment);
					int redTeamMinionKills = game.getGamePlayerStats().stream().filter(gamePlayerStats -> gamePlayerStats.getPlayer().getTeam() == game.getRedTeam()).map(gamePlayerStats -> gamePlayerStats.getMinionKills()).reduce((0), (subtotal, increment)-> subtotal += increment);
					int redTeamMonsterKills = game.getGamePlayerStats().stream().filter(gamePlayerStats -> gamePlayerStats.getPlayer().getTeam() == game.getRedTeam()).map(gamePlayerStats -> gamePlayerStats.getMonsterKills()).reduce((0), (subtotal, increment)-> subtotal += increment);
					
					gameTeamStatsRed = LeagueOfLegendsCreationUtils.createGameTeamStats(redTeam, redTeamKills, redTeamDeaths, redTeamAssists, redTeamWards, redTeamVisionWards, redTeamWardsKilled, redTeamGold, redTeamMinionKills, redTeamMonsterKills);
					
					GameTeamStats gameTeamStatsBlue;
					Team blueTeam = game.getBlueTeam();
					int blueTeamKills = game.getGamePlayerStats().stream().filter(gamePlayerStats -> gamePlayerStats.getPlayer().getTeam() == game.getBlueTeam()).map(gamePlayerStats -> gamePlayerStats.getKills()).reduce((0), (subtotal, increment)-> subtotal += increment);
					int blueTeamDeaths = game.getGamePlayerStats().stream().filter(gamePlayerStats -> gamePlayerStats.getPlayer().getTeam() == game.getBlueTeam()).map(gamePlayerStats -> gamePlayerStats.getDeaths()).reduce((0), (subtotal, increment)-> subtotal += increment);
					int blueTeamAssists = game.getGamePlayerStats().stream().filter(gamePlayerStats -> gamePlayerStats.getPlayer().getTeam() == game.getBlueTeam()).map(gamePlayerStats -> gamePlayerStats.getAssist()).reduce((0), (subtotal, increment)-> subtotal += increment);
					int blueTeamWards = game.getGamePlayerStats().stream().filter(gamePlayerStats -> gamePlayerStats.getPlayer().getTeam() == game.getBlueTeam()).map(gamePlayerStats -> gamePlayerStats.getWards()).reduce((0), (subtotal, increment)-> subtotal += increment);
					int blueTeamVisionWards = game.getGamePlayerStats().stream().filter(gamePlayerStats -> gamePlayerStats.getPlayer().getTeam() == game.getBlueTeam()).map(gamePlayerStats -> gamePlayerStats.getVisionWards()).reduce((0), (subtotal, increment)-> subtotal += increment);
					int blueTeamWardsKilled = game.getGamePlayerStats().stream().filter(gamePlayerStats -> gamePlayerStats.getPlayer().getTeam() == game.getBlueTeam()).map(gamePlayerStats -> gamePlayerStats.getWardsKilled()).reduce((0), (subtotal, increment)-> subtotal += increment);
					int blueTeamGold = game.getGamePlayerStats().stream().filter(gamePlayerStats -> gamePlayerStats.getPlayer().getTeam() == game.getBlueTeam()).map(gamePlayerStats -> gamePlayerStats.getGolds()).reduce((0), (subtotal, increment)-> subtotal += increment);
					int blueTeamMinionKills = game.getGamePlayerStats().stream().filter(gamePlayerStats -> gamePlayerStats.getPlayer().getTeam() == game.getBlueTeam()).map(gamePlayerStats -> gamePlayerStats.getMinionKills()).reduce((0), (subtotal, increment)-> subtotal += increment);
					int blueTeamMonsterKills = game.getGamePlayerStats().stream().filter(gamePlayerStats -> gamePlayerStats.getPlayer().getTeam() == game.getBlueTeam()).map(gamePlayerStats -> gamePlayerStats.getMonsterKills()).reduce((0), (subtotal, increment)-> subtotal += increment);
					
					gameTeamStatsBlue = LeagueOfLegendsCreationUtils.createGameTeamStats(blueTeam, blueTeamKills, blueTeamDeaths, blueTeamAssists, blueTeamWards, blueTeamVisionWards, blueTeamWardsKilled, blueTeamGold, blueTeamMinionKills, blueTeamMonsterKills);
					
					game.getGameTeamStat().add(gameTeamStatsRed);
					game.getGameTeamStat().add(gameTeamStatsBlue);
					
					
					GameStats gameStats = LeagueOfLegendsCreationUtils.createGameStats(game, redTeamKills + blueTeamKills, redTeamDeaths + blueTeamDeaths, redTeamAssists + blueTeamAssists, redTeamWards + blueTeamWards, redTeamVisionWards + blueTeamVisionWards, redTeamWardsKilled + blueTeamWardsKilled, redTeamGold + blueTeamGold, redTeamMinionKills + blueTeamMinionKills, redTeamMonsterKills + blueTeamMonsterKills);
					game.setGameStats(gameStats);
				}
			}
		}

		try {
			File file = new File("assets\\league.xmi");
			FileOutputStream fop = new FileOutputStream(file);
			if (!file.exists()) {
				file.createNewFile();
			}
			leagueResource.save(fop, null);
			fop.flush();
			fop.close();

		} catch (Exception e) {
			System.out.println("Encountered error: " + e);
		}

	}

} // LeagueOfLegendsResourceImpl
