package FileUpload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FileUploadUsingSikuli {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='input-4']")).click();
		//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		/*Thread.sleep(3000);
		//driver.findElement(By.id("imagesrc")).click();
		//driver.findElement(By.id("uploadPicture")).sendKeys("D:\\Eclispe\\ScreenShots\\Orange.jpg");
		String imagesFilepath ="D:\\Eclispe\\ScreenShots\\";
		
		String inputFilepath = "D:\\Eclispe\\ScreenShots\\";
		
		Screen s= new Screen(); //Screen is the class in Sikuli
		
		Pattern fileInputTextbox= new Pattern(imagesFilepath+ "FileTextBox.png");
		//"D:\\Eclispe\\ScreenShots\\FileTextBox.png" // This is the actual whole path but as we used the path above here we are just appending
		
		Pattern openButton= new Pattern(imagesFilepath+ "OpenButton.png");
		
		Thread.sleep(5000);
		
		s.wait(fileInputTextbox, 20);
		s.type(fileInputTextbox, inputFilepath+ "Orange.jpg");
		
		//s.type(textbox image location , the image which needs to be inserted
		s.click(openButton);*/
		
	}

}
