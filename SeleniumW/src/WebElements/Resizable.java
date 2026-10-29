package WebElements;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		WebElement resize= driver.findElement(By.xpath("//body/div[@id='resizable']/div[1]"));
		
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(resize).dragAndDropBy(resize, 100,250).build().perform();
		System.out.println("done");
	}

}
