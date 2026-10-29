package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithTextEntered {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		//Alert box with OK button example
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box')]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Abdul Wahed");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		WebElement Statement = driver.findElement(By.xpath("//*[@id=\"demo1\"]"));
		System.out.println(Statement.getText());
		
	}

}
