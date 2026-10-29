package HandlingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Radio_Check_Boxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		
		//driver.findElement(By.id("//*[@id=\"RESULT_RadioButton-9_0\"]")).isSelected();

		//radio buttons
		
		if (driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/label[1]/input[1]")).isSelected()==false)
		{if (driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/label[2]/input[1]")).isSelected()==false)
			
		{
			driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/label[1]/input[1]")).click();
		}
		else {
			System.out.println("radio button is already selected");
		}
	//checkboxes selection
		
		driver.findElement(By.xpath("//input[@id='checkbox3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		
	}

}
}
