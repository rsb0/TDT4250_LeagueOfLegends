/**
 */
package leagueOfLegends.impl;

import java.util.Collection;

import leagueOfLegends.BestOf;
import leagueOfLegends.Game;
import leagueOfLegends.LeagueOfLegendsPackage;
import leagueOfLegends.Match;

import leagueOfLegends.Team;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link leagueOfLegends.impl.MatchImpl#getGames <em>Games</em>}</li>
 *   <li>{@link leagueOfLegends.impl.MatchImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link leagueOfLegends.impl.MatchImpl#getMatchID <em>Match ID</em>}</li>
 *   <li>{@link leagueOfLegends.impl.MatchImpl#getBestOF <em>Best OF</em>}</li>
 *   <li>{@link leagueOfLegends.impl.MatchImpl#getScore <em>Score</em>}</li>
 *   <li>{@link leagueOfLegends.impl.MatchImpl#getTeams <em>Teams</em>}</li>
 *   <li>{@link leagueOfLegends.impl.MatchImpl#getWeek <em>Week</em>}</li>
 *   <li>{@link leagueOfLegends.impl.MatchImpl#getWinner <em>Winner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchImpl extends MinimalEObjectImpl.Container implements Match {
	/**
	 * The cached value of the '{@link #getGames() <em>Games</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGames()
	 * @generated
	 * @ordered
	 */
	protected EList<Game> games;

	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String displayName = DISPLAY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMatchID() <em>Match ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchID()
	 * @generated
	 * @ordered
	 */
	protected static final String MATCH_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMatchID() <em>Match ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchID()
	 * @generated
	 * @ordered
	 */
	protected String matchID = MATCH_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBestOF() <em>Best OF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBestOF()
	 * @generated
	 * @ordered
	 */
	protected static final BestOf BEST_OF_EDEFAULT = BestOf.QF;

	/**
	 * The cached value of the '{@link #getBestOF() <em>Best OF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBestOF()
	 * @generated
	 * @ordered
	 */
	protected BestOf bestOF = BEST_OF_EDEFAULT;

	/**
	 * The default value of the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected static final String SCORE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected String score = SCORE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTeams() <em>Teams</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeams()
	 * @generated
	 * @ordered
	 */
	protected EList<Team> teams;

	/**
	 * The default value of the '{@link #getWeek() <em>Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeek()
	 * @generated
	 * @ordered
	 */
	protected static final String WEEK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeek() <em>Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeek()
	 * @generated
	 * @ordered
	 */
	protected String week = WEEK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWinner() <em>Winner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinner()
	 * @generated
	 * @ordered
	 */
	protected Team winner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LeagueOfLegendsPackage.Literals.MATCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Game> getGames() {
		if (games == null) {
			games = new EObjectContainmentEList<Game>(Game.class, this, LeagueOfLegendsPackage.MATCH__GAMES);
		}
		return games;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.MATCH__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMatchID() {
		return matchID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMatchID(String newMatchID) {
		String oldMatchID = matchID;
		matchID = newMatchID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.MATCH__MATCH_ID, oldMatchID, matchID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BestOf getBestOF() {
		return bestOF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBestOF(BestOf newBestOF) {
		BestOf oldBestOF = bestOF;
		bestOF = newBestOF == null ? BEST_OF_EDEFAULT : newBestOF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.MATCH__BEST_OF, oldBestOF, bestOF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScore() {
		return score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScore(String newScore) {
		String oldScore = score;
		score = newScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.MATCH__SCORE, oldScore, score));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Team> getTeams() {
		if (teams == null) {
			teams = new EObjectResolvingEList<Team>(Team.class, this, LeagueOfLegendsPackage.MATCH__TEAMS);
		}
		return teams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWeek() {
		return week;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeek(String newWeek) {
		String oldWeek = week;
		week = newWeek;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.MATCH__WEEK, oldWeek, week));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Team getWinner() {
		if (winner != null && winner.eIsProxy()) {
			InternalEObject oldWinner = (InternalEObject)winner;
			winner = (Team)eResolveProxy(oldWinner);
			if (winner != oldWinner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeagueOfLegendsPackage.MATCH__WINNER, oldWinner, winner));
			}
		}
		return winner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team basicGetWinner() {
		return winner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWinner(Team newWinner) {
		Team oldWinner = winner;
		winner = newWinner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeagueOfLegendsPackage.MATCH__WINNER, oldWinner, winner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LeagueOfLegendsPackage.MATCH__GAMES:
				return ((InternalEList<?>)getGames()).basicRemove(otherEnd, msgs);
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
			case LeagueOfLegendsPackage.MATCH__GAMES:
				return getGames();
			case LeagueOfLegendsPackage.MATCH__DISPLAY_NAME:
				return getDisplayName();
			case LeagueOfLegendsPackage.MATCH__MATCH_ID:
				return getMatchID();
			case LeagueOfLegendsPackage.MATCH__BEST_OF:
				return getBestOF();
			case LeagueOfLegendsPackage.MATCH__SCORE:
				return getScore();
			case LeagueOfLegendsPackage.MATCH__TEAMS:
				return getTeams();
			case LeagueOfLegendsPackage.MATCH__WEEK:
				return getWeek();
			case LeagueOfLegendsPackage.MATCH__WINNER:
				if (resolve) return getWinner();
				return basicGetWinner();
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
			case LeagueOfLegendsPackage.MATCH__GAMES:
				getGames().clear();
				getGames().addAll((Collection<? extends Game>)newValue);
				return;
			case LeagueOfLegendsPackage.MATCH__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case LeagueOfLegendsPackage.MATCH__MATCH_ID:
				setMatchID((String)newValue);
				return;
			case LeagueOfLegendsPackage.MATCH__BEST_OF:
				setBestOF((BestOf)newValue);
				return;
			case LeagueOfLegendsPackage.MATCH__SCORE:
				setScore((String)newValue);
				return;
			case LeagueOfLegendsPackage.MATCH__TEAMS:
				getTeams().clear();
				getTeams().addAll((Collection<? extends Team>)newValue);
				return;
			case LeagueOfLegendsPackage.MATCH__WEEK:
				setWeek((String)newValue);
				return;
			case LeagueOfLegendsPackage.MATCH__WINNER:
				setWinner((Team)newValue);
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
			case LeagueOfLegendsPackage.MATCH__GAMES:
				getGames().clear();
				return;
			case LeagueOfLegendsPackage.MATCH__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.MATCH__MATCH_ID:
				setMatchID(MATCH_ID_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.MATCH__BEST_OF:
				setBestOF(BEST_OF_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.MATCH__SCORE:
				setScore(SCORE_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.MATCH__TEAMS:
				getTeams().clear();
				return;
			case LeagueOfLegendsPackage.MATCH__WEEK:
				setWeek(WEEK_EDEFAULT);
				return;
			case LeagueOfLegendsPackage.MATCH__WINNER:
				setWinner((Team)null);
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
			case LeagueOfLegendsPackage.MATCH__GAMES:
				return games != null && !games.isEmpty();
			case LeagueOfLegendsPackage.MATCH__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case LeagueOfLegendsPackage.MATCH__MATCH_ID:
				return MATCH_ID_EDEFAULT == null ? matchID != null : !MATCH_ID_EDEFAULT.equals(matchID);
			case LeagueOfLegendsPackage.MATCH__BEST_OF:
				return bestOF != BEST_OF_EDEFAULT;
			case LeagueOfLegendsPackage.MATCH__SCORE:
				return SCORE_EDEFAULT == null ? score != null : !SCORE_EDEFAULT.equals(score);
			case LeagueOfLegendsPackage.MATCH__TEAMS:
				return teams != null && !teams.isEmpty();
			case LeagueOfLegendsPackage.MATCH__WEEK:
				return WEEK_EDEFAULT == null ? week != null : !WEEK_EDEFAULT.equals(week);
			case LeagueOfLegendsPackage.MATCH__WINNER:
				return winner != null;
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
		result.append(" (DisplayName: ");
		result.append(displayName);
		result.append(", matchID: ");
		result.append(matchID);
		result.append(", bestOF: ");
		result.append(bestOF);
		result.append(", score: ");
		result.append(score);
		result.append(", week: ");
		result.append(week);
		result.append(')');
		return result.toString();
	}

} //MatchImpl
