package HandlingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseWT {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		
		/*driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_UserManagement")).click();
		driver.findElement(By.id("menu_admin_viewSystemUsers")).click();*/
		
		int rowcount = driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/div[5]/div")).size();
		
		System.out.println(rowcount);
	}

}
