package AShotapi;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class CaptureImageOfPage {

	public static void main(String[] args) throws IOException {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.twoplugs.com/");
		
		WebElement logoImageElement= driver.findElement(By.xpath("//header/div[1]/a[1]/img[1]"));
		
		Screenshot LogoImageScreenshot =new AShot().takeScreenshot(driver, logoImageElement);
		
		ImageIO.write(LogoImageScreenshot.getImage(), "png",new File("D://Eclispe//ScreenShots//logo.png"));
		
		File f= new File("D://Eclispe//ScreenShots/logo.png");
		if(f.exists()) {
			System.out.println("Image file captured");
		}
		else {
			System.out.println("Image file not captured");
		}
		
	}

}
