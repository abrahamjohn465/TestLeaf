package week5.assignment.workout;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] Readdata( String fname, String sheetname) throws IOException {
		
		XSSFWorkbook wb=new XSSFWorkbook("./data/"+fname+".xlsx");
		XSSFSheet sh = wb.getSheet(sheetname);
		
		int rowcount = sh.getLastRowNum();
		
		int columncount = sh.getRow(0).getLastCellNum();
		
		String[][] data=new String[rowcount][columncount];
		
	   for (int i = 1; i <=rowcount; i++) {
		
		    for (int j = 0; j <columncount; j++) {
		    	//String stringCellValue = sh.getRow(i).getCell(columncount-1).getStringCellValue();
		    	
			
			data[i-1][j]= sh.getRow(i).getCell(j).getStringCellValue();
			
			
			
		}
		
	}
		
		
		
    wb.close();
    return data;
	}
	

}
