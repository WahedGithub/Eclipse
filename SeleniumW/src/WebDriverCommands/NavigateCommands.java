package WebDriverCommands;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateCommands {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		driver.close();
	}

}
