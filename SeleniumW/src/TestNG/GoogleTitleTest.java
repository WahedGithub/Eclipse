package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {

WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	
	@Test
	public void googleTitleTest() {
		String title= driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Google", "title is not matched");
	}
	
	@Test(priority=2, groups="Logo")
	public void googlelogo() {
		boolean b=driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/img[1]")).isDisplayed();
		Assert.assertTrue(b);
	//	Assert.assertEquals(b, true);
	}
	@AfterMethod
	public void tearDown() {
	driver.quit();
}
}