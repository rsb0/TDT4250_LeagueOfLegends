/**
 */
package leagueOfLegends;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Best Of</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see leagueOfLegends.LeagueOfLegendsPackage#getBestOf()
 * @model
 * @generated
 */
public enum BestOf implements Enumerator {
	/**
	 * The '<em><b>Best Of One</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEST_OF_ONE_VALUE
	 * @generated
	 * @ordered
	 */
	BEST_OF_ONE(0, "bestOfOne", "bestOfOne"),

	/**
	 * The '<em><b>Best Of Three</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEST_OF_THREE_VALUE
	 * @generated
	 * @ordered
	 */
	BEST_OF_THREE(3, "bestOfThree", "bestOfThree"),

	/**
	 * The '<em><b>Best Of Five</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEST_OF_FIVE_VALUE
	 * @generated
	 * @ordered
	 */
	BEST_OF_FIVE(5, "bestOfFive", "bestOfFive");

	/**
	 * The '<em><b>Best Of One</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEST_OF_ONE
	 * @model name="bestOfOne"
	 * @generated
	 * @ordered
	 */
	public static final int BEST_OF_ONE_VALUE = 0;

	/**
	 * The '<em><b>Best Of Three</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEST_OF_THREE
	 * @model name="bestOfThree"
	 * @generated
	 * @ordered
	 */
	public static final int BEST_OF_THREE_VALUE = 3;

	/**
	 * The '<em><b>Best Of Five</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEST_OF_FIVE
	 * @model name="bestOfFive"
	 * @generated
	 * @ordered
	 */
	public static final int BEST_OF_FIVE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Best Of</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BestOf[] VALUES_ARRAY =
		new BestOf[] {
			BEST_OF_ONE,
			BEST_OF_THREE,
			BEST_OF_FIVE,
		};

	/**
	 * A public read-only list of all the '<em><b>Best Of</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BestOf> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Best Of</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BestOf get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BestOf result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Best Of</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BestOf getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BestOf result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Best Of</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BestOf get(int value) {
		switch (value) {
			case BEST_OF_ONE_VALUE: return BEST_OF_ONE;
			case BEST_OF_THREE_VALUE: return BEST_OF_THREE;
			case BEST_OF_FIVE_VALUE: return BEST_OF_FIVE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BestOf(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //BestOf
