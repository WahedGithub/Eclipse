package DataDrivenTests;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		FileInputStream file = new FileInputStream("D://Eclispe//Selenium_Data.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("sheet3");
		
		//Get number of rows from sheet.
		int noOfRows= sheet.getLastRowNum();	
		
		System.out.println("No. of records in the excel sheet: " + noOfRows);
		
		//Get First row from the sheet
		for (int row =1; row<=noOfRows; row++) {
			XSSFRow currentrow= sheet.getRow(row);
			
			String Firstname= currentrow.getCell(0).toString();
			String Lastname= currentrow.getCell(1).toString();
			String Phone= currentrow.getCell(2).toString();
			String Email= currentrow.getCell(3).toString();
			String Address= currentrow.getCell(4).toString();
			String City= currentrow.getCell(5).toString();
			String State= currentrow.getCell(6).toString();
			String Pincode= currentrow.getCell(7).toString();
			String Country= currentrow.getCell(8).toString();
			String Username= currentrow.getCell(9).toString();
			String Password= currentrow.getCell(10).toString();
			
			//Registration Process
			driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
			
			//entering contact information
			driver.findElement(By.name("firstName")).sendKeys(Firstname);
			driver.findElement(By.name("lastName")).sendKeys(Lastname);
			driver.findElement(By.name("phone")).sendKeys(Phone);
			driver.findElement(By.name("userName")).sendKeys(Email);
			
			//entering mailing information
			driver.findElement(By.name("address1")).sendKeys(Address);
			driver.findElement(By.name("city")).sendKeys(City);
			driver.findElement(By.name("state")).sendKeys(State);
			driver.findElement(By.name("postalCode")).sendKeys(Pincode);
			
			Thread.sleep(3000);
			
			//Country Selection using dropdown
			Select dropcountry = new Select(driver.findElement(By.name("country")));
			dropcountry.selectByVisibleText(Country);
			
			//Entering user Information
			
			driver.findElement(By.name("email")).sendKeys(Username); //user
			driver.findElement(By.name("password")).sendKeys(Password);
			driver.findElement(By.name("confirmPassword")).sendKeys(Password);
			
			//submitting the form
			driver.findElement(By.name("submit")).click();
			
			Thread.sleep(10000);
			if (driver.getPageSource().contains("Thank you for registering.")) {
				System.out.println("Registration Completed for "+ row +" record");
			}
				else
				{
					System.out.println("Registration Failed for " + row + " record");
					//driver.close();
				}
			Thread.sleep(4000);
			
			}
		}
	}

