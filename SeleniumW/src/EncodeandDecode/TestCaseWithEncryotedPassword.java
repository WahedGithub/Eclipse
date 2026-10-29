package EncodeandDecode;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseWithEncryotedPassword {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/login");
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("jhoncena@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(decodeString("dGVzdDEyMw=="));
		//Passing the encoded value using decoded method for "Test123"
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();

	}
	
	static String decodeString(String password)
	{
		byte[] decodedString= Base64.decodeBase64(password);
		return(new String(decodedString));
		
	}

}
