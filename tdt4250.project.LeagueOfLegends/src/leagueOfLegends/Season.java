/**
 */
package leagueOfLegends;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Season</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link leagueOfLegends.Season#getSplitName <em>Split Name</em>}</li>
 *   <li>{@link leagueOfLegends.Season#getMatches <em>Matches</em>}</li>
 *   <li>{@link leagueOfLegends.Season#getLeague <em>League</em>}</li>
 * </ul>
 *
 * @see leagueOfLegends.LeagueOfLegendsPackage#getSeason()
 * @model
 * @generated
 */
public interface Season extends EObject {

	/**
	 * Returns the value of the '<em><b>Split Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Split Name</em>' attribute.
	 * @see #setSplitName(String)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getSeason_SplitName()
	 * @model
	 * @generated
	 */
	String getSplitName();

	/**
	 * Sets the value of the '{@link leagueOfLegends.Season#getSplitName <em>Split Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Split Name</em>' attribute.
	 * @see #getSplitName()
	 * @generated
	 */
	void setSplitName(String value);

	/**
	 * Returns the value of the '<em><b>Matches</b></em>' containment reference list.
	 * The list contents are of type {@link leagueOfLegends.Match}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matches</em>' containment reference list.
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getSeason_Matches()
	 * @model containment="true"
	 * @generated
	 */
	EList<Match> getMatches();

	/**
	 * Returns the value of the '<em><b>League</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link leagueOfLegends.League#getSeasons <em>Seasons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>League</em>' container reference.
	 * @see #setLeague(League)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getSeason_League()
	 * @see leagueOfLegends.League#getSeasons
	 * @model opposite="seasons" required="true" transient="false"
	 * @generated
	 */
	League getLeague();

	/**
	 * Sets the value of the '{@link leagueOfLegends.Season#getLeague <em>League</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>League</em>' container reference.
	 * @see #getLeague()
	 * @generated
	 */
	void setLeague(League value);
} // Season
