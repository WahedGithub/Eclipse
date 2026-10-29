package WebDriverCommands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingWindows {

	public static void main(String[] args) {
WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Open New Tabbed Windows')]")).click();
		
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]")).click();

		//System.out.println(driver.getTitle());
		
		Set <String> s= driver.getWindowHandles(); // this will get the unique ID of the windws
		
		for (String i: s)
		{
			//System.out.println(i);
			String t= driver.switchTo().window(i).getTitle();
			//System.out.println(t);
			if(t.contains("Selenium")) {
				driver.close();
			}
		}
	}

}
