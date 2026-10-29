package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTestChrome {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("userName")).sendKeys("mercury");
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("mercury");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
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
		Thread.sleep(3000);
		driver.close(); // this will close the browser
	}

}
