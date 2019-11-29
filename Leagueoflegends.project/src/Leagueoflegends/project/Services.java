package Leagueoflegends.project;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;

import org.osgi.framework.Bundle;

import leagueOfLegends.Champion;
import leagueOfLegends.League;
import leagueOfLegends.Player;
import leagueOfLegends.Team;

import java.net.URL;
import java.nio.file.Files;
import java.io.File;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
	public String getTeamImage(Team team) {
		Bundle bundle = Platform.getBundle(Activator.PLUGIN_ID);
		String imageName = (team.getName().replaceAll(" ", "") + ".png").toLowerCase();
		
		//Path imagePath = new Path("/Leagueoflegends.project/Teams/" + imageName);
		String finalPath = "/Leagueoflegends.project/Teams/" + imageName;
		if(finalPath.equals("/Leagueoflegends.project/Teams/giantsgaming.png")) {
			return "/Leagueoflegends.project/Teams/giantsgaming.png";
		}
		else if(finalPath.equals("/Leagueoflegends.project/Teams/unicornsoflove.png")) {
			return "/Leagueoflegends.project/Teams/HELLO.png";
		}
		else {
		return finalPath;
		}
	}
	
	public String getPositionImage(Player player) {
		Bundle bundle = Platform.getBundle(Activator.PLUGIN_ID);
		
		String imageName = (player.getPosition().toString()).replaceAll(" ", "") + ".png";
		Path imagePath = new Path("Possitiones/" + imageName);
		URL imageURL = FileLocator.find(bundle, imagePath, null);
		System.out.println(imageName);
		
		if (imageURL != null) {
			return "/Leagueoflegends.project/" + imagePath.toString();
		}
		return "/Leagueoflegends.project/Possitiones/middle.png";
	}
	
	public String getLeagueImage(League league) {
		
		// Note this is actually overkill, as we only have one league, but if expanded it could show more league, and the function is ready
		Bundle bundle = Platform.getBundle(Activator.PLUGIN_ID);
		
		String imageName = league.getName().replaceAll(" ", "") + ".png";
		Path imagePath = new Path("Leagues/" + imageName);
		URL imageURL = FileLocator.find(bundle, imagePath, null);
		System.out.println(imageName + "is the league");
		
		if (imageURL != null) {
			return "/Leagueoflegends.project/" + imagePath.toString();
		}
		return "/Leagueoflegends.project/Leagues/EULCS.png";
	}
	
	public String getPlayerImage(Player player) {
		Bundle bundle = Platform.getBundle(Activator.PLUGIN_ID);
		
		String imageName = player.getName().replaceAll(" ", "") + ".jpg";
		Path imagePath = new Path("Players/" + imageName);
		URL imageURL = FileLocator.find(bundle, imagePath, null);
		
		if (imageURL != null) {
			return "/Leagueoflegends.project/" + imagePath.toString();
		}
		else {
			String imageName2 = player.getName().replaceAll(" ", "") + ".png";
    		Path imagePath2 = new Path("Players/" + imageName2);
    		URL imageURL2 = FileLocator.find(bundle, imagePath2, null);
    		
    		if(imageURL2 != null) {
    			return "/Leagueoflegends.project/" + imagePath2.toString();
    		}
    		else {
    			return "/Leagueoflegends.project/Players/steelback.jpg";
    		}
		}
		
	}
	
	public String getChampionImage(Champion champion) {
		
		Bundle bundle = Platform.getBundle(Activator.PLUGIN_ID);
	
		String[] replacements = {" ", "'"};
		String imageName = champion.getName() + "Square.png";
		for(int i =0 ; i<replacements.length; i++) {
			imageName = imageName.replaceAll(replacements[i], "_");
		}
		Path imagePath = new Path("Champions/" + imageName);
		URL imageURL = FileLocator.find(bundle, imagePath, null);
		
		if (imageURL != null) {
			return "/Leagueoflegends.project/" + imagePath.toString();
		}
		else {
			String imageName2 =imageName.replaceAll("_", "");
			
			Path imagePath2 = imagePath = new Path("Champions/" + imageName2);
    		URL imageURL2 = imageURL = FileLocator.find(bundle, imagePath, null);
    		if (imageURL2 != null) {
    			return "/Leagueoflegends.project/" + imagePath.toString();
    		}
    		else if(imageName2.equals("Dr.MundoSquare.png")) {
    			return "Leagueoflegends.project/Champions/DrMundoSquare.png";
    		}
    		System.out.println(imageName2);
		}
		
		
		return "Leagueoflegends.project/Champions/DrMundoSquare.png";
		
	}
		
    
    
}
