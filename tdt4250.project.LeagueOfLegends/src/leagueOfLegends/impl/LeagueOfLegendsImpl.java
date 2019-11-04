/**
 */
package leagueOfLegends.impl;

import java.util.Collection;

import leagueOfLegends.Champion;
import leagueOfLegends.League;
import leagueOfLegends.LeagueOfLegends;
import leagueOfLegends.LeagueOfLegendsPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>League Of Legends</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link leagueOfLegends.impl.LeagueOfLegendsImpl#getChampions <em>Champions</em>}</li>
 *   <li>{@link leagueOfLegends.impl.LeagueOfLegendsImpl#getLeagues <em>Leagues</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LeagueOfLegendsImpl extends MinimalEObjectImpl.Container implements LeagueOfLegends {
	/**
	 * The cached value of the '{@link #getChampions() <em>Champions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChampions()
	 * @generated
	 * @ordered
	 */
	protected EList<Champion> champions;

	/**
	 * The cached value of the '{@link #getLeagues() <em>Leagues</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeagues()
	 * @generated
	 * @ordered
	 */
	protected EList<League> leagues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeagueOfLegendsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LeagueOfLegendsPackage.Literals.LEAGUE_OF_LEGENDS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Champion> getChampions() {
		if (champions == null) {
			champions = new EObjectContainmentWithInverseEList<Champion>(Champion.class, this, LeagueOfLegendsPackage.LEAGUE_OF_LEGENDS__CHAMPIONS, LeagueOfLegendsPackage.CHAMPION__LEAGUE_OF_LEGENDS);
		}
		return champions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<League> getLeagues() {
		if (leagues == null) {
			leagues = new EObjectContainmentWithInverseEList<League>(League.class, this, LeagueOfLegendsPackage.LEAGUE_OF_LEGENDS__LEAGUES, LeagueOfLegendsPackage.LEAGUE__LEAGUE_OF_LEGENDS);
		}
		return leagues;
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
			case LeagueOfLegendsPackage.LEAGUE_OF_LEGENDS__CHAMPIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChampions()).basicAdd(otherEnd, msgs);
			case LeagueOfLegendsPackage.LEAGUE_OF_LEGENDS__LEAGUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLeagues()).basicAdd(otherEnd, msgs);
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
			case LeagueOfLegendsPackage.LEAGUE_OF_LEGENDS__CHAMPIONS:
				return ((InternalEList<?>)getChampions()).basicRemove(otherEnd, msgs);
			case LeagueOfLegendsPackage.LEAGUE_OF_LEGENDS__LEAGUES:
				return ((InternalEList<?>)getLeagues()).basicRemove(otherEnd, msgs);
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
			case LeagueOfLegendsPackage.LEAGUE_OF_LEGENDS__CHAMPIONS:
				return getChampions();
			case LeagueOfLegendsPackage.LEAGUE_OF_LEGENDS__LEAGUES:
				return getLeagues();
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
			case LeagueOfLegendsPackage.LEAGUE_OF_LEGENDS__CHAMPIONS:
				getChampions().clear();
				getChampions().addAll((Collection<? extends Champion>)newValue);
				return;
			case LeagueOfLegendsPackage.LEAGUE_OF_LEGENDS__LEAGUES:
				getLeagues().clear();
				getLeagues().addAll((Collection<? extends League>)newValue);
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
			case LeagueOfLegendsPackage.LEAGUE_OF_LEGENDS__CHAMPIONS:
				getChampions().clear();
				return;
			case LeagueOfLegendsPackage.LEAGUE_OF_LEGENDS__LEAGUES:
				getLeagues().clear();
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
			case LeagueOfLegendsPackage.LEAGUE_OF_LEGENDS__CHAMPIONS:
				return champions != null && !champions.isEmpty();
			case LeagueOfLegendsPackage.LEAGUE_OF_LEGENDS__LEAGUES:
				return leagues != null && !leagues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LeagueOfLegendsImpl
