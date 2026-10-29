package TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShotBase {

	public static WebDriver driver;
	
	public static void initialization() {
		driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/?gws_rd=cr&ei=x03aUsqPHIWIrgecoYCoDg");
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		
	}

	public void failed(String testMethodName){
		File scrFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("D://Eclispe//ScreenShots//" + testMethodName+ "_"+" .jpg"));
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
