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

	/**
	 * @param args
	 * @throws IOException
	 */
	/**
	 * @param args
	 * @throws IOException
	 */
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
		Map<Game, GameStats> gameStatistics = new HashMap<Game, GameStats>();
		Map<Team, TeamStats> teamStatistics = new HashMap<Team, TeamStats>();

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
					/** If current row contains stats for the whole game (celldata[6] > 10) 
					*&& If any of the banned champions in this game (cols 12-16) has not been created yet: create it
					*/
					if (Integer.parseInt(cellData[6]) > 10) {
						for (int i = 12 ; i < 17 ; i++) {
							if (!champions.containsKey(cellData[i])) {
								champions.put(cellData[i], LeagueOfLegendsCreationUtils.createChampion(cellData[i]));
								champions.get(cellData[i]).setChampionStat(LeagueOfLegendsCreationUtils.createChampionsStats());
								league.getChampions().add(champions.get(cellData[i]));
							}
							/**
							 * Handle number of bans for champions
							 */
							champions.get(cellData[i]).getChampionStat().setBans(champions.get(cellData[i]).getChampionStat().getBans() + 1);
						}
					}
					
					Champion champion;
					
					/**
					 * If champion played by player in current row has not yet been created: create it
					 */
					if (!champions.containsKey(cellData[11])) {
						champion = LeagueOfLegendsCreationUtils.createChampion(cellData[11]);
						champions.put(cellData[11], champion);
						ChampionsStats championsStats = LeagueOfLegendsCreationUtils.createChampionsStats();
						champion.setChampionStat(championsStats);
						league.getChampions().add(champion);
					}
					else {
						champion = champions.get(cellData[11]);						
					}
					
					
					/**
					 * Handle remaining champion statistics
					 */
					champion.getChampionStat().setGamesPlayed(champion.getChampionStat().getGamesPlayed() + 1);
					champion.getChampionStat().setWins(champion.getChampionStat().getWins() + Integer.parseInt(cellData[18]));
					champion.getChampionStat().setTotalKills(champion.getChampionStat().getTotalKills() + Integer.parseInt(cellData[19]));
					champion.getChampionStat().setTotalDeaths(champion.getChampionStat().getTotalDeaths()+ Integer.parseInt(cellData[20]));
					champion.getChampionStat().setTotalAssist(champion.getChampionStat().getTotalAssist() + Integer.parseInt(cellData[21]));
					
					
					
					// Handle game
					if (!games.containsKey(cellData[0])) {
						Side winner;
						if(Integer.parseInt(cellData[18]) == 1) {
							winner = Side.get(cellData[7].toLowerCase());
							if (cellData[4].equals("R2")) {
								System.out.println(winner + "   " + cellData[10] + "   " + cellData[7] + "   " + cellData[0]);
							}
						}
						else {
							winner = Side.get((Side.get(cellData[7].toLowerCase()).getValue() + 1) % 2);
							if (cellData[4].equals("R2")) {								
								System.out.println(winner + "   " + cellData[10] + "   " + cellData[7] + "   " + cellData[0]);
							}
						}
						games.put(cellData[0], LeagueOfLegendsCreationUtils.createGame(cellData[0], winner));
					}
					Game game = games.get(cellData[0]);
					
					// Handle gameStats 
					// Create gameStats object and populate with only game duration for now. 
					// Remaining game statistics is populated outside of the loop reading from the csv file 
					if(!gameStatistics.containsKey(game)) {
						GameStats gameStats = LeagueOfLegendsCreationUtils.createGameStats(game, Float.parseFloat(cellData[17]));
						gameStatistics.put(game, gameStats);
						game.setGameStats(gameStats);
					}
					
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
					
					
					// Handle TeamStats
					if (Integer.parseInt(cellData[6]) >= 100) {
						// If teamStats has not yet been added for this team, add it to team
						if (!teamStatistics.containsKey(team)) {
							teamStatistics.put(team, LeagueOfLegendsCreationUtils.createTeamStats(team));
						}
						// Create TeamStats and populate with data that can be collected directly from current row
						TeamStats teamStats = teamStatistics.get(team);
						teamStats.setGamesPlayed(teamStats.getGamesPlayed() + 1);
						teamStats.setKills(teamStats.getKills() + Integer.parseInt(cellData[19]));
						teamStats.setDeaths(teamStats.getDeaths() + Integer.parseInt(cellData[20]));
						teamStats.setAssists(teamStats.getAssists() + Integer.parseInt(cellData[21]));
						if (cellData[18].trim().equals("1")) {
							teamStats.setGameWins(teamStats.getGameWins() + 1);
						}
					}

					// Handle player
					if(!cellData[9].equals("Team")) {
						
						Optional<Player> result = team.getPlayer().stream().filter(x -> x.getName().equals(cellData[9]))
								.findAny();
						
						Player player;
						
						if (!result.isPresent()) {
							// Create player
							player = LeagueOfLegendsCreationUtils.createPlayer(cellData[9], cellData[8]);
							// Create PlayerStats for player
							PlayerStats playerStats = LeagueOfLegendsCreationUtils.createPlayerStats();
							// Add playerstats to player
							player.setPlayerStats(playerStats);
							// add player to team
							team.getPlayer().add(player);
						}
						else {
							player = result.get();
						}
						player.getChampionPool().add(champion);
						
						//handle player statistics
						player.getPlayerStats().setGamesPlayed(player.getPlayerStats().getGamesPlayed() + 1);
						player.getPlayerStats().setCareerGameWins(player.getPlayerStats().getCareerGameWins() + Integer.parseInt(cellData[18]));
						player.getPlayerStats().setCareerKills(player.getPlayerStats().getCareerKills() + Integer.parseInt(cellData[19]));
						player.getPlayerStats().setCareerDeaths(player.getPlayerStats().getCareerDeaths() + Integer.parseInt(cellData[20]));
						player.getPlayerStats().setCareerAssist(player.getPlayerStats().getCareerAssist() + Integer.parseInt(cellData[21]));
						
						//Handle Game Player statistics
						int cellDataIndex = 19;
						GamePlayerStats gamePlayerStats = LeagueOfLegendsCreationUtils.createGamePlayerStats(player, champion, Integer.parseInt(cellData[cellDataIndex]), Integer.parseInt(cellData[cellDataIndex + 1]), Integer.parseInt(cellData[cellDataIndex + 2]), Integer.parseInt(cellData[cellDataIndex + 18]), Integer.parseInt(cellData[cellDataIndex + 20]), Integer.parseInt(cellData[cellDataIndex + 22]), Integer.parseInt(cellData[cellDataIndex + 23]),Integer.parseInt(cellData[cellDataIndex + 25]),Integer.parseInt(cellData[cellDataIndex + 26]));
						game.getGamePlayerStats().add(gamePlayerStats);
					}

					// Handle matches
					
					// Loop through matches, looking for game with same gameID
					// Adds opposing team to already existing games with only one team registered
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
					// Adds a new game to an existing match

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

					// If not foundGame, game
					// Creates a new match and adds one game to that match

					if (!foundGame) {
						String matchID = "" + ++autoIncrementorMatchId;
						matches.put(matchID, LeagueOfLegendsCreationUtils.createMatch(matchID, cellData[4]));
						matches.get(matchID).setDisplayName(matchID + " | " + cellData[4]);
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
		
		//Handle gameTeamStats and gameStats
		
		for (Season season: league.getSeasons()) {
			for(Match match: season.getMatches()) {
				for(Game game: match.getGames()) {
					GameTeamStats gameTeamStatsRed;
					Team redTeam = game.getRedTeam();
					int redTeamKills = game.getGamePlayerStats().stream().filter(gamePlayerStats -> gamePlayerStats.getPlayer().getTeam() == game.getRedTeam()).map(gamePlayerStats -> gamePlayerStats.getKills()).reduce((0), (subtotal, increment)-> subtotal += increment);
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

					// Handle gameStats
					// Populate remaining game statistics for each game
					game.getGameStats().setTotalKills(redTeamKills + blueTeamKills);
					game.getGameStats().setTotalDeaths(redTeamDeaths + blueTeamDeaths);
					game.getGameStats().setTotalAssist(redTeamAssists + blueTeamAssists);
					game.getGameStats().setTotalWards(redTeamWards + blueTeamWards);
					game.getGameStats().setTotalVisionWards(redTeamVisionWards + blueTeamVisionWards);
					game.getGameStats().setTotalWardsKilled(redTeamWardsKilled + blueTeamWardsKilled);
					game.getGameStats().setTotalGolds(redTeamGold + blueTeamGold);
					game.getGameStats().setTotalMinionKills(redTeamMinionKills + blueTeamMinionKills);
					game.getGameStats().setTotalMonsterKills(redTeamMonsterKills + blueTeamMonsterKills);
					game.getGameStats().setWinner(game.getWinningSide());
					
				}
			}
		}
		
		// Update ChampionsStats with kill-Death-Assist-Ratio ((#kills + #assists) / #deaths) and winLoseRatio (#wins / #losses)
		for (Champion champion : league.getChampions()) {
				float wins = champion.getChampionStat().getWins();
				float losses = champion.getChampionStat().getGamesPlayed() - champion.getChampionStat().getWins();
				float kills = champion.getChampionStat().getTotalKills();
				float assists = champion.getChampionStat().getTotalAssist();
				float deaths = champion.getChampionStat().getTotalDeaths();
				champion.getChampionStat().setWinLoseRatio(wins / losses);
				champion.getChampionStat().setKillDeathAssistRatio((kills + assists) / deaths); 
		}
		
		// Update PlayerStats with kill-Death-Assist-Ratio ((#kills + #assists) / #deaths) and winLoseRatio (#wins / #losses)
		for (Team team : league.getTeams()) {
			for (Player player : team.getPlayer()) {
				float wins = player.getPlayerStats().getCareerGameWins();
				float losses = player.getPlayerStats().getGamesPlayed() - player.getPlayerStats().getCareerGameWins();
				float kills = player.getPlayerStats().getCareerKills();
				float assists = player.getPlayerStats().getCareerAssist();
				float deaths = player.getPlayerStats().getCareerDeaths();
				player.getPlayerStats().setWinLoseRatio(wins / losses);
				player.getPlayerStats().setKillDeathAssistRatio((kills + assists) / deaths); 
			}
		}
		

				
		
		// Update game and match with winning team, PlayerStats with careerGameWins,carrerMatchWins, and match displayName with team names
		for (Match match : matches.values()) {
			match.getTeams().add(match.getGames().get(0).getRedTeam());
			match.getTeams().add(match.getGames().get(0).getBlueTeam());
			Team teamOne = match.getGames().get(0).getBlueTeam();
			Team teamTwo = match.getGames().get(0).getRedTeam();
			int teamOneWins = 0;
			int teamTwoWins = 0;
			for (Game game : match.getGames()) {
				Team gameWinner;
				if (game.getWinningSide() == Side.BLUE) {
					gameWinner = game.getBlueTeam();
				}
				else {
					gameWinner = game.getRedTeam();
				}
				game.setWinningTeam(gameWinner);
				if (gameWinner == teamOne) {
					teamOneWins++;
				}
				else {
					teamTwoWins++;
				}
			}
			Team matchWinner = (teamOneWins > teamTwoWins) ? teamOne : teamTwo;
			match.setWinner(matchWinner);
			match.setDisplayName(match.getDisplayName() + " | " + match.getGames().get(0).getRedTeam().getName() + 
					"   vs.   " + match.getGames().get(0).getBlueTeam().getName());
			for (Player player : matchWinner.getPlayer()) {
				player.getPlayerStats().setCareerMatchWins(player.getPlayerStats().getCareerMatchWins() + 1);
			}
		}
		
		// Update teamStats with data that was not added upon instantiation
		for (Team team : teams.values()) {
			TeamStats teamStat = team.getTeamStats();
			teamStat.setKillDeathAssistRatio((teamStat.getKills() + teamStat.getAssists()) / teamStat.getDeaths());
			teamStat.setWinLoseRatio((float)teamStat.getGameWins() / ((float)teamStat.getGamesPlayed() - (float)teamStat.getGameWins()));
			// Set team tournament wins, seconds and third places
			// Set match wins
			for (Match match : matches.values()) {
				if (match.getTeams().contains(team)) {
					if (match.getWinner() == team) {
						teamStat.setMatchWins(teamStat.getMatchWins() + 1);
					}
					
					if (match.getWeek().trim().equals("F")) {
						if (match.getWinner() == team) {
							teamStat.setTournamentWins(teamStat.getTournamentWins() + 1);
						} else  {
							teamStat.setTournamentSecondPlaces(teamStat.getTournamentSecondPlaces() + 1);
						}
					}
					
					if (match.getWeek().trim().equals("3p") && match.getWinner() == team) {
						teamStat.setTournamentThridPlaces(teamStat.getTournamentThridPlaces() + 1);
					}
				}
			}
			
			// Set team player with most kills, deaths, assisssts and highest KDA
			int mostKills = 0;
			int mostDeaths = 0;
			int mostAssists = 0;
			float highestKDA = 0;
			for (Player player : team.getPlayer()) {
				int kills = player.getPlayerStats().getCareerKills();
				int deaths = player.getPlayerStats().getCareerDeaths();
				int assists = player.getPlayerStats().getCareerAssist();
				float kda = player.getPlayerStats().getKillDeathAssistRatio();
				if (kills > mostKills) {
					teamStat.setPlayerWithMostKills(player);
					mostKills = kills;
				}
				if (deaths > mostDeaths) {
					teamStat.setPlayerWithMostDeaths(player);
					mostDeaths = deaths;
				}
				if (assists > mostAssists) {
					teamStat.setPlayerWithMostAssists(player);
					mostAssists = assists;
				}
				if (kda > highestKDA) {
					teamStat.setPlayerWithHighestKda(player);
					highestKDA = kda;
				}
			}
		}
		
		//Set league Stats
		
		int leagueKills = league.getTeams().stream().map(team -> team.getTeamStats().getKills()).reduce((0), (subtotal, increment)-> subtotal += increment);
		int leagueAssists = league.getTeams().stream().map(team -> team.getTeamStats().getDeaths()).reduce((0), (subtotal, increment)-> subtotal += increment);
		int leagueDeaths = league.getTeams().stream().map(team -> team.getTeamStats().getAssists()).reduce((0), (subtotal, increment)-> subtotal += increment);
		
		Player playerWithMostKills = league.getTeams().stream().map(team -> team.getTeamStats().getPlayerWithMostKills()).max((a,b) -> a.getPlayerStats().getCareerKills() - b.getPlayerStats().getCareerKills()).get();
		Player playerWithMostDeaths = league.getTeams().stream().map(team -> team.getTeamStats().getPlayerWithMostDeaths()).max((a,b) -> a.getPlayerStats().getCareerDeaths() - b.getPlayerStats().getCareerDeaths()).get();
		Player playerWithMostAssists = league.getTeams().stream().map(team -> team.getTeamStats().getPlayerWithMostAssists()).max((a,b) -> a.getPlayerStats().getCareerAssist() - b.getPlayerStats().getCareerAssist()).get();
		Player playerWithHighestKda = league.getTeams().stream().map(team -> team.getTeamStats().getPlayerWithHighestKda()).max((a,b) -> (int) (a.getPlayerStats().getKillDeathAssistRatio() - b.getPlayerStats().getKillDeathAssistRatio())).get();
		
		//remove "default" champion
		
		league.getChampions().removeIf(champion -> champion.getName().equals(""));
		
		
		Champion championWithMostKills = league.getChampions().stream().max((a,b) -> a.getChampionStat().getTotalKills() - b.getChampionStat().getTotalKills()).get();
		Champion championWithMostDeaths = league.getChampions().stream().max((a,b) -> a.getChampionStat().getTotalDeaths() - b.getChampionStat().getTotalDeaths()).get();
		Champion championWithMostAssists = league.getChampions().stream().max((a,b) -> a.getChampionStat().getTotalAssist() - b.getChampionStat().getTotalAssist()).get();
		Champion championWithHighestKda = league.getChampions().stream().max((a,b) -> (int) ( a.getChampionStat().getKillDeathAssistRatio() - b.getChampionStat().getKillDeathAssistRatio())).get();
		
		LeagueStats leagueStats = LeagueOfLegendsCreationUtils.createLeagueStats(leagueKills, leagueAssists, leagueDeaths, playerWithMostKills, playerWithMostDeaths, playerWithMostAssists, playerWithHighestKda, championWithMostKills, championWithMostDeaths, championWithMostAssists, championWithHighestKda);
		leagueStats.setLeague(league);
		league.setLeagueStats(leagueStats);
		
		
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
