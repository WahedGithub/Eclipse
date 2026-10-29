package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		//FirefoxDriver driver = new FirefoxDriver();
			WebDriver driver= new ChromeDriver();
			
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		
		/*driver.findElement(By.xpath("//*[@id=app]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=app]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=app]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/ul/li")).click();*/
		
		WebElement admin = driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span"));
		WebElement usermg= driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[1]/span"));
		WebElement users= driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[1]/ul/li"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(admin).build().perform();
		act.moveToElement(usermg).build().perform();
		act.moveToElement(users).build().perform();
		
		/*admin.click();
		Thread.sleep(1000);
		usermg.click();
		Thread.sleep(1000);
		users.click();*/
	}

}
