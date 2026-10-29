package FileDownloads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadZIPFile {

	public static void main(String[] args) throws InterruptedException {
		//create browser profile
				FirefoxProfile profile= new FirefoxProfile();
				profile.setPreference("browser.helperApps.neverAsk", "application/zip"); // set MIME types --> https://www.sitepoint.com/mime-types-complete-list/
				
				profile.setPreference("browser.downlond.manager.showWhenStarting", false);
				
				FirefoxOptions option=new FirefoxOptions();
				option.setProfile(profile);
				
				// Initialize Firefox driver
				
				WebDriver driver =new FirefoxDriver(option);
				
				driver.get("http://testingmasters.com/student-corner/downloads/");
				
				Thread.sleep(4000);
				
				driver.findElement(By.xpath("//*[@id=\"tablepress-7\"]/tbody/tr[1]/td[2]/a")).click();
				
				

	}

}
