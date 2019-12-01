package leagueOfLegends.util;

import leagueOfLegends.*;

public class LeagueOfLegendsCreationUtils {
	
	public static League createLeague() {
		League league = LeagueOfLegendsFactory.eINSTANCE.createLeague();
		league.setName("EULCS");
		return league;
	}
	
	public static Season createSeason(String splitName, League league, int splitType) {
		Season season = LeagueOfLegendsFactory.eINSTANCE.createSeason();
		season.setSplitName(splitName);
		season.setLeague(league);
		season.setSplitType(SplitType.get(splitType));
		return season;
	}
	
	public static Champion createChampion(String name) {
		Champion champion = LeagueOfLegendsFactory.eINSTANCE.createChampion();
		champion.setName(name);
		return champion;
	}
	
	public static Player createPlayer(String name, String position) {
		Player player = LeagueOfLegendsFactory.eINSTANCE.createPlayer();
		player.setName(name);
		for(Position pos : Position.VALUES) {
			if(pos.getLiteral().equals(position.toLowerCase())) {
				player.setPosition(pos);
				break;
			}
		}
		return player;
	}
	
	public static Team createTeam(String name, League league) {
		Team team = LeagueOfLegendsFactory.eINSTANCE.createTeam();
		team.setName(name);
		team.setLeague(league);
		return team;
	}
	
	public static TeamStats createTeamStats(Team team) {
		TeamStats teamStats = LeagueOfLegendsFactory.eINSTANCE.createTeamStats();
		teamStats.setTeam(team);
		return teamStats;
	}
	
	public static Match createMatch(String matchID, String week) {
		Match match = LeagueOfLegendsFactory.eINSTANCE.createMatch();
		match.setMatchID(matchID);
		match.setWeek(week);
		match.setBestOF(mapWeekToBestOf(week));
		return match;
	}
	
	public static Game createGame(String gameID, Side winner) {
		Game game = LeagueOfLegendsFactory.eINSTANCE.createGame();
		game.setGameID(gameID);
		game.setWinningSide(winner);
		return game;
	}
	
	public static PlayerStats createPlayerStats() {
		PlayerStats playerStats = LeagueOfLegendsFactory.eINSTANCE.createPlayerStats();
		return playerStats;
	}
	
	public static ChampionsStats createChampionsStats() {
		ChampionsStats championsStats = LeagueOfLegendsFactory.eINSTANCE.createChampionsStats();
		return championsStats;
	}
	
	
	public static GameStats createGameStats(Game game, float duration) {
		GameStats gameStats = LeagueOfLegendsFactory.eINSTANCE.createGameStats();
		gameStats.setGame(game);
		gameStats.setDuration(duration);
		return gameStats;
	}
	
	public static GamePlayerStats createGamePlayerStats(Player player, Champion champion, int kills, int deaths, int assists,
			int wards, int visionWards, int wardsKilled, int gold, int minionKills, int monsterKills) {
		GamePlayerStats gamePlayerStats = LeagueOfLegendsFactory.eINSTANCE.createGamePlayerStats();
		
		gamePlayerStats.setPlayer(player);
		gamePlayerStats.setName(player.getName());
		gamePlayerStats.setChampion(champion);
		gamePlayerStats.setKills(kills);
		gamePlayerStats.setDeaths(deaths);
		gamePlayerStats.setAssist(assists);
		gamePlayerStats.setWards(wards);
		gamePlayerStats.setVisionWards(visionWards);
		gamePlayerStats.setWardsKilled(wardsKilled);
		gamePlayerStats.setGolds(gold);
		gamePlayerStats.setMinionKills(minionKills);
		gamePlayerStats.setMonsterKills(monsterKills);
		
		return gamePlayerStats;
	}
	
	public static GameTeamStats createGameTeamStats(Team team, int kills, int deaths, int assists,
			int wards, int visionWards, int wardsKilled, int gold, int minionKills, int monsterKills) {
		GameTeamStats gameTeamStats =  LeagueOfLegendsFactory.eINSTANCE.createGameTeamStats();
		gameTeamStats.setTeam(team);
		gameTeamStats.setName(team.getName());
		gameTeamStats.setTotalKills(kills);
		gameTeamStats.setTotalDeaths(deaths);
		gameTeamStats.setTotalAssist(assists);
		gameTeamStats.setTotalWards(wards);
		gameTeamStats.setTotalVisionWards(visionWards);
		gameTeamStats.setTotalWardsKilled(wardsKilled);
		gameTeamStats.setTotalGolds(gold);
		gameTeamStats.setTotalMinionKills(minionKills);
		gameTeamStats.setTotalMonsterKills(monsterKills);
		return gameTeamStats;
	}
	
	public static LeagueStats createLeagueStats(int kills, int deaths, int assists, Player playerWithMostKills, Player playerWithMostDeaths,
			Player playerWithMostAssists, Player playerHighestKda, 
			Champion championWithMostKills, Champion championWithMostDeaths, Champion championWithMostAssists, Champion championWithHighestKda, Champion mostBannedChampion, Champion leastBannedChampion) {
		LeagueStats leagueStats = LeagueOfLegendsFactory.eINSTANCE.createLeagueStats();
		
		leagueStats.setKills(kills);
		leagueStats.setAssists(assists);
		leagueStats.setDeaths(deaths);
		leagueStats.setPlayerWithMostKills(playerWithMostKills);
		leagueStats.setPlayerWithMostDeaths(playerWithMostDeaths);
		leagueStats.setPlayerWithMostAssists(playerWithMostAssists);
		leagueStats.setPlayerWithHighestKda(playerHighestKda);
		leagueStats.setChampionWithMostKills(championWithMostKills);
		leagueStats.setChampionWithMostDeaths(championWithMostDeaths);
		leagueStats.setChampionWithMostAssists(championWithMostAssists);
		leagueStats.setChampionWithHighestKda(championWithHighestKda);
		return leagueStats;
	}
	
	
	public static BestOf mapWeekToBestOf(String week) {
		
		for(BestOf bestOf: BestOf.VALUES) {
			if(bestOf.getLiteral().startsWith("_")) {
				if(week.equals(bestOf.getLiteral().substring(1))){
					return bestOf;
				}
			}
			if (week.equals(bestOf.getLiteral())){
				return bestOf;
			}
		}
		return BestOf.REGULAR;
	}
	
	
}
