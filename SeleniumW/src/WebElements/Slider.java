package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/slider/");
		
		driver.switchTo().frame(0); // here we are taking it as frame(0) as there is only single slider on the website.
		WebElement slider= driver.findElement(By.xpath("//*[@id=\"slider\"]"));
		
		Actions act= new Actions(driver);
		
		act.moveToElement(slider).dragAndDropBy(slider, 500, 100).build().perform(); //drag the slider based on the x and y value.

	}

}
