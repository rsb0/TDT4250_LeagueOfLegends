/**
 */
package leagueOfLegends;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Champion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link leagueOfLegends.Champion#getName <em>Name</em>}</li>
 *   <li>{@link leagueOfLegends.Champion#getChampionStat <em>Champion Stat</em>}</li>
 * </ul>
 *
 * @see leagueOfLegends.LeagueOfLegendsPackage#getChampion()
 * @model
 * @generated
 */
public interface Champion extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getChampion_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link leagueOfLegends.Champion#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Champion Stat</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link leagueOfLegends.ChampionsStats#getChampion <em>Champion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Champion Stat</em>' containment reference.
	 * @see #setChampionStat(ChampionsStats)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getChampion_ChampionStat()
	 * @see leagueOfLegends.ChampionsStats#getChampion
	 * @model opposite="champion" containment="true"
	 * @generated
	 */
	ChampionsStats getChampionStat();

	/**
	 * Sets the value of the '{@link leagueOfLegends.Champion#getChampionStat <em>Champion Stat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Champion Stat</em>' containment reference.
	 * @see #getChampionStat()
	 * @generated
	 */
	void setChampionStat(ChampionsStats value);

} // Champion
