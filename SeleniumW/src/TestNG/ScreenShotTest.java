package TestNG;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(CustomListener.class) // adding listeners here on the top of the class will add all the listeners features to the script
public class ScreenShotTest extends ScreenShotBase {

	@BeforeMethod
	public void setUp() {
		initialization();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void LoginTest() {
		String title= driver.getTitle();
		Assert.assertEquals(title, "googgle");
		
	}
	
	@Test
	public void SearchTest1() {
		String title= driver.getTitle();
		Assert.assertEquals(title, "googgle");
	}
	
	
}
