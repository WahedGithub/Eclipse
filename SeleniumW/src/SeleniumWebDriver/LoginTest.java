package SeleniumWebDriver;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		Logger logger = Logger.getLogger("LoginTest");
		//DOMConfigurator.configure("Log4j.xml");
		PropertyConfigurator.configure("Log4j.properties");
		
		WebDriver driver = new FirefoxDriver();
		
		logger.info("browser opened");
		driver.get("https://demo.guru99.com/test/newtours/");
		
		driver.manage().window().maximize();
		
		logger.info("Entering Credentials");
		driver.findElement(By.name("userName")).sendKeys("mercury");
		
		driver.findElement(By.name("password")).sendKeys("mercury");
		
		driver.findElement(By.name("submit")).click();
		
		String exp_title= "Login: Mercury Tours";
		
		String act_title= driver.getTitle();
		
		System.out.println(act_title);
		
		if(exp_title.equals(act_title)==true)
		{
			System.out.println("Test is Passed");
		}
		else
		{
			System.out.println("Test is Failed");
		}
		logger.info("Test completed");
		driver.close(); // this will close the browser
	}

}
