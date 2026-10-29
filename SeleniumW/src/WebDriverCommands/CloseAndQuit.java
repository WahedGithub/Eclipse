package WebDriverCommands;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseAndQuit {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(2000);
		//driver.close(); closes only single window/tab
		driver.quit(); //close the browser with whatever number of tabs are open
	}

}
