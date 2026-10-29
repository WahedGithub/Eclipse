package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithOkCancelButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		//Alert box with OK button example
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]")).click();
		Thread.sleep(2000);
		String ExpTextOkButton = "You pressed Ok";
		
		//System.out.println(driver.switchTo().alert().getText());
	
		driver.switchTo().alert().accept();
		String ActText= driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		if (ExpTextOkButton.equals(ActText)==true)
		{
			System.out.println("You pressed Ok");
		}
		else {
			System.out.println("Text Didn't Matched");
		}
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]")).click();
		
		String ExpTextCancelButton= "You Pressed Cancel";
		driver.switchTo().alert().dismiss();
		ActText= driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		if(ExpTextCancelButton.equals(ActText)==true)
		{
			System.out.println("ExpTextCancelButton is same as ActText: You Pressed Cancel");
		}
		else {
			System.out.println("ExpTextCancelButton Text Didn't Matched with ActText");
	}

	}
}
