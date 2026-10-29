package FileDownloads;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadFileUsingChrome {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		
		driver.findElement(By.id("textbox")).sendKeys("Kar Download12");
		Thread.sleep(2000);
		
		driver.findElement(By.id("createTxt")).click(); //generate text file button
		Thread.sleep(2000);
		driver.findElement(By.id("link-to-download")).click(); // display download and click

		if(isFileExist("C:/Users/abdul/Downloads/info.txt"))
		{
			System.out.println("file Exists");
		}
		else {
			System.out.println("file not Exists");
		}
		//PDF download
		driver.findElement(By.id("pdfbox")).sendKeys("Kar Download12");
		Thread.sleep(2000);
		
		driver.findElement(By.id("createPdf")).click(); //generate text file button
		Thread.sleep(2000);
		driver.findElement(By.id("pdf-link-to-download")).click(); // display download and click
		
		if(isFileExist("C:/Users/abdul/Downloads/info.txt"))
		{
			System.out.println("PDF file Exists");
		}
		else {
			System.out.println("PDF file not Exists");
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
