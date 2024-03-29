/**
 */
package leagueOfLegends;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link leagueOfLegends.Game#getGameID <em>Game ID</em>}</li>
 *   <li>{@link leagueOfLegends.Game#getGameStats <em>Game Stats</em>}</li>
 *   <li>{@link leagueOfLegends.Game#getRedTeam <em>Red Team</em>}</li>
 *   <li>{@link leagueOfLegends.Game#getBlueTeam <em>Blue Team</em>}</li>
 *   <li>{@link leagueOfLegends.Game#getGameTeamStat <em>Game Team Stat</em>}</li>
 *   <li>{@link leagueOfLegends.Game#getGamePlayerStats <em>Game Player Stats</em>}</li>
 *   <li>{@link leagueOfLegends.Game#getWinningSide <em>Winning Side</em>}</li>
 *   <li>{@link leagueOfLegends.Game#getWinningTeam <em>Winning Team</em>}</li>
 *   <li>{@link leagueOfLegends.Game#getMatch <em>Match</em>}</li>
 * </ul>
 *
 * @see leagueOfLegends.LeagueOfLegendsPackage#getGame()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='blueTeamNotNull redTeamNotNull validGameID validWinningSide winnerTeamNotNull'"
 * @generated
 */
public interface Game extends EObject {
	/**
	 * Returns the value of the '<em><b>Game ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game ID</em>' attribute.
	 * @see #setGameID(String)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGame_GameID()
	 * @model required="true"
	 * @generated
	 */
	String getGameID();

	/**
	 * Sets the value of the '{@link leagueOfLegends.Game#getGameID <em>Game ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game ID</em>' attribute.
	 * @see #getGameID()
	 * @generated
	 */
	void setGameID(String value);

	/**
	 * Returns the value of the '<em><b>Game Stats</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link leagueOfLegends.GameStats#getGame <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game Stats</em>' containment reference.
	 * @see #setGameStats(GameStats)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGame_GameStats()
	 * @see leagueOfLegends.GameStats#getGame
	 * @model opposite="game" containment="true" required="true"
	 * @generated
	 */
	GameStats getGameStats();

	/**
	 * Sets the value of the '{@link leagueOfLegends.Game#getGameStats <em>Game Stats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game Stats</em>' containment reference.
	 * @see #getGameStats()
	 * @generated
	 */
	void setGameStats(GameStats value);

	/**
	 * Returns the value of the '<em><b>Red Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Red Team</em>' reference.
	 * @see #setRedTeam(Team)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGame_RedTeam()
	 * @model required="true"
	 * @generated
	 */
	Team getRedTeam();

	/**
	 * Sets the value of the '{@link leagueOfLegends.Game#getRedTeam <em>Red Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Red Team</em>' reference.
	 * @see #getRedTeam()
	 * @generated
	 */
	void setRedTeam(Team value);

	/**
	 * Returns the value of the '<em><b>Blue Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blue Team</em>' reference.
	 * @see #setBlueTeam(Team)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGame_BlueTeam()
	 * @model required="true"
	 * @generated
	 */
	Team getBlueTeam();

	/**
	 * Sets the value of the '{@link leagueOfLegends.Game#getBlueTeam <em>Blue Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blue Team</em>' reference.
	 * @see #getBlueTeam()
	 * @generated
	 */
	void setBlueTeam(Team value);

	/**
	 * Returns the value of the '<em><b>Game Team Stat</b></em>' containment reference list.
	 * The list contents are of type {@link leagueOfLegends.GameTeamStats}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game Team Stat</em>' containment reference list.
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGame_GameTeamStat()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<GameTeamStats> getGameTeamStat();

	/**
	 * Returns the value of the '<em><b>Game Player Stats</b></em>' containment reference list.
	 * The list contents are of type {@link leagueOfLegends.GamePlayerStats}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game Player Stats</em>' containment reference list.
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGame_GamePlayerStats()
	 * @model containment="true"
	 * @generated
	 */
	EList<GamePlayerStats> getGamePlayerStats();

	/**
	 * Returns the value of the '<em><b>Winning Side</b></em>' attribute.
	 * The literals are from the enumeration {@link leagueOfLegends.Side}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Winning Side</em>' attribute.
	 * @see leagueOfLegends.Side
	 * @see #setWinningSide(Side)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGame_WinningSide()
	 * @model
	 * @generated
	 */
	Side getWinningSide();

	/**
	 * Sets the value of the '{@link leagueOfLegends.Game#getWinningSide <em>Winning Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Winning Side</em>' attribute.
	 * @see leagueOfLegends.Side
	 * @see #getWinningSide()
	 * @generated
	 */
	void setWinningSide(Side value);

	/**
	 * Returns the value of the '<em><b>Winning Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Winning Team</em>' reference.
	 * @see #setWinningTeam(Team)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGame_WinningTeam()
	 * @model required="true"
	 * @generated
	 */
	Team getWinningTeam();

	/**
	 * Sets the value of the '{@link leagueOfLegends.Game#getWinningTeam <em>Winning Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Winning Team</em>' reference.
	 * @see #getWinningTeam()
	 * @generated
	 */
	void setWinningTeam(Team value);

	/**
	 * Returns the value of the '<em><b>Match</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link leagueOfLegends.Match#getGames <em>Games</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match</em>' container reference.
	 * @see #setMatch(Match)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getGame_Match()
	 * @see leagueOfLegends.Match#getGames
	 * @model opposite="games" required="true" transient="false"
	 * @generated
	 */
	Match getMatch();

	/**
	 * Sets the value of the '{@link leagueOfLegends.Game#getMatch <em>Match</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match</em>' container reference.
	 * @see #getMatch()
	 * @generated
	 */
	void setMatch(Match value);

} // Game
