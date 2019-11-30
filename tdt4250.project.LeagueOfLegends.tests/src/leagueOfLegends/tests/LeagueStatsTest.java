/**
 */
package leagueOfLegends.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import leagueOfLegends.LeagueOfLegendsFactory;
import leagueOfLegends.LeagueStats;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>League Stats</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LeagueStatsTest extends TestCase {

	/**
	 * The fixture for this League Stats test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeagueStats fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LeagueStatsTest.class);
	}

	/**
	 * Constructs a new League Stats test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeagueStatsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this League Stats test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(LeagueStats fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this League Stats test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeagueStats getFixture() {
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
		setFixture(LeagueOfLegendsFactory.eINSTANCE.createLeagueStats());
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

} //LeagueStatsTest
