package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCommands {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(2000);
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		
		//statement can be spilt into multiple lines as below
		System.out.println(driver.findElement(By.xpath
				("/html[1]/body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]"
						+ "/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr"
						+ "[2]/td[3]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/font[1]/b[1]")).getText());
		Thread.sleep(3000);
		//driver.close(); // close only the current window
		driver.quit(); // closes multiple windows
	
	}
}
