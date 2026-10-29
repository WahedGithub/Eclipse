package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		/*WebDriver driver = new FirefoxDriver();
		driver1.get("https://www.google.com/");
		driver.get("https://www.youtube.com/watch?v=9Bt2F6pbiag");*/
		driver1.get("https://accounts.google.com/v3/signin/identifier?dsh=S-720386856%3A1686767703820490&continue=https%3A%2F%2Fwww.youtube.com%2Fsignin%3Faction_handle_signin%3Dtrue%26app%3Ddesktop%26hl%3Den%26next%3Dhttps%253A%252F%252Fwww.youtube.com%252F&ec=65620&ffgf=1&hl=en&ifkv=Af_xneE2TnJV9SjPe4CrLaXeqEgTqpe0T1LV9vOc5GzUlH-uOTet7-YZ9BFQlGqpyN6xOaOnnM8kxw&passive=true&service=youtube&uilel=3&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver1.findElement(By.id("identifierId")).sendKeys("Abcd@gmail.com");

	}

}
