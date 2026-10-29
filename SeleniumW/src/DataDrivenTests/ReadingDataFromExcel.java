package DataDrivenTests;

import java.io.FileInputStream;
import java.io.IOException;

//import org.apache.poi.xssf.usermodel.XSSFWorkbook; // this will target to just specific (XSSFWorkbook class)
import org.apache.poi.xssf.usermodel.*; // this will import all the files from usermodel this is kind of generic

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file =new FileInputStream("D://Eclispe//Selenium_Data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1"); // providing sheet name
		

		//XSSFSheet sheet = workbook.getSheetAt(0); // for providing index value.
		
		int rowcount = sheet.getLastRowNum(); // returns the row count
		
		int colcount= sheet.getRow(0).getLastCellNum(); // returns column/cell count
		
		for(int i=0; i<=rowcount; i++)
		{
			XSSFRow currentrow= sheet.getRow(i); //focus on current row
			
			for( int j=0; j<colcount; j++)
			{
				String value= currentrow.getCell(j).toString(); // read the value from a cell assign tostring() as this is the generic one
				System.out.print(" " + value);
			}
			System.out.println();
			
		}

}
}
