/**
 */
package leagueOfLegends.util;

import java.util.Map;

import leagueOfLegends.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see leagueOfLegends.LeagueOfLegendsPackage
 * @generated
 */
public class LeagueOfLegendsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final LeagueOfLegendsValidator INSTANCE = new LeagueOfLegendsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "leagueOfLegends";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeagueOfLegendsValidator() {
		super();
	}
	
	
	/**
	 * @generated not
	 * Constants related to validation of entities.
	 */
	
	private static int VALID_NUMBER_OF_TEAMS = 2;
	private static int VALID_NUMBER_OF_SEASONS = 3;
	private static int VALID_NUMBER_OF_CHAMPIONS = 20;
	
	private static int VALID_NUMBER_OF_TEAM_MEMBERS = 5;

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return LeagueOfLegendsPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case LeagueOfLegendsPackage.LEAGUE:
				return validateLeague((League)value, diagnostics, context);
			case LeagueOfLegendsPackage.CHAMPION:
				return validateChampion((Champion)value, diagnostics, context);
			case LeagueOfLegendsPackage.TEAM:
				return validateTeam((Team)value, diagnostics, context);
			case LeagueOfLegendsPackage.PLAYER:
				return validatePlayer((Player)value, diagnostics, context);
			case LeagueOfLegendsPackage.PLAYER_STATS:
				return validatePlayerStats((PlayerStats)value, diagnostics, context);
			case LeagueOfLegendsPackage.MATCH:
				return validateMatch((Match)value, diagnostics, context);
			case LeagueOfLegendsPackage.GAME:
				return validateGame((Game)value, diagnostics, context);
			case LeagueOfLegendsPackage.GAME_TEAM_STATS:
				return validateGameTeamStats((GameTeamStats)value, diagnostics, context);
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS:
				return validateGamePlayerStats((GamePlayerStats)value, diagnostics, context);
			case LeagueOfLegendsPackage.SEASON:
				return validateSeason((Season)value, diagnostics, context);
			case LeagueOfLegendsPackage.GAME_STATS:
				return validateGameStats((GameStats)value, diagnostics, context);
			case LeagueOfLegendsPackage.CHAMPIONS_STATS:
				return validateChampionsStats((ChampionsStats)value, diagnostics, context);
			case LeagueOfLegendsPackage.TEAM_STATS:
				return validateTeamStats((TeamStats)value, diagnostics, context);
			case LeagueOfLegendsPackage.LEAGUE_STATS:
				return validateLeagueStats((LeagueStats)value, diagnostics, context);
			case LeagueOfLegendsPackage.BEST_OF:
				return validateBestOf((BestOf)value, diagnostics, context);
			case LeagueOfLegendsPackage.POSITION:
				return validatePosition((Position)value, diagnostics, context);
			case LeagueOfLegendsPackage.SIDE:
				return validateSide((Side)value, diagnostics, context);
			case LeagueOfLegendsPackage.SPLIT_TYPE:
				return validateSplitType((SplitType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeague(League league, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(league, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(league, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(league, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(league, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(league, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(league, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(league, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(league, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(league, diagnostics, context);
		if (result || diagnostics != null) result &= validateLeague_nameNotNull(league, diagnostics, context);
		if (result || diagnostics != null) result &= validateLeague_validNumberOfSeasons(league, diagnostics, context);
		if (result || diagnostics != null) result &= validateLeague_validNumberOfTeams(league, diagnostics, context);
		if (result || diagnostics != null) result &= validateLeague_validNumberOfChampions(league, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nameNotNull constraint of '<em>League</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateLeague_nameNotNull(League league, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (league.getName() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "nameNotNull", getObjectLabel(league, context) },
						 new Object[] { league },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the validNumberOfSeasons constraint of '<em>League</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateLeague_validNumberOfSeasons(League league, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (league.getSeasons().size() < VALID_NUMBER_OF_SEASONS) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validNumberOfSeasons", getObjectLabel(league, context) },
						 new Object[] { league },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the validNumberOfTeams constraint of '<em>League</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateLeague_validNumberOfTeams(League league, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (league.getTeams().size() < VALID_NUMBER_OF_TEAMS) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validNumberOfTeams", getObjectLabel(league, context) },
						 new Object[] { league },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the validNumberOfChampions constraint of '<em>League</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateLeague_validNumberOfChampions(League league, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (league.getChampions().size() < VALID_NUMBER_OF_CHAMPIONS) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validNumberOfChampions", getObjectLabel(league, context) },
						 new Object[] { league },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChampion(Champion champion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(champion, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(champion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(champion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(champion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(champion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(champion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(champion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(champion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(champion, diagnostics, context);
		if (result || diagnostics != null) result &= validateChampion_nameNotNull(champion, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nameNotNull constraint of '<em>Champion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateChampion_nameNotNull(Champion champion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (champion.getName() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "nameNotNull", getObjectLabel(champion, context) },
						 new Object[] { champion },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTeam(Team team, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(team, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(team, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(team, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(team, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(team, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(team, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(team, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(team, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(team, diagnostics, context);
		if (result || diagnostics != null) result &= validateTeam_validNumberOfTeamMembers(team, diagnostics, context);
		if (result || diagnostics != null) result &= validateTeam_nameNotNull(team, diagnostics, context);
		if (result || diagnostics != null) result &= validateTeam_leagueNotNull(team, diagnostics, context);
		if (result || diagnostics != null) result &= validateTeam_filledAllPositions(team, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validNumberOfTeamMembers constraint of '<em>Team</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTeam_validNumberOfTeamMembers(Team team, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (team.getPlayer().size() < VALID_NUMBER_OF_TEAM_MEMBERS) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validNumberOfTeamMembers", getObjectLabel(team, context) },
						 new Object[] { team },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the nameNotNull constraint of '<em>Team</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTeam_nameNotNull(Team team, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (team.getName() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "nameNotNull", getObjectLabel(team, context) },
						 new Object[] { team },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the leagueNotNull constraint of '<em>Team</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTeam_leagueNotNull(Team team, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (team.getLeague() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "leagueNotNull", getObjectLabel(team, context) },
						 new Object[] { team },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the filledAllPositions constraint of '<em>Team</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTeam_filledAllPositions(Team team, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (areAllPositionsFilled(team)) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "filledAllPositions", getObjectLabel(team, context) },
						 new Object[] { team },
						 context));
			}
			return false;
		}
		return true;
	}
	
	private boolean areAllPositionsFilled(Team team) {
		
		for(Position position : Position.VALUES) {
			if(!team.getPlayer().stream().anyMatch(player -> player.getPosition() == position)){
				return true;
			}
		}
		
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlayer(Player player, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(player, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(player, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(player, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(player, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(player, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(player, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(player, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(player, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(player, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlayer_nameNotNull(player, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlayer_teamNotNull(player, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlayer_validPosition(player, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlayer_tester(player, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nameNotNull constraint of '<em>Player</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePlayer_nameNotNull(Player player, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (player.getName() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "nameNotNull", getObjectLabel(player, context) },
						 new Object[] { player },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the teamNotNull constraint of '<em>Player</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePlayer_teamNotNull(Player player, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (player.getTeam() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "teamNotNull", getObjectLabel(player, context) },
						 new Object[] { player },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the validPosition constraint of '<em>Player</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePlayer_validPosition(Player player, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (!Position.VALUES.contains(player.getPosition())) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validPosition", getObjectLabel(player, context) },
						 new Object[] { player },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the tester constraint of '<em>Player</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePlayer_tester(Player player, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (true) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "tester", getObjectLabel(player, context) },
						 new Object[] { player },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlayerStats(PlayerStats playerStats, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(playerStats, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMatch(Match match, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(match, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(match, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(match, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(match, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(match, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(match, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(match, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(match, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(match, diagnostics, context);
		if (result || diagnostics != null) result &= validateMatch_seasonNotNull(match, diagnostics, context);
		if (result || diagnostics != null) result &= validateMatch_validNumberOfTeams(match, diagnostics, context);
		if (result || diagnostics != null) result &= validateMatch_winnerNotNull(match, diagnostics, context);
		if (result || diagnostics != null) result &= validateMatch_validNumberOfGames(match, diagnostics, context);
		return result;
	}

	/**
	 * Validates the seasonNotNull constraint of '<em>Match</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateMatch_seasonNotNull(Match match, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (match.getSeason() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "seasonNotNull", getObjectLabel(match, context) },
						 new Object[] { match },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the validNumberOfTeams constraint of '<em>Match</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateMatch_validNumberOfTeams(Match match, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (match.getTeams().size() < VALID_NUMBER_OF_TEAMS) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validNumberOfTeams", getObjectLabel(match, context) },
						 new Object[] { match },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the winnerNotNull constraint of '<em>Match</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateMatch_winnerNotNull(Match match, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (match.getWinner() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "winnerNotNull", getObjectLabel(match, context) },
						 new Object[] { match },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the validNumberOfGames constraint of '<em>Match</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated Not
	 */
	public boolean validateMatch_validNumberOfGames(Match match, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		
		if (!BestOf.VALUES.stream().map(bestOf -> bestOf.getValue()).anyMatch(bestOf -> bestOf == match.getGames().size())) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validNumberOfGames", getObjectLabel(match, context) },
						 new Object[] { match },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGame(Game game, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(game, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(game, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(game, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(game, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(game, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(game, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(game, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(game, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(game, diagnostics, context);
		if (result || diagnostics != null) result &= validateGame_blueTeamNotNull(game, diagnostics, context);
		if (result || diagnostics != null) result &= validateGame_redTeamNotNull(game, diagnostics, context);
		if (result || diagnostics != null) result &= validateGame_validGameID(game, diagnostics, context);
		if (result || diagnostics != null) result &= validateGame_validWinningSide(game, diagnostics, context);
		if (result || diagnostics != null) result &= validateGame_winnerTeamNotNull(game, diagnostics, context);
		return result;
	}

	/**
	 * Validates the blueTeamNotNull constraint of '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateGame_blueTeamNotNull(Game game, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (game.getBlueTeam() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "blueTeamNotNull", getObjectLabel(game, context) },
						 new Object[] { game },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the redTeamNotNull constraint of '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateGame_redTeamNotNull(Game game, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (game.getRedTeam() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "redTeamNotNull", getObjectLabel(game, context) },
						 new Object[] { game },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the validGameID constraint of '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateGame_validGameID(Game game, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (isGameIdValid(game)) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validGameID", getObjectLabel(game, context) },
						 new Object[] { game },
						 context));
			}
			return false;
		}
		return true;
	}
	
	private boolean isGameIdValid(Game game) {
		
		if(game.getGameID().length()!= 10 && game.getGameID() instanceof String) {
			return true;
		}
		return false;
	}

	/**
	 * Validates the validWinningSide constraint of '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateGame_validWinningSide(Game game, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (!Side.VALUES.contains(game.getWinningSide())) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validWinningSide", getObjectLabel(game, context) },
						 new Object[] { game },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the winnerTeamNotNull constraint of '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateGame_winnerTeamNotNull(Game game, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (game.getWinningTeam() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "winnerTeamNotNull", getObjectLabel(game, context) },
						 new Object[] { game },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGameTeamStats(GameTeamStats gameTeamStats, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gameTeamStats, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGamePlayerStats(GamePlayerStats gamePlayerStats, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gamePlayerStats, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeason(Season season, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(season, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(season, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(season, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(season, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(season, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(season, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(season, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(season, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(season, diagnostics, context);
		if (result || diagnostics != null) result &= validateSeason_validSplitName(season, diagnostics, context);
		if (result || diagnostics != null) result &= validateSeason_leagueNotNull(season, diagnostics, context);
		if (result || diagnostics != null) result &= validateSeason_atleastOneMatchPerSeason(season, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validSplitName constraint of '<em>Season</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSeason_validSplitName(Season season, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (isValidSplitName(season)) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validSplitName", getObjectLabel(season, context) },
						 new Object[] { season },
						 context));
			}
			return false;
		}
		return true;
	}
	
	private boolean isValidSplitName(Season season) {
		return !season.getSplitName().matches("^[0-9]{4}-[0-9]{1,}[a-z]{0,}$");
	}

	/**
	 * Validates the leagueNotNull constraint of '<em>Season</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSeason_leagueNotNull(Season season, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (season.getLeague()==null) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "leagueNotNull", getObjectLabel(season, context) },
						 new Object[] { season },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the atleastOneMatchPerSeason constraint of '<em>Season</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSeason_atleastOneMatchPerSeason(Season season, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (season.getMatches().size() < 1) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "atleastOneMatchPerSeason", getObjectLabel(season, context) },
						 new Object[] { season },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGameStats(GameStats gameStats, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gameStats, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChampionsStats(ChampionsStats championsStats, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(championsStats, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTeamStats(TeamStats teamStats, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(teamStats, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeagueStats(LeagueStats leagueStats, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(leagueStats, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBestOf(BestOf bestOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePosition(Position position, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSide(Side side, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSplitType(SplitType splitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //LeagueOfLegendsValidator
