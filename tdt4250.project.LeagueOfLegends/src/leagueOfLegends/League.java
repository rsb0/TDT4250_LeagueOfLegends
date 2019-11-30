/**
 */
package leagueOfLegends;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>League</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link leagueOfLegends.League#getName <em>Name</em>}</li>
 *   <li>{@link leagueOfLegends.League#getLeagueStats <em>League Stats</em>}</li>
 *   <li>{@link leagueOfLegends.League#getTeams <em>Teams</em>}</li>
 *   <li>{@link leagueOfLegends.League#getSeasons <em>Seasons</em>}</li>
 *   <li>{@link leagueOfLegends.League#getChampions <em>Champions</em>}</li>
 * </ul>
 *
 * @see leagueOfLegends.LeagueOfLegendsPackage#getLeague()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nameNotNull validNumberOfSeasons validNumberOfTeams validNumberOfChampions uniqueTeamNames uniqueChampionNames'"
 * @generated
 */
public interface League extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getLeague_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link leagueOfLegends.League#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Teams</b></em>' containment reference list.
	 * The list contents are of type {@link leagueOfLegends.Team}.
	 * It is bidirectional and its opposite is '{@link leagueOfLegends.Team#getLeague <em>League</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teams</em>' containment reference list.
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getLeague_Teams()
	 * @see leagueOfLegends.Team#getLeague
	 * @model opposite="league" containment="true"
	 * @generated
	 */
	EList<Team> getTeams();

	/**
	 * Returns the value of the '<em><b>Seasons</b></em>' containment reference list.
	 * The list contents are of type {@link leagueOfLegends.Season}.
	 * It is bidirectional and its opposite is '{@link leagueOfLegends.Season#getLeague <em>League</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seasons</em>' containment reference list.
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getLeague_Seasons()
	 * @see leagueOfLegends.Season#getLeague
	 * @model opposite="league" containment="true"
	 * @generated
	 */
	EList<Season> getSeasons();

	/**
	 * Returns the value of the '<em><b>Champions</b></em>' containment reference list.
	 * The list contents are of type {@link leagueOfLegends.Champion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Champions</em>' containment reference list.
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getLeague_Champions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Champion> getChampions();

	/**
	 * Returns the value of the '<em><b>League Stats</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link leagueOfLegends.LeagueStats#getLeague <em>League</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>League Stats</em>' containment reference.
	 * @see #setLeagueStats(LeagueStats)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getLeague_LeagueStats()
	 * @see leagueOfLegends.LeagueStats#getLeague
	 * @model opposite="league" containment="true"
	 * @generated
	 */
	LeagueStats getLeagueStats();

	/**
	 * Sets the value of the '{@link leagueOfLegends.League#getLeagueStats <em>League Stats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>League Stats</em>' containment reference.
	 * @see #getLeagueStats()
	 * @generated
	 */
	void setLeagueStats(LeagueStats value);

} // League
