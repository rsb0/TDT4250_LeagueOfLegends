/**
 */
package leagueOfLegends.provider;


import java.util.Collection;
import java.util.List;

import leagueOfLegends.LeagueOfLegendsPackage;
import leagueOfLegends.LeagueStats;

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
 * This is the item provider adapter for a {@link leagueOfLegends.LeagueStats} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LeagueStatsItemProvider 
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
	public LeagueStatsItemProvider(AdapterFactory adapterFactory) {
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

			addLeaguePropertyDescriptor(object);
			addKillsPropertyDescriptor(object);
			addDeathsPropertyDescriptor(object);
			addAssistsPropertyDescriptor(object);
			addPlayerWithMostKillsPropertyDescriptor(object);
			addPlayerWithMostDeathsPropertyDescriptor(object);
			addPlayerWithMostAssistsPropertyDescriptor(object);
			addPlayerWithHighestKdaPropertyDescriptor(object);
			addChampionWithMostKillsPropertyDescriptor(object);
			addChampionWithMostDeathsPropertyDescriptor(object);
			addChampionWithMostAssistsPropertyDescriptor(object);
			addChampionWithHighestKdaPropertyDescriptor(object);
			addMostBannedChampionPropertyDescriptor(object);
			addLeastBannedChampionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the League feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLeaguePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LeagueStats_league_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LeagueStats_league_feature", "_UI_LeagueStats_type"),
				 LeagueOfLegendsPackage.Literals.LEAGUE_STATS__LEAGUE,
				 true,
				 false,
				 true,
				 null,
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
				 getString("_UI_LeagueStats_kills_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LeagueStats_kills_feature", "_UI_LeagueStats_type"),
				 LeagueOfLegendsPackage.Literals.LEAGUE_STATS__KILLS,
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
				 getString("_UI_LeagueStats_deaths_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LeagueStats_deaths_feature", "_UI_LeagueStats_type"),
				 LeagueOfLegendsPackage.Literals.LEAGUE_STATS__DEATHS,
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
				 getString("_UI_LeagueStats_assists_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LeagueStats_assists_feature", "_UI_LeagueStats_type"),
				 LeagueOfLegendsPackage.Literals.LEAGUE_STATS__ASSISTS,
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
				 getString("_UI_LeagueStats_playerWithMostKills_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LeagueStats_playerWithMostKills_feature", "_UI_LeagueStats_type"),
				 LeagueOfLegendsPackage.Literals.LEAGUE_STATS__PLAYER_WITH_MOST_KILLS,
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
				 getString("_UI_LeagueStats_playerWithMostDeaths_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LeagueStats_playerWithMostDeaths_feature", "_UI_LeagueStats_type"),
				 LeagueOfLegendsPackage.Literals.LEAGUE_STATS__PLAYER_WITH_MOST_DEATHS,
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
				 getString("_UI_LeagueStats_playerWithMostAssists_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LeagueStats_playerWithMostAssists_feature", "_UI_LeagueStats_type"),
				 LeagueOfLegendsPackage.Literals.LEAGUE_STATS__PLAYER_WITH_MOST_ASSISTS,
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
				 getString("_UI_LeagueStats_playerWithHighestKda_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LeagueStats_playerWithHighestKda_feature", "_UI_LeagueStats_type"),
				 LeagueOfLegendsPackage.Literals.LEAGUE_STATS__PLAYER_WITH_HIGHEST_KDA,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Champion With Most Kills feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChampionWithMostKillsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LeagueStats_championWithMostKills_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LeagueStats_championWithMostKills_feature", "_UI_LeagueStats_type"),
				 LeagueOfLegendsPackage.Literals.LEAGUE_STATS__CHAMPION_WITH_MOST_KILLS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Champion With Most Deaths feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChampionWithMostDeathsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LeagueStats_championWithMostDeaths_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LeagueStats_championWithMostDeaths_feature", "_UI_LeagueStats_type"),
				 LeagueOfLegendsPackage.Literals.LEAGUE_STATS__CHAMPION_WITH_MOST_DEATHS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Champion With Most Assists feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChampionWithMostAssistsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LeagueStats_championWithMostAssists_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LeagueStats_championWithMostAssists_feature", "_UI_LeagueStats_type"),
				 LeagueOfLegendsPackage.Literals.LEAGUE_STATS__CHAMPION_WITH_MOST_ASSISTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Champion With Highest Kda feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChampionWithHighestKdaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LeagueStats_championWithHighestKda_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LeagueStats_championWithHighestKda_feature", "_UI_LeagueStats_type"),
				 LeagueOfLegendsPackage.Literals.LEAGUE_STATS__CHAMPION_WITH_HIGHEST_KDA,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Most Banned Champion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMostBannedChampionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LeagueStats_mostBannedChampion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LeagueStats_mostBannedChampion_feature", "_UI_LeagueStats_type"),
				 LeagueOfLegendsPackage.Literals.LEAGUE_STATS__MOST_BANNED_CHAMPION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Least Banned Champion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLeastBannedChampionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LeagueStats_leastBannedChampion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LeagueStats_leastBannedChampion_feature", "_UI_LeagueStats_type"),
				 LeagueOfLegendsPackage.Literals.LEAGUE_STATS__LEAST_BANNED_CHAMPION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns LeagueStats.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LeagueStats"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		LeagueStats leagueStats = (LeagueStats)object;
		return getString("_UI_LeagueStats_type") + " " + leagueStats.getKills();
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

		switch (notification.getFeatureID(LeagueStats.class)) {
			case LeagueOfLegendsPackage.LEAGUE_STATS__KILLS:
			case LeagueOfLegendsPackage.LEAGUE_STATS__DEATHS:
			case LeagueOfLegendsPackage.LEAGUE_STATS__ASSISTS:
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
