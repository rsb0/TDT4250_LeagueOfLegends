package tdt4250.project.LeagueOfLegends.util;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {

	public static void main(String[] args) {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet();
		
		Map<String, Object[]> data = new TreeMap<String, Object[]>();
		data.put("0", new Object[] {"navn", "adresse", "nummer"});
		data.put("1", new Object[] {"Rune", "veivei 1", 12345678});
		data.put("2", new Object[] {"Enur", "veivei 2", 87654321});
		
		Set<String> keyset = data.keySet();
		int rownum = 0;
		for (String key : keyset) {
			Row row = sheet.createRow(rownum++);
			Object[] objArr = data.get(key);
			int cellNum = 0;
			for (Object obj: objArr) {
				Cell cell = row.createCell(cellNum++);
				if(obj instanceof String) {
					cell.setCellValue((String)obj);					
				}
				if(obj instanceof Integer) {
					cell.setCellValue((Integer)obj); 
				}
			}
		}
		
		try {
			FileOutputStream out = new FileOutputStream(new File("C:\\Users\\Rune_\\Desktop\\demosheet.xlsx"));
			workbook.write(out);
			out.close();
			workbook.close();
			System.out.println("succsessfull write to disk");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
