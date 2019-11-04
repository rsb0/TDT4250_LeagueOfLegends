/**
 */
package leagueOfLegends;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Position</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see leagueOfLegends.LeagueOfLegendsPackage#getPosition()
 * @model
 * @generated
 */
public enum Position implements Enumerator {
	/**
	 * The '<em><b>Middle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIDDLE_VALUE
	 * @generated
	 * @ordered
	 */
	MIDDLE(0, "middle", "middle"),

	/**
	 * The '<em><b>Top</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOP_VALUE
	 * @generated
	 * @ordered
	 */
	TOP(1, "top", "top"),

	/**
	 * The '<em><b>Jungle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JUNGLE_VALUE
	 * @generated
	 * @ordered
	 */
	JUNGLE(2, "jungle", "jungle"),

	/**
	 * The '<em><b>Adc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADC_VALUE
	 * @generated
	 * @ordered
	 */
	ADC(3, "adc", "adc"),

	/**
	 * The '<em><b>Support</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPPORT_VALUE
	 * @generated
	 * @ordered
	 */
	SUPPORT(4, "support", "support");

	/**
	 * The '<em><b>Middle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIDDLE
	 * @model name="middle"
	 * @generated
	 * @ordered
	 */
	public static final int MIDDLE_VALUE = 0;

	/**
	 * The '<em><b>Top</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOP
	 * @model name="top"
	 * @generated
	 * @ordered
	 */
	public static final int TOP_VALUE = 1;

	/**
	 * The '<em><b>Jungle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JUNGLE
	 * @model name="jungle"
	 * @generated
	 * @ordered
	 */
	public static final int JUNGLE_VALUE = 2;

	/**
	 * The '<em><b>Adc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADC
	 * @model name="adc"
	 * @generated
	 * @ordered
	 */
	public static final int ADC_VALUE = 3;

	/**
	 * The '<em><b>Support</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPPORT
	 * @model name="support"
	 * @generated
	 * @ordered
	 */
	public static final int SUPPORT_VALUE = 4;

	/**
	 * An array of all the '<em><b>Position</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Position[] VALUES_ARRAY =
		new Position[] {
			MIDDLE,
			TOP,
			JUNGLE,
			ADC,
			SUPPORT,
		};

	/**
	 * A public read-only list of all the '<em><b>Position</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Position> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Position</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Position get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Position result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Position</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Position getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Position result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Position</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Position get(int value) {
		switch (value) {
			case MIDDLE_VALUE: return MIDDLE;
			case TOP_VALUE: return TOP;
			case JUNGLE_VALUE: return JUNGLE;
			case ADC_VALUE: return ADC;
			case SUPPORT_VALUE: return SUPPORT;
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
	private Position(int value, String name, String literal) {
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
	
} //Position
