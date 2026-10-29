package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ConditionalCommands {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.xpath(".//*[@id='email']"));
		WebElement password = driver.findElement(By.xpath(".//*[@id='pass']"));
		
		if(email.isDisplayed() && email.isEnabled())
		{
			email.sendKeys("abcd@gmail.com");
		}
		Thread.sleep(2000);
		if(password.isDisplayed() && password.isEnabled())
		{
			password.sendKeys("12345");
		}
		
		

	}

}
