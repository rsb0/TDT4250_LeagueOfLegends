/**
 */
package leagueOfLegends.impl;

import java.util.Collection;

import leagueOfLegends.League;
import leagueOfLegends.LeagueOfLegendsPackage;
import leagueOfLegends.Player;
import leagueOfLegends.Team;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link leagueOfLegends.impl.TeamImpl#getName <em>Name</em>}</li>
 *   <li>{@link leagueOfLegends.impl.TeamImpl#getLeague <em>League</em>}</li>
 *   <li>{@link leagueOfLegends.impl.TeamImpl#getPlayer <em>Player</em>}</li>
 *   <li>{@link leagueOfLegends.impl.TeamImpl#getWinLossRatio <em>Win Loss Ratio</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TeamImpl extends MinimalEObjectImpl.Container implements Team {
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
	 * The cached value of the '{@link #getPlayer() <em>Player</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayer()
	 * @generated
	 * @ordered
	 */
	protected EList<Player> player;

	/**
	 * The default value of the '{@link #getWinLossRatio() <em>Win Loss Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinLossRatio()
	 * @generated
	 * @ordered
	 */
	protected static final float WIN_LOSS_RATIO_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWinLossRatio() <em>Win Loss Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinLossRatio()
	 * @generated
	 * @ordered
	 */
	protected float winLossRatio = WIN_LOSS_RATIO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LeagueOfLegendsPackage.Literals.TEAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.TEAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public League getLeague() {
		if (eContainerFeatureID() != LeagueOfLegendsPackage.TEAM__LEAGUE) return null;
		return (League)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeague(League newLeague, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLeague, LeagueOfLegendsPackage.TEAM__LEAGUE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeague(League newLeague) {
		if (newLeague != eInternalContainer() || (eContainerFeatureID() != LeagueOfLegendsPackage.TEAM__LEAGUE && newLeague != null)) {
			if (EcoreUtil.isAncestor(this, newLeague))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLeague != null)
				msgs = ((InternalEObject)newLeague).eInverseAdd(this, LeagueOfLegendsPackage.LEAGUE__TEAMS, League.class, msgs);
			msgs = basicSetLeague(newLeague, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.TEAM__LEAGUE, newLeague, newLeague));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Player> getPlayer() {
		if (player == null) {
			player = new EObjectContainmentWithInverseEList<Player>(Player.class, this, LeagueOfLegendsPackage.TEAM__PLAYER, LeagueOfLegendsPackage.PLAYER__TEAM);
		}
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getWinLossRatio() {
		return winLossRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWinLossRatio(float newWinLossRatio) {
		float oldWinLossRatio = winLossRatio;
		winLossRatio = newWinLossRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.TEAM__WIN_LOSS_RATIO, oldWinLossRatio, winLossRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LeagueOfLegendsPackage.TEAM__LEAGUE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLeague((League)otherEnd, msgs);
			case LeagueOfLegendsPackage.TEAM__PLAYER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPlayer()).basicAdd(otherEnd, msgs);
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
			case LeagueOfLegendsPackage.TEAM__LEAGUE:
				return basicSetLeague(null, msgs);
			case LeagueOfLegendsPackage.TEAM__PLAYER:
				return ((InternalEList<?>)getPlayer()).basicRemove(otherEnd, msgs);
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
			case LeagueOfLegendsPackage.TEAM__LEAGUE:
				return eInternalContainer().eInverseRemove(this, LeagueOfLegendsPackage.LEAGUE__TEAMS, League.class, msgs);
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
			case LeagueOfLegendsPackage.TEAM__NAME:
				return getName();
			case LeagueOfLegendsPackage.TEAM__LEAGUE:
				return getLeague();
			case LeagueOfLegendsPackage.TEAM__PLAYER:
				return getPlayer();
			case LeagueOfLegendsPackage.TEAM__WIN_LOSS_RATIO:
				return getWinLossRatio();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LeagueOfLegendsPackage.TEAM__NAME:
				setName((String)newValue);
				return;
			case LeagueOfLegendsPackage.TEAM__LEAGUE:
				setLeague((League)newValue);
				return;
			case LeagueOfLegendsPackage.TEAM__PLAYER:
				getPlayer().clear();
				getPlayer().addAll((Collection<? extends Player>)newValue);
				return;
			case LeagueOfLegendsPackage.TEAM__WIN_LOSS_RATIO:
				setWinLossRatio((Float)newValue);
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
			case LeagueOfLegendsPackage.TEAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.TEAM__LEAGUE:
				setLeague((League)null);
				return;
			case LeagueOfLegendsPackage.TEAM__PLAYER:
				getPlayer().clear();
				return;
			case LeagueOfLegendsPackage.TEAM__WIN_LOSS_RATIO:
				setWinLossRatio(WIN_LOSS_RATIO_EDEFAULT);
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
			case LeagueOfLegendsPackage.TEAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LeagueOfLegendsPackage.TEAM__LEAGUE:
				return getLeague() != null;
			case LeagueOfLegendsPackage.TEAM__PLAYER:
				return player != null && !player.isEmpty();
			case LeagueOfLegendsPackage.TEAM__WIN_LOSS_RATIO:
				return winLossRatio != WIN_LOSS_RATIO_EDEFAULT;
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
		result.append(", winLossRatio: ");
		result.append(winLossRatio);
		result.append(')');
		return result.toString();
	}

} //TeamImpl
