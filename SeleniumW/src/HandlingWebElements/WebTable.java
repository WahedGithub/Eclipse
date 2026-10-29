package HandlingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.get("file:///D:/Eclispe/New%20Text%20Document.html");
		
		int r=driver.findElements(By.xpath("html/body/table/tbody/tr")).size();
		
		System.out.println(r);
		int c=driver.findElements(By.xpath("html/body/table/tbody/tr/th")).size();
		System.out.println(c);
		
		for(int i=2; i<=r; i++) {
			for(int j=1; j<=c; j++)
			{
				String Data= driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(Data + "   ");
			}
			System.out.println();
		}
		
	}

}
