/**
 */
package leagueOfLegends;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Player Stats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link leagueOfLegends.GamePlayerStats#getPlayer <em>Player</em>}</li>
 *   <li>{@link leagueOfLegends.GamePlayerStats#getKills <em>Kills</em>}</li>
 *   <li>{@link leagueOfLegends.GamePlayerStats#getDeaths <em>Deaths</em>}</li>
 *   <li>{@link leagueOfLegends.GamePlayerStats#getAssist <em>Assist</em>}</li>
 *   <li>{@link leagueOfLegends.GamePlayerStats#getGolds <em>Golds</em>}</li>
 *   <li>{@link leagueOfLegends.GamePlayerStats#getWards <em>Wards</em>}</li>
 *   <li>{@link leagueOfLegends.GamePlayerStats#getWardsKilled <em>Wards Killed</em>}</li>
 *   <li>{@link leagueOfLegends.GamePlayerStats#getVisionWards <em>Vision Wards</em>}</li>
 *   <li>{@link leagueOfLegends.GamePlayerStats#getMinionKills <em>Minion Kills</em>}</li>
 *   <li>{@link leagueOfLegends.GamePlayerStats#getMonsterKills <em>Monster Kills</em>}</li>
 *   <li>{@link leagueOfLegends.GamePlayerStats#getChampion <em>Champion</em>}</li>
 *   <li>{@link leagueOfLegends.GamePlayerStats#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see leagueOfLegends.LeagueOfLegendsPackage#getGamePlayerStats()
 * @model
 * @generated
 */
public interface GamePlayerStats extends EObject {
	/**
	 * Returns the value of the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player</em>' reference.
	 * @see #setPlayer(Player)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGamePlayerStats_Player()
	 * @model required="true"
	 * @generated
	 */
	Player getPlayer();

	/**
	 * Sets the value of the '{@link leagueOfLegends.GamePlayerStats#getPlayer <em>Player</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player</em>' reference.
	 * @see #getPlayer()
	 * @generated
	 */
	void setPlayer(Player value);

	/**
	 * Returns the value of the '<em><b>Kills</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kills</em>' attribute.
	 * @see #setKills(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGamePlayerStats_Kills()
	 * @model
	 * @generated
	 */
	int getKills();

	/**
	 * Sets the value of the '{@link leagueOfLegends.GamePlayerStats#getKills <em>Kills</em>}' attribute.
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
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGamePlayerStats_Deaths()
	 * @model
	 * @generated
	 */
	int getDeaths();

	/**
	 * Sets the value of the '{@link leagueOfLegends.GamePlayerStats#getDeaths <em>Deaths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deaths</em>' attribute.
	 * @see #getDeaths()
	 * @generated
	 */
	void setDeaths(int value);

	/**
	 * Returns the value of the '<em><b>Assist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assist</em>' attribute.
	 * @see #setAssist(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGamePlayerStats_Assist()
	 * @model
	 * @generated
	 */
	int getAssist();

	/**
	 * Sets the value of the '{@link leagueOfLegends.GamePlayerStats#getAssist <em>Assist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assist</em>' attribute.
	 * @see #getAssist()
	 * @generated
	 */
	void setAssist(int value);

	/**
	 * Returns the value of the '<em><b>Golds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Golds</em>' attribute.
	 * @see #setGolds(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGamePlayerStats_Golds()
	 * @model
	 * @generated
	 */
	int getGolds();

	/**
	 * Sets the value of the '{@link leagueOfLegends.GamePlayerStats#getGolds <em>Golds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Golds</em>' attribute.
	 * @see #getGolds()
	 * @generated
	 */
	void setGolds(int value);

	/**
	 * Returns the value of the '<em><b>Wards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wards</em>' attribute.
	 * @see #setWards(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGamePlayerStats_Wards()
	 * @model
	 * @generated
	 */
	int getWards();

	/**
	 * Sets the value of the '{@link leagueOfLegends.GamePlayerStats#getWards <em>Wards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wards</em>' attribute.
	 * @see #getWards()
	 * @generated
	 */
	void setWards(int value);

	/**
	 * Returns the value of the '<em><b>Wards Killed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wards Killed</em>' attribute.
	 * @see #setWardsKilled(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGamePlayerStats_WardsKilled()
	 * @model
	 * @generated
	 */
	int getWardsKilled();

	/**
	 * Sets the value of the '{@link leagueOfLegends.GamePlayerStats#getWardsKilled <em>Wards Killed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wards Killed</em>' attribute.
	 * @see #getWardsKilled()
	 * @generated
	 */
	void setWardsKilled(int value);

	/**
	 * Returns the value of the '<em><b>Vision Wards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vision Wards</em>' attribute.
	 * @see #setVisionWards(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGamePlayerStats_VisionWards()
	 * @model
	 * @generated
	 */
	int getVisionWards();

	/**
	 * Sets the value of the '{@link leagueOfLegends.GamePlayerStats#getVisionWards <em>Vision Wards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vision Wards</em>' attribute.
	 * @see #getVisionWards()
	 * @generated
	 */
	void setVisionWards(int value);

	/**
	 * Returns the value of the '<em><b>Minion Kills</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minion Kills</em>' attribute.
	 * @see #setMinionKills(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGamePlayerStats_MinionKills()
	 * @model
	 * @generated
	 */
	int getMinionKills();

	/**
	 * Sets the value of the '{@link leagueOfLegends.GamePlayerStats#getMinionKills <em>Minion Kills</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minion Kills</em>' attribute.
	 * @see #getMinionKills()
	 * @generated
	 */
	void setMinionKills(int value);

	/**
	 * Returns the value of the '<em><b>Monster Kills</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monster Kills</em>' attribute.
	 * @see #setMonsterKills(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGamePlayerStats_MonsterKills()
	 * @model
	 * @generated
	 */
	int getMonsterKills();

	/**
	 * Sets the value of the '{@link leagueOfLegends.GamePlayerStats#getMonsterKills <em>Monster Kills</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monster Kills</em>' attribute.
	 * @see #getMonsterKills()
	 * @generated
	 */
	void setMonsterKills(int value);

	/**
	 * Returns the value of the '<em><b>Champion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Champion</em>' reference.
	 * @see #setChampion(Champion)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGamePlayerStats_Champion()
	 * @model
	 * @generated
	 */
	Champion getChampion();

	/**
	 * Sets the value of the '{@link leagueOfLegends.GamePlayerStats#getChampion <em>Champion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Champion</em>' reference.
	 * @see #getChampion()
	 * @generated
	 */
	void setChampion(Champion value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGamePlayerStats_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link leagueOfLegends.GamePlayerStats#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // GamePlayerStats
