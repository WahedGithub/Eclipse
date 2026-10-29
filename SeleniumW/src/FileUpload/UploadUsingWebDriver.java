package FileUpload;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class UploadUsingWebDriver {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://imgbb.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Start uploading')]")).click();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.findElement(By.id("imagesrc")).click();
		//driver.findElement(By.id("uploadPicture")).sendKeys("D:\\Eclispe\\ScreenShots\\Orange.jpg");
		String imagesFilepath ="D://Eclispe//ScreenShots//";
		
		String inputFilepath = "C:\\Users\\abdul\\Downloads\\";
		
		Screen s= new Screen(); //Screen is the class in Sikuli
		
		Pattern fileInputTextbox= new Pattern(imagesFilepath+ "FileTextBox.png");
		//"D:\\Eclispe\\ScreenShots\\FileTextBox.png" // This is the actual whole path but as we used the path above here we are just appending
		
		Pattern openButton= new Pattern(imagesFilepath+ "OpenButton.png");
		
		Thread.sleep(5000);
		
		s.wait(fileInputTextbox, 20);
		s.type(fileInputTextbox, inputFilepath+ "Orange.jpg");
		
		//s.type(textbox image location , the image which needs to be inserted
		s.click(openButton);
		
		driver.navigate().refresh();
		
		WebDriverWait wait= new WebDriverWait(driver, 20);
		element=wait.until(ExpectedConditions.
		
		
		
		
	}

}
