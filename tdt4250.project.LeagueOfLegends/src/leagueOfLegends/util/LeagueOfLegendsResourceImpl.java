/**
 */
package leagueOfLegends.util;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

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
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ra", new LeagueOfLegendsResourceFactoryImpl());
		Resource leagueResource = resSet.createResource(URI.createURI("test.ra"));
		
		//DO stuff
		

        String csvFile = "/Users/mkyong/csv/country3.csv";

        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader(csvFile));
            String[] line;
            while ((line = reader.readNext()) != null) {
                System.out.println("Country [id= " + line[0] + ", code= " + line[1] + " , name=" + line[2] + "]");
            }
        } catch (CsvException e) {
            e.printStackTrace();
        }


		
		
		leagueResource.save(System.out, null);
	}

	
	

} //LeagueOfLegendsResourceImpl
