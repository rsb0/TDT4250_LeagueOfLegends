package leagueOfLegends.util;

import leagueOfLegends.*;

public class LeagueOfLegendsCreationUtils {
	
	public static League createLeague() {
		League league = LeagueOfLegendsFactory.eINSTANCE.createLeague();
		league.setName("EULCS");
		return league;
	}
	
	public static Season createSeason(String splitName) {
		Season season = LeagueOfLegendsFactory.eINSTANCE.createSeason();
		season.setSplitName(splitName);
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
	
	public static Match createMatch(String matchID) {
		Match match = LeagueOfLegendsFactory.eINSTANCE.createMatch();
		match.setMatchID(matchID);
		return match;
	}
	
	public static Game createGame(String gameID) {
		Game game = LeagueOfLegendsFactory.eINSTANCE.createGame();
		game.setGameID(gameID);
		return game;
	}
	
	
}
