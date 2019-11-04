/**
 */
package leagueOfLegends.impl;

import leagueOfLegends.Champion;
import leagueOfLegends.LeagueOfLegends;
import leagueOfLegends.LeagueOfLegendsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Champion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link leagueOfLegends.impl.ChampionImpl#getName <em>Name</em>}</li>
 *   <li>{@link leagueOfLegends.impl.ChampionImpl#getLeagueOfLegends <em>League Of Legends</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChampionImpl extends MinimalEObjectImpl.Container implements Champion {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChampionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LeagueOfLegendsPackage.Literals.CHAMPION;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.CHAMPION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LeagueOfLegends getLeagueOfLegends() {
		if (eContainerFeatureID() != LeagueOfLegendsPackage.CHAMPION__LEAGUE_OF_LEGENDS) return null;
		return (LeagueOfLegends)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeagueOfLegends(LeagueOfLegends newLeagueOfLegends, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLeagueOfLegends, LeagueOfLegendsPackage.CHAMPION__LEAGUE_OF_LEGENDS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeagueOfLegends(LeagueOfLegends newLeagueOfLegends) {
		if (newLeagueOfLegends != eInternalContainer() || (eContainerFeatureID() != LeagueOfLegendsPackage.CHAMPION__LEAGUE_OF_LEGENDS && newLeagueOfLegends != null)) {
			if (EcoreUtil.isAncestor(this, newLeagueOfLegends))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLeagueOfLegends != null)
				msgs = ((InternalEObject)newLeagueOfLegends).eInverseAdd(this, LeagueOfLegendsPackage.LEAGUE_OF_LEGENDS__CHAMPIONS, LeagueOfLegends.class, msgs);
			msgs = basicSetLeagueOfLegends(newLeagueOfLegends, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.CHAMPION__LEAGUE_OF_LEGENDS, newLeagueOfLegends, newLeagueOfLegends));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LeagueOfLegendsPackage.CHAMPION__LEAGUE_OF_LEGENDS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLeagueOfLegends((LeagueOfLegends)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LeagueOfLegendsPackage.CHAMPION__LEAGUE_OF_LEGENDS:
				return basicSetLeagueOfLegends(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case LeagueOfLegendsPackage.CHAMPION__LEAGUE_OF_LEGENDS:
				return eInternalContainer().eInverseRemove(this, LeagueOfLegendsPackage.LEAGUE_OF_LEGENDS__CHAMPIONS, LeagueOfLegends.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LeagueOfLegendsPackage.CHAMPION__NAME:
				return getName();
			case LeagueOfLegendsPackage.CHAMPION__LEAGUE_OF_LEGENDS:
				return getLeagueOfLegends();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LeagueOfLegendsPackage.CHAMPION__NAME:
				setName((String)newValue);
				return;
			case LeagueOfLegendsPackage.CHAMPION__LEAGUE_OF_LEGENDS:
				setLeagueOfLegends((LeagueOfLegends)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LeagueOfLegendsPackage.CHAMPION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.CHAMPION__LEAGUE_OF_LEGENDS:
				setLeagueOfLegends((LeagueOfLegends)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LeagueOfLegendsPackage.CHAMPION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LeagueOfLegendsPackage.CHAMPION__LEAGUE_OF_LEGENDS:
				return getLeagueOfLegends() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ChampionImpl
