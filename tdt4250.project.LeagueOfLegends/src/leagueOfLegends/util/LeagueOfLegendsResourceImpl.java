/**
 */
package leagueOfLegends.util;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import leagueOfLegends.League;
import leagueOfLegends.LeagueOfLegendsFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;



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
		League league = LeagueOfLegendsFactory.eINSTANCE.createLeague();
		league.setName("Testing league");
		leagueResource.getContents().add(league);
		//DO stuff
		
		String rowString;
		BufferedReader csvReader;
		try {
			csvReader = new BufferedReader(new FileReader("assets\\EULCS-2018_split_2_small.csv"));
			while ((rowString = csvReader.readLine()) != null) {
				String[] rowData = rowString.split("\n");
				for (String row: rowData) {
					String str = "";
					String[] cellData = row.split(",");
					for (String cell : cellData) {
						str += cell + "\t";
					}
					System.out.println(str);
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
