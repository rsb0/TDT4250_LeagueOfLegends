/**
 */
package leagueOfLegends.provider;


import java.util.Collection;
import java.util.List;

import leagueOfLegends.LeagueOfLegendsPackage;
import leagueOfLegends.TeamStats;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link leagueOfLegends.TeamStats} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TeamStatsItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeamStatsItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addGamesPlayedPropertyDescriptor(object);
			addKillsPropertyDescriptor(object);
			addDeathsPropertyDescriptor(object);
			addAssistsPropertyDescriptor(object);
			addKillDeathAssistRatioPropertyDescriptor(object);
			addWinLoseRatioPropertyDescriptor(object);
			addGameWinsPropertyDescriptor(object);
			addMatchWinsPropertyDescriptor(object);
			addTournamentWinsPropertyDescriptor(object);
			addTournamentSecondPlacesPropertyDescriptor(object);
			addTournamentThridPlacesPropertyDescriptor(object);
			addPlayerWithMostKillsPropertyDescriptor(object);
			addPlayerWithMostDeathsPropertyDescriptor(object);
			addPlayerWithMostAssistsPropertyDescriptor(object);
			addPlayerWithHighestKdaPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Games Played feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGamesPlayedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TeamStats_gamesPlayed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TeamStats_gamesPlayed_feature", "_UI_TeamStats_type"),
				 LeagueOfLegendsPackage.Literals.TEAM_STATS__GAMES_PLAYED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Kills feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKillsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TeamStats_kills_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TeamStats_kills_feature", "_UI_TeamStats_type"),
				 LeagueOfLegendsPackage.Literals.TEAM_STATS__KILLS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Deaths feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeathsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TeamStats_deaths_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TeamStats_deaths_feature", "_UI_TeamStats_type"),
				 LeagueOfLegendsPackage.Literals.TEAM_STATS__DEATHS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Assists feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssistsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TeamStats_assists_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TeamStats_assists_feature", "_UI_TeamStats_type"),
				 LeagueOfLegendsPackage.Literals.TEAM_STATS__ASSISTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Kill Death Assist Ratio feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKillDeathAssistRatioPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TeamStats_killDeathAssistRatio_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TeamStats_killDeathAssistRatio_feature", "_UI_TeamStats_type"),
				 LeagueOfLegendsPackage.Literals.TEAM_STATS__KILL_DEATH_ASSIST_RATIO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Win Lose Ratio feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWinLoseRatioPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TeamStats_winLoseRatio_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TeamStats_winLoseRatio_feature", "_UI_TeamStats_type"),
				 LeagueOfLegendsPackage.Literals.TEAM_STATS__WIN_LOSE_RATIO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Game Wins feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGameWinsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TeamStats_gameWins_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TeamStats_gameWins_feature", "_UI_TeamStats_type"),
				 LeagueOfLegendsPackage.Literals.TEAM_STATS__GAME_WINS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Match Wins feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMatchWinsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TeamStats_matchWins_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TeamStats_matchWins_feature", "_UI_TeamStats_type"),
				 LeagueOfLegendsPackage.Literals.TEAM_STATS__MATCH_WINS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tournament Wins feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTournamentWinsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TeamStats_tournamentWins_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TeamStats_tournamentWins_feature", "_UI_TeamStats_type"),
				 LeagueOfLegendsPackage.Literals.TEAM_STATS__TOURNAMENT_WINS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tournament Second Places feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTournamentSecondPlacesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TeamStats_tournamentSecondPlaces_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TeamStats_tournamentSecondPlaces_feature", "_UI_TeamStats_type"),
				 LeagueOfLegendsPackage.Literals.TEAM_STATS__TOURNAMENT_SECOND_PLACES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tournament Thrid Places feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTournamentThridPlacesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TeamStats_tournamentThridPlaces_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TeamStats_tournamentThridPlaces_feature", "_UI_TeamStats_type"),
				 LeagueOfLegendsPackage.Literals.TEAM_STATS__TOURNAMENT_THRID_PLACES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Player With Most Kills feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlayerWithMostKillsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TeamStats_playerWithMostKills_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TeamStats_playerWithMostKills_feature", "_UI_TeamStats_type"),
				 LeagueOfLegendsPackage.Literals.TEAM_STATS__PLAYER_WITH_MOST_KILLS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Player With Most Deaths feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlayerWithMostDeathsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TeamStats_playerWithMostDeaths_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TeamStats_playerWithMostDeaths_feature", "_UI_TeamStats_type"),
				 LeagueOfLegendsPackage.Literals.TEAM_STATS__PLAYER_WITH_MOST_DEATHS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Player With Most Assists feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlayerWithMostAssistsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TeamStats_playerWithMostAssists_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TeamStats_playerWithMostAssists_feature", "_UI_TeamStats_type"),
				 LeagueOfLegendsPackage.Literals.TEAM_STATS__PLAYER_WITH_MOST_ASSISTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Player With Highest Kda feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlayerWithHighestKdaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TeamStats_playerWithHighestKda_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TeamStats_playerWithHighestKda_feature", "_UI_TeamStats_type"),
				 LeagueOfLegendsPackage.Literals.TEAM_STATS__PLAYER_WITH_HIGHEST_KDA,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns TeamStats.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TeamStats"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		TeamStats teamStats = (TeamStats)object;
		return getString("_UI_TeamStats_type") + " " + teamStats.getTournamentWins();
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(TeamStats.class)) {
			case LeagueOfLegendsPackage.TEAM_STATS__GAMES_PLAYED:
			case LeagueOfLegendsPackage.TEAM_STATS__KILLS:
			case LeagueOfLegendsPackage.TEAM_STATS__DEATHS:
			case LeagueOfLegendsPackage.TEAM_STATS__ASSISTS:
			case LeagueOfLegendsPackage.TEAM_STATS__KILL_DEATH_ASSIST_RATIO:
			case LeagueOfLegendsPackage.TEAM_STATS__WIN_LOSE_RATIO:
			case LeagueOfLegendsPackage.TEAM_STATS__GAME_WINS:
			case LeagueOfLegendsPackage.TEAM_STATS__MATCH_WINS:
			case LeagueOfLegendsPackage.TEAM_STATS__TOURNAMENT_WINS:
			case LeagueOfLegendsPackage.TEAM_STATS__TOURNAMENT_SECOND_PLACES:
			case LeagueOfLegendsPackage.TEAM_STATS__TOURNAMENT_THRID_PLACES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return LeagueOfLegendsEditPlugin.INSTANCE;
	}

}
