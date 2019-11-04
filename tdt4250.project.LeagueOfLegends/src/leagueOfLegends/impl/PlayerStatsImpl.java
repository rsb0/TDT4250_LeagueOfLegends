/**
 */
package leagueOfLegends.impl;

import leagueOfLegends.LeagueOfLegendsPackage;
import leagueOfLegends.Player;
import leagueOfLegends.PlayerStats;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Player Stats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link leagueOfLegends.impl.PlayerStatsImpl#getGamesPlayed <em>Games Played</em>}</li>
 *   <li>{@link leagueOfLegends.impl.PlayerStatsImpl#getCareerKills <em>Career Kills</em>}</li>
 *   <li>{@link leagueOfLegends.impl.PlayerStatsImpl#getCareerDeaths <em>Career Deaths</em>}</li>
 *   <li>{@link leagueOfLegends.impl.PlayerStatsImpl#getCareerAssist <em>Career Assist</em>}</li>
 *   <li>{@link leagueOfLegends.impl.PlayerStatsImpl#getKillDeathAssistRatio <em>Kill Death Assist Ratio</em>}</li>
 *   <li>{@link leagueOfLegends.impl.PlayerStatsImpl#getWinLoseRatio <em>Win Lose Ratio</em>}</li>
 *   <li>{@link leagueOfLegends.impl.PlayerStatsImpl#getPlayer <em>Player</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlayerStatsImpl extends MinimalEObjectImpl.Container implements PlayerStats {
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
	 * The default value of the '{@link #getCareerKills() <em>Career Kills</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareerKills()
	 * @generated
	 * @ordered
	 */
	protected static final int CAREER_KILLS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCareerKills() <em>Career Kills</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareerKills()
	 * @generated
	 * @ordered
	 */
	protected int careerKills = CAREER_KILLS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCareerDeaths() <em>Career Deaths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareerDeaths()
	 * @generated
	 * @ordered
	 */
	protected static final int CAREER_DEATHS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCareerDeaths() <em>Career Deaths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareerDeaths()
	 * @generated
	 * @ordered
	 */
	protected int careerDeaths = CAREER_DEATHS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCareerAssist() <em>Career Assist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareerAssist()
	 * @generated
	 * @ordered
	 */
	protected static final int CAREER_ASSIST_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCareerAssist() <em>Career Assist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareerAssist()
	 * @generated
	 * @ordered
	 */
	protected int careerAssist = CAREER_ASSIST_EDEFAULT;

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
	protected PlayerStatsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LeagueOfLegendsPackage.Literals.PLAYER_STATS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.PLAYER_STATS__GAMES_PLAYED, oldGamesPlayed, gamesPlayed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCareerKills() {
		return careerKills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCareerKills(int newCareerKills) {
		int oldCareerKills = careerKills;
		careerKills = newCareerKills;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.PLAYER_STATS__CAREER_KILLS, oldCareerKills, careerKills));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCareerDeaths() {
		return careerDeaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCareerDeaths(int newCareerDeaths) {
		int oldCareerDeaths = careerDeaths;
		careerDeaths = newCareerDeaths;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.PLAYER_STATS__CAREER_DEATHS, oldCareerDeaths, careerDeaths));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCareerAssist() {
		return careerAssist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCareerAssist(int newCareerAssist) {
		int oldCareerAssist = careerAssist;
		careerAssist = newCareerAssist;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.PLAYER_STATS__CAREER_ASSIST, oldCareerAssist, careerAssist));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.PLAYER_STATS__KILL_DEATH_ASSIST_RATIO, oldKillDeathAssistRatio, killDeathAssistRatio));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.PLAYER_STATS__WIN_LOSE_RATIO, oldWinLoseRatio, winLoseRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Player getPlayer() {
		if (eContainerFeatureID() != LeagueOfLegendsPackage.PLAYER_STATS__PLAYER) return null;
		return (Player)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlayer(Player newPlayer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPlayer, LeagueOfLegendsPackage.PLAYER_STATS__PLAYER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlayer(Player newPlayer) {
		if (newPlayer != eInternalContainer() || (eContainerFeatureID() != LeagueOfLegendsPackage.PLAYER_STATS__PLAYER && newPlayer != null)) {
			if (EcoreUtil.isAncestor(this, newPlayer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPlayer != null)
				msgs = ((InternalEObject)newPlayer).eInverseAdd(this, LeagueOfLegendsPackage.PLAYER__PLAYER_STATS, Player.class, msgs);
			msgs = basicSetPlayer(newPlayer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.PLAYER_STATS__PLAYER, newPlayer, newPlayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LeagueOfLegendsPackage.PLAYER_STATS__PLAYER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPlayer((Player)otherEnd, msgs);
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
			case LeagueOfLegendsPackage.PLAYER_STATS__PLAYER:
				return basicSetPlayer(null, msgs);
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
			case LeagueOfLegendsPackage.PLAYER_STATS__PLAYER:
				return eInternalContainer().eInverseRemove(this, LeagueOfLegendsPackage.PLAYER__PLAYER_STATS, Player.class, msgs);
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
			case LeagueOfLegendsPackage.PLAYER_STATS__GAMES_PLAYED:
				return getGamesPlayed();
			case LeagueOfLegendsPackage.PLAYER_STATS__CAREER_KILLS:
				return getCareerKills();
			case LeagueOfLegendsPackage.PLAYER_STATS__CAREER_DEATHS:
				return getCareerDeaths();
			case LeagueOfLegendsPackage.PLAYER_STATS__CAREER_ASSIST:
				return getCareerAssist();
			case LeagueOfLegendsPackage.PLAYER_STATS__KILL_DEATH_ASSIST_RATIO:
				return getKillDeathAssistRatio();
			case LeagueOfLegendsPackage.PLAYER_STATS__WIN_LOSE_RATIO:
				return getWinLoseRatio();
			case LeagueOfLegendsPackage.PLAYER_STATS__PLAYER:
				return getPlayer();
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
			case LeagueOfLegendsPackage.PLAYER_STATS__GAMES_PLAYED:
				setGamesPlayed((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.PLAYER_STATS__CAREER_KILLS:
				setCareerKills((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.PLAYER_STATS__CAREER_DEATHS:
				setCareerDeaths((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.PLAYER_STATS__CAREER_ASSIST:
				setCareerAssist((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.PLAYER_STATS__KILL_DEATH_ASSIST_RATIO:
				setKillDeathAssistRatio((Float)newValue);
				return;
			case LeagueOfLegendsPackage.PLAYER_STATS__WIN_LOSE_RATIO:
				setWinLoseRatio((Float)newValue);
				return;
			case LeagueOfLegendsPackage.PLAYER_STATS__PLAYER:
				setPlayer((Player)newValue);
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
			case LeagueOfLegendsPackage.PLAYER_STATS__GAMES_PLAYED:
				setGamesPlayed(GAMES_PLAYED_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.PLAYER_STATS__CAREER_KILLS:
				setCareerKills(CAREER_KILLS_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.PLAYER_STATS__CAREER_DEATHS:
				setCareerDeaths(CAREER_DEATHS_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.PLAYER_STATS__CAREER_ASSIST:
				setCareerAssist(CAREER_ASSIST_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.PLAYER_STATS__KILL_DEATH_ASSIST_RATIO:
				setKillDeathAssistRatio(KILL_DEATH_ASSIST_RATIO_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.PLAYER_STATS__WIN_LOSE_RATIO:
				setWinLoseRatio(WIN_LOSE_RATIO_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.PLAYER_STATS__PLAYER:
				setPlayer((Player)null);
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
			case LeagueOfLegendsPackage.PLAYER_STATS__GAMES_PLAYED:
				return gamesPlayed != GAMES_PLAYED_EDEFAULT;
			case LeagueOfLegendsPackage.PLAYER_STATS__CAREER_KILLS:
				return careerKills != CAREER_KILLS_EDEFAULT;
			case LeagueOfLegendsPackage.PLAYER_STATS__CAREER_DEATHS:
				return careerDeaths != CAREER_DEATHS_EDEFAULT;
			case LeagueOfLegendsPackage.PLAYER_STATS__CAREER_ASSIST:
				return careerAssist != CAREER_ASSIST_EDEFAULT;
			case LeagueOfLegendsPackage.PLAYER_STATS__KILL_DEATH_ASSIST_RATIO:
				return killDeathAssistRatio != KILL_DEATH_ASSIST_RATIO_EDEFAULT;
			case LeagueOfLegendsPackage.PLAYER_STATS__WIN_LOSE_RATIO:
				return winLoseRatio != WIN_LOSE_RATIO_EDEFAULT;
			case LeagueOfLegendsPackage.PLAYER_STATS__PLAYER:
				return getPlayer() != null;
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
		result.append(", careerKills: ");
		result.append(careerKills);
		result.append(", careerDeaths: ");
		result.append(careerDeaths);
		result.append(", careerAssist: ");
		result.append(careerAssist);
		result.append(", killDeathAssistRatio: ");
		result.append(killDeathAssistRatio);
		result.append(", winLoseRatio: ");
		result.append(winLoseRatio);
		result.append(')');
		return result.toString();
	}

} //PlayerStatsImpl
