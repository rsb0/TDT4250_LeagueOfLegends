/**
 */
package leagueOfLegends.impl;

import java.util.Collection;

import leagueOfLegends.Game;
import leagueOfLegends.GamePlayerStats;
import leagueOfLegends.GameStats;
import leagueOfLegends.GameTeamStats;
import leagueOfLegends.LeagueOfLegendsPackage;
import leagueOfLegends.Side;
import leagueOfLegends.Team;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link leagueOfLegends.impl.GameImpl#getGameID <em>Game ID</em>}</li>
 *   <li>{@link leagueOfLegends.impl.GameImpl#getGameStats <em>Game Stats</em>}</li>
 *   <li>{@link leagueOfLegends.impl.GameImpl#getRedTeam <em>Red Team</em>}</li>
 *   <li>{@link leagueOfLegends.impl.GameImpl#getBlueTeam <em>Blue Team</em>}</li>
 *   <li>{@link leagueOfLegends.impl.GameImpl#getGameTeamStat <em>Game Team Stat</em>}</li>
 *   <li>{@link leagueOfLegends.impl.GameImpl#getGamePlayerStats <em>Game Player Stats</em>}</li>
 *   <li>{@link leagueOfLegends.impl.GameImpl#getWinner <em>Winner</em>}</li>
 *   <li>{@link leagueOfLegends.impl.GameImpl#getGameLength <em>Game Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameImpl extends MinimalEObjectImpl.Container implements Game {
	/**
	 * The default value of the '{@link #getGameID() <em>Game ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameID()
	 * @generated
	 * @ordered
	 */
	protected static final String GAME_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGameID() <em>Game ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameID()
	 * @generated
	 * @ordered
	 */
	protected String gameID = GAME_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGameStats() <em>Game Stats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameStats()
	 * @generated
	 * @ordered
	 */
	protected GameStats gameStats;

	/**
	 * The cached value of the '{@link #getRedTeam() <em>Red Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedTeam()
	 * @generated
	 * @ordered
	 */
	protected Team redTeam;

	/**
	 * The cached value of the '{@link #getBlueTeam() <em>Blue Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlueTeam()
	 * @generated
	 * @ordered
	 */
	protected Team blueTeam;

	/**
	 * The cached value of the '{@link #getGameTeamStat() <em>Game Team Stat</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameTeamStat()
	 * @generated
	 * @ordered
	 */
	protected EList<GameTeamStats> gameTeamStat;

	/**
	 * The cached value of the '{@link #getGamePlayerStats() <em>Game Player Stats</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamePlayerStats()
	 * @generated
	 * @ordered
	 */
	protected EList<GamePlayerStats> gamePlayerStats;

	/**
	 * The default value of the '{@link #getWinner() <em>Winner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinner()
	 * @generated
	 * @ordered
	 */
	protected static final Side WINNER_EDEFAULT = Side.RED;

	/**
	 * The cached value of the '{@link #getWinner() <em>Winner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinner()
	 * @generated
	 * @ordered
	 */
	protected Side winner = WINNER_EDEFAULT;

	/**
	 * The default value of the '{@link #getGameLength() <em>Game Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameLength()
	 * @generated
	 * @ordered
	 */
	protected static final float GAME_LENGTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getGameLength() <em>Game Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameLength()
	 * @generated
	 * @ordered
	 */
	protected float gameLength = GAME_LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LeagueOfLegendsPackage.Literals.GAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGameID() {
		return gameID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGameID(String newGameID) {
		String oldGameID = gameID;
		gameID = newGameID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.GAME__GAME_ID, oldGameID, gameID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GameStats getGameStats() {
		return gameStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGameStats(GameStats newGameStats, NotificationChain msgs) {
		GameStats oldGameStats = gameStats;
		gameStats = newGameStats;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.GAME__GAME_STATS, oldGameStats, newGameStats);
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
	public void setGameStats(GameStats newGameStats) {
		if (newGameStats != gameStats) {
			NotificationChain msgs = null;
			if (gameStats != null)
				msgs = ((InternalEObject)gameStats).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LeagueOfLegendsPackage.GAME__GAME_STATS, null, msgs);
			if (newGameStats != null)
				msgs = ((InternalEObject)newGameStats).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LeagueOfLegendsPackage.GAME__GAME_STATS, null, msgs);
			msgs = basicSetGameStats(newGameStats, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.GAME__GAME_STATS, newGameStats, newGameStats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Team getRedTeam() {
		if (redTeam != null && redTeam.eIsProxy()) {
			InternalEObject oldRedTeam = (InternalEObject)redTeam;
			redTeam = (Team)eResolveProxy(oldRedTeam);
			if (redTeam != oldRedTeam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeagueOfLegendsPackage.GAME__RED_TEAM, oldRedTeam, redTeam));
			}
		}
		return redTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team basicGetRedTeam() {
		return redTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRedTeam(Team newRedTeam) {
		Team oldRedTeam = redTeam;
		redTeam = newRedTeam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.GAME__RED_TEAM, oldRedTeam, redTeam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Team getBlueTeam() {
		if (blueTeam != null && blueTeam.eIsProxy()) {
			InternalEObject oldBlueTeam = (InternalEObject)blueTeam;
			blueTeam = (Team)eResolveProxy(oldBlueTeam);
			if (blueTeam != oldBlueTeam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeagueOfLegendsPackage.GAME__BLUE_TEAM, oldBlueTeam, blueTeam));
			}
		}
		return blueTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team basicGetBlueTeam() {
		return blueTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlueTeam(Team newBlueTeam) {
		Team oldBlueTeam = blueTeam;
		blueTeam = newBlueTeam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.GAME__BLUE_TEAM, oldBlueTeam, blueTeam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GameTeamStats> getGameTeamStat() {
		if (gameTeamStat == null) {
			gameTeamStat = new EObjectContainmentEList<GameTeamStats>(GameTeamStats.class, this, LeagueOfLegendsPackage.GAME__GAME_TEAM_STAT);
		}
		return gameTeamStat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GamePlayerStats> getGamePlayerStats() {
		if (gamePlayerStats == null) {
			gamePlayerStats = new EObjectContainmentEList<GamePlayerStats>(GamePlayerStats.class, this, LeagueOfLegendsPackage.GAME__GAME_PLAYER_STATS);
		}
		return gamePlayerStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Side getWinner() {
		return winner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWinner(Side newWinner) {
		Side oldWinner = winner;
		winner = newWinner == null ? WINNER_EDEFAULT : newWinner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.GAME__WINNER, oldWinner, winner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getGameLength() {
		return gameLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGameLength(float newGameLength) {
		float oldGameLength = gameLength;
		gameLength = newGameLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.GAME__GAME_LENGTH, oldGameLength, gameLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LeagueOfLegendsPackage.GAME__GAME_STATS:
				return basicSetGameStats(null, msgs);
			case LeagueOfLegendsPackage.GAME__GAME_TEAM_STAT:
				return ((InternalEList<?>)getGameTeamStat()).basicRemove(otherEnd, msgs);
			case LeagueOfLegendsPackage.GAME__GAME_PLAYER_STATS:
				return ((InternalEList<?>)getGamePlayerStats()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LeagueOfLegendsPackage.GAME__GAME_ID:
				return getGameID();
			case LeagueOfLegendsPackage.GAME__GAME_STATS:
				return getGameStats();
			case LeagueOfLegendsPackage.GAME__RED_TEAM:
				if (resolve) return getRedTeam();
				return basicGetRedTeam();
			case LeagueOfLegendsPackage.GAME__BLUE_TEAM:
				if (resolve) return getBlueTeam();
				return basicGetBlueTeam();
			case LeagueOfLegendsPackage.GAME__GAME_TEAM_STAT:
				return getGameTeamStat();
			case LeagueOfLegendsPackage.GAME__GAME_PLAYER_STATS:
				return getGamePlayerStats();
			case LeagueOfLegendsPackage.GAME__WINNER:
				return getWinner();
			case LeagueOfLegendsPackage.GAME__GAME_LENGTH:
				return getGameLength();
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
			case LeagueOfLegendsPackage.GAME__GAME_ID:
				setGameID((String)newValue);
				return;
			case LeagueOfLegendsPackage.GAME__GAME_STATS:
				setGameStats((GameStats)newValue);
				return;
			case LeagueOfLegendsPackage.GAME__RED_TEAM:
				setRedTeam((Team)newValue);
				return;
			case LeagueOfLegendsPackage.GAME__BLUE_TEAM:
				setBlueTeam((Team)newValue);
				return;
			case LeagueOfLegendsPackage.GAME__GAME_TEAM_STAT:
				getGameTeamStat().clear();
				getGameTeamStat().addAll((Collection<? extends GameTeamStats>)newValue);
				return;
			case LeagueOfLegendsPackage.GAME__GAME_PLAYER_STATS:
				getGamePlayerStats().clear();
				getGamePlayerStats().addAll((Collection<? extends GamePlayerStats>)newValue);
				return;
			case LeagueOfLegendsPackage.GAME__WINNER:
				setWinner((Side)newValue);
				return;
			case LeagueOfLegendsPackage.GAME__GAME_LENGTH:
				setGameLength((Float)newValue);
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
			case LeagueOfLegendsPackage.GAME__GAME_ID:
				setGameID(GAME_ID_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.GAME__GAME_STATS:
				setGameStats((GameStats)null);
				return;
			case LeagueOfLegendsPackage.GAME__RED_TEAM:
				setRedTeam((Team)null);
				return;
			case LeagueOfLegendsPackage.GAME__BLUE_TEAM:
				setBlueTeam((Team)null);
				return;
			case LeagueOfLegendsPackage.GAME__GAME_TEAM_STAT:
				getGameTeamStat().clear();
				return;
			case LeagueOfLegendsPackage.GAME__GAME_PLAYER_STATS:
				getGamePlayerStats().clear();
				return;
			case LeagueOfLegendsPackage.GAME__WINNER:
				setWinner(WINNER_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.GAME__GAME_LENGTH:
				setGameLength(GAME_LENGTH_EDEFAULT);
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
			case LeagueOfLegendsPackage.GAME__GAME_ID:
				return GAME_ID_EDEFAULT == null ? gameID != null : !GAME_ID_EDEFAULT.equals(gameID);
			case LeagueOfLegendsPackage.GAME__GAME_STATS:
				return gameStats != null;
			case LeagueOfLegendsPackage.GAME__RED_TEAM:
				return redTeam != null;
			case LeagueOfLegendsPackage.GAME__BLUE_TEAM:
				return blueTeam != null;
			case LeagueOfLegendsPackage.GAME__GAME_TEAM_STAT:
				return gameTeamStat != null && !gameTeamStat.isEmpty();
			case LeagueOfLegendsPackage.GAME__GAME_PLAYER_STATS:
				return gamePlayerStats != null && !gamePlayerStats.isEmpty();
			case LeagueOfLegendsPackage.GAME__WINNER:
				return winner != WINNER_EDEFAULT;
			case LeagueOfLegendsPackage.GAME__GAME_LENGTH:
				return gameLength != GAME_LENGTH_EDEFAULT;
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
		result.append(" (gameID: ");
		result.append(gameID);
		result.append(", Winner: ");
		result.append(winner);
		result.append(", gameLength: ");
		result.append(gameLength);
		result.append(')');
		return result.toString();
	}

} //GameImpl
