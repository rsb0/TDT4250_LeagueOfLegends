/**
 */
package leagueOfLegends.impl;

import java.util.Collection;

import leagueOfLegends.Champion;
import leagueOfLegends.League;
import leagueOfLegends.LeagueOfLegendsPackage;
import leagueOfLegends.Match;
import leagueOfLegends.Season;
import leagueOfLegends.Team;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>League</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link leagueOfLegends.impl.LeagueImpl#getName <em>Name</em>}</li>
 *   <li>{@link leagueOfLegends.impl.LeagueImpl#getTeams <em>Teams</em>}</li>
 *   <li>{@link leagueOfLegends.impl.LeagueImpl#getSeasons <em>Seasons</em>}</li>
 *   <li>{@link leagueOfLegends.impl.LeagueImpl#getMatches <em>Matches</em>}</li>
 *   <li>{@link leagueOfLegends.impl.LeagueImpl#getChampions <em>Champions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LeagueImpl extends MinimalEObjectImpl.Container implements League {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTeams() <em>Teams</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeams()
	 * @generated
	 * @ordered
	 */
	protected EList<Team> teams;

	/**
	 * The cached value of the '{@link #getSeasons() <em>Seasons</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeasons()
	 * @generated
	 * @ordered
	 */
	protected EList<Season> seasons;

	/**
	 * The cached value of the '{@link #getMatches() <em>Matches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatches()
	 * @generated
	 * @ordered
	 */
	protected EList<Match> matches;

	/**
	 * The cached value of the '{@link #getChampions() <em>Champions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChampions()
	 * @generated
	 * @ordered
	 */
	protected Champion champions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeagueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LeagueOfLegendsPackage.Literals.LEAGUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.LEAGUE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Team> getTeams() {
		if (teams == null) {
			teams = new EObjectContainmentWithInverseEList<Team>(Team.class, this, LeagueOfLegendsPackage.LEAGUE__TEAMS, LeagueOfLegendsPackage.TEAM__LEAGUE);
		}
		return teams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Season> getSeasons() {
		if (seasons == null) {
			seasons = new EObjectResolvingEList<Season>(Season.class, this, LeagueOfLegendsPackage.LEAGUE__SEASONS);
		}
		return seasons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Match> getMatches() {
		if (matches == null) {
			matches = new EObjectContainmentEList<Match>(Match.class, this, LeagueOfLegendsPackage.LEAGUE__MATCHES);
		}
		return matches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Champion getChampions() {
		return champions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChampions(Champion newChampions, NotificationChain msgs) {
		Champion oldChampions = champions;
		champions = newChampions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.LEAGUE__CHAMPIONS, oldChampions, newChampions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChampions(Champion newChampions) {
		if (newChampions != champions) {
			NotificationChain msgs = null;
			if (champions != null)
				msgs = ((InternalEObject)champions).eInverseRemove(this, LeagueOfLegendsPackage.CHAMPION__LEAGUE, Champion.class, msgs);
			if (newChampions != null)
				msgs = ((InternalEObject)newChampions).eInverseAdd(this, LeagueOfLegendsPackage.CHAMPION__LEAGUE, Champion.class, msgs);
			msgs = basicSetChampions(newChampions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.LEAGUE__CHAMPIONS, newChampions, newChampions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LeagueOfLegendsPackage.LEAGUE__TEAMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTeams()).basicAdd(otherEnd, msgs);
			case LeagueOfLegendsPackage.LEAGUE__CHAMPIONS:
				if (champions != null)
					msgs = ((InternalEObject)champions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LeagueOfLegendsPackage.LEAGUE__CHAMPIONS, null, msgs);
				return basicSetChampions((Champion)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LeagueOfLegendsPackage.LEAGUE__TEAMS:
				return ((InternalEList<?>)getTeams()).basicRemove(otherEnd, msgs);
			case LeagueOfLegendsPackage.LEAGUE__MATCHES:
				return ((InternalEList<?>)getMatches()).basicRemove(otherEnd, msgs);
			case LeagueOfLegendsPackage.LEAGUE__CHAMPIONS:
				return basicSetChampions(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LeagueOfLegendsPackage.LEAGUE__NAME:
				return getName();
			case LeagueOfLegendsPackage.LEAGUE__TEAMS:
				return getTeams();
			case LeagueOfLegendsPackage.LEAGUE__SEASONS:
				return getSeasons();
			case LeagueOfLegendsPackage.LEAGUE__MATCHES:
				return getMatches();
			case LeagueOfLegendsPackage.LEAGUE__CHAMPIONS:
				return getChampions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LeagueOfLegendsPackage.LEAGUE__NAME:
				setName((String)newValue);
				return;
			case LeagueOfLegendsPackage.LEAGUE__TEAMS:
				getTeams().clear();
				getTeams().addAll((Collection<? extends Team>)newValue);
				return;
			case LeagueOfLegendsPackage.LEAGUE__SEASONS:
				getSeasons().clear();
				getSeasons().addAll((Collection<? extends Season>)newValue);
				return;
			case LeagueOfLegendsPackage.LEAGUE__MATCHES:
				getMatches().clear();
				getMatches().addAll((Collection<? extends Match>)newValue);
				return;
			case LeagueOfLegendsPackage.LEAGUE__CHAMPIONS:
				setChampions((Champion)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LeagueOfLegendsPackage.LEAGUE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.LEAGUE__TEAMS:
				getTeams().clear();
				return;
			case LeagueOfLegendsPackage.LEAGUE__SEASONS:
				getSeasons().clear();
				return;
			case LeagueOfLegendsPackage.LEAGUE__MATCHES:
				getMatches().clear();
				return;
			case LeagueOfLegendsPackage.LEAGUE__CHAMPIONS:
				setChampions((Champion)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LeagueOfLegendsPackage.LEAGUE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LeagueOfLegendsPackage.LEAGUE__TEAMS:
				return teams != null && !teams.isEmpty();
			case LeagueOfLegendsPackage.LEAGUE__SEASONS:
				return seasons != null && !seasons.isEmpty();
			case LeagueOfLegendsPackage.LEAGUE__MATCHES:
				return matches != null && !matches.isEmpty();
			case LeagueOfLegendsPackage.LEAGUE__CHAMPIONS:
				return champions != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //LeagueImpl