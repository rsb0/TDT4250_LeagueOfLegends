package tdt4250.project.LeagueOfLegends.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {
	public static void main(String[] args) {
		File sheetFile = null;
		FileInputStream fis = null;
		int i = 0;
		try {
			sheetFile = new File("assets\\EULCS-2018_split_2.xlsx");
			fis = new FileInputStream(sheetFile);
			
			//create Workbook instance holding reference to xlsx file
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			
			
			//Get sheet from workbook
			XSSFSheet spreadSheet = workbook.getSheetAt(0);
			
			//Iterate through rows
			Iterator<Row> rowIterator = spreadSheet.iterator();
			while(i < 4) {
			//while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				String rowString = "";
				//iterate through cell in row
				Iterator<Cell> cellIterator = row.cellIterator();
				while (cellIterator.hasNext()) {
					
					Cell cell = cellIterator.next();
					//check cell type and use correct format
					switch(cell.getCellType()) 
					{
					case Cell.CELL_TYPE_NUMERIC:
						Double doubleValue = cell.getNumericCellValue();
						String stringValue = Double.toString(doubleValue);
						if (stringValue.contains(".")) {
							stringValue = stringValue.substring(0, stringValue.indexOf(".")) + stringValue.substring(stringValue.indexOf(".") + 1);
						}
						if (stringValue.contains("E")) {
							stringValue = stringValue.substring(0, stringValue.indexOf("E"));
						}
						rowString += stringValue + "\t";
						break;
					case Cell.CELL_TYPE_STRING:
						rowString += cell.getStringCellValue() + "\t";
						break;
					case Cell.CELL_TYPE_BOOLEAN:
						rowString += cell.getBooleanCellValue();
						break;
					case Cell.CELL_TYPE_BLANK:
						break;
					case Cell.CELL_TYPE_ERROR:
						break;
					case Cell.CELL_TYPE_FORMULA:
						break;
					}
				}
				rowString += "\n";
				System.out.println(rowString);
				i++;
			}
			fis.close();
			workbook.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
