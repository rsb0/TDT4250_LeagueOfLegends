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
 *   <li>{@link leagueOfLegends.Season#getSplitType <em>Split Type</em>}</li>
 * </ul>
 *
 * @see leagueOfLegends.LeagueOfLegendsPackage#getSeason()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='validSplitName leagueNotNull atleastOneMatchPerSeason'"
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
	 * It is bidirectional and its opposite is '{@link leagueOfLegends.Match#getSeason <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matches</em>' containment reference list.
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getSeason_Matches()
	 * @see leagueOfLegends.Match#getSeason
	 * @model opposite="season" containment="true" required="true"
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

	/**
	 * Returns the value of the '<em><b>Split Type</b></em>' attribute.
	 * The literals are from the enumeration {@link leagueOfLegends.SplitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Split Type</em>' attribute.
	 * @see leagueOfLegends.SplitType
	 * @see #setSplitType(SplitType)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getSeason_SplitType()
	 * @model
	 * @generated
	 */
	SplitType getSplitType();

	/**
	 * Sets the value of the '{@link leagueOfLegends.Season#getSplitType <em>Split Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Split Type</em>' attribute.
	 * @see leagueOfLegends.SplitType
	 * @see #getSplitType()
	 * @generated
	 */
	void setSplitType(SplitType value);
} // Season
