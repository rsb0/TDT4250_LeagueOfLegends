/**
 */
package leagueOfLegends.impl;

import leagueOfLegends.Champion;
import leagueOfLegends.GamePlayerStats;
import leagueOfLegends.LeagueOfLegendsPackage;
import leagueOfLegends.Player;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game Player Stats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link leagueOfLegends.impl.GamePlayerStatsImpl#getPlayer <em>Player</em>}</li>
 *   <li>{@link leagueOfLegends.impl.GamePlayerStatsImpl#getKills <em>Kills</em>}</li>
 *   <li>{@link leagueOfLegends.impl.GamePlayerStatsImpl#getDeaths <em>Deaths</em>}</li>
 *   <li>{@link leagueOfLegends.impl.GamePlayerStatsImpl#getAssist <em>Assist</em>}</li>
 *   <li>{@link leagueOfLegends.impl.GamePlayerStatsImpl#getGolds <em>Golds</em>}</li>
 *   <li>{@link leagueOfLegends.impl.GamePlayerStatsImpl#getWards <em>Wards</em>}</li>
 *   <li>{@link leagueOfLegends.impl.GamePlayerStatsImpl#getWardsKilled <em>Wards Killed</em>}</li>
 *   <li>{@link leagueOfLegends.impl.GamePlayerStatsImpl#getVisionWards <em>Vision Wards</em>}</li>
 *   <li>{@link leagueOfLegends.impl.GamePlayerStatsImpl#getMinionKills <em>Minion Kills</em>}</li>
 *   <li>{@link leagueOfLegends.impl.GamePlayerStatsImpl#getMonsterKills <em>Monster Kills</em>}</li>
 *   <li>{@link leagueOfLegends.impl.GamePlayerStatsImpl#getBaronKills <em>Baron Kills</em>}</li>
 *   <li>{@link leagueOfLegends.impl.GamePlayerStatsImpl#getChampion <em>Champion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GamePlayerStatsImpl extends MinimalEObjectImpl.Container implements GamePlayerStats {
	/**
	 * The cached value of the '{@link #getPlayer() <em>Player</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayer()
	 * @generated
	 * @ordered
	 */
	protected Player player;

	/**
	 * The default value of the '{@link #getKills() <em>Kills</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKills()
	 * @generated
	 * @ordered
	 */
	protected static final int KILLS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getKills() <em>Kills</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKills()
	 * @generated
	 * @ordered
	 */
	protected int kills = KILLS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeaths() <em>Deaths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeaths()
	 * @generated
	 * @ordered
	 */
	protected static final int DEATHS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDeaths() <em>Deaths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeaths()
	 * @generated
	 * @ordered
	 */
	protected int deaths = DEATHS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssist() <em>Assist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssist()
	 * @generated
	 * @ordered
	 */
	protected static final int ASSIST_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAssist() <em>Assist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssist()
	 * @generated
	 * @ordered
	 */
	protected int assist = ASSIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getGolds() <em>Golds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGolds()
	 * @generated
	 * @ordered
	 */
	protected static final int GOLDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGolds() <em>Golds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGolds()
	 * @generated
	 * @ordered
	 */
	protected int golds = GOLDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWards() <em>Wards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWards()
	 * @generated
	 * @ordered
	 */
	protected static final int WARDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWards() <em>Wards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWards()
	 * @generated
	 * @ordered
	 */
	protected int wards = WARDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWardsKilled() <em>Wards Killed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWardsKilled()
	 * @generated
	 * @ordered
	 */
	protected static final int WARDS_KILLED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWardsKilled() <em>Wards Killed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWardsKilled()
	 * @generated
	 * @ordered
	 */
	protected int wardsKilled = WARDS_KILLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisionWards() <em>Vision Wards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisionWards()
	 * @generated
	 * @ordered
	 */
	protected static final int VISION_WARDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVisionWards() <em>Vision Wards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisionWards()
	 * @generated
	 * @ordered
	 */
	protected int visionWards = VISION_WARDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinionKills() <em>Minion Kills</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinionKills()
	 * @generated
	 * @ordered
	 */
	protected static final int MINION_KILLS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinionKills() <em>Minion Kills</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinionKills()
	 * @generated
	 * @ordered
	 */
	protected int minionKills = MINION_KILLS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMonsterKills() <em>Monster Kills</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonsterKills()
	 * @generated
	 * @ordered
	 */
	protected static final int MONSTER_KILLS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMonsterKills() <em>Monster Kills</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonsterKills()
	 * @generated
	 * @ordered
	 */
	protected int monsterKills = MONSTER_KILLS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaronKills() <em>Baron Kills</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaronKills()
	 * @generated
	 * @ordered
	 */
	protected static final int BARON_KILLS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBaronKills() <em>Baron Kills</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaronKills()
	 * @generated
	 * @ordered
	 */
	protected int baronKills = BARON_KILLS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChampion() <em>Champion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChampion()
	 * @generated
	 * @ordered
	 */
	protected Champion champion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GamePlayerStatsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LeagueOfLegendsPackage.Literals.GAME_PLAYER_STATS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Player getPlayer() {
		if (player != null && player.eIsProxy()) {
			InternalEObject oldPlayer = (InternalEObject)player;
			player = (Player)eResolveProxy(oldPlayer);
			if (player != oldPlayer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeagueOfLegendsPackage.GAME_PLAYER_STATS__PLAYER, oldPlayer, player));
			}
		}
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player basicGetPlayer() {
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlayer(Player newPlayer) {
		Player oldPlayer = player;
		player = newPlayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.GAME_PLAYER_STATS__PLAYER, oldPlayer, player));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getKills() {
		return kills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKills(int newKills) {
		int oldKills = kills;
		kills = newKills;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.GAME_PLAYER_STATS__KILLS, oldKills, kills));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDeaths() {
		return deaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeaths(int newDeaths) {
		int oldDeaths = deaths;
		deaths = newDeaths;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.GAME_PLAYER_STATS__DEATHS, oldDeaths, deaths));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAssist() {
		return assist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssist(int newAssist) {
		int oldAssist = assist;
		assist = newAssist;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.GAME_PLAYER_STATS__ASSIST, oldAssist, assist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getGolds() {
		return golds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGolds(int newGolds) {
		int oldGolds = golds;
		golds = newGolds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.GAME_PLAYER_STATS__GOLDS, oldGolds, golds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWards() {
		return wards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWards(int newWards) {
		int oldWards = wards;
		wards = newWards;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.GAME_PLAYER_STATS__WARDS, oldWards, wards));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWardsKilled() {
		return wardsKilled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWardsKilled(int newWardsKilled) {
		int oldWardsKilled = wardsKilled;
		wardsKilled = newWardsKilled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.GAME_PLAYER_STATS__WARDS_KILLED, oldWardsKilled, wardsKilled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getVisionWards() {
		return visionWards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisionWards(int newVisionWards) {
		int oldVisionWards = visionWards;
		visionWards = newVisionWards;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.GAME_PLAYER_STATS__VISION_WARDS, oldVisionWards, visionWards));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinionKills() {
		return minionKills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinionKills(int newMinionKills) {
		int oldMinionKills = minionKills;
		minionKills = newMinionKills;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.GAME_PLAYER_STATS__MINION_KILLS, oldMinionKills, minionKills));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMonsterKills() {
		return monsterKills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMonsterKills(int newMonsterKills) {
		int oldMonsterKills = monsterKills;
		monsterKills = newMonsterKills;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.GAME_PLAYER_STATS__MONSTER_KILLS, oldMonsterKills, monsterKills));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getBaronKills() {
		return baronKills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaronKills(int newBaronKills) {
		int oldBaronKills = baronKills;
		baronKills = newBaronKills;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.GAME_PLAYER_STATS__BARON_KILLS, oldBaronKills, baronKills));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Champion getChampion() {
		if (champion != null && champion.eIsProxy()) {
			InternalEObject oldChampion = (InternalEObject)champion;
			champion = (Champion)eResolveProxy(oldChampion);
			if (champion != oldChampion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeagueOfLegendsPackage.GAME_PLAYER_STATS__CHAMPION, oldChampion, champion));
			}
		}
		return champion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Champion basicGetChampion() {
		return champion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChampion(Champion newChampion) {
		Champion oldChampion = champion;
		champion = newChampion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.GAME_PLAYER_STATS__CHAMPION, oldChampion, champion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__PLAYER:
				if (resolve) return getPlayer();
				return basicGetPlayer();
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__KILLS:
				return getKills();
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__DEATHS:
				return getDeaths();
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__ASSIST:
				return getAssist();
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__GOLDS:
				return getGolds();
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__WARDS:
				return getWards();
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__WARDS_KILLED:
				return getWardsKilled();
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__VISION_WARDS:
				return getVisionWards();
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__MINION_KILLS:
				return getMinionKills();
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__MONSTER_KILLS:
				return getMonsterKills();
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__BARON_KILLS:
				return getBaronKills();
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__CHAMPION:
				if (resolve) return getChampion();
				return basicGetChampion();
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
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__PLAYER:
				setPlayer((Player)newValue);
				return;
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__KILLS:
				setKills((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__DEATHS:
				setDeaths((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__ASSIST:
				setAssist((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__GOLDS:
				setGolds((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__WARDS:
				setWards((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__WARDS_KILLED:
				setWardsKilled((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__VISION_WARDS:
				setVisionWards((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__MINION_KILLS:
				setMinionKills((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__MONSTER_KILLS:
				setMonsterKills((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__BARON_KILLS:
				setBaronKills((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__CHAMPION:
				setChampion((Champion)newValue);
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
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__PLAYER:
				setPlayer((Player)null);
				return;
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__KILLS:
				setKills(KILLS_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__DEATHS:
				setDeaths(DEATHS_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__ASSIST:
				setAssist(ASSIST_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__GOLDS:
				setGolds(GOLDS_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__WARDS:
				setWards(WARDS_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__WARDS_KILLED:
				setWardsKilled(WARDS_KILLED_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__VISION_WARDS:
				setVisionWards(VISION_WARDS_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__MINION_KILLS:
				setMinionKills(MINION_KILLS_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__MONSTER_KILLS:
				setMonsterKills(MONSTER_KILLS_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__BARON_KILLS:
				setBaronKills(BARON_KILLS_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__CHAMPION:
				setChampion((Champion)null);
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
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__PLAYER:
				return player != null;
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__KILLS:
				return kills != KILLS_EDEFAULT;
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__DEATHS:
				return deaths != DEATHS_EDEFAULT;
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__ASSIST:
				return assist != ASSIST_EDEFAULT;
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__GOLDS:
				return golds != GOLDS_EDEFAULT;
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__WARDS:
				return wards != WARDS_EDEFAULT;
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__WARDS_KILLED:
				return wardsKilled != WARDS_KILLED_EDEFAULT;
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__VISION_WARDS:
				return visionWards != VISION_WARDS_EDEFAULT;
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__MINION_KILLS:
				return minionKills != MINION_KILLS_EDEFAULT;
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__MONSTER_KILLS:
				return monsterKills != MONSTER_KILLS_EDEFAULT;
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__BARON_KILLS:
				return baronKills != BARON_KILLS_EDEFAULT;
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__CHAMPION:
				return champion != null;
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
		result.append(" (kills: ");
		result.append(kills);
		result.append(", deaths: ");
		result.append(deaths);
		result.append(", assist: ");
		result.append(assist);
		result.append(", golds: ");
		result.append(golds);
		result.append(", wards: ");
		result.append(wards);
		result.append(", wardsKilled: ");
		result.append(wardsKilled);
		result.append(", visionWards: ");
		result.append(visionWards);
		result.append(", minionKills: ");
		result.append(minionKills);
		result.append(", monsterKills: ");
		result.append(monsterKills);
		result.append(", baronKills: ");
		result.append(baronKills);
		result.append(')');
		return result.toString();
	}

} //GamePlayerStatsImpl
