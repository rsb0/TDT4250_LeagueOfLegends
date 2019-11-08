/**
 */
package leagueOfLegends;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Split Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see leagueOfLegends.LeagueOfLegendsPackage#getSplitType()
 * @model
 * @generated
 */
public enum SplitType implements Enumerator {
	/**
	 * The '<em><b>Regular</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGULAR_VALUE
	 * @generated
	 * @ordered
	 */
	REGULAR(0, "regular", ""),

	/**
	 * The '<em><b>Playoff</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAYOFF_VALUE
	 * @generated
	 * @ordered
	 */
	PLAYOFF(1, "playoff", "playoff"),

	/**
	 * The '<em><b>Regionals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGIONALS_VALUE
	 * @generated
	 * @ordered
	 */
	REGIONALS(2, "regionals", "regionals"),

	/**
	 * The '<em><b>Worlds</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORLDS_VALUE
	 * @generated
	 * @ordered
	 */
	WORLDS(3, "worlds", "worlds");

	/**
	 * The '<em><b>Regular</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGULAR
	 * @model name="regular" literal=""
	 * @generated
	 * @ordered
	 */
	public static final int REGULAR_VALUE = 0;

	/**
	 * The '<em><b>Playoff</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAYOFF
	 * @model name="playoff"
	 * @generated
	 * @ordered
	 */
	public static final int PLAYOFF_VALUE = 1;

	/**
	 * The '<em><b>Regionals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGIONALS
	 * @model name="regionals"
	 * @generated
	 * @ordered
	 */
	public static final int REGIONALS_VALUE = 2;

	/**
	 * The '<em><b>Worlds</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORLDS
	 * @model name="worlds"
	 * @generated
	 * @ordered
	 */
	public static final int WORLDS_VALUE = 3;

	/**
	 * An array of all the '<em><b>Split Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SplitType[] VALUES_ARRAY =
		new SplitType[] {
			REGULAR,
			PLAYOFF,
			REGIONALS,
			WORLDS,
		};

	/**
	 * A public read-only list of all the '<em><b>Split Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SplitType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Split Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SplitType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SplitType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Split Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SplitType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SplitType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Split Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SplitType get(int value) {
		switch (value) {
			case REGULAR_VALUE: return REGULAR;
			case PLAYOFF_VALUE: return PLAYOFF;
			case REGIONALS_VALUE: return REGIONALS;
			case WORLDS_VALUE: return WORLDS;
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
	private SplitType(int value, String name, String literal) {
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
	
} //SplitType
