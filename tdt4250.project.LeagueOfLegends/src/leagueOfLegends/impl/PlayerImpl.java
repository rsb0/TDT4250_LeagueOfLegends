/**
 */
package leagueOfLegends.impl;

import leagueOfLegends.Champion;
import leagueOfLegends.LeagueOfLegendsPackage;
import leagueOfLegends.Player;
import leagueOfLegends.PlayerStats;
import leagueOfLegends.Position;
import leagueOfLegends.Team;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link leagueOfLegends.impl.PlayerImpl#getName <em>Name</em>}</li>
 *   <li>{@link leagueOfLegends.impl.PlayerImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link leagueOfLegends.impl.PlayerImpl#getChampionPool <em>Champion Pool</em>}</li>
 *   <li>{@link leagueOfLegends.impl.PlayerImpl#getPlayerStats <em>Player Stats</em>}</li>
 *   <li>{@link leagueOfLegends.impl.PlayerImpl#getTeam <em>Team</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlayerImpl extends MinimalEObjectImpl.Container implements Player {
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
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final Position POSITION_EDEFAULT = Position.MIDDLE;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Position position = POSITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChampionPool() <em>Champion Pool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChampionPool()
	 * @generated
	 * @ordered
	 */
	protected Champion championPool;

	/**
	 * The cached value of the '{@link #getPlayerStats() <em>Player Stats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerStats()
	 * @generated
	 * @ordered
	 */
	protected PlayerStats playerStats;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LeagueOfLegendsPackage.Literals.PLAYER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.PLAYER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosition(Position newPosition) {
		Position oldPosition = position;
		position = newPosition == null ? POSITION_EDEFAULT : newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.PLAYER__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Champion getChampionPool() {
		if (championPool != null && championPool.eIsProxy()) {
			InternalEObject oldChampionPool = (InternalEObject)championPool;
			championPool = (Champion)eResolveProxy(oldChampionPool);
			if (championPool != oldChampionPool) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeagueOfLegendsPackage.PLAYER__CHAMPION_POOL, oldChampionPool, championPool));
			}
		}
		return championPool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Champion basicGetChampionPool() {
		return championPool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChampionPool(Champion newChampionPool) {
		Champion oldChampionPool = championPool;
		championPool = newChampionPool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.PLAYER__CHAMPION_POOL, oldChampionPool, championPool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlayerStats getPlayerStats() {
		return playerStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlayerStats(PlayerStats newPlayerStats, NotificationChain msgs) {
		PlayerStats oldPlayerStats = playerStats;
		playerStats = newPlayerStats;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.PLAYER__PLAYER_STATS, oldPlayerStats, newPlayerStats);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlayerStats(PlayerStats newPlayerStats) {
		if (newPlayerStats != playerStats) {
			NotificationChain msgs = null;
			if (playerStats != null)
				msgs = ((InternalEObject)playerStats).eInverseRemove(this, LeagueOfLegendsPackage.PLAYER_STATS__PLAYER, PlayerStats.class, msgs);
			if (newPlayerStats != null)
				msgs = ((InternalEObject)newPlayerStats).eInverseAdd(this, LeagueOfLegendsPackage.PLAYER_STATS__PLAYER, PlayerStats.class, msgs);
			msgs = basicSetPlayerStats(newPlayerStats, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.PLAYER__PLAYER_STATS, newPlayerStats, newPlayerStats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Team getTeam() {
		if (eContainerFeatureID() != LeagueOfLegendsPackage.PLAYER__TEAM) return null;
		return (Team)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTeam(Team newTeam, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTeam, LeagueOfLegendsPackage.PLAYER__TEAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTeam(Team newTeam) {
		if (newTeam != eInternalContainer() || (eContainerFeatureID() != LeagueOfLegendsPackage.PLAYER__TEAM && newTeam != null)) {
			if (EcoreUtil.isAncestor(this, newTeam))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTeam != null)
				msgs = ((InternalEObject)newTeam).eInverseAdd(this, LeagueOfLegendsPackage.TEAM__PLAYER, Team.class, msgs);
			msgs = basicSetTeam(newTeam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.PLAYER__TEAM, newTeam, newTeam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LeagueOfLegendsPackage.PLAYER__PLAYER_STATS:
				if (playerStats != null)
					msgs = ((InternalEObject)playerStats).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LeagueOfLegendsPackage.PLAYER__PLAYER_STATS, null, msgs);
				return basicSetPlayerStats((PlayerStats)otherEnd, msgs);
			case LeagueOfLegendsPackage.PLAYER__TEAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTeam((Team)otherEnd, msgs);
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
			case LeagueOfLegendsPackage.PLAYER__PLAYER_STATS:
				return basicSetPlayerStats(null, msgs);
			case LeagueOfLegendsPackage.PLAYER__TEAM:
				return basicSetTeam(null, msgs);
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
			case LeagueOfLegendsPackage.PLAYER__TEAM:
				return eInternalContainer().eInverseRemove(this, LeagueOfLegendsPackage.TEAM__PLAYER, Team.class, msgs);
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
			case LeagueOfLegendsPackage.PLAYER__NAME:
				return getName();
			case LeagueOfLegendsPackage.PLAYER__POSITION:
				return getPosition();
			case LeagueOfLegendsPackage.PLAYER__CHAMPION_POOL:
				if (resolve) return getChampionPool();
				return basicGetChampionPool();
			case LeagueOfLegendsPackage.PLAYER__PLAYER_STATS:
				return getPlayerStats();
			case LeagueOfLegendsPackage.PLAYER__TEAM:
				return getTeam();
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
			case LeagueOfLegendsPackage.PLAYER__NAME:
				setName((String)newValue);
				return;
			case LeagueOfLegendsPackage.PLAYER__POSITION:
				setPosition((Position)newValue);
				return;
			case LeagueOfLegendsPackage.PLAYER__CHAMPION_POOL:
				setChampionPool((Champion)newValue);
				return;
			case LeagueOfLegendsPackage.PLAYER__PLAYER_STATS:
				setPlayerStats((PlayerStats)newValue);
				return;
			case LeagueOfLegendsPackage.PLAYER__TEAM:
				setTeam((Team)newValue);
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
			case LeagueOfLegendsPackage.PLAYER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.PLAYER__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.PLAYER__CHAMPION_POOL:
				setChampionPool((Champion)null);
				return;
			case LeagueOfLegendsPackage.PLAYER__PLAYER_STATS:
				setPlayerStats((PlayerStats)null);
				return;
			case LeagueOfLegendsPackage.PLAYER__TEAM:
				setTeam((Team)null);
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
			case LeagueOfLegendsPackage.PLAYER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LeagueOfLegendsPackage.PLAYER__POSITION:
				return position != POSITION_EDEFAULT;
			case LeagueOfLegendsPackage.PLAYER__CHAMPION_POOL:
				return championPool != null;
			case LeagueOfLegendsPackage.PLAYER__PLAYER_STATS:
				return playerStats != null;
			case LeagueOfLegendsPackage.PLAYER__TEAM:
				return getTeam() != null;
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
		result.append(", position: ");
		result.append(position);
		result.append(')');
		return result.toString();
	}

} //PlayerImpl
