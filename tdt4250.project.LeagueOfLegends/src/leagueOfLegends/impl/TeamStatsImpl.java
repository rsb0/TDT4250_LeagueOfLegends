/**
 */
package leagueOfLegends.impl;

import leagueOfLegends.LeagueOfLegendsPackage;
import leagueOfLegends.Player;
import leagueOfLegends.Team;
import leagueOfLegends.TeamStats;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Team Stats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link leagueOfLegends.impl.TeamStatsImpl#getTeam <em>Team</em>}</li>
 *   <li>{@link leagueOfLegends.impl.TeamStatsImpl#getGamesPlayed <em>Games Played</em>}</li>
 *   <li>{@link leagueOfLegends.impl.TeamStatsImpl#getKills <em>Kills</em>}</li>
 *   <li>{@link leagueOfLegends.impl.TeamStatsImpl#getDeaths <em>Deaths</em>}</li>
 *   <li>{@link leagueOfLegends.impl.TeamStatsImpl#getAssists <em>Assists</em>}</li>
 *   <li>{@link leagueOfLegends.impl.TeamStatsImpl#getKillDeathAssistRatio <em>Kill Death Assist Ratio</em>}</li>
 *   <li>{@link leagueOfLegends.impl.TeamStatsImpl#getWinLoseRatio <em>Win Lose Ratio</em>}</li>
 *   <li>{@link leagueOfLegends.impl.TeamStatsImpl#getGameWins <em>Game Wins</em>}</li>
 *   <li>{@link leagueOfLegends.impl.TeamStatsImpl#getMatchWins <em>Match Wins</em>}</li>
 *   <li>{@link leagueOfLegends.impl.TeamStatsImpl#getTournamentWins <em>Tournament Wins</em>}</li>
 *   <li>{@link leagueOfLegends.impl.TeamStatsImpl#getTournamentSecondPlaces <em>Tournament Second Places</em>}</li>
 *   <li>{@link leagueOfLegends.impl.TeamStatsImpl#getTournamentThridPlaces <em>Tournament Thrid Places</em>}</li>
 *   <li>{@link leagueOfLegends.impl.TeamStatsImpl#getPlayerWithMostKills <em>Player With Most Kills</em>}</li>
 *   <li>{@link leagueOfLegends.impl.TeamStatsImpl#getPlayerWithMostDeaths <em>Player With Most Deaths</em>}</li>
 *   <li>{@link leagueOfLegends.impl.TeamStatsImpl#getPlayerWithMostAssists <em>Player With Most Assists</em>}</li>
 *   <li>{@link leagueOfLegends.impl.TeamStatsImpl#getPlayerWithHighestKda <em>Player With Highest Kda</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TeamStatsImpl extends MinimalEObjectImpl.Container implements TeamStats {
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
	 * The default value of the '{@link #getGameWins() <em>Game Wins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameWins()
	 * @generated
	 * @ordered
	 */
	protected static final int GAME_WINS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGameWins() <em>Game Wins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameWins()
	 * @generated
	 * @ordered
	 */
	protected int gameWins = GAME_WINS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMatchWins() <em>Match Wins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchWins()
	 * @generated
	 * @ordered
	 */
	protected static final int MATCH_WINS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMatchWins() <em>Match Wins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchWins()
	 * @generated
	 * @ordered
	 */
	protected int matchWins = MATCH_WINS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTournamentWins() <em>Tournament Wins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTournamentWins()
	 * @generated
	 * @ordered
	 */
	protected static final int TOURNAMENT_WINS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTournamentWins() <em>Tournament Wins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTournamentWins()
	 * @generated
	 * @ordered
	 */
	protected int tournamentWins = TOURNAMENT_WINS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTournamentSecondPlaces() <em>Tournament Second Places</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTournamentSecondPlaces()
	 * @generated
	 * @ordered
	 */
	protected static final int TOURNAMENT_SECOND_PLACES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTournamentSecondPlaces() <em>Tournament Second Places</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTournamentSecondPlaces()
	 * @generated
	 * @ordered
	 */
	protected int tournamentSecondPlaces = TOURNAMENT_SECOND_PLACES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTournamentThridPlaces() <em>Tournament Thrid Places</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTournamentThridPlaces()
	 * @generated
	 * @ordered
	 */
	protected static final int TOURNAMENT_THRID_PLACES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTournamentThridPlaces() <em>Tournament Thrid Places</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTournamentThridPlaces()
	 * @generated
	 * @ordered
	 */
	protected int tournamentThridPlaces = TOURNAMENT_THRID_PLACES_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamStatsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LeagueOfLegendsPackage.Literals.TEAM_STATS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Team getTeam() {
		if (eContainerFeatureID() != LeagueOfLegendsPackage.TEAM_STATS__TEAM) return null;
		return (Team)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTeam(Team newTeam, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTeam, LeagueOfLegendsPackage.TEAM_STATS__TEAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTeam(Team newTeam) {
		if (newTeam != eInternalContainer() || (eContainerFeatureID() != LeagueOfLegendsPackage.TEAM_STATS__TEAM && newTeam != null)) {
			if (EcoreUtil.isAncestor(this, newTeam))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTeam != null)
				msgs = ((InternalEObject)newTeam).eInverseAdd(this, LeagueOfLegendsPackage.TEAM__TEAM_STATS, Team.class, msgs);
			msgs = basicSetTeam(newTeam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.TEAM_STATS__TEAM, newTeam, newTeam));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.TEAM_STATS__GAMES_PLAYED, oldGamesPlayed, gamesPlayed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.TEAM_STATS__KILLS, oldKills, kills));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.TEAM_STATS__DEATHS, oldDeaths, deaths));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.TEAM_STATS__ASSISTS, oldAssists, assists));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.TEAM_STATS__KILL_DEATH_ASSIST_RATIO, oldKillDeathAssistRatio, killDeathAssistRatio));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.TEAM_STATS__WIN_LOSE_RATIO, oldWinLoseRatio, winLoseRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getGameWins() {
		return gameWins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGameWins(int newGameWins) {
		int oldGameWins = gameWins;
		gameWins = newGameWins;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.TEAM_STATS__GAME_WINS, oldGameWins, gameWins));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMatchWins() {
		return matchWins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMatchWins(int newMatchWins) {
		int oldMatchWins = matchWins;
		matchWins = newMatchWins;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.TEAM_STATS__MATCH_WINS, oldMatchWins, matchWins));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTournamentWins() {
		return tournamentWins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTournamentWins(int newTournamentWins) {
		int oldTournamentWins = tournamentWins;
		tournamentWins = newTournamentWins;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.TEAM_STATS__TOURNAMENT_WINS, oldTournamentWins, tournamentWins));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTournamentSecondPlaces() {
		return tournamentSecondPlaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTournamentSecondPlaces(int newTournamentSecondPlaces) {
		int oldTournamentSecondPlaces = tournamentSecondPlaces;
		tournamentSecondPlaces = newTournamentSecondPlaces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.TEAM_STATS__TOURNAMENT_SECOND_PLACES, oldTournamentSecondPlaces, tournamentSecondPlaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTournamentThridPlaces() {
		return tournamentThridPlaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTournamentThridPlaces(int newTournamentThridPlaces) {
		int oldTournamentThridPlaces = tournamentThridPlaces;
		tournamentThridPlaces = newTournamentThridPlaces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.TEAM_STATS__TOURNAMENT_THRID_PLACES, oldTournamentThridPlaces, tournamentThridPlaces));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeagueOfLegendsPackage.TEAM_STATS__PLAYER_WITH_MOST_KILLS, oldPlayerWithMostKills, playerWithMostKills));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.TEAM_STATS__PLAYER_WITH_MOST_KILLS, oldPlayerWithMostKills, playerWithMostKills));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeagueOfLegendsPackage.TEAM_STATS__PLAYER_WITH_MOST_DEATHS, oldPlayerWithMostDeaths, playerWithMostDeaths));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.TEAM_STATS__PLAYER_WITH_MOST_DEATHS, oldPlayerWithMostDeaths, playerWithMostDeaths));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeagueOfLegendsPackage.TEAM_STATS__PLAYER_WITH_MOST_ASSISTS, oldPlayerWithMostAssists, playerWithMostAssists));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.TEAM_STATS__PLAYER_WITH_MOST_ASSISTS, oldPlayerWithMostAssists, playerWithMostAssists));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeagueOfLegendsPackage.TEAM_STATS__PLAYER_WITH_HIGHEST_KDA, oldPlayerWithHighestKda, playerWithHighestKda));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.TEAM_STATS__PLAYER_WITH_HIGHEST_KDA, oldPlayerWithHighestKda, playerWithHighestKda));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LeagueOfLegendsPackage.TEAM_STATS__TEAM:
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
			case LeagueOfLegendsPackage.TEAM_STATS__TEAM:
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
			case LeagueOfLegendsPackage.TEAM_STATS__TEAM:
				return eInternalContainer().eInverseRemove(this, LeagueOfLegendsPackage.TEAM__TEAM_STATS, Team.class, msgs);
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
			case LeagueOfLegendsPackage.TEAM_STATS__TEAM:
				return getTeam();
			case LeagueOfLegendsPackage.TEAM_STATS__GAMES_PLAYED:
				return getGamesPlayed();
			case LeagueOfLegendsPackage.TEAM_STATS__KILLS:
				return getKills();
			case LeagueOfLegendsPackage.TEAM_STATS__DEATHS:
				return getDeaths();
			case LeagueOfLegendsPackage.TEAM_STATS__ASSISTS:
				return getAssists();
			case LeagueOfLegendsPackage.TEAM_STATS__KILL_DEATH_ASSIST_RATIO:
				return getKillDeathAssistRatio();
			case LeagueOfLegendsPackage.TEAM_STATS__WIN_LOSE_RATIO:
				return getWinLoseRatio();
			case LeagueOfLegendsPackage.TEAM_STATS__GAME_WINS:
				return getGameWins();
			case LeagueOfLegendsPackage.TEAM_STATS__MATCH_WINS:
				return getMatchWins();
			case LeagueOfLegendsPackage.TEAM_STATS__TOURNAMENT_WINS:
				return getTournamentWins();
			case LeagueOfLegendsPackage.TEAM_STATS__TOURNAMENT_SECOND_PLACES:
				return getTournamentSecondPlaces();
			case LeagueOfLegendsPackage.TEAM_STATS__TOURNAMENT_THRID_PLACES:
				return getTournamentThridPlaces();
			case LeagueOfLegendsPackage.TEAM_STATS__PLAYER_WITH_MOST_KILLS:
				if (resolve) return getPlayerWithMostKills();
				return basicGetPlayerWithMostKills();
			case LeagueOfLegendsPackage.TEAM_STATS__PLAYER_WITH_MOST_DEATHS:
				if (resolve) return getPlayerWithMostDeaths();
				return basicGetPlayerWithMostDeaths();
			case LeagueOfLegendsPackage.TEAM_STATS__PLAYER_WITH_MOST_ASSISTS:
				if (resolve) return getPlayerWithMostAssists();
				return basicGetPlayerWithMostAssists();
			case LeagueOfLegendsPackage.TEAM_STATS__PLAYER_WITH_HIGHEST_KDA:
				if (resolve) return getPlayerWithHighestKda();
				return basicGetPlayerWithHighestKda();
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
			case LeagueOfLegendsPackage.TEAM_STATS__TEAM:
				setTeam((Team)newValue);
				return;
			case LeagueOfLegendsPackage.TEAM_STATS__GAMES_PLAYED:
				setGamesPlayed((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.TEAM_STATS__KILLS:
				setKills((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.TEAM_STATS__DEATHS:
				setDeaths((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.TEAM_STATS__ASSISTS:
				setAssists((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.TEAM_STATS__KILL_DEATH_ASSIST_RATIO:
				setKillDeathAssistRatio((Float)newValue);
				return;
			case LeagueOfLegendsPackage.TEAM_STATS__WIN_LOSE_RATIO:
				setWinLoseRatio((Float)newValue);
				return;
			case LeagueOfLegendsPackage.TEAM_STATS__GAME_WINS:
				setGameWins((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.TEAM_STATS__MATCH_WINS:
				setMatchWins((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.TEAM_STATS__TOURNAMENT_WINS:
				setTournamentWins((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.TEAM_STATS__TOURNAMENT_SECOND_PLACES:
				setTournamentSecondPlaces((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.TEAM_STATS__TOURNAMENT_THRID_PLACES:
				setTournamentThridPlaces((Integer)newValue);
				return;
			case LeagueOfLegendsPackage.TEAM_STATS__PLAYER_WITH_MOST_KILLS:
				setPlayerWithMostKills((Player)newValue);
				return;
			case LeagueOfLegendsPackage.TEAM_STATS__PLAYER_WITH_MOST_DEATHS:
				setPlayerWithMostDeaths((Player)newValue);
				return;
			case LeagueOfLegendsPackage.TEAM_STATS__PLAYER_WITH_MOST_ASSISTS:
				setPlayerWithMostAssists((Player)newValue);
				return;
			case LeagueOfLegendsPackage.TEAM_STATS__PLAYER_WITH_HIGHEST_KDA:
				setPlayerWithHighestKda((Player)newValue);
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
			case LeagueOfLegendsPackage.TEAM_STATS__TEAM:
				setTeam((Team)null);
				return;
			case LeagueOfLegendsPackage.TEAM_STATS__GAMES_PLAYED:
				setGamesPlayed(GAMES_PLAYED_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.TEAM_STATS__KILLS:
				setKills(KILLS_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.TEAM_STATS__DEATHS:
				setDeaths(DEATHS_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.TEAM_STATS__ASSISTS:
				setAssists(ASSISTS_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.TEAM_STATS__KILL_DEATH_ASSIST_RATIO:
				setKillDeathAssistRatio(KILL_DEATH_ASSIST_RATIO_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.TEAM_STATS__WIN_LOSE_RATIO:
				setWinLoseRatio(WIN_LOSE_RATIO_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.TEAM_STATS__GAME_WINS:
				setGameWins(GAME_WINS_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.TEAM_STATS__MATCH_WINS:
				setMatchWins(MATCH_WINS_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.TEAM_STATS__TOURNAMENT_WINS:
				setTournamentWins(TOURNAMENT_WINS_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.TEAM_STATS__TOURNAMENT_SECOND_PLACES:
				setTournamentSecondPlaces(TOURNAMENT_SECOND_PLACES_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.TEAM_STATS__TOURNAMENT_THRID_PLACES:
				setTournamentThridPlaces(TOURNAMENT_THRID_PLACES_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.TEAM_STATS__PLAYER_WITH_MOST_KILLS:
				setPlayerWithMostKills((Player)null);
				return;
			case LeagueOfLegendsPackage.TEAM_STATS__PLAYER_WITH_MOST_DEATHS:
				setPlayerWithMostDeaths((Player)null);
				return;
			case LeagueOfLegendsPackage.TEAM_STATS__PLAYER_WITH_MOST_ASSISTS:
				setPlayerWithMostAssists((Player)null);
				return;
			case LeagueOfLegendsPackage.TEAM_STATS__PLAYER_WITH_HIGHEST_KDA:
				setPlayerWithHighestKda((Player)null);
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
			case LeagueOfLegendsPackage.TEAM_STATS__TEAM:
				return getTeam() != null;
			case LeagueOfLegendsPackage.TEAM_STATS__GAMES_PLAYED:
				return gamesPlayed != GAMES_PLAYED_EDEFAULT;
			case LeagueOfLegendsPackage.TEAM_STATS__KILLS:
				return kills != KILLS_EDEFAULT;
			case LeagueOfLegendsPackage.TEAM_STATS__DEATHS:
				return deaths != DEATHS_EDEFAULT;
			case LeagueOfLegendsPackage.TEAM_STATS__ASSISTS:
				return assists != ASSISTS_EDEFAULT;
			case LeagueOfLegendsPackage.TEAM_STATS__KILL_DEATH_ASSIST_RATIO:
				return killDeathAssistRatio != KILL_DEATH_ASSIST_RATIO_EDEFAULT;
			case LeagueOfLegendsPackage.TEAM_STATS__WIN_LOSE_RATIO:
				return winLoseRatio != WIN_LOSE_RATIO_EDEFAULT;
			case LeagueOfLegendsPackage.TEAM_STATS__GAME_WINS:
				return gameWins != GAME_WINS_EDEFAULT;
			case LeagueOfLegendsPackage.TEAM_STATS__MATCH_WINS:
				return matchWins != MATCH_WINS_EDEFAULT;
			case LeagueOfLegendsPackage.TEAM_STATS__TOURNAMENT_WINS:
				return tournamentWins != TOURNAMENT_WINS_EDEFAULT;
			case LeagueOfLegendsPackage.TEAM_STATS__TOURNAMENT_SECOND_PLACES:
				return tournamentSecondPlaces != TOURNAMENT_SECOND_PLACES_EDEFAULT;
			case LeagueOfLegendsPackage.TEAM_STATS__TOURNAMENT_THRID_PLACES:
				return tournamentThridPlaces != TOURNAMENT_THRID_PLACES_EDEFAULT;
			case LeagueOfLegendsPackage.TEAM_STATS__PLAYER_WITH_MOST_KILLS:
				return playerWithMostKills != null;
			case LeagueOfLegendsPackage.TEAM_STATS__PLAYER_WITH_MOST_DEATHS:
				return playerWithMostDeaths != null;
			case LeagueOfLegendsPackage.TEAM_STATS__PLAYER_WITH_MOST_ASSISTS:
				return playerWithMostAssists != null;
			case LeagueOfLegendsPackage.TEAM_STATS__PLAYER_WITH_HIGHEST_KDA:
				return playerWithHighestKda != null;
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
		result.append(", kills: ");
		result.append(kills);
		result.append(", deaths: ");
		result.append(deaths);
		result.append(", assists: ");
		result.append(assists);
		result.append(", killDeathAssistRatio: ");
		result.append(killDeathAssistRatio);
		result.append(", winLoseRatio: ");
		result.append(winLoseRatio);
		result.append(", gameWins: ");
		result.append(gameWins);
		result.append(", matchWins: ");
		result.append(matchWins);
		result.append(", tournamentWins: ");
		result.append(tournamentWins);
		result.append(", tournamentSecondPlaces: ");
		result.append(tournamentSecondPlaces);
		result.append(", tournamentThridPlaces: ");
		result.append(tournamentThridPlaces);
		result.append(')');
		return result.toString();
	}

} //TeamStatsImpl
