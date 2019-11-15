/**
 */
package leagueOfLegends.provider;


import java.util.Collection;
import java.util.List;

import leagueOfLegends.GameStats;
import leagueOfLegends.LeagueOfLegendsPackage;
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
 * This is the item provider adapter for a {@link leagueOfLegends.GameStats} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GameStatsItemProvider 
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
	public GameStatsItemProvider(AdapterFactory adapterFactory) {
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

			addDurationPropertyDescriptor(object);
			addWinnerPropertyDescriptor(object);
			addTotalKillsPropertyDescriptor(object);
			addTotalDeathsPropertyDescriptor(object);
			addTotalAssistPropertyDescriptor(object);
			addTotalGoldsPropertyDescriptor(object);
			addTotalWardsPropertyDescriptor(object);
			addTotalWardsKilledPropertyDescriptor(object);
			addTotalVisionWardsPropertyDescriptor(object);
			addTotalMinionKillsPropertyDescriptor(object);
			addTotalMonsterKillsPropertyDescriptor(object);
			addTeamBaronKillsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GameStats_duration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GameStats_duration_feature", "_UI_GameStats_type"),
				 LeagueOfLegendsPackage.Literals.GAME_STATS__DURATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Winner feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWinnerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GameStats_winner_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GameStats_winner_feature", "_UI_GameStats_type"),
				 LeagueOfLegendsPackage.Literals.GAME_STATS__WINNER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total Kills feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalKillsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GameStats_totalKills_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GameStats_totalKills_feature", "_UI_GameStats_type"),
				 LeagueOfLegendsPackage.Literals.GAME_STATS__TOTAL_KILLS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total Deaths feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalDeathsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GameStats_totalDeaths_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GameStats_totalDeaths_feature", "_UI_GameStats_type"),
				 LeagueOfLegendsPackage.Literals.GAME_STATS__TOTAL_DEATHS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total Assist feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalAssistPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GameStats_totalAssist_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GameStats_totalAssist_feature", "_UI_GameStats_type"),
				 LeagueOfLegendsPackage.Literals.GAME_STATS__TOTAL_ASSIST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total Golds feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalGoldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GameStats_totalGolds_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GameStats_totalGolds_feature", "_UI_GameStats_type"),
				 LeagueOfLegendsPackage.Literals.GAME_STATS__TOTAL_GOLDS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total Wards feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalWardsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GameStats_totalWards_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GameStats_totalWards_feature", "_UI_GameStats_type"),
				 LeagueOfLegendsPackage.Literals.GAME_STATS__TOTAL_WARDS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total Wards Killed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalWardsKilledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GameStats_totalWardsKilled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GameStats_totalWardsKilled_feature", "_UI_GameStats_type"),
				 LeagueOfLegendsPackage.Literals.GAME_STATS__TOTAL_WARDS_KILLED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total Vision Wards feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalVisionWardsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GameStats_totalVisionWards_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GameStats_totalVisionWards_feature", "_UI_GameStats_type"),
				 LeagueOfLegendsPackage.Literals.GAME_STATS__TOTAL_VISION_WARDS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total Minion Kills feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalMinionKillsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GameStats_totalMinionKills_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GameStats_totalMinionKills_feature", "_UI_GameStats_type"),
				 LeagueOfLegendsPackage.Literals.GAME_STATS__TOTAL_MINION_KILLS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total Monster Kills feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalMonsterKillsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GameStats_totalMonsterKills_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GameStats_totalMonsterKills_feature", "_UI_GameStats_type"),
				 LeagueOfLegendsPackage.Literals.GAME_STATS__TOTAL_MONSTER_KILLS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Team Baron Kills feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTeamBaronKillsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GameStats_teamBaronKills_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GameStats_teamBaronKills_feature", "_UI_GameStats_type"),
				 LeagueOfLegendsPackage.Literals.GAME_STATS__TEAM_BARON_KILLS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns GameStats.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GameStats"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		GameStats gameStats = (GameStats)object;
		return getString("_UI_GameStats_type") + " " + gameStats.getDuration();
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

		switch (notification.getFeatureID(GameStats.class)) {
			case LeagueOfLegendsPackage.GAME_STATS__DURATION:
			case LeagueOfLegendsPackage.GAME_STATS__WINNER:
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_KILLS:
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_DEATHS:
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_ASSIST:
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_GOLDS:
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_WARDS:
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_WARDS_KILLED:
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_VISION_WARDS:
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_MINION_KILLS:
			case LeagueOfLegendsPackage.GAME_STATS__TOTAL_MONSTER_KILLS:
			case LeagueOfLegendsPackage.GAME_STATS__TEAM_BARON_KILLS:
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
