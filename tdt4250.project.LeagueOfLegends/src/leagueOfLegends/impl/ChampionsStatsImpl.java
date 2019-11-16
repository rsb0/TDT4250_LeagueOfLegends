/**
 */
package leagueOfLegends.impl;

import leagueOfLegends.Champion;
import leagueOfLegends.ChampionsStats;
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
 * An implementation of the model object '<em><b>Champions Stats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link leagueOfLegends.impl.ChampionsStatsImpl#getGamesPlayed <em>Games Played</em>}</li>
 *   <li>{@link leagueOfLegends.impl.ChampionsStatsImpl#getTotalKills <em>Total Kills</em>}</li>
 *   <li>{@link leagueOfLegends.impl.ChampionsStatsImpl#getTotalDeaths <em>Total Deaths</em>}</li>
 *   <li>{@link leagueOfLegends.impl.ChampionsStatsImpl#getTotalAssist <em>Total Assist</em>}</li>
 *   <li>{@link leagueOfLegends.impl.ChampionsStatsImpl#getKillDeathAssistRatio <em>Kill Death Assist Ratio</em>}</li>
 *   <li>{@link leagueOfLegends.impl.ChampionsStatsImpl#getChampion <em>Champion</em>}</li>
 *   <li>{@link leagueOfLegends.impl.ChampionsStatsImpl#getBans <em>Bans</em>}</li>
 *   <li>{@link leagueOfLegends.impl.ChampionsStatsImpl#getWins <em>Wins</em>}</li>
 *   <li>{@link leagueOfLegends.impl.ChampionsStatsImpl#getWinLoseRatio <em>Win Lose Ratio</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChampionsStatsImpl extends MinimalEObjectImpl.Container implements ChampionsStats {
	/**
	 * The default value of the '{@link #getGamesPlayed() <em>Games Played</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamesPlayed()
	 * @generated
	 * @ordered
	 */
	protected static final int GAMES_PLAYED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGamesPlayed() <em>Games Played</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamesPlayed()
	 * @generated
	 * @ordered
	 */
	protected int gamesPlayed = GAMES_PLAYED_EDEFAULT;

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
	 * The default value of the '{@link #getKillDeathAssistRatio() <em>Kill Death Assist Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKillDeathAssistRatio()
	 * @generated
	 * @ordered
	 */
	protected static final float KILL_DEATH_ASSIST_RATIO_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getKillDeathAssistRatio() <em>Kill Death Assist Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKillDeathAssistRatio()
	 * @generated
	 * @ordered
	 */
	protected float killDeathAssistRatio = KILL_DEATH_ASSIST_RATIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getBans() <em>Bans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBans()
	 * @generated
	 * @ordered
	 */
	protected static final int BANS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBans() <em>Bans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBans()
	 * @generated
	 * @ordered
	 */
	protected int bans = BANS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWins() <em>Wins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWins()
	 * @generated
	 * @ordered
	 */
	protected static final int WINS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWins() <em>Wins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWins()
	 * @generated
	 * @ordered
	 */
	protected int wins = WINS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWinLoseRatio() <em>Win Lose Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinLoseRatio()
	 * @generated
	 * @ordered
	 */
	protected static final float WIN_LOSE_RATIO_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWinLoseRatio() <em>Win Lose Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinLoseRatio()
	 * @generated
	 * @ordered
	 */
	protected float winLoseRatio = WIN_LOSE_RATIO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChampionsStatsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LeagueOfLegendsPackage.Literals.CHAMPIONS_STATS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getGamesPlayed() {
		return gamesPlayed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGamesPlayed(int newGamesPlayed) {
		int oldGamesPlayed = gamesPlayed;
		gamesPlayed = newGamesPlayed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.CHAMPIONS_STATS__GAMES_PLAYED, oldGamesPlayed, gamesPlayed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.CHAMPIONS_STATS__TOTAL_KILLS, oldTotalKills, totalKills));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.CHAMPIONS_STATS__TOTAL_DEATHS, oldTotalDeaths, totalDeaths));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.CHAMPIONS_STATS__TOTAL_ASSIST, oldTotalAssist, totalAssist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getKillDeathAssistRatio() {
		return killDeathAssistRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKillDeathAssistRatio(float newKillDeathAssistRatio) {
		float oldKillDeathAssistRatio = killDeathAssistRatio;
		killDeathAssistRatio = newKillDeathAssistRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.CHAMPIONS_STATS__KILL_DEATH_ASSIST_RATIO, oldKillDeathAssistRatio, killDeathAssistRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Champion getChampion() {
		if (eContainerFeatureID() != LeagueOfLegendsPackage.CHAMPIONS_STATS__CHAMPION) return null;
		return (Champion)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChampion(Champion newChampion, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newChampion, LeagueOfLegendsPackage.CHAMPIONS_STATS__CHAMPION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChampion(Champion newChampion) {
		if (newChampion != eInternalContainer() || (eContainerFeatureID() != LeagueOfLegendsPackage.CHAMPIONS_STATS__CHAMPION && newChampion != null)) {
			if (EcoreUtil.isAncestor(this, newChampion))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newChampion != null)
				msgs = ((InternalEObject)newChampion).eInverseAdd(this, LeagueOfLegendsPackage.CHAMPION__CHAMPION_STAT, Champion.class, msgs);
			msgs = basicSetChampion(newChampion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.CHAMPIONS_STATS__CHAMPION, newChampion, newChampion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getBans() {
		return bans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBans(int newBans) {
		int oldBans = bans;
		bans = newBans;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.CHAMPIONS_STATS__BANS, oldBans, bans));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWins() {
		return wins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWins(int newWins) {
		int oldWins = wins;
		wins = newWins;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.CHAMPIONS_STATS__WINS, oldWins, wins));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getWinLoseRatio() {
		return winLoseRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWinLoseRatio(float newWinLoseRatio) {
		float oldWinLoseRatio = winLoseRatio;
		winLoseRatio = newWinLoseRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.CHAMPIONS_STATS__WIN_LOSE_RATIO, oldWinLoseRatio, winLoseRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LeagueOfLegendsPackage.CHAMPIONS_STATS__CHAMPION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetChampion((Champion)otherEnd, msgs);
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
			case LeagueOfLegendsPackage.CHAMPIONS_STATS__CHAMPION:
				return basicSetChampion(null, msgs);
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
			case LeagueOfLegendsPackage.CHAMPIONS_STATS__CHAMPION:
				return eInternalContainer().eInverseRemove(this, LeagueOfLegendsPackage.CHAMPION__CHAMPION_STAT, Champion.class, msgs);
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
			case LeagueOfLegendsPackage.CHAMPIONS_STATS__GAMES_PLAYED:
				return getGamesPlayed();
			case LeagueOfLegendsPackage.CHAMPIONS_STATS__TOTAL_KILLS:
				return getTotalKills();
			case LeagueOfLegendsPackage.CHAMPIONS_STATS__TOTAL_DEATHS:
				return getTotalDeaths();
			case LeagueOfLegendsPackage.CHAMPIONS_STATS__TOTAL_ASSIST:
				return getTotalAssist();
			case LeagueOfLegendsPackage.CHAMPIONS_STATS__KILL_DEATH_ASSIST_RATIO:
				return getKillDeathAssistRatio();
			case LeagueOfLegendsPackage.CHAMPIONS_STATS__CHAMPION:
				return getChampion();
			case LeagueOfLegendsPackage.CHAMPIONS_STATS__BANS:
				return getBans();
			case LeagueOfLegendsPackage.CHAMPIONS_STATS__WINS:
				return getWins();
			case LeagueOfLegendsPackage.CHAMPIONS_STATS__WIN_LOSE_RATIO:
				return getWinLoseRatio();
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
			case LeagueOfLegendsPackage.CHAMPIONS_STATS__GAMES_PLAYED:
				setGamesPlayed((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.CHAMPIONS_STATS__TOTAL_KILLS:
				setTotalKills((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.CHAMPIONS_STATS__TOTAL_DEATHS:
				setTotalDeaths((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.CHAMPIONS_STATS__TOTAL_ASSIST:
				setTotalAssist((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.CHAMPIONS_STATS__KILL_DEATH_ASSIST_RATIO:
				setKillDeathAssistRatio((Float)newValue);
				return;
			case LeagueOfLegendsPackage.CHAMPIONS_STATS__CHAMPION:
				setChampion((Champion)newValue);
				return;
			case LeagueOfLegendsPackage.CHAMPIONS_STATS__BANS:
				setBans((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.CHAMPIONS_STATS__WINS:
				setWins((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.CHAMPIONS_STATS__WIN_LOSE_RATIO:
				setWinLoseRatio((Float)newValue);
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
			case LeagueOfLegendsPackage.CHAMPIONS_STATS__GAMES_PLAYED:
				setGamesPlayed(GAMES_PLAYED_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.CHAMPIONS_STATS__TOTAL_KILLS:
				setTotalKills(TOTAL_KILLS_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.CHAMPIONS_STATS__TOTAL_DEATHS:
				setTotalDeaths(TOTAL_DEATHS_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.CHAMPIONS_STATS__TOTAL_ASSIST:
				setTotalAssist(TOTAL_ASSIST_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.CHAMPIONS_STATS__KILL_DEATH_ASSIST_RATIO:
				setKillDeathAssistRatio(KILL_DEATH_ASSIST_RATIO_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.CHAMPIONS_STATS__CHAMPION:
				setChampion((Champion)null);
				return;
			case LeagueOfLegendsPackage.CHAMPIONS_STATS__BANS:
				setBans(BANS_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.CHAMPIONS_STATS__WINS:
				setWins(WINS_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.CHAMPIONS_STATS__WIN_LOSE_RATIO:
				setWinLoseRatio(WIN_LOSE_RATIO_EDEFAULT);
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
			case LeagueOfLegendsPackage.CHAMPIONS_STATS__GAMES_PLAYED:
				return gamesPlayed != GAMES_PLAYED_EDEFAULT;
			case LeagueOfLegendsPackage.CHAMPIONS_STATS__TOTAL_KILLS:
				return totalKills != TOTAL_KILLS_EDEFAULT;
			case LeagueOfLegendsPackage.CHAMPIONS_STATS__TOTAL_DEATHS:
				return totalDeaths != TOTAL_DEATHS_EDEFAULT;
			case LeagueOfLegendsPackage.CHAMPIONS_STATS__TOTAL_ASSIST:
				return totalAssist != TOTAL_ASSIST_EDEFAULT;
			case LeagueOfLegendsPackage.CHAMPIONS_STATS__KILL_DEATH_ASSIST_RATIO:
				return killDeathAssistRatio != KILL_DEATH_ASSIST_RATIO_EDEFAULT;
			case LeagueOfLegendsPackage.CHAMPIONS_STATS__CHAMPION:
				return getChampion() != null;
			case LeagueOfLegendsPackage.CHAMPIONS_STATS__BANS:
				return bans != BANS_EDEFAULT;
			case LeagueOfLegendsPackage.CHAMPIONS_STATS__WINS:
				return wins != WINS_EDEFAULT;
			case LeagueOfLegendsPackage.CHAMPIONS_STATS__WIN_LOSE_RATIO:
				return winLoseRatio != WIN_LOSE_RATIO_EDEFAULT;
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
		result.append(" (gamesPlayed: ");
		result.append(gamesPlayed);
		result.append(", totalKills: ");
		result.append(totalKills);
		result.append(", totalDeaths: ");
		result.append(totalDeaths);
		result.append(", totalAssist: ");
		result.append(totalAssist);
		result.append(", killDeathAssistRatio: ");
		result.append(killDeathAssistRatio);
		result.append(", bans: ");
		result.append(bans);
		result.append(", wins: ");
		result.append(wins);
		result.append(", winLoseRatio: ");
		result.append(winLoseRatio);
		result.append(')');
		return result.toString();
	}

} //ChampionsStatsImpl
