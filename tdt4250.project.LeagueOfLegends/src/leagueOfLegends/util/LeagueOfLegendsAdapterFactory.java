/**
 */
package leagueOfLegends.util;

import leagueOfLegends.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see leagueOfLegends.LeagueOfLegendsPackage
 * @generated
 */
public class LeagueOfLegendsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LeagueOfLegendsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeagueOfLegendsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LeagueOfLegendsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeagueOfLegendsSwitch<Adapter> modelSwitch =
		new LeagueOfLegendsSwitch<Adapter>() {
			@Override
			public Adapter caseLeague(League object) {
				return createLeagueAdapter();
			}
			@Override
			public Adapter caseChampion(Champion object) {
				return createChampionAdapter();
			}
			@Override
			public Adapter caseTeam(Team object) {
				return createTeamAdapter();
			}
			@Override
			public Adapter casePlayer(Player object) {
				return createPlayerAdapter();
			}
			@Override
			public Adapter casePlayerStats(PlayerStats object) {
				return createPlayerStatsAdapter();
			}
			@Override
			public Adapter caseMatch(Match object) {
				return createMatchAdapter();
			}
			@Override
			public Adapter caseGame(Game object) {
				return createGameAdapter();
			}
			@Override
			public Adapter caseGameTeamStats(GameTeamStats object) {
				return createGameTeamStatsAdapter();
			}
			@Override
			public Adapter caseGamePlayerStats(GamePlayerStats object) {
				return createGamePlayerStatsAdapter();
			}
			@Override
			public Adapter caseSeason(Season object) {
				return createSeasonAdapter();
			}
			@Override
			public Adapter caseGameStats(GameStats object) {
				return createGameStatsAdapter();
			}
			@Override
			public Adapter caseChampionsStats(ChampionsStats object) {
				return createChampionsStatsAdapter();
			}
			@Override
			public Adapter caseTeamStats(TeamStats object) {
				return createTeamStatsAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link leagueOfLegends.League <em>League</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see leagueOfLegends.League
	 * @generated
	 */
	public Adapter createLeagueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link leagueOfLegends.Team <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see leagueOfLegends.Team
	 * @generated
	 */
	public Adapter createTeamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link leagueOfLegends.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see leagueOfLegends.Player
	 * @generated
	 */
	public Adapter createPlayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link leagueOfLegends.PlayerStats <em>Player Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see leagueOfLegends.PlayerStats
	 * @generated
	 */
	public Adapter createPlayerStatsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link leagueOfLegends.Champion <em>Champion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see leagueOfLegends.Champion
	 * @generated
	 */
	public Adapter createChampionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link leagueOfLegends.Match <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see leagueOfLegends.Match
	 * @generated
	 */
	public Adapter createMatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link leagueOfLegends.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see leagueOfLegends.Game
	 * @generated
	 */
	public Adapter createGameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link leagueOfLegends.GameTeamStats <em>Game Team Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see leagueOfLegends.GameTeamStats
	 * @generated
	 */
	public Adapter createGameTeamStatsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link leagueOfLegends.GamePlayerStats <em>Game Player Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see leagueOfLegends.GamePlayerStats
	 * @generated
	 */
	public Adapter createGamePlayerStatsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link leagueOfLegends.Season <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see leagueOfLegends.Season
	 * @generated
	 */
	public Adapter createSeasonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link leagueOfLegends.GameStats <em>Game Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see leagueOfLegends.GameStats
	 * @generated
	 */
	public Adapter createGameStatsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link leagueOfLegends.ChampionsStats <em>Champions Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see leagueOfLegends.ChampionsStats
	 * @generated
	 */
	public Adapter createChampionsStatsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link leagueOfLegends.TeamStats <em>Team Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see leagueOfLegends.TeamStats
	 * @generated
	 */
	public Adapter createTeamStatsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LeagueOfLegendsAdapterFactory
