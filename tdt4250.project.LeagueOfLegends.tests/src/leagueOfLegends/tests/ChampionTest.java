/**
 */
package leagueOfLegends.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import leagueOfLegends.Champion;
import leagueOfLegends.LeagueOfLegendsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Champion</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChampionTest extends TestCase {

	/**
	 * The fixture for this Champion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Champion fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ChampionTest.class);
	}

	/**
	 * Constructs a new Champion test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChampionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Champion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Champion fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Champion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Champion getFixture() {
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
		setFixture(LeagueOfLegendsFactory.eINSTANCE.createChampion());
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

} //ChampionTest
