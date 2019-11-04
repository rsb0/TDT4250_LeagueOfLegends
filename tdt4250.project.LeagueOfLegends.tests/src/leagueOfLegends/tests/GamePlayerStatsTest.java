/**
 */
package leagueOfLegends.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import leagueOfLegends.GamePlayerStats;
import leagueOfLegends.LeagueOfLegendsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Game Player Stats</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GamePlayerStatsTest extends TestCase {

	/**
	 * The fixture for this Game Player Stats test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GamePlayerStats fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GamePlayerStatsTest.class);
	}

	/**
	 * Constructs a new Game Player Stats test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GamePlayerStatsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Game Player Stats test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(GamePlayerStats fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Game Player Stats test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GamePlayerStats getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(LeagueOfLegendsFactory.eINSTANCE.createGamePlayerStats());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //GamePlayerStatsTest
