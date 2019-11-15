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
	
	public static Player createPlayer(String name) {
		Player player = LeagueOfLegendsFactory.eINSTANCE.createPlayer();
		player.setName(name);
		return player;
	}
	
	public static Team createTeam(String name, League league) {
		Team team = LeagueOfLegendsFactory.eINSTANCE.createTeam();
		team.setName(name);
		team.setLeague(league);
		return team;
	}
	
	public static Match createMatch(String matchID, String week) {
		Match match = LeagueOfLegendsFactory.eINSTANCE.createMatch();
		match.setMatchID(matchID);
		match.setWeek(week);
		match.setBestOF(mapWeekToBestOf(week));
		return match;
	}
	
	public static Game createGame(String gameID) {
		Game game = LeagueOfLegendsFactory.eINSTANCE.createGame();
		game.setGameID(gameID);
		return game;
	}
	
	public static GameStats createGameStats() {
		GameStats gameStats = LeagueOfLegendsFactory.eINSTANCE.createGameStats();
		return gameStats;
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
