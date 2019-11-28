/**
 */
package leagueOfLegends;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team Stats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link leagueOfLegends.TeamStats#getTeam <em>Team</em>}</li>
 *   <li>{@link leagueOfLegends.TeamStats#getGamesPlayed <em>Games Played</em>}</li>
 *   <li>{@link leagueOfLegends.TeamStats#getKills <em>Kills</em>}</li>
 *   <li>{@link leagueOfLegends.TeamStats#getDeaths <em>Deaths</em>}</li>
 *   <li>{@link leagueOfLegends.TeamStats#getAssists <em>Assists</em>}</li>
 *   <li>{@link leagueOfLegends.TeamStats#getKillDeathAssistRatio <em>Kill Death Assist Ratio</em>}</li>
 *   <li>{@link leagueOfLegends.TeamStats#getWinLoseRatio <em>Win Lose Ratio</em>}</li>
 *   <li>{@link leagueOfLegends.TeamStats#getGameWins <em>Game Wins</em>}</li>
 *   <li>{@link leagueOfLegends.TeamStats#getMatchWins <em>Match Wins</em>}</li>
 *   <li>{@link leagueOfLegends.TeamStats#getTournamentWins <em>Tournament Wins</em>}</li>
 *   <li>{@link leagueOfLegends.TeamStats#getTournamentSecondPlaces <em>Tournament Second Places</em>}</li>
 *   <li>{@link leagueOfLegends.TeamStats#getTournamentThridPlaces <em>Tournament Thrid Places</em>}</li>
 *   <li>{@link leagueOfLegends.TeamStats#getPlayerWithMostKills <em>Player With Most Kills</em>}</li>
 *   <li>{@link leagueOfLegends.TeamStats#getPlayerWithMostDeaths <em>Player With Most Deaths</em>}</li>
 *   <li>{@link leagueOfLegends.TeamStats#getPlayerWithMostAssists <em>Player With Most Assists</em>}</li>
 *   <li>{@link leagueOfLegends.TeamStats#getPlayerWithHighestKda <em>Player With Highest Kda</em>}</li>
 * </ul>
 *
 * @see leagueOfLegends.LeagueOfLegendsPackage#getTeamStats()
 * @model
 * @generated
 */
public interface TeamStats extends EObject {
	/**
	 * Returns the value of the '<em><b>Team</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link leagueOfLegends.Team#getTeamStats <em>Team Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team</em>' container reference.
	 * @see #setTeam(Team)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getTeamStats_Team()
	 * @see leagueOfLegends.Team#getTeamStats
	 * @model opposite="teamStats" transient="false"
	 * @generated
	 */
	Team getTeam();

	/**
	 * Sets the value of the '{@link leagueOfLegends.TeamStats#getTeam <em>Team</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team</em>' container reference.
	 * @see #getTeam()
	 * @generated
	 */
	void setTeam(Team value);

	/**
	 * Returns the value of the '<em><b>Games Played</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Games Played</em>' attribute.
	 * @see #setGamesPlayed(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getTeamStats_GamesPlayed()
	 * @model
	 * @generated
	 */
	int getGamesPlayed();

	/**
	 * Sets the value of the '{@link leagueOfLegends.TeamStats#getGamesPlayed <em>Games Played</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Games Played</em>' attribute.
	 * @see #getGamesPlayed()
	 * @generated
	 */
	void setGamesPlayed(int value);

	/**
	 * Returns the value of the '<em><b>Kills</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kills</em>' attribute.
	 * @see #setKills(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getTeamStats_Kills()
	 * @model
	 * @generated
	 */
	int getKills();

	/**
	 * Sets the value of the '{@link leagueOfLegends.TeamStats#getKills <em>Kills</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kills</em>' attribute.
	 * @see #getKills()
	 * @generated
	 */
	void setKills(int value);

	/**
	 * Returns the value of the '<em><b>Deaths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deaths</em>' attribute.
	 * @see #setDeaths(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getTeamStats_Deaths()
	 * @model
	 * @generated
	 */
	int getDeaths();

	/**
	 * Sets the value of the '{@link leagueOfLegends.TeamStats#getDeaths <em>Deaths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deaths</em>' attribute.
	 * @see #getDeaths()
	 * @generated
	 */
	void setDeaths(int value);

	/**
	 * Returns the value of the '<em><b>Assists</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assists</em>' attribute.
	 * @see #setAssists(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getTeamStats_Assists()
	 * @model
	 * @generated
	 */
	int getAssists();

	/**
	 * Sets the value of the '{@link leagueOfLegends.TeamStats#getAssists <em>Assists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assists</em>' attribute.
	 * @see #getAssists()
	 * @generated
	 */
	void setAssists(int value);

	/**
	 * Returns the value of the '<em><b>Kill Death Assist Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kill Death Assist Ratio</em>' attribute.
	 * @see #setKillDeathAssistRatio(float)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getTeamStats_KillDeathAssistRatio()
	 * @model derived="true"
	 * @generated
	 */
	float getKillDeathAssistRatio();

	/**
	 * Sets the value of the '{@link leagueOfLegends.TeamStats#getKillDeathAssistRatio <em>Kill Death Assist Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kill Death Assist Ratio</em>' attribute.
	 * @see #getKillDeathAssistRatio()
	 * @generated
	 */
	void setKillDeathAssistRatio(float value);

	/**
	 * Returns the value of the '<em><b>Win Lose Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Win Lose Ratio</em>' attribute.
	 * @see #setWinLoseRatio(float)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getTeamStats_WinLoseRatio()
	 * @model
	 * @generated
	 */
	float getWinLoseRatio();

	/**
	 * Sets the value of the '{@link leagueOfLegends.TeamStats#getWinLoseRatio <em>Win Lose Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Win Lose Ratio</em>' attribute.
	 * @see #getWinLoseRatio()
	 * @generated
	 */
	void setWinLoseRatio(float value);

	/**
	 * Returns the value of the '<em><b>Game Wins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game Wins</em>' attribute.
	 * @see #setGameWins(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getTeamStats_GameWins()
	 * @model
	 * @generated
	 */
	int getGameWins();

	/**
	 * Sets the value of the '{@link leagueOfLegends.TeamStats#getGameWins <em>Game Wins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game Wins</em>' attribute.
	 * @see #getGameWins()
	 * @generated
	 */
	void setGameWins(int value);

	/**
	 * Returns the value of the '<em><b>Match Wins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match Wins</em>' attribute.
	 * @see #setMatchWins(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getTeamStats_MatchWins()
	 * @model
	 * @generated
	 */
	int getMatchWins();

	/**
	 * Sets the value of the '{@link leagueOfLegends.TeamStats#getMatchWins <em>Match Wins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match Wins</em>' attribute.
	 * @see #getMatchWins()
	 * @generated
	 */
	void setMatchWins(int value);

	/**
	 * Returns the value of the '<em><b>Tournament Wins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tournament Wins</em>' attribute.
	 * @see #setTournamentWins(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getTeamStats_TournamentWins()
	 * @model
	 * @generated
	 */
	int getTournamentWins();

	/**
	 * Sets the value of the '{@link leagueOfLegends.TeamStats#getTournamentWins <em>Tournament Wins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tournament Wins</em>' attribute.
	 * @see #getTournamentWins()
	 * @generated
	 */
	void setTournamentWins(int value);

	/**
	 * Returns the value of the '<em><b>Tournament Second Places</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tournament Second Places</em>' attribute.
	 * @see #setTournamentSecondPlaces(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getTeamStats_TournamentSecondPlaces()
	 * @model
	 * @generated
	 */
	int getTournamentSecondPlaces();

	/**
	 * Sets the value of the '{@link leagueOfLegends.TeamStats#getTournamentSecondPlaces <em>Tournament Second Places</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tournament Second Places</em>' attribute.
	 * @see #getTournamentSecondPlaces()
	 * @generated
	 */
	void setTournamentSecondPlaces(int value);

	/**
	 * Returns the value of the '<em><b>Tournament Thrid Places</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tournament Thrid Places</em>' attribute.
	 * @see #setTournamentThridPlaces(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getTeamStats_TournamentThridPlaces()
	 * @model
	 * @generated
	 */
	int getTournamentThridPlaces();

	/**
	 * Sets the value of the '{@link leagueOfLegends.TeamStats#getTournamentThridPlaces <em>Tournament Thrid Places</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tournament Thrid Places</em>' attribute.
	 * @see #getTournamentThridPlaces()
	 * @generated
	 */
	void setTournamentThridPlaces(int value);

	/**
	 * Returns the value of the '<em><b>Player With Most Kills</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player With Most Kills</em>' reference.
	 * @see #setPlayerWithMostKills(Player)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getTeamStats_PlayerWithMostKills()
	 * @model
	 * @generated
	 */
	Player getPlayerWithMostKills();

	/**
	 * Sets the value of the '{@link leagueOfLegends.TeamStats#getPlayerWithMostKills <em>Player With Most Kills</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player With Most Kills</em>' reference.
	 * @see #getPlayerWithMostKills()
	 * @generated
	 */
	void setPlayerWithMostKills(Player value);

	/**
	 * Returns the value of the '<em><b>Player With Most Deaths</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player With Most Deaths</em>' reference.
	 * @see #setPlayerWithMostDeaths(Player)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getTeamStats_PlayerWithMostDeaths()
	 * @model
	 * @generated
	 */
	Player getPlayerWithMostDeaths();

	/**
	 * Sets the value of the '{@link leagueOfLegends.TeamStats#getPlayerWithMostDeaths <em>Player With Most Deaths</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player With Most Deaths</em>' reference.
	 * @see #getPlayerWithMostDeaths()
	 * @generated
	 */
	void setPlayerWithMostDeaths(Player value);

	/**
	 * Returns the value of the '<em><b>Player With Most Assists</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player With Most Assists</em>' reference.
	 * @see #setPlayerWithMostAssists(Player)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getTeamStats_PlayerWithMostAssists()
	 * @model
	 * @generated
	 */
	Player getPlayerWithMostAssists();

	/**
	 * Sets the value of the '{@link leagueOfLegends.TeamStats#getPlayerWithMostAssists <em>Player With Most Assists</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player With Most Assists</em>' reference.
	 * @see #getPlayerWithMostAssists()
	 * @generated
	 */
	void setPlayerWithMostAssists(Player value);

	/**
	 * Returns the value of the '<em><b>Player With Highest Kda</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player With Highest Kda</em>' reference.
	 * @see #setPlayerWithHighestKda(Player)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getTeamStats_PlayerWithHighestKda()
	 * @model
	 * @generated
	 */
	Player getPlayerWithHighestKda();

	/**
	 * Sets the value of the '{@link leagueOfLegends.TeamStats#getPlayerWithHighestKda <em>Player With Highest Kda</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player With Highest Kda</em>' reference.
	 * @see #getPlayerWithHighestKda()
	 * @generated
	 */
	void setPlayerWithHighestKda(Player value);

} // TeamStats
