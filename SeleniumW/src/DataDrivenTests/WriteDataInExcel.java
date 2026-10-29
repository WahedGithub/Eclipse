package DataDrivenTests;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class WriteDataInExcel {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream("D://Eclispe//Selenium_Write_Data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Likhhhh");
		XSSFSheet sheet2=workbook.createSheet("Likhdiya");
		
		for(int i=1; i<=5; i++) {
			XSSFRow row=sheet.createRow(i);
			XSSFRow row1= sheet2.createRow(i);
			for(int j=0;j<=3;j++) {
				row.createCell(j).setCellValue("Abdul");
				row1.createCell(j).setCellValue("Wahed");
			}
		}
		
		workbook.write(file);
		file.close();
		
		System.out.print("Data Written into excel successfully");
	}

}
