/**
 */
package leagueOfLegends;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link leagueOfLegends.Player#getName <em>Name</em>}</li>
 *   <li>{@link leagueOfLegends.Player#getPosition <em>Position</em>}</li>
 *   <li>{@link leagueOfLegends.Player#getChampionPool <em>Champion Pool</em>}</li>
 *   <li>{@link leagueOfLegends.Player#getPlayerStats <em>Player Stats</em>}</li>
 *   <li>{@link leagueOfLegends.Player#getTeam <em>Team</em>}</li>
 * </ul>
 *
 * @see leagueOfLegends.LeagueOfLegendsPackage#getPlayer()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nameNotNull teamNotNull validPosition'"
 * @generated
 */
public interface Player extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getPlayer_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link leagueOfLegends.Player#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The literals are from the enumeration {@link leagueOfLegends.Position}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see leagueOfLegends.Position
	 * @see #setPosition(Position)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getPlayer_Position()
	 * @model
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link leagueOfLegends.Player#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see leagueOfLegends.Position
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

	/**
	 * Returns the value of the '<em><b>Champion Pool</b></em>' reference list.
	 * The list contents are of type {@link leagueOfLegends.Champion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Champion Pool</em>' reference list.
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getPlayer_ChampionPool()
	 * @model
	 * @generated
	 */
	EList<Champion> getChampionPool();

	/**
	 * Returns the value of the '<em><b>Player Stats</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link leagueOfLegends.PlayerStats#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player Stats</em>' containment reference.
	 * @see #setPlayerStats(PlayerStats)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getPlayer_PlayerStats()
	 * @see leagueOfLegends.PlayerStats#getPlayer
	 * @model opposite="player" containment="true" required="true"
	 * @generated
	 */
	PlayerStats getPlayerStats();

	/**
	 * Sets the value of the '{@link leagueOfLegends.Player#getPlayerStats <em>Player Stats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player Stats</em>' containment reference.
	 * @see #getPlayerStats()
	 * @generated
	 */
	void setPlayerStats(PlayerStats value);

	/**
	 * Returns the value of the '<em><b>Team</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link leagueOfLegends.Team#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team</em>' container reference.
	 * @see #setTeam(Team)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getPlayer_Team()
	 * @see leagueOfLegends.Team#getPlayer
	 * @model opposite="player" required="true" transient="false"
	 * @generated
	 */
	Team getTeam();

	/**
	 * Sets the value of the '{@link leagueOfLegends.Player#getTeam <em>Team</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team</em>' container reference.
	 * @see #getTeam()
	 * @generated
	 */
	void setTeam(Team value);

} // Player
