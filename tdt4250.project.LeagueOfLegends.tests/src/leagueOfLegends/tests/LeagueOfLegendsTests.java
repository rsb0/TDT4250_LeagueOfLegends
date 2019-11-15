/**
 */
package leagueOfLegends.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>leagueOfLegends</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class LeagueOfLegendsTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new LeagueOfLegendsTests("leagueOfLegends Tests");
		suite.addTestSuite(TeamTest.class);
		suite.addTestSuite(PlayerStatsTest.class);
		suite.addTestSuite(ChampionsStatsTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeagueOfLegendsTests(String name) {
		super(name);
	}

} //LeagueOfLegendsTests
