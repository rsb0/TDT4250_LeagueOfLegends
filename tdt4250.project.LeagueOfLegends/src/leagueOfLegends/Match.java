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
 *   <li>{@link leagueOfLegends.Match#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link leagueOfLegends.Match#getMatchID <em>Match ID</em>}</li>
 *   <li>{@link leagueOfLegends.Match#getBestOF <em>Best OF</em>}</li>
 *   <li>{@link leagueOfLegends.Match#getScore <em>Score</em>}</li>
 *   <li>{@link leagueOfLegends.Match#getTeams <em>Teams</em>}</li>
 *   <li>{@link leagueOfLegends.Match#getWeek <em>Week</em>}</li>
 *   <li>{@link leagueOfLegends.Match#getWinner <em>Winner</em>}</li>
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
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getMatch_DisplayName()
	 * @model
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link leagueOfLegends.Match#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

	/**
	 * Returns the value of the '<em><b>Match ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match ID</em>' attribute.
	 * @see #setMatchID(String)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getMatch_MatchID()
	 * @model
	 * @generated
	 */
	String getMatchID();

	/**
	 * Sets the value of the '{@link leagueOfLegends.Match#getMatchID <em>Match ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match ID</em>' attribute.
	 * @see #getMatchID()
	 * @generated
	 */
	void setMatchID(String value);

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
	 * @model upper="2"
	 * @generated
	 */
	EList<Team> getTeams();

	/**
	 * Returns the value of the '<em><b>Week</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Week</em>' attribute.
	 * @see #setWeek(String)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getMatch_Week()
	 * @model
	 * @generated
	 */
	String getWeek();

	/**
	 * Sets the value of the '{@link leagueOfLegends.Match#getWeek <em>Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Week</em>' attribute.
	 * @see #getWeek()
	 * @generated
	 */
	void setWeek(String value);

	/**
	 * Returns the value of the '<em><b>Winner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Winner</em>' reference.
	 * @see #setWinner(Team)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getMatch_Winner()
	 * @model required="true"
	 * @generated
	 */
	Team getWinner();

	/**
	 * Sets the value of the '{@link leagueOfLegends.Match#getWinner <em>Winner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Winner</em>' reference.
	 * @see #getWinner()
	 * @generated
	 */
	void setWinner(Team value);

} // Match
