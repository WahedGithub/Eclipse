package BarCodeAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.How;

public class ReadTextFromBarCode {
//This is for MicroSoft Edge Browser Test.
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("userName")).sendKeys("mercury");
		
		driver.findElement(By.name("password")).sendKeys("mercury");
		
		driver.findElement(By.name("submit")).click();
		
		String exp_title= "Login: Mercury Tours";
		
		String act_title= driver.getTitle();
		
		System.out.println(act_title);
		
		if(exp_title.equals(act_title)==true)
		{
			System.out.println("Test is Passed");
		}
		else
		{
			System.out.println("Test is Failed");
		}
		
		//driver.close(); // this will close the browser
	

	}

}
