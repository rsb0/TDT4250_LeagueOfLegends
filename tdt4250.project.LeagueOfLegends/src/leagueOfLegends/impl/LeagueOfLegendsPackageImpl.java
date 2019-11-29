/**
 */
package leagueOfLegends.impl;

import leagueOfLegends.BestOf;
import leagueOfLegends.Champion;
import leagueOfLegends.ChampionsStats;
import leagueOfLegends.Game;
import leagueOfLegends.GamePlayerStats;
import leagueOfLegends.GameStats;
import leagueOfLegends.GameTeamStats;
import leagueOfLegends.League;
import leagueOfLegends.LeagueOfLegendsFactory;
import leagueOfLegends.LeagueOfLegendsPackage;
import leagueOfLegends.LeagueStats;
import leagueOfLegends.Match;
import leagueOfLegends.Player;
import leagueOfLegends.PlayerStats;
import leagueOfLegends.Position;
import leagueOfLegends.Season;
import leagueOfLegends.Side;
import leagueOfLegends.SplitType;
import leagueOfLegends.Team;

import leagueOfLegends.TeamStats;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LeagueOfLegendsPackageImpl extends EPackageImpl implements LeagueOfLegendsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leagueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass championEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playerStatsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameTeamStatsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gamePlayerStatsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seasonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameStatsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass championsStatsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teamStatsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leagueStatsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bestOfEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum positionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sideEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum splitTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see leagueOfLegends.LeagueOfLegendsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LeagueOfLegendsPackageImpl() {
		super(eNS_URI, LeagueOfLegendsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link LeagueOfLegendsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LeagueOfLegendsPackage init() {
		if (isInited) return (LeagueOfLegendsPackage)EPackage.Registry.INSTANCE.getEPackage(LeagueOfLegendsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLeagueOfLegendsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LeagueOfLegendsPackageImpl theLeagueOfLegendsPackage = registeredLeagueOfLegendsPackage instanceof LeagueOfLegendsPackageImpl ? (LeagueOfLegendsPackageImpl)registeredLeagueOfLegendsPackage : new LeagueOfLegendsPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theLeagueOfLegendsPackage.createPackageContents();

		// Initialize created meta-data
		theLeagueOfLegendsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLeagueOfLegendsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LeagueOfLegendsPackage.eNS_URI, theLeagueOfLegendsPackage);
		return theLeagueOfLegendsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLeague() {
		return leagueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLeague_Name() {
		return (EAttribute)leagueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLeague_Teams() {
		return (EReference)leagueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLeague_Seasons() {
		return (EReference)leagueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLeague_Champions() {
		return (EReference)leagueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLeague_LeagueStats() {
		return (EReference)leagueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChampion() {
		return championEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChampion_Name() {
		return (EAttribute)championEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChampion_ChampionStat() {
		return (EReference)championEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTeam() {
		return teamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTeam_Name() {
		return (EAttribute)teamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTeam_League() {
		return (EReference)teamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTeam_Player() {
		return (EReference)teamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTeam_WinLossRatio() {
		return (EAttribute)teamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTeam_TeamStats() {
		return (EReference)teamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlayer() {
		return playerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlayer_Name() {
		return (EAttribute)playerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlayer_Position() {
		return (EAttribute)playerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlayer_ChampionPool() {
		return (EReference)playerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlayer_PlayerStats() {
		return (EReference)playerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlayer_Team() {
		return (EReference)playerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlayerStats() {
		return playerStatsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlayerStats_GamesPlayed() {
		return (EAttribute)playerStatsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlayerStats_CareerKills() {
		return (EAttribute)playerStatsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlayerStats_CareerDeaths() {
		return (EAttribute)playerStatsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlayerStats_CareerAssist() {
		return (EAttribute)playerStatsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlayerStats_KillDeathAssistRatio() {
		return (EAttribute)playerStatsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlayerStats_WinLoseRatio() {
		return (EAttribute)playerStatsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlayerStats_Player() {
		return (EReference)playerStatsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlayerStats_CareerGameWins() {
		return (EAttribute)playerStatsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlayerStats_CareerMatchWins() {
		return (EAttribute)playerStatsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMatch() {
		return matchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatch_Games() {
		return (EReference)matchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMatch_DisplayName() {
		return (EAttribute)matchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMatch_MatchID() {
		return (EAttribute)matchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMatch_BestOF() {
		return (EAttribute)matchEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMatch_Score() {
		return (EAttribute)matchEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatch_Teams() {
		return (EReference)matchEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMatch_Week() {
		return (EAttribute)matchEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatch_Winner() {
		return (EReference)matchEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGame() {
		return gameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGame_GameID() {
		return (EAttribute)gameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGame_GameStats() {
		return (EReference)gameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGame_RedTeam() {
		return (EReference)gameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGame_BlueTeam() {
		return (EReference)gameEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGame_GameTeamStat() {
		return (EReference)gameEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGame_GamePlayerStats() {
		return (EReference)gameEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGame_WinningSide() {
		return (EAttribute)gameEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGame_WinningTeam() {
		return (EReference)gameEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGameTeamStats() {
		return gameTeamStatsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGameTeamStats_Team() {
		return (EReference)gameTeamStatsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGameTeamStats_TotalKills() {
		return (EAttribute)gameTeamStatsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGameTeamStats_TotalDeaths() {
		return (EAttribute)gameTeamStatsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGameTeamStats_TotalAssist() {
		return (EAttribute)gameTeamStatsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGameTeamStats_TotalGolds() {
		return (EAttribute)gameTeamStatsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGameTeamStats_TotalWards() {
		return (EAttribute)gameTeamStatsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGameTeamStats_TotalWardsKilled() {
		return (EAttribute)gameTeamStatsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGameTeamStats_TotalVisionWards() {
		return (EAttribute)gameTeamStatsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGameTeamStats_TotalMinionKills() {
		return (EAttribute)gameTeamStatsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGameTeamStats_TotalMonsterKills() {
		return (EAttribute)gameTeamStatsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGameTeamStats_TeamBaronKills() {
		return (EAttribute)gameTeamStatsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGameTeamStats_TeamSide() {
		return (EAttribute)gameTeamStatsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGameTeamStats_Name() {
		return (EAttribute)gameTeamStatsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGamePlayerStats() {
		return gamePlayerStatsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGamePlayerStats_Player() {
		return (EReference)gamePlayerStatsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGamePlayerStats_Kills() {
		return (EAttribute)gamePlayerStatsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGamePlayerStats_Deaths() {
		return (EAttribute)gamePlayerStatsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGamePlayerStats_Assist() {
		return (EAttribute)gamePlayerStatsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGamePlayerStats_Golds() {
		return (EAttribute)gamePlayerStatsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGamePlayerStats_Wards() {
		return (EAttribute)gamePlayerStatsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGamePlayerStats_WardsKilled() {
		return (EAttribute)gamePlayerStatsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGamePlayerStats_VisionWards() {
		return (EAttribute)gamePlayerStatsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGamePlayerStats_MinionKills() {
		return (EAttribute)gamePlayerStatsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGamePlayerStats_MonsterKills() {
		return (EAttribute)gamePlayerStatsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGamePlayerStats_Champion() {
		return (EReference)gamePlayerStatsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGamePlayerStats_Name() {
		return (EAttribute)gamePlayerStatsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSeason() {
		return seasonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSeason_SplitName() {
		return (EAttribute)seasonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSeason_Matches() {
		return (EReference)seasonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSeason_League() {
		return (EReference)seasonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSeason_SplitType() {
		return (EAttribute)seasonEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGameStats() {
		return gameStatsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGameStats_Game() {
		return (EReference)gameStatsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGameStats_Duration() {
		return (EAttribute)gameStatsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGameStats_Winner() {
		return (EAttribute)gameStatsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGameStats_TotalKills() {
		return (EAttribute)gameStatsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGameStats_TotalDeaths() {
		return (EAttribute)gameStatsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGameStats_TotalAssist() {
		return (EAttribute)gameStatsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGameStats_TotalGolds() {
		return (EAttribute)gameStatsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGameStats_TotalWards() {
		return (EAttribute)gameStatsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGameStats_TotalWardsKilled() {
		return (EAttribute)gameStatsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGameStats_TotalVisionWards() {
		return (EAttribute)gameStatsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGameStats_TotalMinionKills() {
		return (EAttribute)gameStatsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGameStats_TotalMonsterKills() {
		return (EAttribute)gameStatsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGameStats_TeamBaronKills() {
		return (EAttribute)gameStatsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGameStats_Name() {
		return (EAttribute)gameStatsEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChampionsStats() {
		return championsStatsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChampionsStats_GamesPlayed() {
		return (EAttribute)championsStatsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChampionsStats_TotalKills() {
		return (EAttribute)championsStatsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChampionsStats_TotalDeaths() {
		return (EAttribute)championsStatsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChampionsStats_TotalAssist() {
		return (EAttribute)championsStatsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChampionsStats_KillDeathAssistRatio() {
		return (EAttribute)championsStatsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChampionsStats_Champion() {
		return (EReference)championsStatsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChampionsStats_Bans() {
		return (EAttribute)championsStatsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChampionsStats_Wins() {
		return (EAttribute)championsStatsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChampionsStats_WinLoseRatio() {
		return (EAttribute)championsStatsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTeamStats() {
		return teamStatsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTeamStats_Team() {
		return (EReference)teamStatsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTeamStats_GamesPlayed() {
		return (EAttribute)teamStatsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTeamStats_Kills() {
		return (EAttribute)teamStatsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTeamStats_Deaths() {
		return (EAttribute)teamStatsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTeamStats_Assists() {
		return (EAttribute)teamStatsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTeamStats_KillDeathAssistRatio() {
		return (EAttribute)teamStatsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTeamStats_WinLoseRatio() {
		return (EAttribute)teamStatsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTeamStats_GameWins() {
		return (EAttribute)teamStatsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTeamStats_MatchWins() {
		return (EAttribute)teamStatsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTeamStats_TournamentWins() {
		return (EAttribute)teamStatsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTeamStats_TournamentSecondPlaces() {
		return (EAttribute)teamStatsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTeamStats_TournamentThridPlaces() {
		return (EAttribute)teamStatsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTeamStats_PlayerWithMostKills() {
		return (EReference)teamStatsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTeamStats_PlayerWithMostDeaths() {
		return (EReference)teamStatsEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTeamStats_PlayerWithMostAssists() {
		return (EReference)teamStatsEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTeamStats_PlayerWithHighestKda() {
		return (EReference)teamStatsEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLeagueStats() {
		return leagueStatsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLeagueStats_League() {
		return (EReference)leagueStatsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLeagueStats_Kills() {
		return (EAttribute)leagueStatsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLeagueStats_Deaths() {
		return (EAttribute)leagueStatsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLeagueStats_Assists() {
		return (EAttribute)leagueStatsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLeagueStats_PlayerWithMostKills() {
		return (EReference)leagueStatsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLeagueStats_PlayerWithMostDeaths() {
		return (EReference)leagueStatsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLeagueStats_PlayerWithMostAssists() {
		return (EReference)leagueStatsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLeagueStats_PlayerWithHighestKda() {
		return (EReference)leagueStatsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLeagueStats_ChampionWithMostKills() {
		return (EReference)leagueStatsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLeagueStats_ChampionWithMostDeaths() {
		return (EReference)leagueStatsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLeagueStats_ChampionWithMostAssists() {
		return (EReference)leagueStatsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLeagueStats_ChampionWithHighestKda() {
		return (EReference)leagueStatsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBestOf() {
		return bestOfEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPosition() {
		return positionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSide() {
		return sideEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSplitType() {
		return splitTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LeagueOfLegendsFactory getLeagueOfLegendsFactory() {
		return (LeagueOfLegendsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		leagueEClass = createEClass(LEAGUE);
		createEAttribute(leagueEClass, LEAGUE__NAME);
		createEReference(leagueEClass, LEAGUE__TEAMS);
		createEReference(leagueEClass, LEAGUE__SEASONS);
		createEReference(leagueEClass, LEAGUE__CHAMPIONS);
		createEReference(leagueEClass, LEAGUE__LEAGUE_STATS);

		championEClass = createEClass(CHAMPION);
		createEAttribute(championEClass, CHAMPION__NAME);
		createEReference(championEClass, CHAMPION__CHAMPION_STAT);

		teamEClass = createEClass(TEAM);
		createEAttribute(teamEClass, TEAM__NAME);
		createEReference(teamEClass, TEAM__LEAGUE);
		createEReference(teamEClass, TEAM__PLAYER);
		createEAttribute(teamEClass, TEAM__WIN_LOSS_RATIO);
		createEReference(teamEClass, TEAM__TEAM_STATS);

		playerEClass = createEClass(PLAYER);
		createEAttribute(playerEClass, PLAYER__NAME);
		createEAttribute(playerEClass, PLAYER__POSITION);
		createEReference(playerEClass, PLAYER__CHAMPION_POOL);
		createEReference(playerEClass, PLAYER__PLAYER_STATS);
		createEReference(playerEClass, PLAYER__TEAM);

		playerStatsEClass = createEClass(PLAYER_STATS);
		createEAttribute(playerStatsEClass, PLAYER_STATS__GAMES_PLAYED);
		createEAttribute(playerStatsEClass, PLAYER_STATS__CAREER_KILLS);
		createEAttribute(playerStatsEClass, PLAYER_STATS__CAREER_DEATHS);
		createEAttribute(playerStatsEClass, PLAYER_STATS__CAREER_ASSIST);
		createEAttribute(playerStatsEClass, PLAYER_STATS__KILL_DEATH_ASSIST_RATIO);
		createEAttribute(playerStatsEClass, PLAYER_STATS__WIN_LOSE_RATIO);
		createEReference(playerStatsEClass, PLAYER_STATS__PLAYER);
		createEAttribute(playerStatsEClass, PLAYER_STATS__CAREER_GAME_WINS);
		createEAttribute(playerStatsEClass, PLAYER_STATS__CAREER_MATCH_WINS);

		matchEClass = createEClass(MATCH);
		createEReference(matchEClass, MATCH__GAMES);
		createEAttribute(matchEClass, MATCH__DISPLAY_NAME);
		createEAttribute(matchEClass, MATCH__MATCH_ID);
		createEAttribute(matchEClass, MATCH__BEST_OF);
		createEAttribute(matchEClass, MATCH__SCORE);
		createEReference(matchEClass, MATCH__TEAMS);
		createEAttribute(matchEClass, MATCH__WEEK);
		createEReference(matchEClass, MATCH__WINNER);

		gameEClass = createEClass(GAME);
		createEAttribute(gameEClass, GAME__GAME_ID);
		createEReference(gameEClass, GAME__GAME_STATS);
		createEReference(gameEClass, GAME__RED_TEAM);
		createEReference(gameEClass, GAME__BLUE_TEAM);
		createEReference(gameEClass, GAME__GAME_TEAM_STAT);
		createEReference(gameEClass, GAME__GAME_PLAYER_STATS);
		createEAttribute(gameEClass, GAME__WINNING_SIDE);
		createEReference(gameEClass, GAME__WINNING_TEAM);

		gameTeamStatsEClass = createEClass(GAME_TEAM_STATS);
		createEReference(gameTeamStatsEClass, GAME_TEAM_STATS__TEAM);
		createEAttribute(gameTeamStatsEClass, GAME_TEAM_STATS__TOTAL_KILLS);
		createEAttribute(gameTeamStatsEClass, GAME_TEAM_STATS__TOTAL_DEATHS);
		createEAttribute(gameTeamStatsEClass, GAME_TEAM_STATS__TOTAL_ASSIST);
		createEAttribute(gameTeamStatsEClass, GAME_TEAM_STATS__TOTAL_GOLDS);
		createEAttribute(gameTeamStatsEClass, GAME_TEAM_STATS__TOTAL_WARDS);
		createEAttribute(gameTeamStatsEClass, GAME_TEAM_STATS__TOTAL_WARDS_KILLED);
		createEAttribute(gameTeamStatsEClass, GAME_TEAM_STATS__TOTAL_VISION_WARDS);
		createEAttribute(gameTeamStatsEClass, GAME_TEAM_STATS__TOTAL_MINION_KILLS);
		createEAttribute(gameTeamStatsEClass, GAME_TEAM_STATS__TOTAL_MONSTER_KILLS);
		createEAttribute(gameTeamStatsEClass, GAME_TEAM_STATS__TEAM_BARON_KILLS);
		createEAttribute(gameTeamStatsEClass, GAME_TEAM_STATS__TEAM_SIDE);
		createEAttribute(gameTeamStatsEClass, GAME_TEAM_STATS__NAME);

		gamePlayerStatsEClass = createEClass(GAME_PLAYER_STATS);
		createEReference(gamePlayerStatsEClass, GAME_PLAYER_STATS__PLAYER);
		createEAttribute(gamePlayerStatsEClass, GAME_PLAYER_STATS__KILLS);
		createEAttribute(gamePlayerStatsEClass, GAME_PLAYER_STATS__DEATHS);
		createEAttribute(gamePlayerStatsEClass, GAME_PLAYER_STATS__ASSIST);
		createEAttribute(gamePlayerStatsEClass, GAME_PLAYER_STATS__GOLDS);
		createEAttribute(gamePlayerStatsEClass, GAME_PLAYER_STATS__WARDS);
		createEAttribute(gamePlayerStatsEClass, GAME_PLAYER_STATS__WARDS_KILLED);
		createEAttribute(gamePlayerStatsEClass, GAME_PLAYER_STATS__VISION_WARDS);
		createEAttribute(gamePlayerStatsEClass, GAME_PLAYER_STATS__MINION_KILLS);
		createEAttribute(gamePlayerStatsEClass, GAME_PLAYER_STATS__MONSTER_KILLS);
		createEReference(gamePlayerStatsEClass, GAME_PLAYER_STATS__CHAMPION);
		createEAttribute(gamePlayerStatsEClass, GAME_PLAYER_STATS__NAME);

		seasonEClass = createEClass(SEASON);
		createEAttribute(seasonEClass, SEASON__SPLIT_NAME);
		createEReference(seasonEClass, SEASON__MATCHES);
		createEReference(seasonEClass, SEASON__LEAGUE);
		createEAttribute(seasonEClass, SEASON__SPLIT_TYPE);

		gameStatsEClass = createEClass(GAME_STATS);
		createEReference(gameStatsEClass, GAME_STATS__GAME);
		createEAttribute(gameStatsEClass, GAME_STATS__DURATION);
		createEAttribute(gameStatsEClass, GAME_STATS__WINNER);
		createEAttribute(gameStatsEClass, GAME_STATS__TOTAL_KILLS);
		createEAttribute(gameStatsEClass, GAME_STATS__TOTAL_DEATHS);
		createEAttribute(gameStatsEClass, GAME_STATS__TOTAL_ASSIST);
		createEAttribute(gameStatsEClass, GAME_STATS__TOTAL_GOLDS);
		createEAttribute(gameStatsEClass, GAME_STATS__TOTAL_WARDS);
		createEAttribute(gameStatsEClass, GAME_STATS__TOTAL_WARDS_KILLED);
		createEAttribute(gameStatsEClass, GAME_STATS__TOTAL_VISION_WARDS);
		createEAttribute(gameStatsEClass, GAME_STATS__TOTAL_MINION_KILLS);
		createEAttribute(gameStatsEClass, GAME_STATS__TOTAL_MONSTER_KILLS);
		createEAttribute(gameStatsEClass, GAME_STATS__TEAM_BARON_KILLS);
		createEAttribute(gameStatsEClass, GAME_STATS__NAME);

		championsStatsEClass = createEClass(CHAMPIONS_STATS);
		createEAttribute(championsStatsEClass, CHAMPIONS_STATS__GAMES_PLAYED);
		createEAttribute(championsStatsEClass, CHAMPIONS_STATS__TOTAL_KILLS);
		createEAttribute(championsStatsEClass, CHAMPIONS_STATS__TOTAL_DEATHS);
		createEAttribute(championsStatsEClass, CHAMPIONS_STATS__TOTAL_ASSIST);
		createEAttribute(championsStatsEClass, CHAMPIONS_STATS__KILL_DEATH_ASSIST_RATIO);
		createEReference(championsStatsEClass, CHAMPIONS_STATS__CHAMPION);
		createEAttribute(championsStatsEClass, CHAMPIONS_STATS__BANS);
		createEAttribute(championsStatsEClass, CHAMPIONS_STATS__WINS);
		createEAttribute(championsStatsEClass, CHAMPIONS_STATS__WIN_LOSE_RATIO);

		teamStatsEClass = createEClass(TEAM_STATS);
		createEReference(teamStatsEClass, TEAM_STATS__TEAM);
		createEAttribute(teamStatsEClass, TEAM_STATS__GAMES_PLAYED);
		createEAttribute(teamStatsEClass, TEAM_STATS__KILLS);
		createEAttribute(teamStatsEClass, TEAM_STATS__DEATHS);
		createEAttribute(teamStatsEClass, TEAM_STATS__ASSISTS);
		createEAttribute(teamStatsEClass, TEAM_STATS__KILL_DEATH_ASSIST_RATIO);
		createEAttribute(teamStatsEClass, TEAM_STATS__WIN_LOSE_RATIO);
		createEAttribute(teamStatsEClass, TEAM_STATS__GAME_WINS);
		createEAttribute(teamStatsEClass, TEAM_STATS__MATCH_WINS);
		createEAttribute(teamStatsEClass, TEAM_STATS__TOURNAMENT_WINS);
		createEAttribute(teamStatsEClass, TEAM_STATS__TOURNAMENT_SECOND_PLACES);
		createEAttribute(teamStatsEClass, TEAM_STATS__TOURNAMENT_THRID_PLACES);
		createEReference(teamStatsEClass, TEAM_STATS__PLAYER_WITH_MOST_KILLS);
		createEReference(teamStatsEClass, TEAM_STATS__PLAYER_WITH_MOST_DEATHS);
		createEReference(teamStatsEClass, TEAM_STATS__PLAYER_WITH_MOST_ASSISTS);
		createEReference(teamStatsEClass, TEAM_STATS__PLAYER_WITH_HIGHEST_KDA);

		leagueStatsEClass = createEClass(LEAGUE_STATS);
		createEReference(leagueStatsEClass, LEAGUE_STATS__LEAGUE);
		createEAttribute(leagueStatsEClass, LEAGUE_STATS__KILLS);
		createEAttribute(leagueStatsEClass, LEAGUE_STATS__DEATHS);
		createEAttribute(leagueStatsEClass, LEAGUE_STATS__ASSISTS);
		createEReference(leagueStatsEClass, LEAGUE_STATS__PLAYER_WITH_MOST_KILLS);
		createEReference(leagueStatsEClass, LEAGUE_STATS__PLAYER_WITH_MOST_DEATHS);
		createEReference(leagueStatsEClass, LEAGUE_STATS__PLAYER_WITH_MOST_ASSISTS);
		createEReference(leagueStatsEClass, LEAGUE_STATS__PLAYER_WITH_HIGHEST_KDA);
		createEReference(leagueStatsEClass, LEAGUE_STATS__CHAMPION_WITH_MOST_KILLS);
		createEReference(leagueStatsEClass, LEAGUE_STATS__CHAMPION_WITH_MOST_DEATHS);
		createEReference(leagueStatsEClass, LEAGUE_STATS__CHAMPION_WITH_MOST_ASSISTS);
		createEReference(leagueStatsEClass, LEAGUE_STATS__CHAMPION_WITH_HIGHEST_KDA);

		// Create enums
		bestOfEEnum = createEEnum(BEST_OF);
		positionEEnum = createEEnum(POSITION);
		sideEEnum = createEEnum(SIDE);
		splitTypeEEnum = createEEnum(SPLIT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(leagueEClass, League.class, "League", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLeague_Name(), ecorePackage.getEString(), "name", null, 0, 1, League.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLeague_Teams(), this.getTeam(), this.getTeam_League(), "teams", null, 0, -1, League.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLeague_Seasons(), this.getSeason(), this.getSeason_League(), "seasons", null, 0, -1, League.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLeague_Champions(), this.getChampion(), null, "champions", null, 0, -1, League.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLeague_LeagueStats(), this.getLeagueStats(), null, "leagueStats", null, 0, 1, League.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(championEClass, Champion.class, "Champion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChampion_Name(), ecorePackage.getEString(), "name", null, 0, 1, Champion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChampion_ChampionStat(), this.getChampionsStats(), this.getChampionsStats_Champion(), "championStat", null, 0, 1, Champion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(teamEClass, Team.class, "Team", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTeam_Name(), ecorePackage.getEString(), "name", null, 0, 1, Team.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeam_League(), this.getLeague(), this.getLeague_Teams(), "league", null, 1, 1, Team.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeam_Player(), this.getPlayer(), this.getPlayer_Team(), "player", null, 5, -1, Team.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeam_WinLossRatio(), ecorePackage.getEFloat(), "winLossRatio", null, 0, 1, Team.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTeam_TeamStats(), this.getTeamStats(), this.getTeamStats_Team(), "teamStats", null, 0, 1, Team.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(playerEClass, Player.class, "Player", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlayer_Name(), ecorePackage.getEString(), "name", null, 1, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayer_Position(), this.getPosition(), "position", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlayer_ChampionPool(), this.getChampion(), null, "championPool", null, 0, -1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlayer_PlayerStats(), this.getPlayerStats(), this.getPlayerStats_Player(), "playerStats", null, 1, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlayer_Team(), this.getTeam(), this.getTeam_Player(), "team", null, 1, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(playerStatsEClass, PlayerStats.class, "PlayerStats", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlayerStats_GamesPlayed(), ecorePackage.getEInt(), "gamesPlayed", null, 0, 1, PlayerStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayerStats_CareerKills(), ecorePackage.getEInt(), "careerKills", null, 0, 1, PlayerStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayerStats_CareerDeaths(), ecorePackage.getEInt(), "careerDeaths", null, 0, 1, PlayerStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayerStats_CareerAssist(), ecorePackage.getEInt(), "careerAssist", null, 0, 1, PlayerStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayerStats_KillDeathAssistRatio(), ecorePackage.getEFloat(), "killDeathAssistRatio", null, 0, 1, PlayerStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayerStats_WinLoseRatio(), ecorePackage.getEFloat(), "winLoseRatio", null, 0, 1, PlayerStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlayerStats_Player(), this.getPlayer(), this.getPlayer_PlayerStats(), "player", null, 1, 1, PlayerStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayerStats_CareerGameWins(), ecorePackage.getEInt(), "careerGameWins", null, 0, 1, PlayerStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayerStats_CareerMatchWins(), ecorePackage.getEInt(), "careerMatchWins", null, 0, 1, PlayerStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matchEClass, Match.class, "Match", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMatch_Games(), this.getGame(), null, "games", null, 0, -1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatch_DisplayName(), ecorePackage.getEString(), "DisplayName", null, 0, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatch_MatchID(), ecorePackage.getEString(), "matchID", null, 0, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatch_BestOF(), this.getBestOf(), "bestOF", null, 0, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatch_Score(), ecorePackage.getEString(), "score", null, 0, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatch_Teams(), this.getTeam(), null, "teams", null, 0, 2, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatch_Week(), ecorePackage.getEString(), "week", null, 0, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatch_Winner(), this.getTeam(), null, "winner", null, 1, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameEClass, Game.class, "Game", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGame_GameID(), ecorePackage.getEString(), "gameID", null, 1, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_GameStats(), this.getGameStats(), this.getGameStats_Game(), "gameStats", null, 1, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_RedTeam(), this.getTeam(), null, "redTeam", null, 1, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_BlueTeam(), this.getTeam(), null, "blueTeam", null, 1, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_GameTeamStat(), this.getGameTeamStats(), null, "gameTeamStat", null, 2, 2, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_GamePlayerStats(), this.getGamePlayerStats(), null, "gamePlayerStats", null, 0, -1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGame_WinningSide(), this.getSide(), "winningSide", null, 0, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_WinningTeam(), this.getTeam(), null, "winningTeam", null, 1, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameTeamStatsEClass, GameTeamStats.class, "GameTeamStats", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGameTeamStats_Team(), this.getTeam(), null, "team", null, 1, 1, GameTeamStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameTeamStats_TotalKills(), ecorePackage.getEInt(), "totalKills", null, 0, 1, GameTeamStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameTeamStats_TotalDeaths(), ecorePackage.getEInt(), "totalDeaths", null, 0, 1, GameTeamStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameTeamStats_TotalAssist(), ecorePackage.getEInt(), "totalAssist", null, 0, 1, GameTeamStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameTeamStats_TotalGolds(), ecorePackage.getEInt(), "totalGolds", null, 0, 1, GameTeamStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameTeamStats_TotalWards(), ecorePackage.getEInt(), "totalWards", null, 0, 1, GameTeamStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameTeamStats_TotalWardsKilled(), ecorePackage.getEInt(), "totalWardsKilled", null, 0, 1, GameTeamStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameTeamStats_TotalVisionWards(), ecorePackage.getEInt(), "totalVisionWards", null, 0, 1, GameTeamStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameTeamStats_TotalMinionKills(), ecorePackage.getEInt(), "totalMinionKills", null, 0, 1, GameTeamStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameTeamStats_TotalMonsterKills(), ecorePackage.getEInt(), "totalMonsterKills", null, 0, 1, GameTeamStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameTeamStats_TeamBaronKills(), ecorePackage.getEInt(), "teamBaronKills", null, 0, 1, GameTeamStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameTeamStats_TeamSide(), this.getSide(), "teamSide", null, 0, 1, GameTeamStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameTeamStats_Name(), ecorePackage.getEString(), "name", null, 0, 1, GameTeamStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gamePlayerStatsEClass, GamePlayerStats.class, "GamePlayerStats", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGamePlayerStats_Player(), this.getPlayer(), null, "player", null, 1, 1, GamePlayerStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGamePlayerStats_Kills(), ecorePackage.getEInt(), "kills", null, 0, 1, GamePlayerStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGamePlayerStats_Deaths(), ecorePackage.getEInt(), "deaths", null, 0, 1, GamePlayerStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGamePlayerStats_Assist(), ecorePackage.getEInt(), "assist", null, 0, 1, GamePlayerStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGamePlayerStats_Golds(), ecorePackage.getEInt(), "golds", null, 0, 1, GamePlayerStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGamePlayerStats_Wards(), ecorePackage.getEInt(), "wards", null, 0, 1, GamePlayerStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGamePlayerStats_WardsKilled(), ecorePackage.getEInt(), "wardsKilled", null, 0, 1, GamePlayerStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGamePlayerStats_VisionWards(), ecorePackage.getEInt(), "visionWards", null, 0, 1, GamePlayerStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGamePlayerStats_MinionKills(), ecorePackage.getEInt(), "minionKills", null, 0, 1, GamePlayerStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGamePlayerStats_MonsterKills(), ecorePackage.getEInt(), "monsterKills", null, 0, 1, GamePlayerStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGamePlayerStats_Champion(), this.getChampion(), null, "champion", null, 0, 1, GamePlayerStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGamePlayerStats_Name(), ecorePackage.getEString(), "name", null, 0, 1, GamePlayerStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seasonEClass, Season.class, "Season", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSeason_SplitName(), ecorePackage.getEString(), "SplitName", null, 0, 1, Season.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSeason_Matches(), this.getMatch(), null, "matches", null, 0, -1, Season.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSeason_League(), this.getLeague(), this.getLeague_Seasons(), "league", null, 1, 1, Season.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeason_SplitType(), this.getSplitType(), "splitType", null, 0, 1, Season.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameStatsEClass, GameStats.class, "GameStats", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGameStats_Game(), this.getGame(), this.getGame_GameStats(), "game", null, 1, 1, GameStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameStats_Duration(), ecorePackage.getEFloat(), "duration", null, 0, 1, GameStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameStats_Winner(), this.getSide(), "winner", null, 0, 1, GameStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameStats_TotalKills(), ecorePackage.getEInt(), "totalKills", null, 0, 1, GameStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameStats_TotalDeaths(), ecorePackage.getEInt(), "totalDeaths", null, 0, 1, GameStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameStats_TotalAssist(), ecorePackage.getEInt(), "totalAssist", null, 0, 1, GameStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameStats_TotalGolds(), ecorePackage.getEInt(), "totalGolds", null, 0, 1, GameStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameStats_TotalWards(), ecorePackage.getEInt(), "totalWards", null, 0, 1, GameStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameStats_TotalWardsKilled(), ecorePackage.getEInt(), "totalWardsKilled", null, 0, 1, GameStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameStats_TotalVisionWards(), ecorePackage.getEInt(), "totalVisionWards", null, 0, 1, GameStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameStats_TotalMinionKills(), ecorePackage.getEInt(), "totalMinionKills", null, 0, 1, GameStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameStats_TotalMonsterKills(), ecorePackage.getEInt(), "totalMonsterKills", null, 0, 1, GameStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameStats_TeamBaronKills(), ecorePackage.getEInt(), "teamBaronKills", null, 0, 1, GameStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameStats_Name(), ecorePackage.getEString(), "name", null, 0, 1, GameStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(championsStatsEClass, ChampionsStats.class, "ChampionsStats", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChampionsStats_GamesPlayed(), ecorePackage.getEInt(), "gamesPlayed", null, 0, 1, ChampionsStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChampionsStats_TotalKills(), ecorePackage.getEInt(), "totalKills", null, 0, 1, ChampionsStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChampionsStats_TotalDeaths(), ecorePackage.getEInt(), "totalDeaths", null, 0, 1, ChampionsStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChampionsStats_TotalAssist(), ecorePackage.getEInt(), "totalAssist", null, 0, 1, ChampionsStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChampionsStats_KillDeathAssistRatio(), ecorePackage.getEFloat(), "killDeathAssistRatio", null, 0, 1, ChampionsStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getChampionsStats_Champion(), this.getChampion(), this.getChampion_ChampionStat(), "champion", null, 0, 1, ChampionsStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChampionsStats_Bans(), ecorePackage.getEInt(), "bans", null, 0, 1, ChampionsStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChampionsStats_Wins(), ecorePackage.getEInt(), "wins", null, 0, 1, ChampionsStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChampionsStats_WinLoseRatio(), ecorePackage.getEFloat(), "winLoseRatio", null, 0, 1, ChampionsStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(teamStatsEClass, TeamStats.class, "TeamStats", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTeamStats_Team(), this.getTeam(), this.getTeam_TeamStats(), "team", null, 0, 1, TeamStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeamStats_GamesPlayed(), ecorePackage.getEInt(), "gamesPlayed", null, 0, 1, TeamStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeamStats_Kills(), ecorePackage.getEInt(), "kills", null, 0, 1, TeamStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeamStats_Deaths(), ecorePackage.getEInt(), "deaths", null, 0, 1, TeamStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeamStats_Assists(), ecorePackage.getEInt(), "assists", null, 0, 1, TeamStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeamStats_KillDeathAssistRatio(), ecorePackage.getEFloat(), "killDeathAssistRatio", null, 0, 1, TeamStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeamStats_WinLoseRatio(), ecorePackage.getEFloat(), "winLoseRatio", null, 0, 1, TeamStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeamStats_GameWins(), ecorePackage.getEInt(), "gameWins", null, 0, 1, TeamStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeamStats_MatchWins(), ecorePackage.getEInt(), "matchWins", null, 0, 1, TeamStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeamStats_TournamentWins(), ecorePackage.getEInt(), "tournamentWins", null, 0, 1, TeamStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeamStats_TournamentSecondPlaces(), ecorePackage.getEInt(), "tournamentSecondPlaces", null, 0, 1, TeamStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeamStats_TournamentThridPlaces(), ecorePackage.getEInt(), "tournamentThridPlaces", null, 0, 1, TeamStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeamStats_PlayerWithMostKills(), this.getPlayer(), null, "playerWithMostKills", null, 0, 1, TeamStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeamStats_PlayerWithMostDeaths(), this.getPlayer(), null, "playerWithMostDeaths", null, 0, 1, TeamStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeamStats_PlayerWithMostAssists(), this.getPlayer(), null, "playerWithMostAssists", null, 0, 1, TeamStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeamStats_PlayerWithHighestKda(), this.getPlayer(), null, "playerWithHighestKda", null, 0, 1, TeamStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(leagueStatsEClass, LeagueStats.class, "LeagueStats", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLeagueStats_League(), this.getLeague(), null, "league", null, 0, 1, LeagueStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLeagueStats_Kills(), ecorePackage.getEInt(), "kills", null, 0, 1, LeagueStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLeagueStats_Deaths(), ecorePackage.getEInt(), "deaths", null, 0, 1, LeagueStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLeagueStats_Assists(), ecorePackage.getEInt(), "assists", null, 0, 1, LeagueStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLeagueStats_PlayerWithMostKills(), this.getPlayer(), null, "playerWithMostKills", null, 0, 1, LeagueStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLeagueStats_PlayerWithMostDeaths(), this.getPlayer(), null, "playerWithMostDeaths", null, 0, 1, LeagueStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLeagueStats_PlayerWithMostAssists(), this.getPlayer(), null, "playerWithMostAssists", null, 0, 1, LeagueStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLeagueStats_PlayerWithHighestKda(), this.getPlayer(), null, "playerWithHighestKda", null, 0, 1, LeagueStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLeagueStats_ChampionWithMostKills(), this.getChampion(), null, "championWithMostKills", null, 0, 1, LeagueStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLeagueStats_ChampionWithMostDeaths(), this.getChampion(), null, "championWithMostDeaths", null, 0, 1, LeagueStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLeagueStats_ChampionWithMostAssists(), this.getChampion(), null, "championWithMostAssists", null, 0, 1, LeagueStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLeagueStats_ChampionWithHighestKda(), this.getChampion(), null, "championWithHighestKda", null, 0, 1, LeagueStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(bestOfEEnum, BestOf.class, "BestOf");
		addEEnumLiteral(bestOfEEnum, BestOf.QF);
		addEEnumLiteral(bestOfEEnum, BestOf.F);
		addEEnumLiteral(bestOfEEnum, BestOf.SF);
		addEEnumLiteral(bestOfEEnum, BestOf.REGULAR);
		addEEnumLiteral(bestOfEEnum, BestOf.R1);
		addEEnumLiteral(bestOfEEnum, BestOf.R2);
		addEEnumLiteral(bestOfEEnum, BestOf.R3);
		addEEnumLiteral(bestOfEEnum, BestOf._3P);

		initEEnum(positionEEnum, Position.class, "Position");
		addEEnumLiteral(positionEEnum, Position.MIDDLE);
		addEEnumLiteral(positionEEnum, Position.TOP);
		addEEnumLiteral(positionEEnum, Position.JUNGLE);
		addEEnumLiteral(positionEEnum, Position.ADC);
		addEEnumLiteral(positionEEnum, Position.SUPPORT);

		initEEnum(sideEEnum, Side.class, "Side");
		addEEnumLiteral(sideEEnum, Side.RED);
		addEEnumLiteral(sideEEnum, Side.BLUE);

		initEEnum(splitTypeEEnum, SplitType.class, "SplitType");
		addEEnumLiteral(splitTypeEEnum, SplitType.REGULAR);
		addEEnumLiteral(splitTypeEEnum, SplitType.PLAYOFF);
		addEEnumLiteral(splitTypeEEnum, SplitType.REGIONALS);

		// Create resource
		createResource(eNS_URI);
	}

} //LeagueOfLegendsPackageImpl
