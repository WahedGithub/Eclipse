package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(1000);
		
		Actions act =new Actions(driver);
		WebElement button = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		
		act.contextClick(button).build().perform(); // right click on the element
		
		driver.findElement(By.xpath("/html/body/ul/li[3]/span")).click(); //click the copy option
		
		System.out.println(driver.switchTo().alert().getText());
		
		Thread.sleep(5000);
		driver.switchTo().alert().accept(); // this clicks on "ok/accept" button popup 
	}

}
