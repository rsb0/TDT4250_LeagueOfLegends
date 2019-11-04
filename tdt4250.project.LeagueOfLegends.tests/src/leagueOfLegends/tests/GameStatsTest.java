/**
 */
package leagueOfLegends.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import leagueOfLegends.GameStats;
import leagueOfLegends.LeagueOfLegendsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Game Stats</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GameStatsTest extends TestCase {

	/**
	 * The fixture for this Game Stats test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameStats fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GameStatsTest.class);
	}

	/**
	 * Constructs a new Game Stats test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameStatsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Game Stats test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(GameStats fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Game Stats test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameStats getFixture() {
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
		setFixture(LeagueOfLegendsFactory.eINSTANCE.createGameStats());
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

} //GameStatsTest
