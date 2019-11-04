/**
 */
package leagueOfLegends;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>League Of Legends</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link leagueOfLegends.LeagueOfLegends#getChampions <em>Champions</em>}</li>
 *   <li>{@link leagueOfLegends.LeagueOfLegends#getLeagues <em>Leagues</em>}</li>
 * </ul>
 *
 * @see leagueOfLegends.LeagueOfLegendsPackage#getLeagueOfLegends()
 * @model
 * @generated
 */
public interface LeagueOfLegends extends EObject {
	/**
	 * Returns the value of the '<em><b>Champions</b></em>' containment reference list.
	 * The list contents are of type {@link leagueOfLegends.Champion}.
	 * It is bidirectional and its opposite is '{@link leagueOfLegends.Champion#getLeagueOfLegends <em>League Of Legends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Champions</em>' containment reference list.
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getLeagueOfLegends_Champions()
	 * @see leagueOfLegends.Champion#getLeagueOfLegends
	 * @model opposite="leagueOfLegends" containment="true"
	 * @generated
	 */
	EList<Champion> getChampions();

	/**
	 * Returns the value of the '<em><b>Leagues</b></em>' containment reference list.
	 * The list contents are of type {@link leagueOfLegends.League}.
	 * It is bidirectional and its opposite is '{@link leagueOfLegends.League#getLeagueOfLegends <em>League Of Legends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leagues</em>' containment reference list.
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getLeagueOfLegends_Leagues()
	 * @see leagueOfLegends.League#getLeagueOfLegends
	 * @model opposite="leagueOfLegends" containment="true"
	 * @generated
	 */
	EList<League> getLeagues();

} // LeagueOfLegends
