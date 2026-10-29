package com.datadriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class DataDrivenTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://signup.ebay.com/pa/crte?usage=2943");
		
		Thread.sleep(20000);
		
		//Data Driven Approach(Parameterization)-->used to create data driven framework
		//get Test Data from excel:
		Xls_Reader reader= new Xls_Reader("D://Eclispe//Selenium_Data.xlsx");
		
		int rowCount=reader.getRowCount("TestNG_Data");
		
		reader.addColumn("TestNG_Data", "Status"); // here we are creating the column to get the status
		for(int rowNum=2; rowNum<= rowCount; rowNum++) {
		
		String FirstName= reader.getCellData("TestNG_Data",  "FirstName", rowNum);
		String LastName= reader.getCellData("TestNG_Data", "LastName", rowNum);
		String Email= reader.getCellData("TestNG_Data", "Email", rowNum);
		String Password=	reader.getCellData("TestNG_Data", "Password", rowNum);
			
		
		//enter Data:
		driver.findElement(By.xpath("//input[@id='firstname']")).clear();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(FirstName);
		
		driver.findElement(By.xpath("//input[@id='lastname']")).clear();
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(LastName);
		
		driver.findElement(By.xpath("//input[@id='Email']")).clear();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(Email);
		
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
		
		reader.setCellData("TestNG_Data", "Status", rowNum, "Pass"); // write data into Excel
		Thread.sleep(2000);
		}
		
	}

}
