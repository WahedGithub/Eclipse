package AuthenticationPopups;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopups {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		
		//http://username:password@url.com --> this is using webdriver method to insert the username and password
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String title= driver.findElement(By.cssSelector("p")).getText();
		
		System.out.println(title);

	}

}
