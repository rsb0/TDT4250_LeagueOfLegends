/**
 */
package leagueOfLegends;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Champions Stats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link leagueOfLegends.ChampionsStats#getGamesPlayed <em>Games Played</em>}</li>
 *   <li>{@link leagueOfLegends.ChampionsStats#getTotalKills <em>Total Kills</em>}</li>
 *   <li>{@link leagueOfLegends.ChampionsStats#getTotalDeaths <em>Total Deaths</em>}</li>
 *   <li>{@link leagueOfLegends.ChampionsStats#getTotalAssist <em>Total Assist</em>}</li>
 *   <li>{@link leagueOfLegends.ChampionsStats#getKillDeathAssistRatio <em>Kill Death Assist Ratio</em>}</li>
 *   <li>{@link leagueOfLegends.ChampionsStats#getChampion <em>Champion</em>}</li>
 *   <li>{@link leagueOfLegends.ChampionsStats#getBans <em>Bans</em>}</li>
 *   <li>{@link leagueOfLegends.ChampionsStats#getWins <em>Wins</em>}</li>
 *   <li>{@link leagueOfLegends.ChampionsStats#getWinLoseRatio <em>Win Lose Ratio</em>}</li>
 * </ul>
 *
 * @see leagueOfLegends.LeagueOfLegendsPackage#getChampionsStats()
 * @model
 * @generated
 */
public interface ChampionsStats extends EObject {
	/**
	 * Returns the value of the '<em><b>Games Played</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Games Played</em>' attribute.
	 * @see #setGamesPlayed(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getChampionsStats_GamesPlayed()
	 * @model
	 * @generated
	 */
	int getGamesPlayed();

	/**
	 * Sets the value of the '{@link leagueOfLegends.ChampionsStats#getGamesPlayed <em>Games Played</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Games Played</em>' attribute.
	 * @see #getGamesPlayed()
	 * @generated
	 */
	void setGamesPlayed(int value);

	/**
	 * Returns the value of the '<em><b>Total Kills</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Kills</em>' attribute.
	 * @see #setTotalKills(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getChampionsStats_TotalKills()
	 * @model
	 * @generated
	 */
	int getTotalKills();

	/**
	 * Sets the value of the '{@link leagueOfLegends.ChampionsStats#getTotalKills <em>Total Kills</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Kills</em>' attribute.
	 * @see #getTotalKills()
	 * @generated
	 */
	void setTotalKills(int value);

	/**
	 * Returns the value of the '<em><b>Total Deaths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Deaths</em>' attribute.
	 * @see #setTotalDeaths(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getChampionsStats_TotalDeaths()
	 * @model
	 * @generated
	 */
	int getTotalDeaths();

	/**
	 * Sets the value of the '{@link leagueOfLegends.ChampionsStats#getTotalDeaths <em>Total Deaths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Deaths</em>' attribute.
	 * @see #getTotalDeaths()
	 * @generated
	 */
	void setTotalDeaths(int value);

	/**
	 * Returns the value of the '<em><b>Total Assist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Assist</em>' attribute.
	 * @see #setTotalAssist(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getChampionsStats_TotalAssist()
	 * @model
	 * @generated
	 */
	int getTotalAssist();

	/**
	 * Sets the value of the '{@link leagueOfLegends.ChampionsStats#getTotalAssist <em>Total Assist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Assist</em>' attribute.
	 * @see #getTotalAssist()
	 * @generated
	 */
	void setTotalAssist(int value);

	/**
	 * Returns the value of the '<em><b>Kill Death Assist Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kill Death Assist Ratio</em>' attribute.
	 * @see #setKillDeathAssistRatio(float)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getChampionsStats_KillDeathAssistRatio()
	 * @model derived="true"
	 * @generated
	 */
	float getKillDeathAssistRatio();

	/**
	 * Sets the value of the '{@link leagueOfLegends.ChampionsStats#getKillDeathAssistRatio <em>Kill Death Assist Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kill Death Assist Ratio</em>' attribute.
	 * @see #getKillDeathAssistRatio()
	 * @generated
	 */
	void setKillDeathAssistRatio(float value);

	/**
	 * Returns the value of the '<em><b>Champion</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link leagueOfLegends.Champion#getChampionStat <em>Champion Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Champion</em>' container reference.
	 * @see #setChampion(Champion)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getChampionsStats_Champion()
	 * @see leagueOfLegends.Champion#getChampionStat
	 * @model opposite="championStat" required="true" transient="false"
	 * @generated
	 */
	Champion getChampion();

	/**
	 * Sets the value of the '{@link leagueOfLegends.ChampionsStats#getChampion <em>Champion</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Champion</em>' container reference.
	 * @see #getChampion()
	 * @generated
	 */
	void setChampion(Champion value);

	/**
	 * Returns the value of the '<em><b>Bans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bans</em>' attribute.
	 * @see #setBans(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getChampionsStats_Bans()
	 * @model
	 * @generated
	 */
	int getBans();

	/**
	 * Sets the value of the '{@link leagueOfLegends.ChampionsStats#getBans <em>Bans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bans</em>' attribute.
	 * @see #getBans()
	 * @generated
	 */
	void setBans(int value);

	/**
	 * Returns the value of the '<em><b>Wins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wins</em>' attribute.
	 * @see #setWins(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getChampionsStats_Wins()
	 * @model
	 * @generated
	 */
	int getWins();

	/**
	 * Sets the value of the '{@link leagueOfLegends.ChampionsStats#getWins <em>Wins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wins</em>' attribute.
	 * @see #getWins()
	 * @generated
	 */
	void setWins(int value);

	/**
	 * Returns the value of the '<em><b>Win Lose Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Win Lose Ratio</em>' attribute.
	 * @see #setWinLoseRatio(float)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getChampionsStats_WinLoseRatio()
	 * @model
	 * @generated
	 */
	float getWinLoseRatio();

	/**
	 * Sets the value of the '{@link leagueOfLegends.ChampionsStats#getWinLoseRatio <em>Win Lose Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Win Lose Ratio</em>' attribute.
	 * @see #getWinLoseRatio()
	 * @generated
	 */
	void setWinLoseRatio(float value);

} // ChampionsStats
