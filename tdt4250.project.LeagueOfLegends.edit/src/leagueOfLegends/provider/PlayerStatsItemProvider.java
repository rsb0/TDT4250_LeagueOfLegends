/**
 */
package leagueOfLegends.provider;


import java.util.Collection;
import java.util.List;

import leagueOfLegends.LeagueOfLegendsPackage;
import leagueOfLegends.PlayerStats;

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
 * This is the item provider adapter for a {@link leagueOfLegends.PlayerStats} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PlayerStatsItemProvider 
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
	public PlayerStatsItemProvider(AdapterFactory adapterFactory) {
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
			addCareerKillsPropertyDescriptor(object);
			addCareerDeathsPropertyDescriptor(object);
			addCareerAssistPropertyDescriptor(object);
			addKillDeathAssistRatioPropertyDescriptor(object);
			addWinLoseRatioPropertyDescriptor(object);
			addCareerGameWinsPropertyDescriptor(object);
			addCareerMatchWinsPropertyDescriptor(object);
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
				 getString("_UI_PlayerStats_gamesPlayed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PlayerStats_gamesPlayed_feature", "_UI_PlayerStats_type"),
				 LeagueOfLegendsPackage.Literals.PLAYER_STATS__GAMES_PLAYED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Career Kills feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCareerKillsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PlayerStats_careerKills_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PlayerStats_careerKills_feature", "_UI_PlayerStats_type"),
				 LeagueOfLegendsPackage.Literals.PLAYER_STATS__CAREER_KILLS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Career Deaths feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCareerDeathsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PlayerStats_careerDeaths_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PlayerStats_careerDeaths_feature", "_UI_PlayerStats_type"),
				 LeagueOfLegendsPackage.Literals.PLAYER_STATS__CAREER_DEATHS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Career Assist feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCareerAssistPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PlayerStats_careerAssist_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PlayerStats_careerAssist_feature", "_UI_PlayerStats_type"),
				 LeagueOfLegendsPackage.Literals.PLAYER_STATS__CAREER_ASSIST,
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
				 getString("_UI_PlayerStats_killDeathAssistRatio_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PlayerStats_killDeathAssistRatio_feature", "_UI_PlayerStats_type"),
				 LeagueOfLegendsPackage.Literals.PLAYER_STATS__KILL_DEATH_ASSIST_RATIO,
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
				 getString("_UI_PlayerStats_winLoseRatio_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PlayerStats_winLoseRatio_feature", "_UI_PlayerStats_type"),
				 LeagueOfLegendsPackage.Literals.PLAYER_STATS__WIN_LOSE_RATIO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Career Game Wins feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCareerGameWinsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PlayerStats_careerGameWins_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PlayerStats_careerGameWins_feature", "_UI_PlayerStats_type"),
				 LeagueOfLegendsPackage.Literals.PLAYER_STATS__CAREER_GAME_WINS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Career Match Wins feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCareerMatchWinsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PlayerStats_careerMatchWins_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PlayerStats_careerMatchWins_feature", "_UI_PlayerStats_type"),
				 LeagueOfLegendsPackage.Literals.PLAYER_STATS__CAREER_MATCH_WINS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns PlayerStats.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PlayerStats"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		PlayerStats playerStats = (PlayerStats)object;
		return getString("_UI_PlayerStats_type") + " " + playerStats.getGamesPlayed();
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

		switch (notification.getFeatureID(PlayerStats.class)) {
			case LeagueOfLegendsPackage.PLAYER_STATS__GAMES_PLAYED:
			case LeagueOfLegendsPackage.PLAYER_STATS__CAREER_KILLS:
			case LeagueOfLegendsPackage.PLAYER_STATS__CAREER_DEATHS:
			case LeagueOfLegendsPackage.PLAYER_STATS__CAREER_ASSIST:
			case LeagueOfLegendsPackage.PLAYER_STATS__KILL_DEATH_ASSIST_RATIO:
			case LeagueOfLegendsPackage.PLAYER_STATS__WIN_LOSE_RATIO:
			case LeagueOfLegendsPackage.PLAYER_STATS__CAREER_GAME_WINS:
			case LeagueOfLegendsPackage.PLAYER_STATS__CAREER_MATCH_WINS:
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
