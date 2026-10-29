package HandlingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver=new FirefoxDriver();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.formsite.com/templates/order-form-templates/scheduling-form/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='q13']/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html[1]/body[1]/p[1]/input[1]")).click();
		
		WebDriverWait mywait= new WebDriverWait(driver, Duration.ofSeconds(10));
	
		Select y= new Select(driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[2]")));
		y.selectByVisibleText("2020");
		
	
		//Future Month & Date i=6 is because its current june month so after june we have 6 more months in that particular year
		// if its November month than i=1 it should come
		/*for(int i=6; i>=1; i--) {
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			
			String m=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/select[1]")).getText();
			if(m.equalsIgnoreCase("Sep")) {
				driver.findElement(By.linkText("28")).click();
				break;
			}*/
			
		//Past Month & Date here again its starting from june so before june we have 5 months
		for(int i=5; i>=1; i++) {
				driver.findElement(By.xpath("//span[contains(text(),'Previous')]")).click();
				
				String m=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/select[1]")).getText();
				if(m.equalsIgnoreCase("February")) {
					driver.findElement(By.linkText("14")).click();
					break;
				}
		}
	}

}
