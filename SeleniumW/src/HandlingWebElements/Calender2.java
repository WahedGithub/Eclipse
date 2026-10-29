package HandlingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		Thread.sleep(3000);
		driver.findElement(By.id("datepicker")).click();
		
		//Future date 
		/*for (int i=6; i>=1; i--)
		{
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
			
			String m= driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]")).getText();
			
			if(m.equalsIgnoreCase("December 2023")) {
				driver.findElement(By.linkText("15")).click();
				break;
			}
		}*/
		
		//Past Date
		for (int i=5; i>=1; i++)
		{
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
			
			String m= driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]")).getText();
			
			if(m.equalsIgnoreCase("March 2023")) {
				driver.findElement(By.linkText("31")).click();
				break;
	}
	

}
	}
}
