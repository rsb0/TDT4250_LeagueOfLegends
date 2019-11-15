/**
 */
package leagueOfLegends.impl;

import leagueOfLegends.Game;
import leagueOfLegends.GameStats;
import leagueOfLegends.LeagueOfLegendsPackage;

import leagueOfLegends.Side;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game Stats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link leagueOfLegends.impl.GameStatsImpl#getGame <em>Game</em>}</li>
 *   <li>{@link leagueOfLegends.impl.GameStatsImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link leagueOfLegends.impl.GameStatsImpl#getWinner <em>Winner</em>}</li>
 *   <li>{@link leagueOfLegends.impl.GameStatsImpl#getTotalKills <em>Total Kills</em>}</li>
 *   <li>{@link leagueOfLegends.impl.GameStatsImpl#getTotalDeaths <em>Total Deaths</em>}</li>
 *   <li>{@link leagueOfLegends.impl.GameStatsImpl#getTotalAssist <em>Total Assist</em>}</li>
 *   <li>{@link leagueOfLegends.impl.GameStatsImpl#getTotalGolds <em>Total Golds</em>}</li>
 *   <li>{@link leagueOfLegends.impl.GameStatsImpl#getTotalWards <em>Total Wards</em>}</li>
 *   <li>{@link leagueOfLegends.impl.GameStatsImpl#getTotalWardsKilled <em>Total Wards Killed</em>}</li>
 *   <li>{@link leagueOfLegends.impl.GameStatsImpl#getTotalVisionWards <em>Total Vision Wards</em>}</li>
 *   <li>{@link leagueOfLegends.impl.GameStatsImpl#getTotalMinionKills <em>Total Minion Kills</em>}</li>
 *   <li>{@link leagueOfLegends.impl.GameStatsImpl#getTotalMonsterKills <em>Total Monster Kills</em>}</li>
 *   <li>{@link leagueOfLegends.impl.GameStatsImpl#getTeamBaronKills <em>Team Baron Kills</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameStatsImpl extends MinimalEObjectImpl.Container implements GameStats {
	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;
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
	 * The default value of the '{@link #getTotalKills() <em>Total Kills</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalKills()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_KILLS_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getTotalKills() <em>Total Kills</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalKills()
	 * @generated
	 * @ordered
	 */
	protected int totalKills = TOTAL_KILLS_EDEFAULT;
	/**
	 * The default value of the '{@link #getTotalDeaths() <em>Total Deaths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalDeaths()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_DEATHS_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getTotalDeaths() <em>Total Deaths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalDeaths()
	 * @generated
	 * @ordered
	 */
	protected int totalDeaths = TOTAL_DEATHS_EDEFAULT;
	/**
	 * The default value of the '{@link #getTotalAssist() <em>Total Assist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalAssist()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_ASSIST_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getTotalAssist() <em>Total Assist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalAssist()
	 * @generated
	 * @ordered
	 */
	protected int totalAssist = TOTAL_ASSIST_EDEFAULT;
	/**
	 * The default value of the '{@link #getTotalGolds() <em>Total Golds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalGolds()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_GOLDS_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getTotalGolds() <em>Total Golds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalGolds()
	 * @generated
	 * @ordered
	 */
	protected int totalGolds = TOTAL_GOLDS_EDEFAULT;
	/**
	 * The default value of the '{@link #getTotalWards() <em>Total Wards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalWards()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_WARDS_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getTotalWards() <em>Total Wards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalWards()
	 * @generated
	 * @ordered
	 */
	protected int totalWards = TOTAL_WARDS_EDEFAULT;
	/**
	 * The default value of the '{@link #getTotalWardsKilled() <em>Total Wards Killed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalWardsKilled()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_WARDS_KILLED_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getTotalWardsKilled() <em>Total Wards Killed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalWardsKilled()
	 * @generated
	 * @ordered
	 */
	protected int totalWardsKilled = TOTAL_WARDS_KILLED_EDEFAULT;
	/**
	 * The default value of the '{@link #getTotalVisionWards() <em>Total Vision Wards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalVisionWards()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_VISION_WARDS_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getTotalVisionWards() <em>Total Vision Wards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalVisionWards()
	 * @generated
	 * @ordered
	 */
	protected int totalVisionWards = TOTAL_VISION_WARDS_EDEFAULT;
	/**
	 * The default value of the '{@link #getTotalMinionKills() <em>Total Minion Kills</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalMinionKills()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_MINION_KILLS_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getTotalMinionKills() <em>Total Minion Kills</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalMinionKills()
	 * @generated
	 * @ordered
	 */
	protected int totalMinionKills = TOTAL_MINION_KILLS_EDEFAULT;
	/**
	 * The default value of the '{@link #getTotalMonsterKills() <em>Total Monster Kills</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalMonsterKills()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_MONSTER_KILLS_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getTotalMonsterKills() <em>Total Monster Kills</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalMonsterKills()
	 * @generated
	 * @ordered
	 */
	protected int totalMonsterKills = TOTAL_MONSTER_KILLS_EDEFAULT;
	/**
	 * The default value of the '{@link #getTeamBaronKills() <em>Team Baron Kills</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeamBaronKills()
	 * @generated
	 * @ordered
	 */
	protected static final int TEAM_BARON_KILLS_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getTeamBaronKills() <em>Team Baron Kills</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeamBaronKills()
	 * @generated
	 * @ordered
	 */
	protected int teamBaronKills = TEAM_BARON_KILLS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameStatsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LeagueOfLegendsPackage.Literals.GAME_STATS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Game getGame() {
		if (eContainerFeatureID() != LeagueOfLegendsPackage.GAME_STATS__GAME) return null;
		return (Game)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGame(Game newGame, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGame, LeagueOfLegendsPackage.GAME_STATS__GAME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGame(Game newGame) {
		if (newGame != eInternalContainer() || (eContainerFeatureID() != LeagueOfLegendsPackage.GAME_STATS__GAME && newGame != null)) {
			if (EcoreUtil.isAncestor(this, newGame))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGame != null)
				msgs = ((InternalEObject)newGame).eInverseAdd(this, LeagueOfLegendsPackage.GAME__GAME_STATS, Game.class, msgs);
			msgs = basicSetGame(newGame, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.GAME_STATS__GAME, newGame, newGame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.GAME_STATS__DURATION, oldDuration, duration));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.GAME_STATS__WINNER, oldWinner, winner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTotalKills() {
		return totalKills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalKills(int newTotalKills) {
		int oldTotalKills = totalKills;
		totalKills = newTotalKills;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.GAME_STATS__TOTAL_KILLS, oldTotalKills, totalKills));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTotalDeaths() {
		return totalDeaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalDeaths(int newTotalDeaths) {
		int oldTotalDeaths = totalDeaths;
		totalDeaths = newTotalDeaths;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.GAME_STATS__TOTAL_DEATHS, oldTotalDeaths, totalDeaths));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTotalAssist() {
		return totalAssist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalAssist(int newTotalAssist) {
		int oldTotalAssist = totalAssist;
		totalAssist = newTotalAssist;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.GAME_STATS__TOTAL_ASSIST, oldTotalAssist, totalAssist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTotalGolds() {
		return totalGolds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalGolds(int newTotalGolds) {
		int oldTotalGolds = totalGolds;
		totalGolds = newTotalGolds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.GAME_STATS__TOTAL_GOLDS, oldTotalGolds, totalGolds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTotalWards() {
		return totalWards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalWards(int newTotalWards) {
		int oldTotalWards = totalWards;
		totalWards = newTotalWards;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.GAME_STATS__TOTAL_WARDS, oldTotalWards, totalWards));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTotalWardsKilled() {
		return totalWardsKilled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalWardsKilled(int newTotalWardsKilled) {
		int oldTotalWardsKilled = totalWardsKilled;
		totalWardsKilled = newTotalWardsKilled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.GAME_STATS__TOTAL_WARDS_KILLED, oldTotalWardsKilled, totalWardsKilled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTotalVisionWards() {
		return totalVisionWards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalVisionWards(int newTotalVisionWards) {
		int oldTotalVisionWards = totalVisionWards;
		totalVisionWards = newTotalVisionWards;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.GAME_STATS__TOTAL_VISION_WARDS, oldTotalVisionWards, totalVisionWards));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTotalMinionKills() {
		return totalMinionKills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalMinionKills(int newTotalMinionKills) {
		int oldTotalMinionKills = totalMinionKills;
		totalMinionKills = newTotalMinionKills;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.GAME_STATS__TOTAL_MINION_KILLS, oldTotalMinionKills, totalMinionKills));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTotalMonsterKills() {
		return totalMonsterKills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalMonsterKills(int newTotalMonsterKills) {
		int oldTotalMonsterKills = totalMonsterKills;
		totalMonsterKills = newTotalMonsterKills;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.GAME_STATS__TOTAL_MONSTER_KILLS, oldTotalMonsterKills, totalMonsterKills));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTeamBaronKills() {
		return teamBaronKills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTeamBaronKills(int newTeamBaronKills) {
		int oldTeamBaronKills = teamBaronKills;
		teamBaronKills = newTeamBaronKills;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.GAME_STATS__TEAM_BARON_KILLS, oldTeamBaronKills, teamBaronKills));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LeagueOfLegendsPackage.GAME_STATS__GAME:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGame((Game)otherEnd, msgs);
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
			case LeagueOfLegendsPackage.GAME_STATS__GAME:
				return basicSetGame(null, msgs);
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
			case LeagueOfLegendsPackage.GAME_STATS__GAME:
				return eInternalContainer().eInverseRemove(this, LeagueOfLegendsPackage.GAME__GAME_STATS, Game.class, msgs);
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
			case LeagueOfLegendsPackage.GAME_STATS__GAME:
				return getGame();
			case LeagueOfLegendsPackage.GAME_STATS__DURATION:
				return getDuration();
			case LeagueOfLegendsPackage.GAME_STATS__WINNER:
				return getWinner();
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_KILLS:
				return getTotalKills();
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_DEATHS:
				return getTotalDeaths();
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_ASSIST:
				return getTotalAssist();
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_GOLDS:
				return getTotalGolds();
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_WARDS:
				return getTotalWards();
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_WARDS_KILLED:
				return getTotalWardsKilled();
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_VISION_WARDS:
				return getTotalVisionWards();
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_MINION_KILLS:
				return getTotalMinionKills();
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_MONSTER_KILLS:
				return getTotalMonsterKills();
			case LeagueOfLegendsPackage.GAME_STATS__TEAM_BARON_KILLS:
				return getTeamBaronKills();
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
			case LeagueOfLegendsPackage.GAME_STATS__GAME:
				setGame((Game)newValue);
				return;
			case LeagueOfLegendsPackage.GAME_STATS__DURATION:
				setDuration((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.GAME_STATS__WINNER:
				setWinner((Side)newValue);
				return;
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_KILLS:
				setTotalKills((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_DEATHS:
				setTotalDeaths((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_ASSIST:
				setTotalAssist((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_GOLDS:
				setTotalGolds((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_WARDS:
				setTotalWards((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_WARDS_KILLED:
				setTotalWardsKilled((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_VISION_WARDS:
				setTotalVisionWards((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_MINION_KILLS:
				setTotalMinionKills((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_MONSTER_KILLS:
				setTotalMonsterKills((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.GAME_STATS__TEAM_BARON_KILLS:
				setTeamBaronKills((Integer)newValue);
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
			case LeagueOfLegendsPackage.GAME_STATS__GAME:
				setGame((Game)null);
				return;
			case LeagueOfLegendsPackage.GAME_STATS__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.GAME_STATS__WINNER:
				setWinner(WINNER_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_KILLS:
				setTotalKills(TOTAL_KILLS_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_DEATHS:
				setTotalDeaths(TOTAL_DEATHS_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_ASSIST:
				setTotalAssist(TOTAL_ASSIST_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_GOLDS:
				setTotalGolds(TOTAL_GOLDS_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_WARDS:
				setTotalWards(TOTAL_WARDS_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_WARDS_KILLED:
				setTotalWardsKilled(TOTAL_WARDS_KILLED_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_VISION_WARDS:
				setTotalVisionWards(TOTAL_VISION_WARDS_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_MINION_KILLS:
				setTotalMinionKills(TOTAL_MINION_KILLS_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_MONSTER_KILLS:
				setTotalMonsterKills(TOTAL_MONSTER_KILLS_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.GAME_STATS__TEAM_BARON_KILLS:
				setTeamBaronKills(TEAM_BARON_KILLS_EDEFAULT);
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
			case LeagueOfLegendsPackage.GAME_STATS__GAME:
				return getGame() != null;
			case LeagueOfLegendsPackage.GAME_STATS__DURATION:
				return duration != DURATION_EDEFAULT;
			case LeagueOfLegendsPackage.GAME_STATS__WINNER:
				return winner != WINNER_EDEFAULT;
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_KILLS:
				return totalKills != TOTAL_KILLS_EDEFAULT;
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_DEATHS:
				return totalDeaths != TOTAL_DEATHS_EDEFAULT;
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_ASSIST:
				return totalAssist != TOTAL_ASSIST_EDEFAULT;
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_GOLDS:
				return totalGolds != TOTAL_GOLDS_EDEFAULT;
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_WARDS:
				return totalWards != TOTAL_WARDS_EDEFAULT;
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_WARDS_KILLED:
				return totalWardsKilled != TOTAL_WARDS_KILLED_EDEFAULT;
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_VISION_WARDS:
				return totalVisionWards != TOTAL_VISION_WARDS_EDEFAULT;
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_MINION_KILLS:
				return totalMinionKills != TOTAL_MINION_KILLS_EDEFAULT;
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_MONSTER_KILLS:
				return totalMonsterKills != TOTAL_MONSTER_KILLS_EDEFAULT;
			case LeagueOfLegendsPackage.GAME_STATS__TEAM_BARON_KILLS:
				return teamBaronKills != TEAM_BARON_KILLS_EDEFAULT;
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
		result.append(" (duration: ");
		result.append(duration);
		result.append(", winner: ");
		result.append(winner);
		result.append(", totalKills: ");
		result.append(totalKills);
		result.append(", totalDeaths: ");
		result.append(totalDeaths);
		result.append(", totalAssist: ");
		result.append(totalAssist);
		result.append(", totalGolds: ");
		result.append(totalGolds);
		result.append(", totalWards: ");
		result.append(totalWards);
		result.append(", totalWardsKilled: ");
		result.append(totalWardsKilled);
		result.append(", totalVisionWards: ");
		result.append(totalVisionWards);
		result.append(", totalMinionKills: ");
		result.append(totalMinionKills);
		result.append(", totalMonsterKills: ");
		result.append(totalMonsterKills);
		result.append(", teamBaronKills: ");
		result.append(teamBaronKills);
		result.append(')');
		return result.toString();
	}

} //GameStatsImpl
