/**
 */
package leagueOfLegends.impl;

import leagueOfLegends.Champion;
import leagueOfLegends.League;
import leagueOfLegends.LeagueOfLegendsPackage;
import leagueOfLegends.LeagueStats;
import leagueOfLegends.Player;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>League Stats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link leagueOfLegends.impl.LeagueStatsImpl#getLeague <em>League</em>}</li>
 *   <li>{@link leagueOfLegends.impl.LeagueStatsImpl#getKills <em>Kills</em>}</li>
 *   <li>{@link leagueOfLegends.impl.LeagueStatsImpl#getDeaths <em>Deaths</em>}</li>
 *   <li>{@link leagueOfLegends.impl.LeagueStatsImpl#getAssists <em>Assists</em>}</li>
 *   <li>{@link leagueOfLegends.impl.LeagueStatsImpl#getPlayerWithMostKills <em>Player With Most Kills</em>}</li>
 *   <li>{@link leagueOfLegends.impl.LeagueStatsImpl#getPlayerWithMostDeaths <em>Player With Most Deaths</em>}</li>
 *   <li>{@link leagueOfLegends.impl.LeagueStatsImpl#getPlayerWithMostAssists <em>Player With Most Assists</em>}</li>
 *   <li>{@link leagueOfLegends.impl.LeagueStatsImpl#getPlayerWithHighestKda <em>Player With Highest Kda</em>}</li>
 *   <li>{@link leagueOfLegends.impl.LeagueStatsImpl#getChampionWithMostKills <em>Champion With Most Kills</em>}</li>
 *   <li>{@link leagueOfLegends.impl.LeagueStatsImpl#getChampionWithMostDeaths <em>Champion With Most Deaths</em>}</li>
 *   <li>{@link leagueOfLegends.impl.LeagueStatsImpl#getChampionWithMostAssists <em>Champion With Most Assists</em>}</li>
 *   <li>{@link leagueOfLegends.impl.LeagueStatsImpl#getChampionWithHighestKda <em>Champion With Highest Kda</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LeagueStatsImpl extends MinimalEObjectImpl.Container implements LeagueStats {
	/**
	 * The cached value of the '{@link #getLeague() <em>League</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeague()
	 * @generated
	 * @ordered
	 */
	protected League league;

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
	 * The default value of the '{@link #getAssists() <em>Assists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssists()
	 * @generated
	 * @ordered
	 */
	protected static final int ASSISTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAssists() <em>Assists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssists()
	 * @generated
	 * @ordered
	 */
	protected int assists = ASSISTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlayerWithMostKills() <em>Player With Most Kills</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerWithMostKills()
	 * @generated
	 * @ordered
	 */
	protected Player playerWithMostKills;

	/**
	 * The cached value of the '{@link #getPlayerWithMostDeaths() <em>Player With Most Deaths</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerWithMostDeaths()
	 * @generated
	 * @ordered
	 */
	protected Player playerWithMostDeaths;

	/**
	 * The cached value of the '{@link #getPlayerWithMostAssists() <em>Player With Most Assists</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerWithMostAssists()
	 * @generated
	 * @ordered
	 */
	protected Player playerWithMostAssists;

	/**
	 * The cached value of the '{@link #getPlayerWithHighestKda() <em>Player With Highest Kda</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerWithHighestKda()
	 * @generated
	 * @ordered
	 */
	protected Player playerWithHighestKda;

	/**
	 * The cached value of the '{@link #getChampionWithMostKills() <em>Champion With Most Kills</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChampionWithMostKills()
	 * @generated
	 * @ordered
	 */
	protected Champion championWithMostKills;

	/**
	 * The cached value of the '{@link #getChampionWithMostDeaths() <em>Champion With Most Deaths</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChampionWithMostDeaths()
	 * @generated
	 * @ordered
	 */
	protected Champion championWithMostDeaths;

	/**
	 * The cached value of the '{@link #getChampionWithMostAssists() <em>Champion With Most Assists</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChampionWithMostAssists()
	 * @generated
	 * @ordered
	 */
	protected Champion championWithMostAssists;

	/**
	 * The cached value of the '{@link #getChampionWithHighestKda() <em>Champion With Highest Kda</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChampionWithHighestKda()
	 * @generated
	 * @ordered
	 */
	protected Champion championWithHighestKda;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeagueStatsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LeagueOfLegendsPackage.Literals.LEAGUE_STATS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public League getLeague() {
		if (league != null && league.eIsProxy()) {
			InternalEObject oldLeague = (InternalEObject)league;
			league = (League)eResolveProxy(oldLeague);
			if (league != oldLeague) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeagueOfLegendsPackage.LEAGUE_STATS__LEAGUE, oldLeague, league));
			}
		}
		return league;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public League basicGetLeague() {
		return league;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeague(League newLeague) {
		League oldLeague = league;
		league = newLeague;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.LEAGUE_STATS__LEAGUE, oldLeague, league));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.LEAGUE_STATS__KILLS, oldKills, kills));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.LEAGUE_STATS__DEATHS, oldDeaths, deaths));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAssists() {
		return assists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssists(int newAssists) {
		int oldAssists = assists;
		assists = newAssists;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.LEAGUE_STATS__ASSISTS, oldAssists, assists));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Player getPlayerWithMostKills() {
		if (playerWithMostKills != null && playerWithMostKills.eIsProxy()) {
			InternalEObject oldPlayerWithMostKills = (InternalEObject)playerWithMostKills;
			playerWithMostKills = (Player)eResolveProxy(oldPlayerWithMostKills);
			if (playerWithMostKills != oldPlayerWithMostKills) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeagueOfLegendsPackage.LEAGUE_STATS__PLAYER_WITH_MOST_KILLS, oldPlayerWithMostKills, playerWithMostKills));
			}
		}
		return playerWithMostKills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player basicGetPlayerWithMostKills() {
		return playerWithMostKills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlayerWithMostKills(Player newPlayerWithMostKills) {
		Player oldPlayerWithMostKills = playerWithMostKills;
		playerWithMostKills = newPlayerWithMostKills;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.LEAGUE_STATS__PLAYER_WITH_MOST_KILLS, oldPlayerWithMostKills, playerWithMostKills));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Player getPlayerWithMostDeaths() {
		if (playerWithMostDeaths != null && playerWithMostDeaths.eIsProxy()) {
			InternalEObject oldPlayerWithMostDeaths = (InternalEObject)playerWithMostDeaths;
			playerWithMostDeaths = (Player)eResolveProxy(oldPlayerWithMostDeaths);
			if (playerWithMostDeaths != oldPlayerWithMostDeaths) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeagueOfLegendsPackage.LEAGUE_STATS__PLAYER_WITH_MOST_DEATHS, oldPlayerWithMostDeaths, playerWithMostDeaths));
			}
		}
		return playerWithMostDeaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player basicGetPlayerWithMostDeaths() {
		return playerWithMostDeaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlayerWithMostDeaths(Player newPlayerWithMostDeaths) {
		Player oldPlayerWithMostDeaths = playerWithMostDeaths;
		playerWithMostDeaths = newPlayerWithMostDeaths;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.LEAGUE_STATS__PLAYER_WITH_MOST_DEATHS, oldPlayerWithMostDeaths, playerWithMostDeaths));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Player getPlayerWithMostAssists() {
		if (playerWithMostAssists != null && playerWithMostAssists.eIsProxy()) {
			InternalEObject oldPlayerWithMostAssists = (InternalEObject)playerWithMostAssists;
			playerWithMostAssists = (Player)eResolveProxy(oldPlayerWithMostAssists);
			if (playerWithMostAssists != oldPlayerWithMostAssists) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeagueOfLegendsPackage.LEAGUE_STATS__PLAYER_WITH_MOST_ASSISTS, oldPlayerWithMostAssists, playerWithMostAssists));
			}
		}
		return playerWithMostAssists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player basicGetPlayerWithMostAssists() {
		return playerWithMostAssists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlayerWithMostAssists(Player newPlayerWithMostAssists) {
		Player oldPlayerWithMostAssists = playerWithMostAssists;
		playerWithMostAssists = newPlayerWithMostAssists;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.LEAGUE_STATS__PLAYER_WITH_MOST_ASSISTS, oldPlayerWithMostAssists, playerWithMostAssists));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Player getPlayerWithHighestKda() {
		if (playerWithHighestKda != null && playerWithHighestKda.eIsProxy()) {
			InternalEObject oldPlayerWithHighestKda = (InternalEObject)playerWithHighestKda;
			playerWithHighestKda = (Player)eResolveProxy(oldPlayerWithHighestKda);
			if (playerWithHighestKda != oldPlayerWithHighestKda) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeagueOfLegendsPackage.LEAGUE_STATS__PLAYER_WITH_HIGHEST_KDA, oldPlayerWithHighestKda, playerWithHighestKda));
			}
		}
		return playerWithHighestKda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player basicGetPlayerWithHighestKda() {
		return playerWithHighestKda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlayerWithHighestKda(Player newPlayerWithHighestKda) {
		Player oldPlayerWithHighestKda = playerWithHighestKda;
		playerWithHighestKda = newPlayerWithHighestKda;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.LEAGUE_STATS__PLAYER_WITH_HIGHEST_KDA, oldPlayerWithHighestKda, playerWithHighestKda));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Champion getChampionWithMostKills() {
		if (championWithMostKills != null && championWithMostKills.eIsProxy()) {
			InternalEObject oldChampionWithMostKills = (InternalEObject)championWithMostKills;
			championWithMostKills = (Champion)eResolveProxy(oldChampionWithMostKills);
			if (championWithMostKills != oldChampionWithMostKills) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeagueOfLegendsPackage.LEAGUE_STATS__CHAMPION_WITH_MOST_KILLS, oldChampionWithMostKills, championWithMostKills));
			}
		}
		return championWithMostKills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Champion basicGetChampionWithMostKills() {
		return championWithMostKills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChampionWithMostKills(Champion newChampionWithMostKills) {
		Champion oldChampionWithMostKills = championWithMostKills;
		championWithMostKills = newChampionWithMostKills;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.LEAGUE_STATS__CHAMPION_WITH_MOST_KILLS, oldChampionWithMostKills, championWithMostKills));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Champion getChampionWithMostDeaths() {
		if (championWithMostDeaths != null && championWithMostDeaths.eIsProxy()) {
			InternalEObject oldChampionWithMostDeaths = (InternalEObject)championWithMostDeaths;
			championWithMostDeaths = (Champion)eResolveProxy(oldChampionWithMostDeaths);
			if (championWithMostDeaths != oldChampionWithMostDeaths) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeagueOfLegendsPackage.LEAGUE_STATS__CHAMPION_WITH_MOST_DEATHS, oldChampionWithMostDeaths, championWithMostDeaths));
			}
		}
		return championWithMostDeaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Champion basicGetChampionWithMostDeaths() {
		return championWithMostDeaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChampionWithMostDeaths(Champion newChampionWithMostDeaths) {
		Champion oldChampionWithMostDeaths = championWithMostDeaths;
		championWithMostDeaths = newChampionWithMostDeaths;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.LEAGUE_STATS__CHAMPION_WITH_MOST_DEATHS, oldChampionWithMostDeaths, championWithMostDeaths));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Champion getChampionWithMostAssists() {
		if (championWithMostAssists != null && championWithMostAssists.eIsProxy()) {
			InternalEObject oldChampionWithMostAssists = (InternalEObject)championWithMostAssists;
			championWithMostAssists = (Champion)eResolveProxy(oldChampionWithMostAssists);
			if (championWithMostAssists != oldChampionWithMostAssists) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeagueOfLegendsPackage.LEAGUE_STATS__CHAMPION_WITH_MOST_ASSISTS, oldChampionWithMostAssists, championWithMostAssists));
			}
		}
		return championWithMostAssists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Champion basicGetChampionWithMostAssists() {
		return championWithMostAssists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChampionWithMostAssists(Champion newChampionWithMostAssists) {
		Champion oldChampionWithMostAssists = championWithMostAssists;
		championWithMostAssists = newChampionWithMostAssists;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.LEAGUE_STATS__CHAMPION_WITH_MOST_ASSISTS, oldChampionWithMostAssists, championWithMostAssists));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Champion getChampionWithHighestKda() {
		if (championWithHighestKda != null && championWithHighestKda.eIsProxy()) {
			InternalEObject oldChampionWithHighestKda = (InternalEObject)championWithHighestKda;
			championWithHighestKda = (Champion)eResolveProxy(oldChampionWithHighestKda);
			if (championWithHighestKda != oldChampionWithHighestKda) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeagueOfLegendsPackage.LEAGUE_STATS__CHAMPION_WITH_HIGHEST_KDA, oldChampionWithHighestKda, championWithHighestKda));
			}
		}
		return championWithHighestKda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Champion basicGetChampionWithHighestKda() {
		return championWithHighestKda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChampionWithHighestKda(Champion newChampionWithHighestKda) {
		Champion oldChampionWithHighestKda = championWithHighestKda;
		championWithHighestKda = newChampionWithHighestKda;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.LEAGUE_STATS__CHAMPION_WITH_HIGHEST_KDA, oldChampionWithHighestKda, championWithHighestKda));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LeagueOfLegendsPackage.LEAGUE_STATS__LEAGUE:
				if (resolve) return getLeague();
				return basicGetLeague();
			case LeagueOfLegendsPackage.LEAGUE_STATS__KILLS:
				return getKills();
			case LeagueOfLegendsPackage.LEAGUE_STATS__DEATHS:
				return getDeaths();
			case LeagueOfLegendsPackage.LEAGUE_STATS__ASSISTS:
				return getAssists();
			case LeagueOfLegendsPackage.LEAGUE_STATS__PLAYER_WITH_MOST_KILLS:
				if (resolve) return getPlayerWithMostKills();
				return basicGetPlayerWithMostKills();
			case LeagueOfLegendsPackage.LEAGUE_STATS__PLAYER_WITH_MOST_DEATHS:
				if (resolve) return getPlayerWithMostDeaths();
				return basicGetPlayerWithMostDeaths();
			case LeagueOfLegendsPackage.LEAGUE_STATS__PLAYER_WITH_MOST_ASSISTS:
				if (resolve) return getPlayerWithMostAssists();
				return basicGetPlayerWithMostAssists();
			case LeagueOfLegendsPackage.LEAGUE_STATS__PLAYER_WITH_HIGHEST_KDA:
				if (resolve) return getPlayerWithHighestKda();
				return basicGetPlayerWithHighestKda();
			case LeagueOfLegendsPackage.LEAGUE_STATS__CHAMPION_WITH_MOST_KILLS:
				if (resolve) return getChampionWithMostKills();
				return basicGetChampionWithMostKills();
			case LeagueOfLegendsPackage.LEAGUE_STATS__CHAMPION_WITH_MOST_DEATHS:
				if (resolve) return getChampionWithMostDeaths();
				return basicGetChampionWithMostDeaths();
			case LeagueOfLegendsPackage.LEAGUE_STATS__CHAMPION_WITH_MOST_ASSISTS:
				if (resolve) return getChampionWithMostAssists();
				return basicGetChampionWithMostAssists();
			case LeagueOfLegendsPackage.LEAGUE_STATS__CHAMPION_WITH_HIGHEST_KDA:
				if (resolve) return getChampionWithHighestKda();
				return basicGetChampionWithHighestKda();
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
			case LeagueOfLegendsPackage.LEAGUE_STATS__LEAGUE:
				setLeague((League)newValue);
				return;
			case LeagueOfLegendsPackage.LEAGUE_STATS__KILLS:
				setKills((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.LEAGUE_STATS__DEATHS:
				setDeaths((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.LEAGUE_STATS__ASSISTS:
				setAssists((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.LEAGUE_STATS__PLAYER_WITH_MOST_KILLS:
				setPlayerWithMostKills((Player)newValue);
				return;
			case LeagueOfLegendsPackage.LEAGUE_STATS__PLAYER_WITH_MOST_DEATHS:
				setPlayerWithMostDeaths((Player)newValue);
				return;
			case LeagueOfLegendsPackage.LEAGUE_STATS__PLAYER_WITH_MOST_ASSISTS:
				setPlayerWithMostAssists((Player)newValue);
				return;
			case LeagueOfLegendsPackage.LEAGUE_STATS__PLAYER_WITH_HIGHEST_KDA:
				setPlayerWithHighestKda((Player)newValue);
				return;
			case LeagueOfLegendsPackage.LEAGUE_STATS__CHAMPION_WITH_MOST_KILLS:
				setChampionWithMostKills((Champion)newValue);
				return;
			case LeagueOfLegendsPackage.LEAGUE_STATS__CHAMPION_WITH_MOST_DEATHS:
				setChampionWithMostDeaths((Champion)newValue);
				return;
			case LeagueOfLegendsPackage.LEAGUE_STATS__CHAMPION_WITH_MOST_ASSISTS:
				setChampionWithMostAssists((Champion)newValue);
				return;
			case LeagueOfLegendsPackage.LEAGUE_STATS__CHAMPION_WITH_HIGHEST_KDA:
				setChampionWithHighestKda((Champion)newValue);
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
			case LeagueOfLegendsPackage.LEAGUE_STATS__LEAGUE:
				setLeague((League)null);
				return;
			case LeagueOfLegendsPackage.LEAGUE_STATS__KILLS:
				setKills(KILLS_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.LEAGUE_STATS__DEATHS:
				setDeaths(DEATHS_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.LEAGUE_STATS__ASSISTS:
				setAssists(ASSISTS_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.LEAGUE_STATS__PLAYER_WITH_MOST_KILLS:
				setPlayerWithMostKills((Player)null);
				return;
			case LeagueOfLegendsPackage.LEAGUE_STATS__PLAYER_WITH_MOST_DEATHS:
				setPlayerWithMostDeaths((Player)null);
				return;
			case LeagueOfLegendsPackage.LEAGUE_STATS__PLAYER_WITH_MOST_ASSISTS:
				setPlayerWithMostAssists((Player)null);
				return;
			case LeagueOfLegendsPackage.LEAGUE_STATS__PLAYER_WITH_HIGHEST_KDA:
				setPlayerWithHighestKda((Player)null);
				return;
			case LeagueOfLegendsPackage.LEAGUE_STATS__CHAMPION_WITH_MOST_KILLS:
				setChampionWithMostKills((Champion)null);
				return;
			case LeagueOfLegendsPackage.LEAGUE_STATS__CHAMPION_WITH_MOST_DEATHS:
				setChampionWithMostDeaths((Champion)null);
				return;
			case LeagueOfLegendsPackage.LEAGUE_STATS__CHAMPION_WITH_MOST_ASSISTS:
				setChampionWithMostAssists((Champion)null);
				return;
			case LeagueOfLegendsPackage.LEAGUE_STATS__CHAMPION_WITH_HIGHEST_KDA:
				setChampionWithHighestKda((Champion)null);
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
			case LeagueOfLegendsPackage.LEAGUE_STATS__LEAGUE:
				return league != null;
			case LeagueOfLegendsPackage.LEAGUE_STATS__KILLS:
				return kills != KILLS_EDEFAULT;
			case LeagueOfLegendsPackage.LEAGUE_STATS__DEATHS:
				return deaths != DEATHS_EDEFAULT;
			case LeagueOfLegendsPackage.LEAGUE_STATS__ASSISTS:
				return assists != ASSISTS_EDEFAULT;
			case LeagueOfLegendsPackage.LEAGUE_STATS__PLAYER_WITH_MOST_KILLS:
				return playerWithMostKills != null;
			case LeagueOfLegendsPackage.LEAGUE_STATS__PLAYER_WITH_MOST_DEATHS:
				return playerWithMostDeaths != null;
			case LeagueOfLegendsPackage.LEAGUE_STATS__PLAYER_WITH_MOST_ASSISTS:
				return playerWithMostAssists != null;
			case LeagueOfLegendsPackage.LEAGUE_STATS__PLAYER_WITH_HIGHEST_KDA:
				return playerWithHighestKda != null;
			case LeagueOfLegendsPackage.LEAGUE_STATS__CHAMPION_WITH_MOST_KILLS:
				return championWithMostKills != null;
			case LeagueOfLegendsPackage.LEAGUE_STATS__CHAMPION_WITH_MOST_DEATHS:
				return championWithMostDeaths != null;
			case LeagueOfLegendsPackage.LEAGUE_STATS__CHAMPION_WITH_MOST_ASSISTS:
				return championWithMostAssists != null;
			case LeagueOfLegendsPackage.LEAGUE_STATS__CHAMPION_WITH_HIGHEST_KDA:
				return championWithHighestKda != null;
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
		result.append(", assists: ");
		result.append(assists);
		result.append(')');
		return result.toString();
	}

} //LeagueStatsImpl
