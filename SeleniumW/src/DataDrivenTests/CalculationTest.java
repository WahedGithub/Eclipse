package DataDrivenTests;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalculationTest {

	public static void main(String[] args) throws IOException, InterruptedException {
WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BS001.html");
		driver.manage().window().maximize();
		FileInputStream file = new FileInputStream("D://Eclispe//Selenium_Data.xlsx");
		
		Thread.sleep(4000);
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet4");
		
		int rowcount = sheet.getLastRowNum();
		
		for(int i =1; i<=rowcount; i++) {
			XSSFRow row=sheet.getRow(i);
			
			//this below lines are giving type casting error need to check
			//XSSFCell principlecell = row.getCell(0);
			//int princ=(int)principlecell.getNumericCellValue(); // type casting
			
			
			int princ=(int)row.getCell(0).getNumericCellValue(); // type casting one liner
			int roi = (int)row.getCell(1).getNumericCellValue();
			int per=(int)row.getCell(2).getNumericCellValue();
			String Freq= row.getCell(3).getStringCellValue();
			int Exp_value=(int)row.getCell(4).getNumericCellValue();
			
			
			driver.findElement(By.id("principal")).sendKeys(String.valueOf(princ));
			driver.findElement(By.id("interest")).sendKeys(String.valueOf(roi));
			driver.findElement(By.id("tenure")).sendKeys(String.valueOf(per));
			
			Select periodcombo=new Select(driver.findElement(By.id("tenurePeriod")));
			periodcombo.selectByVisibleText("year(s)");
			
			Select frequency=new Select (driver.findElement(By.id("frequency")));
				frequency.selectByVisibleText(Freq);
				
				driver.findElement(By.xpath("//body/div[@id='mc_mainWrapper']/div[2]/div[1]/div[4]/div[1]/div[1]/div[3]/form[1]/div[2]/a[1]/img[1]")).click();
				String actual_mvalue=driver.findElement(By.xpath("//span[@id='resp_matval']")).getText();
				
				
				if (Double.parseDouble(actual_mvalue)==Exp_value){
					System.out.println("Test Passed");
					
				}
				else {
					System.out.println("Test Failed");
					
					
					//driver.switchTo().alert().accept();
					
					
				}
				Thread.sleep(4000);
	driver.findElement(By.xpath("//body/div[@id='mc_mainWrapper']/div[2]/div[1]/div[4]/div[1]/div[1]/div[3]/form[1]/div[2]/a[2]/img[1]")).click();
	//driver.findElement(By.xpath("//img[class=PL5]")).clear();
		

	}
	}
}


