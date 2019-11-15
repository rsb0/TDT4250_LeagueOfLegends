/**
 */
package leagueOfLegends;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Stats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link leagueOfLegends.GameStats#getGame <em>Game</em>}</li>
 *   <li>{@link leagueOfLegends.GameStats#getDuration <em>Duration</em>}</li>
 *   <li>{@link leagueOfLegends.GameStats#getWinner <em>Winner</em>}</li>
 *   <li>{@link leagueOfLegends.GameStats#getTotalKills <em>Total Kills</em>}</li>
 *   <li>{@link leagueOfLegends.GameStats#getTotalDeaths <em>Total Deaths</em>}</li>
 *   <li>{@link leagueOfLegends.GameStats#getTotalAssist <em>Total Assist</em>}</li>
 *   <li>{@link leagueOfLegends.GameStats#getTotalGolds <em>Total Golds</em>}</li>
 *   <li>{@link leagueOfLegends.GameStats#getTotalWards <em>Total Wards</em>}</li>
 *   <li>{@link leagueOfLegends.GameStats#getTotalWardsKilled <em>Total Wards Killed</em>}</li>
 *   <li>{@link leagueOfLegends.GameStats#getTotalVisionWards <em>Total Vision Wards</em>}</li>
 *   <li>{@link leagueOfLegends.GameStats#getTotalMinionKills <em>Total Minion Kills</em>}</li>
 *   <li>{@link leagueOfLegends.GameStats#getTotalMonsterKills <em>Total Monster Kills</em>}</li>
 *   <li>{@link leagueOfLegends.GameStats#getTeamBaronKills <em>Team Baron Kills</em>}</li>
 * </ul>
 *
 * @see leagueOfLegends.LeagueOfLegendsPackage#getGameStats()
 * @model
 * @generated
 */
public interface GameStats extends EObject {

	/**
	 * Returns the value of the '<em><b>Game</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link leagueOfLegends.Game#getGameStats <em>Game Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game</em>' container reference.
	 * @see #setGame(Game)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGameStats_Game()
	 * @see leagueOfLegends.Game#getGameStats
	 * @model opposite="gameStats" required="true" transient="false"
	 * @generated
	 */
	Game getGame();

	/**
	 * Sets the value of the '{@link leagueOfLegends.GameStats#getGame <em>Game</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game</em>' container reference.
	 * @see #getGame()
	 * @generated
	 */
	void setGame(Game value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGameStats_Duration()
	 * @model
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link leagueOfLegends.GameStats#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Returns the value of the '<em><b>Winner</b></em>' attribute.
	 * The literals are from the enumeration {@link leagueOfLegends.Side}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Winner</em>' attribute.
	 * @see leagueOfLegends.Side
	 * @see #setWinner(Side)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGameStats_Winner()
	 * @model
	 * @generated
	 */
	Side getWinner();

	/**
	 * Sets the value of the '{@link leagueOfLegends.GameStats#getWinner <em>Winner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Winner</em>' attribute.
	 * @see leagueOfLegends.Side
	 * @see #getWinner()
	 * @generated
	 */
	void setWinner(Side value);

	/**
	 * Returns the value of the '<em><b>Total Kills</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Kills</em>' attribute.
	 * @see #setTotalKills(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGameStats_TotalKills()
	 * @model
	 * @generated
	 */
	int getTotalKills();

	/**
	 * Sets the value of the '{@link leagueOfLegends.GameStats#getTotalKills <em>Total Kills</em>}' attribute.
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
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGameStats_TotalDeaths()
	 * @model
	 * @generated
	 */
	int getTotalDeaths();

	/**
	 * Sets the value of the '{@link leagueOfLegends.GameStats#getTotalDeaths <em>Total Deaths</em>}' attribute.
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
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGameStats_TotalAssist()
	 * @model
	 * @generated
	 */
	int getTotalAssist();

	/**
	 * Sets the value of the '{@link leagueOfLegends.GameStats#getTotalAssist <em>Total Assist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Assist</em>' attribute.
	 * @see #getTotalAssist()
	 * @generated
	 */
	void setTotalAssist(int value);

	/**
	 * Returns the value of the '<em><b>Total Golds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Golds</em>' attribute.
	 * @see #setTotalGolds(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGameStats_TotalGolds()
	 * @model
	 * @generated
	 */
	int getTotalGolds();

	/**
	 * Sets the value of the '{@link leagueOfLegends.GameStats#getTotalGolds <em>Total Golds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Golds</em>' attribute.
	 * @see #getTotalGolds()
	 * @generated
	 */
	void setTotalGolds(int value);

	/**
	 * Returns the value of the '<em><b>Total Wards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Wards</em>' attribute.
	 * @see #setTotalWards(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGameStats_TotalWards()
	 * @model
	 * @generated
	 */
	int getTotalWards();

	/**
	 * Sets the value of the '{@link leagueOfLegends.GameStats#getTotalWards <em>Total Wards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Wards</em>' attribute.
	 * @see #getTotalWards()
	 * @generated
	 */
	void setTotalWards(int value);

	/**
	 * Returns the value of the '<em><b>Total Wards Killed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Wards Killed</em>' attribute.
	 * @see #setTotalWardsKilled(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGameStats_TotalWardsKilled()
	 * @model
	 * @generated
	 */
	int getTotalWardsKilled();

	/**
	 * Sets the value of the '{@link leagueOfLegends.GameStats#getTotalWardsKilled <em>Total Wards Killed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Wards Killed</em>' attribute.
	 * @see #getTotalWardsKilled()
	 * @generated
	 */
	void setTotalWardsKilled(int value);

	/**
	 * Returns the value of the '<em><b>Total Vision Wards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Vision Wards</em>' attribute.
	 * @see #setTotalVisionWards(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGameStats_TotalVisionWards()
	 * @model
	 * @generated
	 */
	int getTotalVisionWards();

	/**
	 * Sets the value of the '{@link leagueOfLegends.GameStats#getTotalVisionWards <em>Total Vision Wards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Vision Wards</em>' attribute.
	 * @see #getTotalVisionWards()
	 * @generated
	 */
	void setTotalVisionWards(int value);

	/**
	 * Returns the value of the '<em><b>Total Minion Kills</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Minion Kills</em>' attribute.
	 * @see #setTotalMinionKills(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGameStats_TotalMinionKills()
	 * @model
	 * @generated
	 */
	int getTotalMinionKills();

	/**
	 * Sets the value of the '{@link leagueOfLegends.GameStats#getTotalMinionKills <em>Total Minion Kills</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Minion Kills</em>' attribute.
	 * @see #getTotalMinionKills()
	 * @generated
	 */
	void setTotalMinionKills(int value);

	/**
	 * Returns the value of the '<em><b>Total Monster Kills</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Monster Kills</em>' attribute.
	 * @see #setTotalMonsterKills(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGameStats_TotalMonsterKills()
	 * @model
	 * @generated
	 */
	int getTotalMonsterKills();

	/**
	 * Sets the value of the '{@link leagueOfLegends.GameStats#getTotalMonsterKills <em>Total Monster Kills</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Monster Kills</em>' attribute.
	 * @see #getTotalMonsterKills()
	 * @generated
	 */
	void setTotalMonsterKills(int value);

	/**
	 * Returns the value of the '<em><b>Team Baron Kills</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team Baron Kills</em>' attribute.
	 * @see #setTeamBaronKills(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGameStats_TeamBaronKills()
	 * @model
	 * @generated
	 */
	int getTeamBaronKills();

	/**
	 * Sets the value of the '{@link leagueOfLegends.GameStats#getTeamBaronKills <em>Team Baron Kills</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team Baron Kills</em>' attribute.
	 * @see #getTeamBaronKills()
	 * @generated
	 */
	void setTeamBaronKills(int value);
} // GameStats
