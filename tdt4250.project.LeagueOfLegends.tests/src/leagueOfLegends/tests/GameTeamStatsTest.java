/**
 */
package leagueOfLegends.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import leagueOfLegends.GameTeamStats;
import leagueOfLegends.LeagueOfLegendsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Game Team Stats</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GameTeamStatsTest extends TestCase {

	/**
	 * The fixture for this Game Team Stats test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameTeamStats fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GameTeamStatsTest.class);
	}

	/**
	 * Constructs a new Game Team Stats test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameTeamStatsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Game Team Stats test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(GameTeamStats fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Game Team Stats test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameTeamStats getFixture() {
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
		setFixture(LeagueOfLegendsFactory.eINSTANCE.createGameTeamStats());
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

} //GameTeamStatsTest
