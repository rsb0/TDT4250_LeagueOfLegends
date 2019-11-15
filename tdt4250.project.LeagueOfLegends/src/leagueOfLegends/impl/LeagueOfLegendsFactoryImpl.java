/**
 */
package leagueOfLegends.impl;

import leagueOfLegends.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LeagueOfLegendsFactoryImpl extends EFactoryImpl implements LeagueOfLegendsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LeagueOfLegendsFactory init() {
		try {
			LeagueOfLegendsFactory theLeagueOfLegendsFactory = (LeagueOfLegendsFactory)EPackage.Registry.INSTANCE.getEFactory(LeagueOfLegendsPackage.eNS_URI);
			if (theLeagueOfLegendsFactory != null) {
				return theLeagueOfLegendsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LeagueOfLegendsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeagueOfLegendsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LeagueOfLegendsPackage.LEAGUE: return createLeague();
			case LeagueOfLegendsPackage.CHAMPION: return createChampion();
			case LeagueOfLegendsPackage.TEAM: return createTeam();
			case LeagueOfLegendsPackage.PLAYER: return createPlayer();
			case LeagueOfLegendsPackage.PLAYER_STATS: return createPlayerStats();
			case LeagueOfLegendsPackage.MATCH: return createMatch();
			case LeagueOfLegendsPackage.GAME: return createGame();
			case LeagueOfLegendsPackage.GAME_TEAM_STATS: return createGameTeamStats();
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS: return createGamePlayerStats();
			case LeagueOfLegendsPackage.SEASON: return createSeason();
			case LeagueOfLegendsPackage.GAME_STATS: return createGameStats();
			case LeagueOfLegendsPackage.CHAMPIONS_STATS: return createChampionsStats();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case LeagueOfLegendsPackage.BEST_OF:
				return createBestOfFromString(eDataType, initialValue);
			case LeagueOfLegendsPackage.POSITION:
				return createPositionFromString(eDataType, initialValue);
			case LeagueOfLegendsPackage.SIDE:
				return createSideFromString(eDataType, initialValue);
			case LeagueOfLegendsPackage.SPLIT_TYPE:
				return createSplitTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case LeagueOfLegendsPackage.BEST_OF:
				return convertBestOfToString(eDataType, instanceValue);
			case LeagueOfLegendsPackage.POSITION:
				return convertPositionToString(eDataType, instanceValue);
			case LeagueOfLegendsPackage.SIDE:
				return convertSideToString(eDataType, instanceValue);
			case LeagueOfLegendsPackage.SPLIT_TYPE:
				return convertSplitTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public League createLeague() {
		LeagueImpl league = new LeagueImpl();
		return league;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Team createTeam() {
		TeamImpl team = new TeamImpl();
		return team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Player createPlayer() {
		PlayerImpl player = new PlayerImpl();
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlayerStats createPlayerStats() {
		PlayerStatsImpl playerStats = new PlayerStatsImpl();
		return playerStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Champion createChampion() {
		ChampionImpl champion = new ChampionImpl();
		return champion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Match createMatch() {
		MatchImpl match = new MatchImpl();
		return match;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Game createGame() {
		GameImpl game = new GameImpl();
		return game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GameTeamStats createGameTeamStats() {
		GameTeamStatsImpl gameTeamStats = new GameTeamStatsImpl();
		return gameTeamStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GamePlayerStats createGamePlayerStats() {
		GamePlayerStatsImpl gamePlayerStats = new GamePlayerStatsImpl();
		return gamePlayerStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Season createSeason() {
		SeasonImpl season = new SeasonImpl();
		return season;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GameStats createGameStats() {
		GameStatsImpl gameStats = new GameStatsImpl();
		return gameStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChampionsStats createChampionsStats() {
		ChampionsStatsImpl championsStats = new ChampionsStatsImpl();
		return championsStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BestOf createBestOfFromString(EDataType eDataType, String initialValue) {
		BestOf result = BestOf.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBestOfToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position createPositionFromString(EDataType eDataType, String initialValue) {
		Position result = Position.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Side createSideFromString(EDataType eDataType, String initialValue) {
		Side result = Side.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSideToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplitType createSplitTypeFromString(EDataType eDataType, String initialValue) {
		SplitType result = SplitType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSplitTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LeagueOfLegendsPackage getLeagueOfLegendsPackage() {
		return (LeagueOfLegendsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LeagueOfLegendsPackage getPackage() {
		return LeagueOfLegendsPackage.eINSTANCE;
	}

} //LeagueOfLegendsFactoryImpl
