package FileUpload;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;

public class FileUploadAutoIT {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException  {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://imgbb.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Start uploading')]")).click();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("D://Eclispe//AutoIT//UploadFile_x64.exe"); // execute the autoit exe file
		
		Thread.sleep(3000);
		WebElement button= driver.findElement(By.xpath("//body/div[@id='anywhere-upload']/div[1]/div[1]/div[2]/div[1]/button[1]"));
		
		//This can be used to communicate when the elements are not foundable error occurs.
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", button);
		
		
		
		
	



	}

}
