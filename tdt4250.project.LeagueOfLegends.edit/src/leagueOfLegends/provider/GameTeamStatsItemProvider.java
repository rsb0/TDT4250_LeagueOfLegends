/**
 */
package leagueOfLegends.provider;


import java.util.Collection;
import java.util.List;

import leagueOfLegends.GameTeamStats;
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
 * This is the item provider adapter for a {@link leagueOfLegends.GameTeamStats} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GameTeamStatsItemProvider 
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
	public GameTeamStatsItemProvider(AdapterFactory adapterFactory) {
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

			addTeamPropertyDescriptor(object);
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
			addTeamSidePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Team feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTeamPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GameTeamStats_team_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GameTeamStats_team_feature", "_UI_GameTeamStats_type"),
				 LeagueOfLegendsPackage.Literals.GAME_TEAM_STATS__TEAM,
				 true,
				 false,
				 true,
				 null,
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
				 getString("_UI_GameTeamStats_totalKills_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GameTeamStats_totalKills_feature", "_UI_GameTeamStats_type"),
				 LeagueOfLegendsPackage.Literals.GAME_TEAM_STATS__TOTAL_KILLS,
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
				 getString("_UI_GameTeamStats_totalDeaths_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GameTeamStats_totalDeaths_feature", "_UI_GameTeamStats_type"),
				 LeagueOfLegendsPackage.Literals.GAME_TEAM_STATS__TOTAL_DEATHS,
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
				 getString("_UI_GameTeamStats_totalAssist_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GameTeamStats_totalAssist_feature", "_UI_GameTeamStats_type"),
				 LeagueOfLegendsPackage.Literals.GAME_TEAM_STATS__TOTAL_ASSIST,
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
				 getString("_UI_GameTeamStats_totalGolds_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GameTeamStats_totalGolds_feature", "_UI_GameTeamStats_type"),
				 LeagueOfLegendsPackage.Literals.GAME_TEAM_STATS__TOTAL_GOLDS,
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
				 getString("_UI_GameTeamStats_totalWards_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GameTeamStats_totalWards_feature", "_UI_GameTeamStats_type"),
				 LeagueOfLegendsPackage.Literals.GAME_TEAM_STATS__TOTAL_WARDS,
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
				 getString("_UI_GameTeamStats_totalWardsKilled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GameTeamStats_totalWardsKilled_feature", "_UI_GameTeamStats_type"),
				 LeagueOfLegendsPackage.Literals.GAME_TEAM_STATS__TOTAL_WARDS_KILLED,
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
				 getString("_UI_GameTeamStats_totalVisionWards_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GameTeamStats_totalVisionWards_feature", "_UI_GameTeamStats_type"),
				 LeagueOfLegendsPackage.Literals.GAME_TEAM_STATS__TOTAL_VISION_WARDS,
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
				 getString("_UI_GameTeamStats_totalMinionKills_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GameTeamStats_totalMinionKills_feature", "_UI_GameTeamStats_type"),
				 LeagueOfLegendsPackage.Literals.GAME_TEAM_STATS__TOTAL_MINION_KILLS,
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
				 getString("_UI_GameTeamStats_totalMonsterKills_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GameTeamStats_totalMonsterKills_feature", "_UI_GameTeamStats_type"),
				 LeagueOfLegendsPackage.Literals.GAME_TEAM_STATS__TOTAL_MONSTER_KILLS,
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
				 getString("_UI_GameTeamStats_teamBaronKills_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GameTeamStats_teamBaronKills_feature", "_UI_GameTeamStats_type"),
				 LeagueOfLegendsPackage.Literals.GAME_TEAM_STATS__TEAM_BARON_KILLS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Team Side feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTeamSidePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GameTeamStats_teamSide_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GameTeamStats_teamSide_feature", "_UI_GameTeamStats_type"),
				 LeagueOfLegendsPackage.Literals.GAME_TEAM_STATS__TEAM_SIDE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GameTeamStats_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GameTeamStats_name_feature", "_UI_GameTeamStats_type"),
				 LeagueOfLegendsPackage.Literals.GAME_TEAM_STATS__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns GameTeamStats.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GameTeamStats"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GameTeamStats)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_GameTeamStats_type") :
			getString("_UI_GameTeamStats_type") + " " + label;
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

		switch (notification.getFeatureID(GameTeamStats.class)) {
			case LeagueOfLegendsPackage.GAME_TEAM_STATS__TOTAL_KILLS:
			case LeagueOfLegendsPackage.GAME_TEAM_STATS__TOTAL_DEATHS:
			case LeagueOfLegendsPackage.GAME_TEAM_STATS__TOTAL_ASSIST:
			case LeagueOfLegendsPackage.GAME_TEAM_STATS__TOTAL_GOLDS:
			case LeagueOfLegendsPackage.GAME_TEAM_STATS__TOTAL_WARDS:
			case LeagueOfLegendsPackage.GAME_TEAM_STATS__TOTAL_WARDS_KILLED:
			case LeagueOfLegendsPackage.GAME_TEAM_STATS__TOTAL_VISION_WARDS:
			case LeagueOfLegendsPackage.GAME_TEAM_STATS__TOTAL_MINION_KILLS:
			case LeagueOfLegendsPackage.GAME_TEAM_STATS__TOTAL_MONSTER_KILLS:
			case LeagueOfLegendsPackage.GAME_TEAM_STATS__TEAM_BARON_KILLS:
			case LeagueOfLegendsPackage.GAME_TEAM_STATS__TEAM_SIDE:
			case LeagueOfLegendsPackage.GAME_TEAM_STATS__NAME:
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
