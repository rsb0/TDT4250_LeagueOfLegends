/**
 */
package leagueOfLegends;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link leagueOfLegends.Match#getGames <em>Games</em>}</li>
 *   <li>{@link leagueOfLegends.Match#getMatchID <em>Match ID</em>}</li>
 *   <li>{@link leagueOfLegends.Match#getBestOF <em>Best OF</em>}</li>
 *   <li>{@link leagueOfLegends.Match#getScore <em>Score</em>}</li>
 *   <li>{@link leagueOfLegends.Match#getTeams <em>Teams</em>}</li>
 * </ul>
 *
 * @see leagueOfLegends.LeagueOfLegendsPackage#getMatch()
 * @model
 * @generated
 */
public interface Match extends EObject {
	/**
	 * Returns the value of the '<em><b>Games</b></em>' containment reference list.
	 * The list contents are of type {@link leagueOfLegends.Game}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Games</em>' containment reference list.
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getMatch_Games()
	 * @model containment="true"
	 * @generated
	 */
	EList<Game> getGames();

	/**
	 * Returns the value of the '<em><b>Match ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match ID</em>' attribute.
	 * @see #setMatchID(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getMatch_MatchID()
	 * @model
	 * @generated
	 */
	int getMatchID();

	/**
	 * Sets the value of the '{@link leagueOfLegends.Match#getMatchID <em>Match ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match ID</em>' attribute.
	 * @see #getMatchID()
	 * @generated
	 */
	void setMatchID(int value);

	/**
	 * Returns the value of the '<em><b>Best OF</b></em>' attribute.
	 * The literals are from the enumeration {@link leagueOfLegends.BestOf}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Best OF</em>' attribute.
	 * @see leagueOfLegends.BestOf
	 * @see #setBestOF(BestOf)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getMatch_BestOF()
	 * @model
	 * @generated
	 */
	BestOf getBestOF();

	/**
	 * Sets the value of the '{@link leagueOfLegends.Match#getBestOF <em>Best OF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Best OF</em>' attribute.
	 * @see leagueOfLegends.BestOf
	 * @see #getBestOF()
	 * @generated
	 */
	void setBestOF(BestOf value);

	/**
	 * Returns the value of the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' attribute.
	 * @see #setScore(String)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getMatch_Score()
	 * @model
	 * @generated
	 */
	String getScore();

	/**
	 * Sets the value of the '{@link leagueOfLegends.Match#getScore <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' attribute.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(String value);

	/**
	 * Returns the value of the '<em><b>Teams</b></em>' reference list.
	 * The list contents are of type {@link leagueOfLegends.Team}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teams</em>' reference list.
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getMatch_Teams()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<Team> getTeams();

} // Match
