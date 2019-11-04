/**
 */
package leagueOfLegends;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Team Stats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link leagueOfLegends.GameTeamStats#getTeam <em>Team</em>}</li>
 *   <li>{@link leagueOfLegends.GameTeamStats#getTotalKills <em>Total Kills</em>}</li>
 *   <li>{@link leagueOfLegends.GameTeamStats#getTotalDeaths <em>Total Deaths</em>}</li>
 *   <li>{@link leagueOfLegends.GameTeamStats#getTotalAssist <em>Total Assist</em>}</li>
 *   <li>{@link leagueOfLegends.GameTeamStats#getTotalGolds <em>Total Golds</em>}</li>
 *   <li>{@link leagueOfLegends.GameTeamStats#getTotalWards <em>Total Wards</em>}</li>
 *   <li>{@link leagueOfLegends.GameTeamStats#getTotalWardsKilled <em>Total Wards Killed</em>}</li>
 *   <li>{@link leagueOfLegends.GameTeamStats#getTotalVisionWards <em>Total Vision Wards</em>}</li>
 *   <li>{@link leagueOfLegends.GameTeamStats#getTotalMinionKills <em>Total Minion Kills</em>}</li>
 *   <li>{@link leagueOfLegends.GameTeamStats#getTotalMonsterKills <em>Total Monster Kills</em>}</li>
 *   <li>{@link leagueOfLegends.GameTeamStats#getTeamBaronKills <em>Team Baron Kills</em>}</li>
 *   <li>{@link leagueOfLegends.GameTeamStats#getTeamSide <em>Team Side</em>}</li>
 *   <li>{@link leagueOfLegends.GameTeamStats#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see leagueOfLegends.LeagueOfLegendsPackage#getGameTeamStats()
 * @model
 * @generated
 */
public interface GameTeamStats extends EObject {
	/**
	 * Returns the value of the '<em><b>Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team</em>' reference.
	 * @see #setTeam(Team)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGameTeamStats_Team()
	 * @model required="true"
	 * @generated
	 */
	Team getTeam();

	/**
	 * Sets the value of the '{@link leagueOfLegends.GameTeamStats#getTeam <em>Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team</em>' reference.
	 * @see #getTeam()
	 * @generated
	 */
	void setTeam(Team value);

	/**
	 * Returns the value of the '<em><b>Total Kills</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Kills</em>' attribute.
	 * @see #setTotalKills(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGameTeamStats_TotalKills()
	 * @model
	 * @generated
	 */
	int getTotalKills();

	/**
	 * Sets the value of the '{@link leagueOfLegends.GameTeamStats#getTotalKills <em>Total Kills</em>}' attribute.
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
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGameTeamStats_TotalDeaths()
	 * @model
	 * @generated
	 */
	int getTotalDeaths();

	/**
	 * Sets the value of the '{@link leagueOfLegends.GameTeamStats#getTotalDeaths <em>Total Deaths</em>}' attribute.
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
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGameTeamStats_TotalAssist()
	 * @model
	 * @generated
	 */
	int getTotalAssist();

	/**
	 * Sets the value of the '{@link leagueOfLegends.GameTeamStats#getTotalAssist <em>Total Assist</em>}' attribute.
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
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGameTeamStats_TotalGolds()
	 * @model
	 * @generated
	 */
	int getTotalGolds();

	/**
	 * Sets the value of the '{@link leagueOfLegends.GameTeamStats#getTotalGolds <em>Total Golds</em>}' attribute.
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
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGameTeamStats_TotalWards()
	 * @model
	 * @generated
	 */
	int getTotalWards();

	/**
	 * Sets the value of the '{@link leagueOfLegends.GameTeamStats#getTotalWards <em>Total Wards</em>}' attribute.
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
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGameTeamStats_TotalWardsKilled()
	 * @model
	 * @generated
	 */
	int getTotalWardsKilled();

	/**
	 * Sets the value of the '{@link leagueOfLegends.GameTeamStats#getTotalWardsKilled <em>Total Wards Killed</em>}' attribute.
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
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGameTeamStats_TotalVisionWards()
	 * @model
	 * @generated
	 */
	int getTotalVisionWards();

	/**
	 * Sets the value of the '{@link leagueOfLegends.GameTeamStats#getTotalVisionWards <em>Total Vision Wards</em>}' attribute.
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
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGameTeamStats_TotalMinionKills()
	 * @model
	 * @generated
	 */
	int getTotalMinionKills();

	/**
	 * Sets the value of the '{@link leagueOfLegends.GameTeamStats#getTotalMinionKills <em>Total Minion Kills</em>}' attribute.
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
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGameTeamStats_TotalMonsterKills()
	 * @model
	 * @generated
	 */
	int getTotalMonsterKills();

	/**
	 * Sets the value of the '{@link leagueOfLegends.GameTeamStats#getTotalMonsterKills <em>Total Monster Kills</em>}' attribute.
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
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGameTeamStats_TeamBaronKills()
	 * @model
	 * @generated
	 */
	int getTeamBaronKills();

	/**
	 * Sets the value of the '{@link leagueOfLegends.GameTeamStats#getTeamBaronKills <em>Team Baron Kills</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team Baron Kills</em>' attribute.
	 * @see #getTeamBaronKills()
	 * @generated
	 */
	void setTeamBaronKills(int value);

	/**
	 * Returns the value of the '<em><b>Team Side</b></em>' attribute.
	 * The literals are from the enumeration {@link leagueOfLegends.Side}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team Side</em>' attribute.
	 * @see leagueOfLegends.Side
	 * @see #setTeamSide(Side)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGameTeamStats_TeamSide()
	 * @model
	 * @generated
	 */
	Side getTeamSide();

	/**
	 * Sets the value of the '{@link leagueOfLegends.GameTeamStats#getTeamSide <em>Team Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team Side</em>' attribute.
	 * @see leagueOfLegends.Side
	 * @see #getTeamSide()
	 * @generated
	 */
	void setTeamSide(Side value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGameTeamStats_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link leagueOfLegends.GameTeamStats#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // GameTeamStats
