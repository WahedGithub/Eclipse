package JSDemo;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.twoplugs.com/");
		
		driver.manage().window().maximize();
		WebElement joinfree= driver.findElement(By.xpath("//header/div[1]/ul[1]/li[2]/a[1]/span[1]"));
		
		// Drawing border
		
		//Either we can use the below two lines to define and call here itself or it call be called from different class method.
		//JavascriptExecutor js= (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].style.border ='3px solid red' ", joinfree);
		
		// Drawing border
		JavaScriptUtil.drawBorder(joinfree, driver);
		
		//Taking Screenshot
		
		//this method takes and save only the element SS
		/*Screenshot Imagecapture= new AShot().takeScreenshot(driver, joinfree);
		ImageIO.write(Imagecapture.getImage(), "png", new File("D://Eclispe//ScreenShots//logo1.png"));*/
		
		//This takes the complete page screenshot
		File src1= joinfree.getScreenshotAs(OutputType.FILE);
		//File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File trg=new File("D://Eclispe//ScreenShots/logo1.png");
		FileUtils.copyFile(src1, trg);
		
		//Capturing the Title
		//System.out.println(driver.getTitle());
		
		String title= JavaScriptUtil.getTitleByJS(driver);
	
		System.out.println(title);
		
		//Clicking the element
		WebElement Loginbtn= driver.findElement(By.xpath("//header/div[1]/ul[1]/li[1]/a[1]/span[1]"));
		
		JavaScriptUtil.ClickElementByJS(Loginbtn, driver);
		
		//Generate alert
		//JavaScriptUtil.generateAlert(driver, "You clicked on login button....");
		
		//refreshing the page
		//driver.navigate().refresh();
		
		JavaScriptUtil.refreshBrowserPage(driver);
		
		
	}
}
