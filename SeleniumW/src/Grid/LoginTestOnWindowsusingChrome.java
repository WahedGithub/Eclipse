package Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class LoginTestOnWindowsusingChrome {

	WebDriver driver;
	
	@Test(priority=1)
	void setUp() throws MalformedURLException
	{
		String nodeURL= "http://192.168.0.86:5555/wd/hub";
		
		ChromeOptions options = new ChromeOptions();
		//DesiredCapabilities cap= DesiredCapabilities.chrome();
		options.setBrowserVersion("chrome");
		options.setPlatformName("Platform.WIN11");
		
		driver=new RemoteWebDriver( new URL(nodeURL), options);
	}
	
	@Test(priority=2)
	void login()
	{
		driver.get("https://practice.automationtesting.in/my-account/");
		
		driver.findElement(By.id("username")).sendKeys("pavanoltraining");
		driver.findElement(By.id("password")).sendKeys("Test@selenium123");
		driver.findElement(By.name("login")).click();
		
		String captext=driver.findElement(By.xpath("//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-36']/div[1]/div[1]/div[1]/p[1]")).getText();
		
		if(captext.contains("pavanoltraining")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		driver.close();
	}
	
}
