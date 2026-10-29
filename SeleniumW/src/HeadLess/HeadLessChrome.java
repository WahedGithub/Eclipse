package HeadLess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessChrome {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		ChromeOptions options = new ChromeOptions();
		//options.setHeadless(false);
		options.addArguments("--headless");
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		System.out.println("Title of the page:" + driver.getTitle());

	}

}
