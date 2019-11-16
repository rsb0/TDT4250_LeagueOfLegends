/**
 */
package leagueOfLegends;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player Stats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link leagueOfLegends.PlayerStats#getGamesPlayed <em>Games Played</em>}</li>
 *   <li>{@link leagueOfLegends.PlayerStats#getCareerKills <em>Career Kills</em>}</li>
 *   <li>{@link leagueOfLegends.PlayerStats#getCareerDeaths <em>Career Deaths</em>}</li>
 *   <li>{@link leagueOfLegends.PlayerStats#getCareerAssist <em>Career Assist</em>}</li>
 *   <li>{@link leagueOfLegends.PlayerStats#getKillDeathAssistRatio <em>Kill Death Assist Ratio</em>}</li>
 *   <li>{@link leagueOfLegends.PlayerStats#getWinLoseRatio <em>Win Lose Ratio</em>}</li>
 *   <li>{@link leagueOfLegends.PlayerStats#getPlayer <em>Player</em>}</li>
 *   <li>{@link leagueOfLegends.PlayerStats#getWins <em>Wins</em>}</li>
 * </ul>
 *
 * @see leagueOfLegends.LeagueOfLegendsPackage#getPlayerStats()
 * @model
 * @generated
 */
public interface PlayerStats extends EObject {
	/**
	 * Returns the value of the '<em><b>Games Played</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Games Played</em>' attribute.
	 * @see #setGamesPlayed(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getPlayerStats_GamesPlayed()
	 * @model
	 * @generated
	 */
	int getGamesPlayed();

	/**
	 * Sets the value of the '{@link leagueOfLegends.PlayerStats#getGamesPlayed <em>Games Played</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Games Played</em>' attribute.
	 * @see #getGamesPlayed()
	 * @generated
	 */
	void setGamesPlayed(int value);

	/**
	 * Returns the value of the '<em><b>Career Kills</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Career Kills</em>' attribute.
	 * @see #setCareerKills(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getPlayerStats_CareerKills()
	 * @model
	 * @generated
	 */
	int getCareerKills();

	/**
	 * Sets the value of the '{@link leagueOfLegends.PlayerStats#getCareerKills <em>Career Kills</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Career Kills</em>' attribute.
	 * @see #getCareerKills()
	 * @generated
	 */
	void setCareerKills(int value);

	/**
	 * Returns the value of the '<em><b>Career Deaths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Career Deaths</em>' attribute.
	 * @see #setCareerDeaths(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getPlayerStats_CareerDeaths()
	 * @model
	 * @generated
	 */
	int getCareerDeaths();

	/**
	 * Sets the value of the '{@link leagueOfLegends.PlayerStats#getCareerDeaths <em>Career Deaths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Career Deaths</em>' attribute.
	 * @see #getCareerDeaths()
	 * @generated
	 */
	void setCareerDeaths(int value);

	/**
	 * Returns the value of the '<em><b>Career Assist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Career Assist</em>' attribute.
	 * @see #setCareerAssist(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getPlayerStats_CareerAssist()
	 * @model
	 * @generated
	 */
	int getCareerAssist();

	/**
	 * Sets the value of the '{@link leagueOfLegends.PlayerStats#getCareerAssist <em>Career Assist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Career Assist</em>' attribute.
	 * @see #getCareerAssist()
	 * @generated
	 */
	void setCareerAssist(int value);

	/**
	 * Returns the value of the '<em><b>Kill Death Assist Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kill Death Assist Ratio</em>' attribute.
	 * @see #setKillDeathAssistRatio(float)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getPlayerStats_KillDeathAssistRatio()
	 * @model derived="true"
	 * @generated
	 */
	float getKillDeathAssistRatio();

	/**
	 * Sets the value of the '{@link leagueOfLegends.PlayerStats#getKillDeathAssistRatio <em>Kill Death Assist Ratio</em>}' attribute.
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
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getPlayerStats_WinLoseRatio()
	 * @model
	 * @generated
	 */
	float getWinLoseRatio();

	/**
	 * Sets the value of the '{@link leagueOfLegends.PlayerStats#getWinLoseRatio <em>Win Lose Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Win Lose Ratio</em>' attribute.
	 * @see #getWinLoseRatio()
	 * @generated
	 */
	void setWinLoseRatio(float value);

	/**
	 * Returns the value of the '<em><b>Player</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link leagueOfLegends.Player#getPlayerStats <em>Player Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player</em>' container reference.
	 * @see #setPlayer(Player)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getPlayerStats_Player()
	 * @see leagueOfLegends.Player#getPlayerStats
	 * @model opposite="playerStats" required="true" transient="false"
	 * @generated
	 */
	Player getPlayer();

	/**
	 * Sets the value of the '{@link leagueOfLegends.PlayerStats#getPlayer <em>Player</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player</em>' container reference.
	 * @see #getPlayer()
	 * @generated
	 */
	void setPlayer(Player value);

	/**
	 * Returns the value of the '<em><b>Wins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wins</em>' attribute.
	 * @see #setWins(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getPlayerStats_Wins()
	 * @model
	 * @generated
	 */
	int getWins();

	/**
	 * Sets the value of the '{@link leagueOfLegends.PlayerStats#getWins <em>Wins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wins</em>' attribute.
	 * @see #getWins()
	 * @generated
	 */
	void setWins(int value);

} // PlayerStats
