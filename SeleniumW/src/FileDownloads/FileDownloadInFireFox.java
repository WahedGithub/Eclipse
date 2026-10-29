package FileDownloads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownloadInFireFox {

	public static void main(String[] args) throws InterruptedException {
		
		//create browser profile
		FirefoxProfile profile= new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk", "text/plain"); // set MIME types --> https://www.sitepoint.com/mime-types-complete-list/
		
		profile.setPreference("browser.downlond.manager.showWhenStarting", false);
		
		FirefoxOptions option=new FirefoxOptions();
		option.setProfile(profile);
		
		// Initialize Firefox driver
		
		WebDriver driver =new FirefoxDriver(option);
		
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		driver.findElement(By.id("textbox")).sendKeys("Kar Download12");
		Thread.sleep(2000);
		
		driver.findElement(By.id("createTxt")).click(); //generate text file button
		Thread.sleep(2000);
		driver.findElement(By.id("link-to-download")).click(); // display download and click

		//PDF download
		/*driver.findElement(By.id("pdfbox")).sendKeys("Kar pdf Download12");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='createPdf']")).click(); //generate text file button
		Thread.sleep(2000);
		driver.findElement(By.id("pdf-link-to-download")).click(); // display download and click*/
	}

}