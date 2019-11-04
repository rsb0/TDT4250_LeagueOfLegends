/**
 */
package leagueOfLegends.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import leagueOfLegends.LeagueOfLegends;
import leagueOfLegends.LeagueOfLegendsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>League Of Legends</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LeagueOfLegendsTest extends TestCase {

	/**
	 * The fixture for this League Of Legends test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeagueOfLegends fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LeagueOfLegendsTest.class);
	}

	/**
	 * Constructs a new League Of Legends test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeagueOfLegendsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this League Of Legends test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(LeagueOfLegends fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this League Of Legends test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeagueOfLegends getFixture() {
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
		setFixture(LeagueOfLegendsFactory.eINSTANCE.createLeagueOfLegends());
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

} //LeagueOfLegendsTest
