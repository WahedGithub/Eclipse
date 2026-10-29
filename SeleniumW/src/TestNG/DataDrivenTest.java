package TestNG;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Test.Utility.TestUtil;

public class DataDrivenTest {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://signup.ebay.com/pa/crte?usage=2943");
		
		Thread.sleep(20000);
	}
	
	@DataProvider
	public Iterator<Object[]>getTestData() {
		ArrayList<Object[]> testData = TestUtil.getDataFromExcel();
		return testData.iterator();
	}
	
	@Test(dataProvider="getTestData")
	public void halfEbayRegPageTest(String firstName, String lastName, String email, String password) throws InterruptedException {
		//enter Data:
		driver.findElement(By.xpath("//input[@id='firstname']")).clear();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstName);
		
		driver.findElement(By.xpath("//input[@id='lastname']")).clear();
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastName);
		
		driver.findElement(By.xpath("//input[@id='Email']")).clear();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		
		Thread.sleep(2000);
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
