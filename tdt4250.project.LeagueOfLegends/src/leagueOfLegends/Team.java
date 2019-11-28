/**
 */
package leagueOfLegends;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link leagueOfLegends.Team#getName <em>Name</em>}</li>
 *   <li>{@link leagueOfLegends.Team#getLeague <em>League</em>}</li>
 *   <li>{@link leagueOfLegends.Team#getPlayer <em>Player</em>}</li>
 *   <li>{@link leagueOfLegends.Team#getWinLossRatio <em>Win Loss Ratio</em>}</li>
 *   <li>{@link leagueOfLegends.Team#getTeamStats <em>Team Stats</em>}</li>
 * </ul>
 *
 * @see leagueOfLegends.LeagueOfLegendsPackage#getTeam()
 * @model
 * @generated
 */
public interface Team extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getTeam_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link leagueOfLegends.Team#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>League</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link leagueOfLegends.League#getTeams <em>Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>League</em>' container reference.
	 * @see #setLeague(League)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getTeam_League()
	 * @see leagueOfLegends.League#getTeams
	 * @model opposite="teams" required="true" transient="false"
	 * @generated
	 */
	League getLeague();

	/**
	 * Sets the value of the '{@link leagueOfLegends.Team#getLeague <em>League</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>League</em>' container reference.
	 * @see #getLeague()
	 * @generated
	 */
	void setLeague(League value);

	/**
	 * Returns the value of the '<em><b>Player</b></em>' containment reference list.
	 * The list contents are of type {@link leagueOfLegends.Player}.
	 * It is bidirectional and its opposite is '{@link leagueOfLegends.Player#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player</em>' containment reference list.
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getTeam_Player()
	 * @see leagueOfLegends.Player#getTeam
	 * @model opposite="team" containment="true" lower="5"
	 * @generated
	 */
	EList<Player> getPlayer();

	/**
	 * Returns the value of the '<em><b>Win Loss Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Win Loss Ratio</em>' attribute.
	 * @see #setWinLossRatio(float)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getTeam_WinLossRatio()
	 * @model derived="true"
	 * @generated
	 */
	float getWinLossRatio();

	/**
	 * Sets the value of the '{@link leagueOfLegends.Team#getWinLossRatio <em>Win Loss Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Win Loss Ratio</em>' attribute.
	 * @see #getWinLossRatio()
	 * @generated
	 */
	void setWinLossRatio(float value);

	/**
	 * Returns the value of the '<em><b>Team Stats</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link leagueOfLegends.TeamStats#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team Stats</em>' containment reference.
	 * @see #setTeamStats(TeamStats)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getTeam_TeamStats()
	 * @see leagueOfLegends.TeamStats#getTeam
	 * @model opposite="team" containment="true"
	 * @generated
	 */
	TeamStats getTeamStats();

	/**
	 * Sets the value of the '{@link leagueOfLegends.Team#getTeamStats <em>Team Stats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team Stats</em>' containment reference.
	 * @see #getTeamStats()
	 * @generated
	 */
	void setTeamStats(TeamStats value);

} // Team
