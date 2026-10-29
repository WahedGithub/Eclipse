package com.Test.Utility;

import java.util.ArrayList;

import com.excel.utility.Xls_Reader;

public class TestUtil {
		static Xls_Reader reader;


	public static ArrayList<Object[]> getDataFromExcel() {
		
		ArrayList<Object[]> myData= new ArrayList<Object[]>();
		try {
			reader=new Xls_Reader("D://Eclispe//Selenium_Data.xlsx");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		for(int rowNum=2; rowNum<= reader.getRowCount("TestNG_Data"); rowNum++) {
			
			String FirstName= reader.getCellData("TestNG_Data",  "FirstName", rowNum);
			String LastName= reader.getCellData("TestNG_Data", "LastName", rowNum);
			String Email= reader.getCellData("TestNG_Data", "Email", rowNum);
			String Password=	reader.getCellData("TestNG_Data", "Password", rowNum);
			
			Object ob[]= {FirstName, LastName, Email, Password};
			myData.add(ob);
	}
		return myData;
}
}
