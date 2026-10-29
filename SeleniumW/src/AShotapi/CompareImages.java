package AShotapi;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class CompareImages {

	public static void main(String[] args) throws IOException {
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.twoplugs.com/");
		
		BufferedImage expectedImage= ImageIO.read(new File("D://Eclispe//ScreenShots//logo.png"));

		WebElement logoImageElement= driver.findElement(By.xpath("//header/div[1]/a[1]/img[1]"));
		
		Screenshot logoImageScreenshot=new AShot().takeScreenshot(driver, logoImageElement);
		
		BufferedImage actualImage= logoImageScreenshot.getImage(); // to get the image from webpage
		
		//call a predefined class for compareing an image
		ImageDiffer imgDiff= new ImageDiffer();
		ImageDiff diff=imgDiff.makeDiff(expectedImage, actualImage);
		
		if(diff.hasDiff()==true) // this will compare 2 images
		{
			System.out.println("Images are NOT same");
		}
		else {
			System.out.println("Images are same");
		}
		
	}

}
