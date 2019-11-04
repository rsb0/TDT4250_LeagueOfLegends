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
 *   <li>{@link leagueOfLegends.Champion#getLeagueOfLegends <em>League Of Legends</em>}</li>
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
	 * Returns the value of the '<em><b>League Of Legends</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link leagueOfLegends.LeagueOfLegends#getChampions <em>Champions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>League Of Legends</em>' container reference.
	 * @see #setLeagueOfLegends(LeagueOfLegends)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getChampion_LeagueOfLegends()
	 * @see leagueOfLegends.LeagueOfLegends#getChampions
	 * @model opposite="champions" transient="false"
	 * @generated
	 */
	LeagueOfLegends getLeagueOfLegends();

	/**
	 * Sets the value of the '{@link leagueOfLegends.Champion#getLeagueOfLegends <em>League Of Legends</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>League Of Legends</em>' container reference.
	 * @see #getLeagueOfLegends()
	 * @generated
	 */
	void setLeagueOfLegends(LeagueOfLegends value);

} // Champion
