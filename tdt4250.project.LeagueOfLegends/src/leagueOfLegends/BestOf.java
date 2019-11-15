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
	 * The '<em><b>QF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QF_VALUE
	 * @generated
	 * @ordered
	 */
	QF(5, "QF", "QF"), /**
	 * The '<em><b>F</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F_VALUE
	 * @generated
	 * @ordered
	 */
	F(5, "F", "F"), /**
	 * The '<em><b>SF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SF_VALUE
	 * @generated
	 * @ordered
	 */
	SF(5, "SF", "SF"), /**
	 * The '<em><b>Regular</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGULAR_VALUE
	 * @generated
	 * @ordered
	 */
	REGULAR(1, "Regular", "Regular"), /**
	 * The '<em><b>R1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #R1_VALUE
	 * @generated
	 * @ordered
	 */
	R1(5, "R1", "R1"), /**
	 * The '<em><b>R2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #R2_VALUE
	 * @generated
	 * @ordered
	 */
	R2(5, "R2", "R2"), /**
	 * The '<em><b>R3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #R3_VALUE
	 * @generated
	 * @ordered
	 */
	R3(5, "R3", "R3"), /**
	 * The '<em><b>3p</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_3P_VALUE
	 * @generated
	 * @ordered
	 */
	_3P(5, "_3p", "_3p");

	/**
	 * The '<em><b>QF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QF_VALUE = 5;

	/**
	 * The '<em><b>F</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int F_VALUE = 5;

	/**
	 * The '<em><b>SF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SF_VALUE = 5;

	/**
	 * The '<em><b>Regular</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGULAR
	 * @model name="Regular"
	 * @generated
	 * @ordered
	 */
	public static final int REGULAR_VALUE = 1;

	/**
	 * The '<em><b>R1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #R1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int R1_VALUE = 5;

	/**
	 * The '<em><b>R2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #R2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int R2_VALUE = 5;

	/**
	 * The '<em><b>R3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #R3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int R3_VALUE = 5;

	/**
	 * The '<em><b>3p</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_3P
	 * @model name="_3p"
	 * @generated
	 * @ordered
	 */
	public static final int _3P_VALUE = 5;

	/**
	 * An array of all the '<em><b>Best Of</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BestOf[] VALUES_ARRAY =
		new BestOf[] {
			QF,
			F,
			SF,
			REGULAR,
			R1,
			R2,
			R3,
			_3P,
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
			case QF_VALUE: return QF;
			case REGULAR_VALUE: return REGULAR;
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
