package RobotAPi;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotAPIDemo {

	public static void main(String[] args) throws InterruptedException, AWTException {
		 WebDriver driver=new ChromeDriver();
		 
		 	driver.get("https://demo.automationtesting.in/FileDownload.html");
			
			driver.findElement(By.id("textbox")).sendKeys("Kar Download12");
			Thread.sleep(2000);
			
			Robot robot= new Robot();
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_ENTER);
			System.out.println("Download file");
			if(isFileExist("C:/Users/abdul/Downloads/info.txt"))
			{
				System.out.println("file Exists");
			}
			else {
				System.out.println("file not Exists");
			}
		
	}
			static boolean isFileExist(String path)
			{
				File f=new File(path);
				if(f.exists()) {
					return true;
				}
				else {
					return false;
				}
			}

}
