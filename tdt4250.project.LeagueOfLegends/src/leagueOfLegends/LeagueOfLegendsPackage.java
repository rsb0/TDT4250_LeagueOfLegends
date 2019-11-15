/**
 */
package leagueOfLegends;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see leagueOfLegends.LeagueOfLegendsFactory
 * @model kind="package"
 * @generated
 */
public interface LeagueOfLegendsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "leagueOfLegends";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://tdt4250/project/leagueOfLegends";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tdt4250.project.leagueOfLegends";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LeagueOfLegendsPackage eINSTANCE = leagueOfLegends.impl.LeagueOfLegendsPackageImpl.init();

	/**
	 * The meta object id for the '{@link leagueOfLegends.impl.LeagueImpl <em>League</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see leagueOfLegends.impl.LeagueImpl
	 * @see leagueOfLegends.impl.LeagueOfLegendsPackageImpl#getLeague()
	 * @generated
	 */
	int LEAGUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAGUE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Teams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAGUE__TEAMS = 1;

	/**
	 * The feature id for the '<em><b>Seasons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAGUE__SEASONS = 2;

	/**
	 * The feature id for the '<em><b>Champions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAGUE__CHAMPIONS = 3;

	/**
	 * The number of structural features of the '<em>League</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAGUE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>League</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAGUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link leagueOfLegends.impl.TeamImpl <em>Team</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see leagueOfLegends.impl.TeamImpl
	 * @see leagueOfLegends.impl.LeagueOfLegendsPackageImpl#getTeam()
	 * @generated
	 */
	int TEAM = 2;

	/**
	 * The meta object id for the '{@link leagueOfLegends.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see leagueOfLegends.impl.PlayerImpl
	 * @see leagueOfLegends.impl.LeagueOfLegendsPackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 3;

	/**
	 * The meta object id for the '{@link leagueOfLegends.impl.PlayerStatsImpl <em>Player Stats</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see leagueOfLegends.impl.PlayerStatsImpl
	 * @see leagueOfLegends.impl.LeagueOfLegendsPackageImpl#getPlayerStats()
	 * @generated
	 */
	int PLAYER_STATS = 4;

	/**
	 * The meta object id for the '{@link leagueOfLegends.impl.ChampionImpl <em>Champion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see leagueOfLegends.impl.ChampionImpl
	 * @see leagueOfLegends.impl.LeagueOfLegendsPackageImpl#getChampion()
	 * @generated
	 */
	int CHAMPION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMPION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Champion Stat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMPION__CHAMPION_STAT = 1;

	/**
	 * The number of structural features of the '<em>Champion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMPION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Champion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMPION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>League</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__LEAGUE = 1;

	/**
	 * The feature id for the '<em><b>Player</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__PLAYER = 2;

	/**
	 * The feature id for the '<em><b>Win Loss Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__WIN_LOSS_RATIO = 3;

	/**
	 * The number of structural features of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__POSITION = 1;

	/**
	 * The feature id for the '<em><b>Champion Pool</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__CHAMPION_POOL = 2;

	/**
	 * The feature id for the '<em><b>Player Stats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__PLAYER_STATS = 3;

	/**
	 * The feature id for the '<em><b>Team</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__TEAM = 4;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Games Played</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_STATS__GAMES_PLAYED = 0;

	/**
	 * The feature id for the '<em><b>Career Kills</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_STATS__CAREER_KILLS = 1;

	/**
	 * The feature id for the '<em><b>Career Deaths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_STATS__CAREER_DEATHS = 2;

	/**
	 * The feature id for the '<em><b>Career Assist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_STATS__CAREER_ASSIST = 3;

	/**
	 * The feature id for the '<em><b>Kill Death Assist Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_STATS__KILL_DEATH_ASSIST_RATIO = 4;

	/**
	 * The feature id for the '<em><b>Win Lose Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_STATS__WIN_LOSE_RATIO = 5;

	/**
	 * The feature id for the '<em><b>Player</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_STATS__PLAYER = 6;

	/**
	 * The number of structural features of the '<em>Player Stats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_STATS_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Player Stats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_STATS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link leagueOfLegends.impl.MatchImpl <em>Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see leagueOfLegends.impl.MatchImpl
	 * @see leagueOfLegends.impl.LeagueOfLegendsPackageImpl#getMatch()
	 * @generated
	 */
	int MATCH = 5;

	/**
	 * The feature id for the '<em><b>Games</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__GAMES = 0;

	/**
	 * The feature id for the '<em><b>Match ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__MATCH_ID = 1;

	/**
	 * The feature id for the '<em><b>Best OF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__BEST_OF = 2;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__SCORE = 3;

	/**
	 * The feature id for the '<em><b>Teams</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__TEAMS = 4;

	/**
	 * The feature id for the '<em><b>Week</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__WEEK = 5;

	/**
	 * The number of structural features of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link leagueOfLegends.impl.GameImpl <em>Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see leagueOfLegends.impl.GameImpl
	 * @see leagueOfLegends.impl.LeagueOfLegendsPackageImpl#getGame()
	 * @generated
	 */
	int GAME = 6;

	/**
	 * The feature id for the '<em><b>Game ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__GAME_ID = 0;

	/**
	 * The feature id for the '<em><b>Game Stats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__GAME_STATS = 1;

	/**
	 * The feature id for the '<em><b>Red Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__RED_TEAM = 2;

	/**
	 * The feature id for the '<em><b>Blue Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__BLUE_TEAM = 3;

	/**
	 * The feature id for the '<em><b>Game Team Stat</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__GAME_TEAM_STAT = 4;

	/**
	 * The feature id for the '<em><b>Game Player Stats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__GAME_PLAYER_STATS = 5;

	/**
	 * The number of structural features of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link leagueOfLegends.impl.GameTeamStatsImpl <em>Game Team Stats</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see leagueOfLegends.impl.GameTeamStatsImpl
	 * @see leagueOfLegends.impl.LeagueOfLegendsPackageImpl#getGameTeamStats()
	 * @generated
	 */
	int GAME_TEAM_STATS = 7;

	/**
	 * The feature id for the '<em><b>Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_TEAM_STATS__TEAM = 0;

	/**
	 * The feature id for the '<em><b>Total Kills</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_TEAM_STATS__TOTAL_KILLS = 1;

	/**
	 * The feature id for the '<em><b>Total Deaths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_TEAM_STATS__TOTAL_DEATHS = 2;

	/**
	 * The feature id for the '<em><b>Total Assist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_TEAM_STATS__TOTAL_ASSIST = 3;

	/**
	 * The feature id for the '<em><b>Total Golds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_TEAM_STATS__TOTAL_GOLDS = 4;

	/**
	 * The feature id for the '<em><b>Total Wards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_TEAM_STATS__TOTAL_WARDS = 5;

	/**
	 * The feature id for the '<em><b>Total Wards Killed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_TEAM_STATS__TOTAL_WARDS_KILLED = 6;

	/**
	 * The feature id for the '<em><b>Total Vision Wards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_TEAM_STATS__TOTAL_VISION_WARDS = 7;

	/**
	 * The feature id for the '<em><b>Total Minion Kills</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_TEAM_STATS__TOTAL_MINION_KILLS = 8;

	/**
	 * The feature id for the '<em><b>Total Monster Kills</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_TEAM_STATS__TOTAL_MONSTER_KILLS = 9;

	/**
	 * The feature id for the '<em><b>Team Baron Kills</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_TEAM_STATS__TEAM_BARON_KILLS = 10;

	/**
	 * The feature id for the '<em><b>Team Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_TEAM_STATS__TEAM_SIDE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_TEAM_STATS__NAME = 12;

	/**
	 * The number of structural features of the '<em>Game Team Stats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_TEAM_STATS_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Game Team Stats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_TEAM_STATS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link leagueOfLegends.impl.GamePlayerStatsImpl <em>Game Player Stats</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see leagueOfLegends.impl.GamePlayerStatsImpl
	 * @see leagueOfLegends.impl.LeagueOfLegendsPackageImpl#getGamePlayerStats()
	 * @generated
	 */
	int GAME_PLAYER_STATS = 8;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_STATS__PLAYER = 0;

	/**
	 * The feature id for the '<em><b>Kills</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_STATS__KILLS = 1;

	/**
	 * The feature id for the '<em><b>Deaths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_STATS__DEATHS = 2;

	/**
	 * The feature id for the '<em><b>Assist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_STATS__ASSIST = 3;

	/**
	 * The feature id for the '<em><b>Golds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_STATS__GOLDS = 4;

	/**
	 * The feature id for the '<em><b>Wards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_STATS__WARDS = 5;

	/**
	 * The feature id for the '<em><b>Wards Killed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_STATS__WARDS_KILLED = 6;

	/**
	 * The feature id for the '<em><b>Vision Wards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_STATS__VISION_WARDS = 7;

	/**
	 * The feature id for the '<em><b>Minion Kills</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_STATS__MINION_KILLS = 8;

	/**
	 * The feature id for the '<em><b>Monster Kills</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_STATS__MONSTER_KILLS = 9;

	/**
	 * The feature id for the '<em><b>Champion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_STATS__CHAMPION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_STATS__NAME = 11;

	/**
	 * The number of structural features of the '<em>Game Player Stats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_STATS_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Game Player Stats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_STATS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link leagueOfLegends.impl.SeasonImpl <em>Season</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see leagueOfLegends.impl.SeasonImpl
	 * @see leagueOfLegends.impl.LeagueOfLegendsPackageImpl#getSeason()
	 * @generated
	 */
	int SEASON = 9;

	/**
	 * The feature id for the '<em><b>Split Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__SPLIT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__MATCHES = 1;

	/**
	 * The feature id for the '<em><b>League</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__LEAGUE = 2;

	/**
	 * The feature id for the '<em><b>Split Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__SPLIT_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Season</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Season</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link leagueOfLegends.impl.GameStatsImpl <em>Game Stats</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see leagueOfLegends.impl.GameStatsImpl
	 * @see leagueOfLegends.impl.LeagueOfLegendsPackageImpl#getGameStats()
	 * @generated
	 */
	int GAME_STATS = 10;

	/**
	 * The feature id for the '<em><b>Game</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_STATS__GAME = 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_STATS__DURATION = 1;

	/**
	 * The feature id for the '<em><b>Winner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_STATS__WINNER = 2;

	/**
	 * The feature id for the '<em><b>Total Kills</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_STATS__TOTAL_KILLS = 3;

	/**
	 * The feature id for the '<em><b>Total Deaths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_STATS__TOTAL_DEATHS = 4;

	/**
	 * The feature id for the '<em><b>Total Assist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_STATS__TOTAL_ASSIST = 5;

	/**
	 * The feature id for the '<em><b>Total Golds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_STATS__TOTAL_GOLDS = 6;

	/**
	 * The feature id for the '<em><b>Total Wards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_STATS__TOTAL_WARDS = 7;

	/**
	 * The feature id for the '<em><b>Total Wards Killed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_STATS__TOTAL_WARDS_KILLED = 8;

	/**
	 * The feature id for the '<em><b>Total Vision Wards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_STATS__TOTAL_VISION_WARDS = 9;

	/**
	 * The feature id for the '<em><b>Total Minion Kills</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_STATS__TOTAL_MINION_KILLS = 10;

	/**
	 * The feature id for the '<em><b>Total Monster Kills</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_STATS__TOTAL_MONSTER_KILLS = 11;

	/**
	 * The feature id for the '<em><b>Team Baron Kills</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_STATS__TEAM_BARON_KILLS = 12;

	/**
	 * The number of structural features of the '<em>Game Stats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_STATS_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Game Stats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_STATS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link leagueOfLegends.impl.ChampionsStatsImpl <em>Champions Stats</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see leagueOfLegends.impl.ChampionsStatsImpl
	 * @see leagueOfLegends.impl.LeagueOfLegendsPackageImpl#getChampionsStats()
	 * @generated
	 */
	int CHAMPIONS_STATS = 11;

	/**
	 * The feature id for the '<em><b>Games Played</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMPIONS_STATS__GAMES_PLAYED = 0;

	/**
	 * The feature id for the '<em><b>Total Kills</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMPIONS_STATS__TOTAL_KILLS = 1;

	/**
	 * The feature id for the '<em><b>Total Deaths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMPIONS_STATS__TOTAL_DEATHS = 2;

	/**
	 * The feature id for the '<em><b>Total Assist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMPIONS_STATS__TOTAL_ASSIST = 3;

	/**
	 * The feature id for the '<em><b>Kill Death Assist Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMPIONS_STATS__KILL_DEATH_ASSIST_RATIO = 4;

	/**
	 * The feature id for the '<em><b>Champion</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMPIONS_STATS__CHAMPION = 5;

	/**
	 * The number of structural features of the '<em>Champions Stats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMPIONS_STATS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Champions Stats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMPIONS_STATS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link leagueOfLegends.BestOf <em>Best Of</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see leagueOfLegends.BestOf
	 * @see leagueOfLegends.impl.LeagueOfLegendsPackageImpl#getBestOf()
	 * @generated
	 */
	int BEST_OF = 12;

	/**
	 * The meta object id for the '{@link leagueOfLegends.Position <em>Position</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see leagueOfLegends.Position
	 * @see leagueOfLegends.impl.LeagueOfLegendsPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 13;

	/**
	 * The meta object id for the '{@link leagueOfLegends.Side <em>Side</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see leagueOfLegends.Side
	 * @see leagueOfLegends.impl.LeagueOfLegendsPackageImpl#getSide()
	 * @generated
	 */
	int SIDE = 14;


	/**
	 * The meta object id for the '{@link leagueOfLegends.SplitType <em>Split Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see leagueOfLegends.SplitType
	 * @see leagueOfLegends.impl.LeagueOfLegendsPackageImpl#getSplitType()
	 * @generated
	 */
	int SPLIT_TYPE = 15;


	/**
	 * Returns the meta object for class '{@link leagueOfLegends.League <em>League</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>League</em>'.
	 * @see leagueOfLegends.League
	 * @generated
	 */
	EClass getLeague();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.League#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see leagueOfLegends.League#getName()
	 * @see #getLeague()
	 * @generated
	 */
	EAttribute getLeague_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link leagueOfLegends.League#getTeams <em>Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Teams</em>'.
	 * @see leagueOfLegends.League#getTeams()
	 * @see #getLeague()
	 * @generated
	 */
	EReference getLeague_Teams();

	/**
	 * Returns the meta object for the containment reference list '{@link leagueOfLegends.League#getSeasons <em>Seasons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Seasons</em>'.
	 * @see leagueOfLegends.League#getSeasons()
	 * @see #getLeague()
	 * @generated
	 */
	EReference getLeague_Seasons();

	/**
	 * Returns the meta object for the containment reference list '{@link leagueOfLegends.League#getChampions <em>Champions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Champions</em>'.
	 * @see leagueOfLegends.League#getChampions()
	 * @see #getLeague()
	 * @generated
	 */
	EReference getLeague_Champions();

	/**
	 * Returns the meta object for class '{@link leagueOfLegends.Team <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team</em>'.
	 * @see leagueOfLegends.Team
	 * @generated
	 */
	EClass getTeam();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.Team#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see leagueOfLegends.Team#getName()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Name();

	/**
	 * Returns the meta object for the container reference '{@link leagueOfLegends.Team#getLeague <em>League</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>League</em>'.
	 * @see leagueOfLegends.Team#getLeague()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_League();

	/**
	 * Returns the meta object for the containment reference list '{@link leagueOfLegends.Team#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Player</em>'.
	 * @see leagueOfLegends.Team#getPlayer()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Player();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.Team#getWinLossRatio <em>Win Loss Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Win Loss Ratio</em>'.
	 * @see leagueOfLegends.Team#getWinLossRatio()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_WinLossRatio();

	/**
	 * Returns the meta object for class '{@link leagueOfLegends.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see leagueOfLegends.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.Player#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see leagueOfLegends.Player#getName()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Name();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.Player#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see leagueOfLegends.Player#getPosition()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Position();

	/**
	 * Returns the meta object for the reference list '{@link leagueOfLegends.Player#getChampionPool <em>Champion Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Champion Pool</em>'.
	 * @see leagueOfLegends.Player#getChampionPool()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_ChampionPool();

	/**
	 * Returns the meta object for the containment reference '{@link leagueOfLegends.Player#getPlayerStats <em>Player Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Player Stats</em>'.
	 * @see leagueOfLegends.Player#getPlayerStats()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_PlayerStats();

	/**
	 * Returns the meta object for the container reference '{@link leagueOfLegends.Player#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Team</em>'.
	 * @see leagueOfLegends.Player#getTeam()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_Team();

	/**
	 * Returns the meta object for class '{@link leagueOfLegends.PlayerStats <em>Player Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player Stats</em>'.
	 * @see leagueOfLegends.PlayerStats
	 * @generated
	 */
	EClass getPlayerStats();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.PlayerStats#getGamesPlayed <em>Games Played</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Games Played</em>'.
	 * @see leagueOfLegends.PlayerStats#getGamesPlayed()
	 * @see #getPlayerStats()
	 * @generated
	 */
	EAttribute getPlayerStats_GamesPlayed();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.PlayerStats#getCareerKills <em>Career Kills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Career Kills</em>'.
	 * @see leagueOfLegends.PlayerStats#getCareerKills()
	 * @see #getPlayerStats()
	 * @generated
	 */
	EAttribute getPlayerStats_CareerKills();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.PlayerStats#getCareerDeaths <em>Career Deaths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Career Deaths</em>'.
	 * @see leagueOfLegends.PlayerStats#getCareerDeaths()
	 * @see #getPlayerStats()
	 * @generated
	 */
	EAttribute getPlayerStats_CareerDeaths();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.PlayerStats#getCareerAssist <em>Career Assist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Career Assist</em>'.
	 * @see leagueOfLegends.PlayerStats#getCareerAssist()
	 * @see #getPlayerStats()
	 * @generated
	 */
	EAttribute getPlayerStats_CareerAssist();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.PlayerStats#getKillDeathAssistRatio <em>Kill Death Assist Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kill Death Assist Ratio</em>'.
	 * @see leagueOfLegends.PlayerStats#getKillDeathAssistRatio()
	 * @see #getPlayerStats()
	 * @generated
	 */
	EAttribute getPlayerStats_KillDeathAssistRatio();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.PlayerStats#getWinLoseRatio <em>Win Lose Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Win Lose Ratio</em>'.
	 * @see leagueOfLegends.PlayerStats#getWinLoseRatio()
	 * @see #getPlayerStats()
	 * @generated
	 */
	EAttribute getPlayerStats_WinLoseRatio();

	/**
	 * Returns the meta object for the container reference '{@link leagueOfLegends.PlayerStats#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Player</em>'.
	 * @see leagueOfLegends.PlayerStats#getPlayer()
	 * @see #getPlayerStats()
	 * @generated
	 */
	EReference getPlayerStats_Player();

	/**
	 * Returns the meta object for class '{@link leagueOfLegends.Champion <em>Champion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Champion</em>'.
	 * @see leagueOfLegends.Champion
	 * @generated
	 */
	EClass getChampion();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.Champion#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see leagueOfLegends.Champion#getName()
	 * @see #getChampion()
	 * @generated
	 */
	EAttribute getChampion_Name();

	/**
	 * Returns the meta object for the containment reference '{@link leagueOfLegends.Champion#getChampionStat <em>Champion Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Champion Stat</em>'.
	 * @see leagueOfLegends.Champion#getChampionStat()
	 * @see #getChampion()
	 * @generated
	 */
	EReference getChampion_ChampionStat();

	/**
	 * Returns the meta object for class '{@link leagueOfLegends.Match <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match</em>'.
	 * @see leagueOfLegends.Match
	 * @generated
	 */
	EClass getMatch();

	/**
	 * Returns the meta object for the containment reference list '{@link leagueOfLegends.Match#getGames <em>Games</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Games</em>'.
	 * @see leagueOfLegends.Match#getGames()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Games();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.Match#getMatchID <em>Match ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Match ID</em>'.
	 * @see leagueOfLegends.Match#getMatchID()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_MatchID();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.Match#getBestOF <em>Best OF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Best OF</em>'.
	 * @see leagueOfLegends.Match#getBestOF()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_BestOF();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.Match#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see leagueOfLegends.Match#getScore()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Score();

	/**
	 * Returns the meta object for the reference list '{@link leagueOfLegends.Match#getTeams <em>Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Teams</em>'.
	 * @see leagueOfLegends.Match#getTeams()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Teams();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.Match#getWeek <em>Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Week</em>'.
	 * @see leagueOfLegends.Match#getWeek()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Week();

	/**
	 * Returns the meta object for class '{@link leagueOfLegends.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game</em>'.
	 * @see leagueOfLegends.Game
	 * @generated
	 */
	EClass getGame();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.Game#getGameID <em>Game ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Game ID</em>'.
	 * @see leagueOfLegends.Game#getGameID()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_GameID();

	/**
	 * Returns the meta object for the containment reference '{@link leagueOfLegends.Game#getGameStats <em>Game Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Game Stats</em>'.
	 * @see leagueOfLegends.Game#getGameStats()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_GameStats();

	/**
	 * Returns the meta object for the reference '{@link leagueOfLegends.Game#getRedTeam <em>Red Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Red Team</em>'.
	 * @see leagueOfLegends.Game#getRedTeam()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_RedTeam();

	/**
	 * Returns the meta object for the reference '{@link leagueOfLegends.Game#getBlueTeam <em>Blue Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blue Team</em>'.
	 * @see leagueOfLegends.Game#getBlueTeam()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_BlueTeam();

	/**
	 * Returns the meta object for the containment reference list '{@link leagueOfLegends.Game#getGameTeamStat <em>Game Team Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Game Team Stat</em>'.
	 * @see leagueOfLegends.Game#getGameTeamStat()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_GameTeamStat();

	/**
	 * Returns the meta object for the containment reference list '{@link leagueOfLegends.Game#getGamePlayerStats <em>Game Player Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Game Player Stats</em>'.
	 * @see leagueOfLegends.Game#getGamePlayerStats()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_GamePlayerStats();

	/**
	 * Returns the meta object for class '{@link leagueOfLegends.GameTeamStats <em>Game Team Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Team Stats</em>'.
	 * @see leagueOfLegends.GameTeamStats
	 * @generated
	 */
	EClass getGameTeamStats();

	/**
	 * Returns the meta object for the reference '{@link leagueOfLegends.GameTeamStats#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Team</em>'.
	 * @see leagueOfLegends.GameTeamStats#getTeam()
	 * @see #getGameTeamStats()
	 * @generated
	 */
	EReference getGameTeamStats_Team();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.GameTeamStats#getTotalKills <em>Total Kills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Kills</em>'.
	 * @see leagueOfLegends.GameTeamStats#getTotalKills()
	 * @see #getGameTeamStats()
	 * @generated
	 */
	EAttribute getGameTeamStats_TotalKills();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.GameTeamStats#getTotalDeaths <em>Total Deaths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Deaths</em>'.
	 * @see leagueOfLegends.GameTeamStats#getTotalDeaths()
	 * @see #getGameTeamStats()
	 * @generated
	 */
	EAttribute getGameTeamStats_TotalDeaths();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.GameTeamStats#getTotalAssist <em>Total Assist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Assist</em>'.
	 * @see leagueOfLegends.GameTeamStats#getTotalAssist()
	 * @see #getGameTeamStats()
	 * @generated
	 */
	EAttribute getGameTeamStats_TotalAssist();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.GameTeamStats#getTotalGolds <em>Total Golds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Golds</em>'.
	 * @see leagueOfLegends.GameTeamStats#getTotalGolds()
	 * @see #getGameTeamStats()
	 * @generated
	 */
	EAttribute getGameTeamStats_TotalGolds();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.GameTeamStats#getTotalWards <em>Total Wards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Wards</em>'.
	 * @see leagueOfLegends.GameTeamStats#getTotalWards()
	 * @see #getGameTeamStats()
	 * @generated
	 */
	EAttribute getGameTeamStats_TotalWards();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.GameTeamStats#getTotalWardsKilled <em>Total Wards Killed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Wards Killed</em>'.
	 * @see leagueOfLegends.GameTeamStats#getTotalWardsKilled()
	 * @see #getGameTeamStats()
	 * @generated
	 */
	EAttribute getGameTeamStats_TotalWardsKilled();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.GameTeamStats#getTotalVisionWards <em>Total Vision Wards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Vision Wards</em>'.
	 * @see leagueOfLegends.GameTeamStats#getTotalVisionWards()
	 * @see #getGameTeamStats()
	 * @generated
	 */
	EAttribute getGameTeamStats_TotalVisionWards();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.GameTeamStats#getTotalMinionKills <em>Total Minion Kills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Minion Kills</em>'.
	 * @see leagueOfLegends.GameTeamStats#getTotalMinionKills()
	 * @see #getGameTeamStats()
	 * @generated
	 */
	EAttribute getGameTeamStats_TotalMinionKills();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.GameTeamStats#getTotalMonsterKills <em>Total Monster Kills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Monster Kills</em>'.
	 * @see leagueOfLegends.GameTeamStats#getTotalMonsterKills()
	 * @see #getGameTeamStats()
	 * @generated
	 */
	EAttribute getGameTeamStats_TotalMonsterKills();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.GameTeamStats#getTeamBaronKills <em>Team Baron Kills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Team Baron Kills</em>'.
	 * @see leagueOfLegends.GameTeamStats#getTeamBaronKills()
	 * @see #getGameTeamStats()
	 * @generated
	 */
	EAttribute getGameTeamStats_TeamBaronKills();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.GameTeamStats#getTeamSide <em>Team Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Team Side</em>'.
	 * @see leagueOfLegends.GameTeamStats#getTeamSide()
	 * @see #getGameTeamStats()
	 * @generated
	 */
	EAttribute getGameTeamStats_TeamSide();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.GameTeamStats#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see leagueOfLegends.GameTeamStats#getName()
	 * @see #getGameTeamStats()
	 * @generated
	 */
	EAttribute getGameTeamStats_Name();

	/**
	 * Returns the meta object for class '{@link leagueOfLegends.GamePlayerStats <em>Game Player Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Player Stats</em>'.
	 * @see leagueOfLegends.GamePlayerStats
	 * @generated
	 */
	EClass getGamePlayerStats();

	/**
	 * Returns the meta object for the reference '{@link leagueOfLegends.GamePlayerStats#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Player</em>'.
	 * @see leagueOfLegends.GamePlayerStats#getPlayer()
	 * @see #getGamePlayerStats()
	 * @generated
	 */
	EReference getGamePlayerStats_Player();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.GamePlayerStats#getKills <em>Kills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kills</em>'.
	 * @see leagueOfLegends.GamePlayerStats#getKills()
	 * @see #getGamePlayerStats()
	 * @generated
	 */
	EAttribute getGamePlayerStats_Kills();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.GamePlayerStats#getDeaths <em>Deaths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deaths</em>'.
	 * @see leagueOfLegends.GamePlayerStats#getDeaths()
	 * @see #getGamePlayerStats()
	 * @generated
	 */
	EAttribute getGamePlayerStats_Deaths();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.GamePlayerStats#getAssist <em>Assist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assist</em>'.
	 * @see leagueOfLegends.GamePlayerStats#getAssist()
	 * @see #getGamePlayerStats()
	 * @generated
	 */
	EAttribute getGamePlayerStats_Assist();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.GamePlayerStats#getGolds <em>Golds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Golds</em>'.
	 * @see leagueOfLegends.GamePlayerStats#getGolds()
	 * @see #getGamePlayerStats()
	 * @generated
	 */
	EAttribute getGamePlayerStats_Golds();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.GamePlayerStats#getWards <em>Wards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wards</em>'.
	 * @see leagueOfLegends.GamePlayerStats#getWards()
	 * @see #getGamePlayerStats()
	 * @generated
	 */
	EAttribute getGamePlayerStats_Wards();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.GamePlayerStats#getWardsKilled <em>Wards Killed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wards Killed</em>'.
	 * @see leagueOfLegends.GamePlayerStats#getWardsKilled()
	 * @see #getGamePlayerStats()
	 * @generated
	 */
	EAttribute getGamePlayerStats_WardsKilled();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.GamePlayerStats#getVisionWards <em>Vision Wards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vision Wards</em>'.
	 * @see leagueOfLegends.GamePlayerStats#getVisionWards()
	 * @see #getGamePlayerStats()
	 * @generated
	 */
	EAttribute getGamePlayerStats_VisionWards();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.GamePlayerStats#getMinionKills <em>Minion Kills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minion Kills</em>'.
	 * @see leagueOfLegends.GamePlayerStats#getMinionKills()
	 * @see #getGamePlayerStats()
	 * @generated
	 */
	EAttribute getGamePlayerStats_MinionKills();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.GamePlayerStats#getMonsterKills <em>Monster Kills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monster Kills</em>'.
	 * @see leagueOfLegends.GamePlayerStats#getMonsterKills()
	 * @see #getGamePlayerStats()
	 * @generated
	 */
	EAttribute getGamePlayerStats_MonsterKills();

	/**
	 * Returns the meta object for the reference '{@link leagueOfLegends.GamePlayerStats#getChampion <em>Champion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Champion</em>'.
	 * @see leagueOfLegends.GamePlayerStats#getChampion()
	 * @see #getGamePlayerStats()
	 * @generated
	 */
	EReference getGamePlayerStats_Champion();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.GamePlayerStats#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see leagueOfLegends.GamePlayerStats#getName()
	 * @see #getGamePlayerStats()
	 * @generated
	 */
	EAttribute getGamePlayerStats_Name();

	/**
	 * Returns the meta object for class '{@link leagueOfLegends.Season <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Season</em>'.
	 * @see leagueOfLegends.Season
	 * @generated
	 */
	EClass getSeason();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.Season#getSplitName <em>Split Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Split Name</em>'.
	 * @see leagueOfLegends.Season#getSplitName()
	 * @see #getSeason()
	 * @generated
	 */
	EAttribute getSeason_SplitName();

	/**
	 * Returns the meta object for the containment reference list '{@link leagueOfLegends.Season#getMatches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matches</em>'.
	 * @see leagueOfLegends.Season#getMatches()
	 * @see #getSeason()
	 * @generated
	 */
	EReference getSeason_Matches();

	/**
	 * Returns the meta object for the container reference '{@link leagueOfLegends.Season#getLeague <em>League</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>League</em>'.
	 * @see leagueOfLegends.Season#getLeague()
	 * @see #getSeason()
	 * @generated
	 */
	EReference getSeason_League();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.Season#getSplitType <em>Split Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Split Type</em>'.
	 * @see leagueOfLegends.Season#getSplitType()
	 * @see #getSeason()
	 * @generated
	 */
	EAttribute getSeason_SplitType();

	/**
	 * Returns the meta object for class '{@link leagueOfLegends.GameStats <em>Game Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Stats</em>'.
	 * @see leagueOfLegends.GameStats
	 * @generated
	 */
	EClass getGameStats();

	/**
	 * Returns the meta object for the container reference '{@link leagueOfLegends.GameStats#getGame <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Game</em>'.
	 * @see leagueOfLegends.GameStats#getGame()
	 * @see #getGameStats()
	 * @generated
	 */
	EReference getGameStats_Game();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.GameStats#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see leagueOfLegends.GameStats#getDuration()
	 * @see #getGameStats()
	 * @generated
	 */
	EAttribute getGameStats_Duration();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.GameStats#getWinner <em>Winner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Winner</em>'.
	 * @see leagueOfLegends.GameStats#getWinner()
	 * @see #getGameStats()
	 * @generated
	 */
	EAttribute getGameStats_Winner();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.GameStats#getTotalKills <em>Total Kills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Kills</em>'.
	 * @see leagueOfLegends.GameStats#getTotalKills()
	 * @see #getGameStats()
	 * @generated
	 */
	EAttribute getGameStats_TotalKills();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.GameStats#getTotalDeaths <em>Total Deaths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Deaths</em>'.
	 * @see leagueOfLegends.GameStats#getTotalDeaths()
	 * @see #getGameStats()
	 * @generated
	 */
	EAttribute getGameStats_TotalDeaths();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.GameStats#getTotalAssist <em>Total Assist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Assist</em>'.
	 * @see leagueOfLegends.GameStats#getTotalAssist()
	 * @see #getGameStats()
	 * @generated
	 */
	EAttribute getGameStats_TotalAssist();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.GameStats#getTotalGolds <em>Total Golds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Golds</em>'.
	 * @see leagueOfLegends.GameStats#getTotalGolds()
	 * @see #getGameStats()
	 * @generated
	 */
	EAttribute getGameStats_TotalGolds();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.GameStats#getTotalWards <em>Total Wards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Wards</em>'.
	 * @see leagueOfLegends.GameStats#getTotalWards()
	 * @see #getGameStats()
	 * @generated
	 */
	EAttribute getGameStats_TotalWards();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.GameStats#getTotalWardsKilled <em>Total Wards Killed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Wards Killed</em>'.
	 * @see leagueOfLegends.GameStats#getTotalWardsKilled()
	 * @see #getGameStats()
	 * @generated
	 */
	EAttribute getGameStats_TotalWardsKilled();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.GameStats#getTotalVisionWards <em>Total Vision Wards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Vision Wards</em>'.
	 * @see leagueOfLegends.GameStats#getTotalVisionWards()
	 * @see #getGameStats()
	 * @generated
	 */
	EAttribute getGameStats_TotalVisionWards();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.GameStats#getTotalMinionKills <em>Total Minion Kills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Minion Kills</em>'.
	 * @see leagueOfLegends.GameStats#getTotalMinionKills()
	 * @see #getGameStats()
	 * @generated
	 */
	EAttribute getGameStats_TotalMinionKills();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.GameStats#getTotalMonsterKills <em>Total Monster Kills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Monster Kills</em>'.
	 * @see leagueOfLegends.GameStats#getTotalMonsterKills()
	 * @see #getGameStats()
	 * @generated
	 */
	EAttribute getGameStats_TotalMonsterKills();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.GameStats#getTeamBaronKills <em>Team Baron Kills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Team Baron Kills</em>'.
	 * @see leagueOfLegends.GameStats#getTeamBaronKills()
	 * @see #getGameStats()
	 * @generated
	 */
	EAttribute getGameStats_TeamBaronKills();

	/**
	 * Returns the meta object for class '{@link leagueOfLegends.ChampionsStats <em>Champions Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Champions Stats</em>'.
	 * @see leagueOfLegends.ChampionsStats
	 * @generated
	 */
	EClass getChampionsStats();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.ChampionsStats#getGamesPlayed <em>Games Played</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Games Played</em>'.
	 * @see leagueOfLegends.ChampionsStats#getGamesPlayed()
	 * @see #getChampionsStats()
	 * @generated
	 */
	EAttribute getChampionsStats_GamesPlayed();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.ChampionsStats#getTotalKills <em>Total Kills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Kills</em>'.
	 * @see leagueOfLegends.ChampionsStats#getTotalKills()
	 * @see #getChampionsStats()
	 * @generated
	 */
	EAttribute getChampionsStats_TotalKills();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.ChampionsStats#getTotalDeaths <em>Total Deaths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Deaths</em>'.
	 * @see leagueOfLegends.ChampionsStats#getTotalDeaths()
	 * @see #getChampionsStats()
	 * @generated
	 */
	EAttribute getChampionsStats_TotalDeaths();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.ChampionsStats#getTotalAssist <em>Total Assist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Assist</em>'.
	 * @see leagueOfLegends.ChampionsStats#getTotalAssist()
	 * @see #getChampionsStats()
	 * @generated
	 */
	EAttribute getChampionsStats_TotalAssist();

	/**
	 * Returns the meta object for the attribute '{@link leagueOfLegends.ChampionsStats#getKillDeathAssistRatio <em>Kill Death Assist Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kill Death Assist Ratio</em>'.
	 * @see leagueOfLegends.ChampionsStats#getKillDeathAssistRatio()
	 * @see #getChampionsStats()
	 * @generated
	 */
	EAttribute getChampionsStats_KillDeathAssistRatio();

	/**
	 * Returns the meta object for the container reference '{@link leagueOfLegends.ChampionsStats#getChampion <em>Champion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Champion</em>'.
	 * @see leagueOfLegends.ChampionsStats#getChampion()
	 * @see #getChampionsStats()
	 * @generated
	 */
	EReference getChampionsStats_Champion();

	/**
	 * Returns the meta object for enum '{@link leagueOfLegends.BestOf <em>Best Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Best Of</em>'.
	 * @see leagueOfLegends.BestOf
	 * @generated
	 */
	EEnum getBestOf();

	/**
	 * Returns the meta object for enum '{@link leagueOfLegends.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Position</em>'.
	 * @see leagueOfLegends.Position
	 * @generated
	 */
	EEnum getPosition();

	/**
	 * Returns the meta object for enum '{@link leagueOfLegends.Side <em>Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Side</em>'.
	 * @see leagueOfLegends.Side
	 * @generated
	 */
	EEnum getSide();

	/**
	 * Returns the meta object for enum '{@link leagueOfLegends.SplitType <em>Split Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Split Type</em>'.
	 * @see leagueOfLegends.SplitType
	 * @generated
	 */
	EEnum getSplitType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LeagueOfLegendsFactory getLeagueOfLegendsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link leagueOfLegends.impl.LeagueImpl <em>League</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see leagueOfLegends.impl.LeagueImpl
		 * @see leagueOfLegends.impl.LeagueOfLegendsPackageImpl#getLeague()
		 * @generated
		 */
		EClass LEAGUE = eINSTANCE.getLeague();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEAGUE__NAME = eINSTANCE.getLeague_Name();

		/**
		 * The meta object literal for the '<em><b>Teams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEAGUE__TEAMS = eINSTANCE.getLeague_Teams();

		/**
		 * The meta object literal for the '<em><b>Seasons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEAGUE__SEASONS = eINSTANCE.getLeague_Seasons();

		/**
		 * The meta object literal for the '<em><b>Champions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEAGUE__CHAMPIONS = eINSTANCE.getLeague_Champions();

		/**
		 * The meta object literal for the '{@link leagueOfLegends.impl.TeamImpl <em>Team</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see leagueOfLegends.impl.TeamImpl
		 * @see leagueOfLegends.impl.LeagueOfLegendsPackageImpl#getTeam()
		 * @generated
		 */
		EClass TEAM = eINSTANCE.getTeam();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__NAME = eINSTANCE.getTeam_Name();

		/**
		 * The meta object literal for the '<em><b>League</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__LEAGUE = eINSTANCE.getTeam_League();

		/**
		 * The meta object literal for the '<em><b>Player</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__PLAYER = eINSTANCE.getTeam_Player();

		/**
		 * The meta object literal for the '<em><b>Win Loss Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__WIN_LOSS_RATIO = eINSTANCE.getTeam_WinLossRatio();

		/**
		 * The meta object literal for the '{@link leagueOfLegends.impl.PlayerImpl <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see leagueOfLegends.impl.PlayerImpl
		 * @see leagueOfLegends.impl.LeagueOfLegendsPackageImpl#getPlayer()
		 * @generated
		 */
		EClass PLAYER = eINSTANCE.getPlayer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__NAME = eINSTANCE.getPlayer_Name();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__POSITION = eINSTANCE.getPlayer_Position();

		/**
		 * The meta object literal for the '<em><b>Champion Pool</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__CHAMPION_POOL = eINSTANCE.getPlayer_ChampionPool();

		/**
		 * The meta object literal for the '<em><b>Player Stats</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__PLAYER_STATS = eINSTANCE.getPlayer_PlayerStats();

		/**
		 * The meta object literal for the '<em><b>Team</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__TEAM = eINSTANCE.getPlayer_Team();

		/**
		 * The meta object literal for the '{@link leagueOfLegends.impl.PlayerStatsImpl <em>Player Stats</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see leagueOfLegends.impl.PlayerStatsImpl
		 * @see leagueOfLegends.impl.LeagueOfLegendsPackageImpl#getPlayerStats()
		 * @generated
		 */
		EClass PLAYER_STATS = eINSTANCE.getPlayerStats();

		/**
		 * The meta object literal for the '<em><b>Games Played</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER_STATS__GAMES_PLAYED = eINSTANCE.getPlayerStats_GamesPlayed();

		/**
		 * The meta object literal for the '<em><b>Career Kills</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER_STATS__CAREER_KILLS = eINSTANCE.getPlayerStats_CareerKills();

		/**
		 * The meta object literal for the '<em><b>Career Deaths</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER_STATS__CAREER_DEATHS = eINSTANCE.getPlayerStats_CareerDeaths();

		/**
		 * The meta object literal for the '<em><b>Career Assist</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER_STATS__CAREER_ASSIST = eINSTANCE.getPlayerStats_CareerAssist();

		/**
		 * The meta object literal for the '<em><b>Kill Death Assist Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER_STATS__KILL_DEATH_ASSIST_RATIO = eINSTANCE.getPlayerStats_KillDeathAssistRatio();

		/**
		 * The meta object literal for the '<em><b>Win Lose Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER_STATS__WIN_LOSE_RATIO = eINSTANCE.getPlayerStats_WinLoseRatio();

		/**
		 * The meta object literal for the '<em><b>Player</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER_STATS__PLAYER = eINSTANCE.getPlayerStats_Player();

		/**
		 * The meta object literal for the '{@link leagueOfLegends.impl.ChampionImpl <em>Champion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see leagueOfLegends.impl.ChampionImpl
		 * @see leagueOfLegends.impl.LeagueOfLegendsPackageImpl#getChampion()
		 * @generated
		 */
		EClass CHAMPION = eINSTANCE.getChampion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAMPION__NAME = eINSTANCE.getChampion_Name();

		/**
		 * The meta object literal for the '<em><b>Champion Stat</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAMPION__CHAMPION_STAT = eINSTANCE.getChampion_ChampionStat();

		/**
		 * The meta object literal for the '{@link leagueOfLegends.impl.MatchImpl <em>Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see leagueOfLegends.impl.MatchImpl
		 * @see leagueOfLegends.impl.LeagueOfLegendsPackageImpl#getMatch()
		 * @generated
		 */
		EClass MATCH = eINSTANCE.getMatch();

		/**
		 * The meta object literal for the '<em><b>Games</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__GAMES = eINSTANCE.getMatch_Games();

		/**
		 * The meta object literal for the '<em><b>Match ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__MATCH_ID = eINSTANCE.getMatch_MatchID();

		/**
		 * The meta object literal for the '<em><b>Best OF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__BEST_OF = eINSTANCE.getMatch_BestOF();

		/**
		 * The meta object literal for the '<em><b>Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__SCORE = eINSTANCE.getMatch_Score();

		/**
		 * The meta object literal for the '<em><b>Teams</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__TEAMS = eINSTANCE.getMatch_Teams();

		/**
		 * The meta object literal for the '<em><b>Week</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__WEEK = eINSTANCE.getMatch_Week();

		/**
		 * The meta object literal for the '{@link leagueOfLegends.impl.GameImpl <em>Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see leagueOfLegends.impl.GameImpl
		 * @see leagueOfLegends.impl.LeagueOfLegendsPackageImpl#getGame()
		 * @generated
		 */
		EClass GAME = eINSTANCE.getGame();

		/**
		 * The meta object literal for the '<em><b>Game ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__GAME_ID = eINSTANCE.getGame_GameID();

		/**
		 * The meta object literal for the '<em><b>Game Stats</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__GAME_STATS = eINSTANCE.getGame_GameStats();

		/**
		 * The meta object literal for the '<em><b>Red Team</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__RED_TEAM = eINSTANCE.getGame_RedTeam();

		/**
		 * The meta object literal for the '<em><b>Blue Team</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__BLUE_TEAM = eINSTANCE.getGame_BlueTeam();

		/**
		 * The meta object literal for the '<em><b>Game Team Stat</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__GAME_TEAM_STAT = eINSTANCE.getGame_GameTeamStat();

		/**
		 * The meta object literal for the '<em><b>Game Player Stats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__GAME_PLAYER_STATS = eINSTANCE.getGame_GamePlayerStats();

		/**
		 * The meta object literal for the '{@link leagueOfLegends.impl.GameTeamStatsImpl <em>Game Team Stats</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see leagueOfLegends.impl.GameTeamStatsImpl
		 * @see leagueOfLegends.impl.LeagueOfLegendsPackageImpl#getGameTeamStats()
		 * @generated
		 */
		EClass GAME_TEAM_STATS = eINSTANCE.getGameTeamStats();

		/**
		 * The meta object literal for the '<em><b>Team</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_TEAM_STATS__TEAM = eINSTANCE.getGameTeamStats_Team();

		/**
		 * The meta object literal for the '<em><b>Total Kills</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_TEAM_STATS__TOTAL_KILLS = eINSTANCE.getGameTeamStats_TotalKills();

		/**
		 * The meta object literal for the '<em><b>Total Deaths</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_TEAM_STATS__TOTAL_DEATHS = eINSTANCE.getGameTeamStats_TotalDeaths();

		/**
		 * The meta object literal for the '<em><b>Total Assist</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_TEAM_STATS__TOTAL_ASSIST = eINSTANCE.getGameTeamStats_TotalAssist();

		/**
		 * The meta object literal for the '<em><b>Total Golds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_TEAM_STATS__TOTAL_GOLDS = eINSTANCE.getGameTeamStats_TotalGolds();

		/**
		 * The meta object literal for the '<em><b>Total Wards</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_TEAM_STATS__TOTAL_WARDS = eINSTANCE.getGameTeamStats_TotalWards();

		/**
		 * The meta object literal for the '<em><b>Total Wards Killed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_TEAM_STATS__TOTAL_WARDS_KILLED = eINSTANCE.getGameTeamStats_TotalWardsKilled();

		/**
		 * The meta object literal for the '<em><b>Total Vision Wards</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_TEAM_STATS__TOTAL_VISION_WARDS = eINSTANCE.getGameTeamStats_TotalVisionWards();

		/**
		 * The meta object literal for the '<em><b>Total Minion Kills</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_TEAM_STATS__TOTAL_MINION_KILLS = eINSTANCE.getGameTeamStats_TotalMinionKills();

		/**
		 * The meta object literal for the '<em><b>Total Monster Kills</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_TEAM_STATS__TOTAL_MONSTER_KILLS = eINSTANCE.getGameTeamStats_TotalMonsterKills();

		/**
		 * The meta object literal for the '<em><b>Team Baron Kills</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_TEAM_STATS__TEAM_BARON_KILLS = eINSTANCE.getGameTeamStats_TeamBaronKills();

		/**
		 * The meta object literal for the '<em><b>Team Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_TEAM_STATS__TEAM_SIDE = eINSTANCE.getGameTeamStats_TeamSide();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_TEAM_STATS__NAME = eINSTANCE.getGameTeamStats_Name();

		/**
		 * The meta object literal for the '{@link leagueOfLegends.impl.GamePlayerStatsImpl <em>Game Player Stats</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see leagueOfLegends.impl.GamePlayerStatsImpl
		 * @see leagueOfLegends.impl.LeagueOfLegendsPackageImpl#getGamePlayerStats()
		 * @generated
		 */
		EClass GAME_PLAYER_STATS = eINSTANCE.getGamePlayerStats();

		/**
		 * The meta object literal for the '<em><b>Player</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_PLAYER_STATS__PLAYER = eINSTANCE.getGamePlayerStats_Player();

		/**
		 * The meta object literal for the '<em><b>Kills</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_PLAYER_STATS__KILLS = eINSTANCE.getGamePlayerStats_Kills();

		/**
		 * The meta object literal for the '<em><b>Deaths</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_PLAYER_STATS__DEATHS = eINSTANCE.getGamePlayerStats_Deaths();

		/**
		 * The meta object literal for the '<em><b>Assist</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_PLAYER_STATS__ASSIST = eINSTANCE.getGamePlayerStats_Assist();

		/**
		 * The meta object literal for the '<em><b>Golds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_PLAYER_STATS__GOLDS = eINSTANCE.getGamePlayerStats_Golds();

		/**
		 * The meta object literal for the '<em><b>Wards</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_PLAYER_STATS__WARDS = eINSTANCE.getGamePlayerStats_Wards();

		/**
		 * The meta object literal for the '<em><b>Wards Killed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_PLAYER_STATS__WARDS_KILLED = eINSTANCE.getGamePlayerStats_WardsKilled();

		/**
		 * The meta object literal for the '<em><b>Vision Wards</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_PLAYER_STATS__VISION_WARDS = eINSTANCE.getGamePlayerStats_VisionWards();

		/**
		 * The meta object literal for the '<em><b>Minion Kills</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_PLAYER_STATS__MINION_KILLS = eINSTANCE.getGamePlayerStats_MinionKills();

		/**
		 * The meta object literal for the '<em><b>Monster Kills</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_PLAYER_STATS__MONSTER_KILLS = eINSTANCE.getGamePlayerStats_MonsterKills();

		/**
		 * The meta object literal for the '<em><b>Champion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_PLAYER_STATS__CHAMPION = eINSTANCE.getGamePlayerStats_Champion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_PLAYER_STATS__NAME = eINSTANCE.getGamePlayerStats_Name();

		/**
		 * The meta object literal for the '{@link leagueOfLegends.impl.SeasonImpl <em>Season</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see leagueOfLegends.impl.SeasonImpl
		 * @see leagueOfLegends.impl.LeagueOfLegendsPackageImpl#getSeason()
		 * @generated
		 */
		EClass SEASON = eINSTANCE.getSeason();

		/**
		 * The meta object literal for the '<em><b>Split Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEASON__SPLIT_NAME = eINSTANCE.getSeason_SplitName();

		/**
		 * The meta object literal for the '<em><b>Matches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEASON__MATCHES = eINSTANCE.getSeason_Matches();

		/**
		 * The meta object literal for the '<em><b>League</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEASON__LEAGUE = eINSTANCE.getSeason_League();

		/**
		 * The meta object literal for the '<em><b>Split Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEASON__SPLIT_TYPE = eINSTANCE.getSeason_SplitType();

		/**
		 * The meta object literal for the '{@link leagueOfLegends.impl.GameStatsImpl <em>Game Stats</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see leagueOfLegends.impl.GameStatsImpl
		 * @see leagueOfLegends.impl.LeagueOfLegendsPackageImpl#getGameStats()
		 * @generated
		 */
		EClass GAME_STATS = eINSTANCE.getGameStats();

		/**
		 * The meta object literal for the '<em><b>Game</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_STATS__GAME = eINSTANCE.getGameStats_Game();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_STATS__DURATION = eINSTANCE.getGameStats_Duration();

		/**
		 * The meta object literal for the '<em><b>Winner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_STATS__WINNER = eINSTANCE.getGameStats_Winner();

		/**
		 * The meta object literal for the '<em><b>Total Kills</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_STATS__TOTAL_KILLS = eINSTANCE.getGameStats_TotalKills();

		/**
		 * The meta object literal for the '<em><b>Total Deaths</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_STATS__TOTAL_DEATHS = eINSTANCE.getGameStats_TotalDeaths();

		/**
		 * The meta object literal for the '<em><b>Total Assist</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_STATS__TOTAL_ASSIST = eINSTANCE.getGameStats_TotalAssist();

		/**
		 * The meta object literal for the '<em><b>Total Golds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_STATS__TOTAL_GOLDS = eINSTANCE.getGameStats_TotalGolds();

		/**
		 * The meta object literal for the '<em><b>Total Wards</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_STATS__TOTAL_WARDS = eINSTANCE.getGameStats_TotalWards();

		/**
		 * The meta object literal for the '<em><b>Total Wards Killed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_STATS__TOTAL_WARDS_KILLED = eINSTANCE.getGameStats_TotalWardsKilled();

		/**
		 * The meta object literal for the '<em><b>Total Vision Wards</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_STATS__TOTAL_VISION_WARDS = eINSTANCE.getGameStats_TotalVisionWards();

		/**
		 * The meta object literal for the '<em><b>Total Minion Kills</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_STATS__TOTAL_MINION_KILLS = eINSTANCE.getGameStats_TotalMinionKills();

		/**
		 * The meta object literal for the '<em><b>Total Monster Kills</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_STATS__TOTAL_MONSTER_KILLS = eINSTANCE.getGameStats_TotalMonsterKills();

		/**
		 * The meta object literal for the '<em><b>Team Baron Kills</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_STATS__TEAM_BARON_KILLS = eINSTANCE.getGameStats_TeamBaronKills();

		/**
		 * The meta object literal for the '{@link leagueOfLegends.impl.ChampionsStatsImpl <em>Champions Stats</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see leagueOfLegends.impl.ChampionsStatsImpl
		 * @see leagueOfLegends.impl.LeagueOfLegendsPackageImpl#getChampionsStats()
		 * @generated
		 */
		EClass CHAMPIONS_STATS = eINSTANCE.getChampionsStats();

		/**
		 * The meta object literal for the '<em><b>Games Played</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAMPIONS_STATS__GAMES_PLAYED = eINSTANCE.getChampionsStats_GamesPlayed();

		/**
		 * The meta object literal for the '<em><b>Total Kills</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAMPIONS_STATS__TOTAL_KILLS = eINSTANCE.getChampionsStats_TotalKills();

		/**
		 * The meta object literal for the '<em><b>Total Deaths</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAMPIONS_STATS__TOTAL_DEATHS = eINSTANCE.getChampionsStats_TotalDeaths();

		/**
		 * The meta object literal for the '<em><b>Total Assist</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAMPIONS_STATS__TOTAL_ASSIST = eINSTANCE.getChampionsStats_TotalAssist();

		/**
		 * The meta object literal for the '<em><b>Kill Death Assist Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAMPIONS_STATS__KILL_DEATH_ASSIST_RATIO = eINSTANCE.getChampionsStats_KillDeathAssistRatio();

		/**
		 * The meta object literal for the '<em><b>Champion</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAMPIONS_STATS__CHAMPION = eINSTANCE.getChampionsStats_Champion();

		/**
		 * The meta object literal for the '{@link leagueOfLegends.BestOf <em>Best Of</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see leagueOfLegends.BestOf
		 * @see leagueOfLegends.impl.LeagueOfLegendsPackageImpl#getBestOf()
		 * @generated
		 */
		EEnum BEST_OF = eINSTANCE.getBestOf();

		/**
		 * The meta object literal for the '{@link leagueOfLegends.Position <em>Position</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see leagueOfLegends.Position
		 * @see leagueOfLegends.impl.LeagueOfLegendsPackageImpl#getPosition()
		 * @generated
		 */
		EEnum POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '{@link leagueOfLegends.Side <em>Side</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see leagueOfLegends.Side
		 * @see leagueOfLegends.impl.LeagueOfLegendsPackageImpl#getSide()
		 * @generated
		 */
		EEnum SIDE = eINSTANCE.getSide();

		/**
		 * The meta object literal for the '{@link leagueOfLegends.SplitType <em>Split Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see leagueOfLegends.SplitType
		 * @see leagueOfLegends.impl.LeagueOfLegendsPackageImpl#getSplitType()
		 * @generated
		 */
		EEnum SPLIT_TYPE = eINSTANCE.getSplitType();

	}

} //LeagueOfLegendsPackage
