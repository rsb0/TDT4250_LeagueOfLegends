/**
 */
package leagueOfLegends.provider;

import java.util.ArrayList;
import java.util.Collection;

import leagueOfLegends.util.LeagueOfLegendsAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LeagueOfLegendsItemProviderAdapterFactory extends LeagueOfLegendsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeagueOfLegendsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link leagueOfLegends.League} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeagueItemProvider leagueItemProvider;

	/**
	 * This creates an adapter for a {@link leagueOfLegends.League}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLeagueAdapter() {
		if (leagueItemProvider == null) {
			leagueItemProvider = new LeagueItemProvider(this);
		}

		return leagueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link leagueOfLegends.Team} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamItemProvider teamItemProvider;

	/**
	 * This creates an adapter for a {@link leagueOfLegends.Team}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTeamAdapter() {
		if (teamItemProvider == null) {
			teamItemProvider = new TeamItemProvider(this);
		}

		return teamItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link leagueOfLegends.Player} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayerItemProvider playerItemProvider;

	/**
	 * This creates an adapter for a {@link leagueOfLegends.Player}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlayerAdapter() {
		if (playerItemProvider == null) {
			playerItemProvider = new PlayerItemProvider(this);
		}

		return playerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link leagueOfLegends.PlayerStats} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayerStatsItemProvider playerStatsItemProvider;

	/**
	 * This creates an adapter for a {@link leagueOfLegends.PlayerStats}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlayerStatsAdapter() {
		if (playerStatsItemProvider == null) {
			playerStatsItemProvider = new PlayerStatsItemProvider(this);
		}

		return playerStatsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link leagueOfLegends.Champion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChampionItemProvider championItemProvider;

	/**
	 * This creates an adapter for a {@link leagueOfLegends.Champion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChampionAdapter() {
		if (championItemProvider == null) {
			championItemProvider = new ChampionItemProvider(this);
		}

		return championItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link leagueOfLegends.Match} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchItemProvider matchItemProvider;

	/**
	 * This creates an adapter for a {@link leagueOfLegends.Match}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMatchAdapter() {
		if (matchItemProvider == null) {
			matchItemProvider = new MatchItemProvider(this);
		}

		return matchItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link leagueOfLegends.Game} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameItemProvider gameItemProvider;

	/**
	 * This creates an adapter for a {@link leagueOfLegends.Game}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGameAdapter() {
		if (gameItemProvider == null) {
			gameItemProvider = new GameItemProvider(this);
		}

		return gameItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link leagueOfLegends.GameTeamStats} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameTeamStatsItemProvider gameTeamStatsItemProvider;

	/**
	 * This creates an adapter for a {@link leagueOfLegends.GameTeamStats}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGameTeamStatsAdapter() {
		if (gameTeamStatsItemProvider == null) {
			gameTeamStatsItemProvider = new GameTeamStatsItemProvider(this);
		}

		return gameTeamStatsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link leagueOfLegends.GamePlayerStats} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GamePlayerStatsItemProvider gamePlayerStatsItemProvider;

	/**
	 * This creates an adapter for a {@link leagueOfLegends.GamePlayerStats}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGamePlayerStatsAdapter() {
		if (gamePlayerStatsItemProvider == null) {
			gamePlayerStatsItemProvider = new GamePlayerStatsItemProvider(this);
		}

		return gamePlayerStatsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link leagueOfLegends.Season} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeasonItemProvider seasonItemProvider;

	/**
	 * This creates an adapter for a {@link leagueOfLegends.Season}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSeasonAdapter() {
		if (seasonItemProvider == null) {
			seasonItemProvider = new SeasonItemProvider(this);
		}

		return seasonItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link leagueOfLegends.GameStats} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameStatsItemProvider gameStatsItemProvider;

	/**
	 * This creates an adapter for a {@link leagueOfLegends.GameStats}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGameStatsAdapter() {
		if (gameStatsItemProvider == null) {
			gameStatsItemProvider = new GameStatsItemProvider(this);
		}

		return gameStatsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link leagueOfLegends.ChampionsStats} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChampionsStatsItemProvider championsStatsItemProvider;

	/**
	 * This creates an adapter for a {@link leagueOfLegends.ChampionsStats}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChampionsStatsAdapter() {
		if (championsStatsItemProvider == null) {
			championsStatsItemProvider = new ChampionsStatsItemProvider(this);
		}

		return championsStatsItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (leagueItemProvider != null) leagueItemProvider.dispose();
		if (championItemProvider != null) championItemProvider.dispose();
		if (teamItemProvider != null) teamItemProvider.dispose();
		if (playerItemProvider != null) playerItemProvider.dispose();
		if (playerStatsItemProvider != null) playerStatsItemProvider.dispose();
		if (matchItemProvider != null) matchItemProvider.dispose();
		if (gameItemProvider != null) gameItemProvider.dispose();
		if (gameTeamStatsItemProvider != null) gameTeamStatsItemProvider.dispose();
		if (gamePlayerStatsItemProvider != null) gamePlayerStatsItemProvider.dispose();
		if (seasonItemProvider != null) seasonItemProvider.dispose();
		if (gameStatsItemProvider != null) gameStatsItemProvider.dispose();
		if (championsStatsItemProvider != null) championsStatsItemProvider.dispose();
	}

}
