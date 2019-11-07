package tdt4250.project.LeagueOfLegends.csvEditing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCsv {
	public static void main(String[] args) {
		String rowString;
		BufferedReader csvReader;
		try {
			csvReader = new BufferedReader(new FileReader("assets\\EULCS-2018_split_2_small.csv"));
			while ((rowString = csvReader.readLine()) != null) {
				String[] rowData = rowString.split("\n");
				String str = "";
				for(String row : rowData) {
					String[] cellData = row.split(",");
					for(String cell : cellData) {
						str += cell + "\t";
					}
				}
				System.out.println(str);
			}
			csvReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
