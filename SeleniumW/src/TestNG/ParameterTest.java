package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

	WebDriver driver;
	@Test
	@Parameters({"browser", "url", "emailId"})
	public void yahooLoginTest(String browser, String url, String emailId) {
		
		if(browser.equals("chrome"))
		{
		driver=new ChromeDriver();
		}
		else if(browser.equals("Firefox"))
		{
			driver= new FirefoxDriver();
		}
		driver.get(url);
		
		driver.findElement(By.name("username")).sendKeys("test@yahoo.com");
		
		driver.findElement(By.id("login-signin")).click();
	}
}
