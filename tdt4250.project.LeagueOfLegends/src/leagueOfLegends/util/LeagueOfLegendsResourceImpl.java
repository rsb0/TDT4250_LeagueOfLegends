/**
 */
package leagueOfLegends.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import leagueOfLegends.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;



/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see leagueOfLegends.util.LeagueOfLegendsResourceFactoryImpl
 * @generated
 */
public class LeagueOfLegendsResourceImpl extends XMIResourceImpl {
	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated
	 */
	public LeagueOfLegendsResourceImpl(URI uri) {
		super(uri);
	}
	
	public static void main(String[] args) throws IOException {
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("LeagueOfLegends", new LeagueOfLegendsResourceFactoryImpl());
		Resource leagueResource = resSet.createResource(URI.createURI("assets\\league.LeagueOfLegends"));
		
		//Create all model EClass instances needed (League, teams etc)
		
		League league = LeagueOfLegendsCreationUtils.createLeague();
		leagueResource.getContents().add(league);
		
		Map<String, Game> games = new HashMap<String, Game>();
		Map<String, Team> teams = new HashMap<String, Team>();
		Map<String, Season> seasons = new HashMap<String, Season>();
		
		
		//Season season = LeagueOfLegendsCreationUtils.createSeason(splitName)
		
		//Loop over csv content, and put it into correct instances
		
		String rowString;
		BufferedReader csvReader;
		try {
			csvReader = new BufferedReader(new FileReader("assets\\EULCS-2018_split_2.csv"));
			boolean hasReadFirstLine = false;
			while ((rowString = csvReader.readLine()) != null) {
				if(!hasReadFirstLine) {
					hasReadFirstLine = true;
					continue;
				}
				String[] rowData = rowString.split("\n");
				for (String row: rowData) {
					String[] cellData = row.split(",");
					
					//Handle season
					
					
					//Handle game
					if(!games.containsKey(cellData[0])) {
						games.put(cellData[0], LeagueOfLegendsCreationUtils.createGame(cellData[0]));
					}
					Game game = games.get(cellData[0]);
					
					//Handle teams
					
					if(!teams.containsKey(cellData[10])){
						teams.put(cellData[10], LeagueOfLegendsCreationUtils.createTeam(cellData[10], league));
					}
					Team team = teams.get(cellData[10]);
					if(cellData[7].equals("Blue")) {
						game.setBlueTeam(teams.get(cellData[10]));
					}
					else {
						game.setRedTeam(teams.get(cellData[10]));
					}
					
					//Handle player
					Optional<Player> result = team.getPlayer().stream().filter(x -> x.getName().equals(cellData[9])).findAny();
					if(!result.isPresent() && !cellData[9].equals("Team")) {
						team.getPlayer().add(LeagueOfLegendsCreationUtils.createPlayer(cellData[9]));
					}
				}
			}
			csvReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			File file = new File("assets\\league.xmi");
			FileOutputStream fop = new FileOutputStream(file);
			if (!file.exists()) {
				file.createNewFile();
			}
			leagueResource.save(fop, null);
			fop.flush();
			fop.close();
			
		} catch (Exception e) {
			System.out.println("Encountered error: " + e);
		}
		
	}

	
	

} //LeagueOfLegendsResourceImpl
