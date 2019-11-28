/**
 */
package leagueOfLegends;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see leagueOfLegends.LeagueOfLegendsPackage
 * @generated
 */
public interface LeagueOfLegendsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LeagueOfLegendsFactory eINSTANCE = leagueOfLegends.impl.LeagueOfLegendsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>League</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>League</em>'.
	 * @generated
	 */
	League createLeague();

	/**
	 * Returns a new object of class '<em>Team</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Team</em>'.
	 * @generated
	 */
	Team createTeam();

	/**
	 * Returns a new object of class '<em>Player</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Player</em>'.
	 * @generated
	 */
	Player createPlayer();

	/**
	 * Returns a new object of class '<em>Player Stats</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Player Stats</em>'.
	 * @generated
	 */
	PlayerStats createPlayerStats();

	/**
	 * Returns a new object of class '<em>Champion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Champion</em>'.
	 * @generated
	 */
	Champion createChampion();

	/**
	 * Returns a new object of class '<em>Match</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Match</em>'.
	 * @generated
	 */
	Match createMatch();

	/**
	 * Returns a new object of class '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Game</em>'.
	 * @generated
	 */
	Game createGame();

	/**
	 * Returns a new object of class '<em>Game Team Stats</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Game Team Stats</em>'.
	 * @generated
	 */
	GameTeamStats createGameTeamStats();

	/**
	 * Returns a new object of class '<em>Game Player Stats</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Game Player Stats</em>'.
	 * @generated
	 */
	GamePlayerStats createGamePlayerStats();

	/**
	 * Returns a new object of class '<em>Season</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Season</em>'.
	 * @generated
	 */
	Season createSeason();

	/**
	 * Returns a new object of class '<em>Game Stats</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Game Stats</em>'.
	 * @generated
	 */
	GameStats createGameStats();

	/**
	 * Returns a new object of class '<em>Champions Stats</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Champions Stats</em>'.
	 * @generated
	 */
	ChampionsStats createChampionsStats();

	/**
	 * Returns a new object of class '<em>Team Stats</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Team Stats</em>'.
	 * @generated
	 */
	TeamStats createTeamStats();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LeagueOfLegendsPackage getLeagueOfLegendsPackage();

} //LeagueOfLegendsFactory
