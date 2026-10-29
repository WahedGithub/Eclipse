package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithOKButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		//Alert box with OK button example
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'alert box:')]")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
	}

}
