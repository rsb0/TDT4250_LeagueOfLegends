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
						
						if (!result.isPresent()) {
							Player player = LeagueOfLegendsCreationUtils.createPlayer(cellData[9]);
							player.getChampionPool().add(champions.get(champion));
							team.getPlayer().add(player);
						}
						else {
							result.get().getChampionPool().add(champions.get(champion));
						}
						
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
