/**
 */
package leagueOfLegends.provider;


import java.util.Collection;
import java.util.List;

import leagueOfLegends.GamePlayerStats;
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
 * This is the item provider adapter for a {@link leagueOfLegends.GamePlayerStats} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GamePlayerStatsItemProvider 
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
	public GamePlayerStatsItemProvider(AdapterFactory adapterFactory) {
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

			addPlayerPropertyDescriptor(object);
			addKillsPropertyDescriptor(object);
			addDeathsPropertyDescriptor(object);
			addAssistPropertyDescriptor(object);
			addGoldsPropertyDescriptor(object);
			addWardsPropertyDescriptor(object);
			addWardsKilledPropertyDescriptor(object);
			addVisionWardsPropertyDescriptor(object);
			addMinionKillsPropertyDescriptor(object);
			addMonsterKillsPropertyDescriptor(object);
			addChampionPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Player feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlayerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GamePlayerStats_player_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GamePlayerStats_player_feature", "_UI_GamePlayerStats_type"),
				 LeagueOfLegendsPackage.Literals.GAME_PLAYER_STATS__PLAYER,
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
				 getString("_UI_GamePlayerStats_kills_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GamePlayerStats_kills_feature", "_UI_GamePlayerStats_type"),
				 LeagueOfLegendsPackage.Literals.GAME_PLAYER_STATS__KILLS,
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
				 getString("_UI_GamePlayerStats_deaths_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GamePlayerStats_deaths_feature", "_UI_GamePlayerStats_type"),
				 LeagueOfLegendsPackage.Literals.GAME_PLAYER_STATS__DEATHS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Assist feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssistPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GamePlayerStats_assist_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GamePlayerStats_assist_feature", "_UI_GamePlayerStats_type"),
				 LeagueOfLegendsPackage.Literals.GAME_PLAYER_STATS__ASSIST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Golds feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGoldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GamePlayerStats_golds_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GamePlayerStats_golds_feature", "_UI_GamePlayerStats_type"),
				 LeagueOfLegendsPackage.Literals.GAME_PLAYER_STATS__GOLDS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wards feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWardsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GamePlayerStats_wards_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GamePlayerStats_wards_feature", "_UI_GamePlayerStats_type"),
				 LeagueOfLegendsPackage.Literals.GAME_PLAYER_STATS__WARDS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wards Killed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWardsKilledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GamePlayerStats_wardsKilled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GamePlayerStats_wardsKilled_feature", "_UI_GamePlayerStats_type"),
				 LeagueOfLegendsPackage.Literals.GAME_PLAYER_STATS__WARDS_KILLED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vision Wards feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisionWardsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GamePlayerStats_visionWards_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GamePlayerStats_visionWards_feature", "_UI_GamePlayerStats_type"),
				 LeagueOfLegendsPackage.Literals.GAME_PLAYER_STATS__VISION_WARDS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Minion Kills feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinionKillsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GamePlayerStats_minionKills_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GamePlayerStats_minionKills_feature", "_UI_GamePlayerStats_type"),
				 LeagueOfLegendsPackage.Literals.GAME_PLAYER_STATS__MINION_KILLS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Monster Kills feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMonsterKillsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GamePlayerStats_monsterKills_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GamePlayerStats_monsterKills_feature", "_UI_GamePlayerStats_type"),
				 LeagueOfLegendsPackage.Literals.GAME_PLAYER_STATS__MONSTER_KILLS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Champion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChampionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GamePlayerStats_champion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GamePlayerStats_champion_feature", "_UI_GamePlayerStats_type"),
				 LeagueOfLegendsPackage.Literals.GAME_PLAYER_STATS__CHAMPION,
				 true,
				 false,
				 true,
				 null,
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
				 getString("_UI_GamePlayerStats_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GamePlayerStats_name_feature", "_UI_GamePlayerStats_type"),
				 LeagueOfLegendsPackage.Literals.GAME_PLAYER_STATS__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns GamePlayerStats.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GamePlayerStats"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GamePlayerStats)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_GamePlayerStats_type") :
			getString("_UI_GamePlayerStats_type") + " " + label;
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

		switch (notification.getFeatureID(GamePlayerStats.class)) {
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__KILLS:
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__DEATHS:
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__ASSIST:
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__GOLDS:
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__WARDS:
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__WARDS_KILLED:
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__VISION_WARDS:
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__MINION_KILLS:
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__MONSTER_KILLS:
			case LeagueOfLegendsPackage.GAME_PLAYER_STATS__NAME:
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
