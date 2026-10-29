package HeadLess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessFriefox {

	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		// ChromeOptions options = new ChromeOptions();
		FirefoxOptions options = new FirefoxOptions();
		options.setHeadless(false);
		options.addArguments("--headless");
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		System.out.println("Title of the page: " + driver.getTitle());

	}

}
