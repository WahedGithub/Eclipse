package HashMap;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestHM {

	static HashMap <String, String>logindata()
	{
		HashMap <String, String> hm=new HashMap <String, String>();
		hm.put("x", "mercury@mercury");
		hm.put("y", "mercury1@mercury1");
		hm.put("z", "mercury2@mercury2");
		
		return hm;
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		String credentials= logindata().get("y");
		String arr[]= credentials.split("@"); //mercury mercury
		
		driver.findElement(By.name("userName")).sendKeys(arr[0]); // now we can access both the datatypes using index
		driver.findElement(By.name("password")).sendKeys(arr[1]);
		
		driver.findElement(By.name("submit")).click();
		
		//Validation
		if(driver.getTitle().equalsIgnoreCase("login: Mercury tours"))
		{
			System.out.println("Test is Passed");
		}
		else
		{
			System.out.println("Test is Failed");
		}
		Thread.sleep(3000);
		driver.findElement(By.linkText("Home")).click();
	}

}
