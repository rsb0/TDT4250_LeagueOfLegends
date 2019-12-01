/**
 */
package leagueOfLegends;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>League Stats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link leagueOfLegends.LeagueStats#getLeague <em>League</em>}</li>
 *   <li>{@link leagueOfLegends.LeagueStats#getKills <em>Kills</em>}</li>
 *   <li>{@link leagueOfLegends.LeagueStats#getDeaths <em>Deaths</em>}</li>
 *   <li>{@link leagueOfLegends.LeagueStats#getAssists <em>Assists</em>}</li>
 *   <li>{@link leagueOfLegends.LeagueStats#getPlayerWithMostKills <em>Player With Most Kills</em>}</li>
 *   <li>{@link leagueOfLegends.LeagueStats#getPlayerWithMostDeaths <em>Player With Most Deaths</em>}</li>
 *   <li>{@link leagueOfLegends.LeagueStats#getPlayerWithMostAssists <em>Player With Most Assists</em>}</li>
 *   <li>{@link leagueOfLegends.LeagueStats#getPlayerWithHighestKda <em>Player With Highest Kda</em>}</li>
 *   <li>{@link leagueOfLegends.LeagueStats#getChampionWithMostKills <em>Champion With Most Kills</em>}</li>
 *   <li>{@link leagueOfLegends.LeagueStats#getChampionWithMostDeaths <em>Champion With Most Deaths</em>}</li>
 *   <li>{@link leagueOfLegends.LeagueStats#getChampionWithMostAssists <em>Champion With Most Assists</em>}</li>
 *   <li>{@link leagueOfLegends.LeagueStats#getChampionWithHighestKda <em>Champion With Highest Kda</em>}</li>
 *   <li>{@link leagueOfLegends.LeagueStats#getMostBannedChampion <em>Most Banned Champion</em>}</li>
 *   <li>{@link leagueOfLegends.LeagueStats#getLeastBannedChampion <em>Least Banned Champion</em>}</li>
 * </ul>
 *
 * @see leagueOfLegends.LeagueOfLegendsPackage#getLeagueStats()
 * @model
 * @generated
 */
public interface LeagueStats extends EObject {
	/**
	 * Returns the value of the '<em><b>League</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link leagueOfLegends.League#getLeagueStats <em>League Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>League</em>' container reference.
	 * @see #setLeague(League)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getLeagueStats_League()
	 * @see leagueOfLegends.League#getLeagueStats
	 * @model opposite="leagueStats" required="true" transient="false"
	 * @generated
	 */
	League getLeague();

	/**
	 * Sets the value of the '{@link leagueOfLegends.LeagueStats#getLeague <em>League</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>League</em>' container reference.
	 * @see #getLeague()
	 * @generated
	 */
	void setLeague(League value);

	/**
	 * Returns the value of the '<em><b>Kills</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kills</em>' attribute.
	 * @see #setKills(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getLeagueStats_Kills()
	 * @model
	 * @generated
	 */
	int getKills();

	/**
	 * Sets the value of the '{@link leagueOfLegends.LeagueStats#getKills <em>Kills</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kills</em>' attribute.
	 * @see #getKills()
	 * @generated
	 */
	void setKills(int value);

	/**
	 * Returns the value of the '<em><b>Deaths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deaths</em>' attribute.
	 * @see #setDeaths(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getLeagueStats_Deaths()
	 * @model
	 * @generated
	 */
	int getDeaths();

	/**
	 * Sets the value of the '{@link leagueOfLegends.LeagueStats#getDeaths <em>Deaths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deaths</em>' attribute.
	 * @see #getDeaths()
	 * @generated
	 */
	void setDeaths(int value);

	/**
	 * Returns the value of the '<em><b>Assists</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assists</em>' attribute.
	 * @see #setAssists(int)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getLeagueStats_Assists()
	 * @model
	 * @generated
	 */
	int getAssists();

	/**
	 * Sets the value of the '{@link leagueOfLegends.LeagueStats#getAssists <em>Assists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assists</em>' attribute.
	 * @see #getAssists()
	 * @generated
	 */
	void setAssists(int value);

	/**
	 * Returns the value of the '<em><b>Player With Most Kills</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player With Most Kills</em>' reference.
	 * @see #setPlayerWithMostKills(Player)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getLeagueStats_PlayerWithMostKills()
	 * @model
	 * @generated
	 */
	Player getPlayerWithMostKills();

	/**
	 * Sets the value of the '{@link leagueOfLegends.LeagueStats#getPlayerWithMostKills <em>Player With Most Kills</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player With Most Kills</em>' reference.
	 * @see #getPlayerWithMostKills()
	 * @generated
	 */
	void setPlayerWithMostKills(Player value);

	/**
	 * Returns the value of the '<em><b>Player With Most Deaths</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player With Most Deaths</em>' reference.
	 * @see #setPlayerWithMostDeaths(Player)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getLeagueStats_PlayerWithMostDeaths()
	 * @model
	 * @generated
	 */
	Player getPlayerWithMostDeaths();

	/**
	 * Sets the value of the '{@link leagueOfLegends.LeagueStats#getPlayerWithMostDeaths <em>Player With Most Deaths</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player With Most Deaths</em>' reference.
	 * @see #getPlayerWithMostDeaths()
	 * @generated
	 */
	void setPlayerWithMostDeaths(Player value);

	/**
	 * Returns the value of the '<em><b>Player With Most Assists</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player With Most Assists</em>' reference.
	 * @see #setPlayerWithMostAssists(Player)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getLeagueStats_PlayerWithMostAssists()
	 * @model
	 * @generated
	 */
	Player getPlayerWithMostAssists();

	/**
	 * Sets the value of the '{@link leagueOfLegends.LeagueStats#getPlayerWithMostAssists <em>Player With Most Assists</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player With Most Assists</em>' reference.
	 * @see #getPlayerWithMostAssists()
	 * @generated
	 */
	void setPlayerWithMostAssists(Player value);

	/**
	 * Returns the value of the '<em><b>Player With Highest Kda</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player With Highest Kda</em>' reference.
	 * @see #setPlayerWithHighestKda(Player)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getLeagueStats_PlayerWithHighestKda()
	 * @model
	 * @generated
	 */
	Player getPlayerWithHighestKda();

	/**
	 * Sets the value of the '{@link leagueOfLegends.LeagueStats#getPlayerWithHighestKda <em>Player With Highest Kda</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player With Highest Kda</em>' reference.
	 * @see #getPlayerWithHighestKda()
	 * @generated
	 */
	void setPlayerWithHighestKda(Player value);

	/**
	 * Returns the value of the '<em><b>Champion With Most Kills</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Champion With Most Kills</em>' reference.
	 * @see #setChampionWithMostKills(Champion)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getLeagueStats_ChampionWithMostKills()
	 * @model
	 * @generated
	 */
	Champion getChampionWithMostKills();

	/**
	 * Sets the value of the '{@link leagueOfLegends.LeagueStats#getChampionWithMostKills <em>Champion With Most Kills</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Champion With Most Kills</em>' reference.
	 * @see #getChampionWithMostKills()
	 * @generated
	 */
	void setChampionWithMostKills(Champion value);

	/**
	 * Returns the value of the '<em><b>Champion With Most Deaths</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Champion With Most Deaths</em>' reference.
	 * @see #setChampionWithMostDeaths(Champion)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getLeagueStats_ChampionWithMostDeaths()
	 * @model
	 * @generated
	 */
	Champion getChampionWithMostDeaths();

	/**
	 * Sets the value of the '{@link leagueOfLegends.LeagueStats#getChampionWithMostDeaths <em>Champion With Most Deaths</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Champion With Most Deaths</em>' reference.
	 * @see #getChampionWithMostDeaths()
	 * @generated
	 */
	void setChampionWithMostDeaths(Champion value);

	/**
	 * Returns the value of the '<em><b>Champion With Most Assists</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Champion With Most Assists</em>' reference.
	 * @see #setChampionWithMostAssists(Champion)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getLeagueStats_ChampionWithMostAssists()
	 * @model
	 * @generated
	 */
	Champion getChampionWithMostAssists();

	/**
	 * Sets the value of the '{@link leagueOfLegends.LeagueStats#getChampionWithMostAssists <em>Champion With Most Assists</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Champion With Most Assists</em>' reference.
	 * @see #getChampionWithMostAssists()
	 * @generated
	 */
	void setChampionWithMostAssists(Champion value);

	/**
	 * Returns the value of the '<em><b>Champion With Highest Kda</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Champion With Highest Kda</em>' reference.
	 * @see #setChampionWithHighestKda(Champion)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getLeagueStats_ChampionWithHighestKda()
	 * @model
	 * @generated
	 */
	Champion getChampionWithHighestKda();

	/**
	 * Sets the value of the '{@link leagueOfLegends.LeagueStats#getChampionWithHighestKda <em>Champion With Highest Kda</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Champion With Highest Kda</em>' reference.
	 * @see #getChampionWithHighestKda()
	 * @generated
	 */
	void setChampionWithHighestKda(Champion value);

	/**
	 * Returns the value of the '<em><b>Most Banned Champion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Most Banned Champion</em>' reference.
	 * @see #setMostBannedChampion(Champion)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getLeagueStats_MostBannedChampion()
	 * @model required="true"
	 * @generated
	 */
	Champion getMostBannedChampion();

	/**
	 * Sets the value of the '{@link leagueOfLegends.LeagueStats#getMostBannedChampion <em>Most Banned Champion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Most Banned Champion</em>' reference.
	 * @see #getMostBannedChampion()
	 * @generated
	 */
	void setMostBannedChampion(Champion value);

	/**
	 * Returns the value of the '<em><b>Least Banned Champion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Least Banned Champion</em>' reference.
	 * @see #setLeastBannedChampion(Champion)
	 * @see leagueOfLegends.LeagueOfLegendsPackage#getLeagueStats_LeastBannedChampion()
	 * @model required="true"
	 * @generated
	 */
	Champion getLeastBannedChampion();

	/**
	 * Sets the value of the '{@link leagueOfLegends.LeagueStats#getLeastBannedChampion <em>Least Banned Champion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Least Banned Champion</em>' reference.
	 * @see #getLeastBannedChampion()
	 * @generated
	 */
	void setLeastBannedChampion(Champion value);

} // LeagueStats
