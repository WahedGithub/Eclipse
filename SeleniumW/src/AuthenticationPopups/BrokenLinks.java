package AuthenticationPopups;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		
		Thread.sleep(5000);
		
		//capture links from a webpage
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		//Number of links
		System.out.println(links.size());
		int bl=0, vl=0;
		for(int i=0; i<=links.size(); i++) {
			
			//by using href attribute we can get the URL of required link
			
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			
			//we can use URL class to get the URL's saved
			URL link = new URL(url);
			
			//create a connection using url object 'link'
			HttpURLConnection httpconn=(HttpURLConnection) link.openConnection();
			Thread.sleep(2000);
			//establish connection
			httpconn.connect();
			
			int respcode= httpconn.getResponseCode(); // returns response code if res code is above 400: broken link
			
		
			if(respcode>=400)
			{
				System.out.println(url + " - " + "is broken link");
				bl= bl+1;
			}
			else {
				System.out.println(url + " - " + "is valid link");
				vl=vl+1;
			}
			
		}
		System.out.println(bl + "Broken Links count & Valid Links count:" + vl);

	}

}
