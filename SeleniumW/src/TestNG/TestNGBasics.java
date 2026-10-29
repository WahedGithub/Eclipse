package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	/*
	@BeforeSuite-->setup chrome drivers
@BeforeTest-->Launch Browser
@BeforeClass--> Login to app

@BeforeMEthod--> enter URL
@Test-->GooglelogoTest
@AfterMethod-->Logout from app

@BeforeMEthod--> enter URL
@Test--> Search Test
@AfterMethod-->Logout from app

@BeforeMEthod--> enter URL
@Test -->Google Title Test
@AfterMethod-->Logout from app

@AfterClass--> Close Browser
@AfterTest--> deleteAllCookies
	*/
	
	//Pre-Conditions annotations --Starting with @Before
	@BeforeSuite
	public void setUp() {
		System.out.println("@BeforeSuite-->setup chrome drivers");
	}
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("@BeforeTest-->Launch Browser");
	}
	@BeforeClass
	public void Login() {
		System.out.println("@BeforeClass--> Login to app");
	}
	
	/*
	 * @BeforeMethod
	 * @Test-1
	 * @AfterMethod
	 * 
	 * @BeforeMEthod
	 * @Test-2
	 * @AfterMethod
	 */
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("@BeforeMEthod--> enter URL");
	}
	
	//Test cases -- starting with @Test
	@Test(priority=1, enabled=true)
	public void googleTitleTest() {
		System.out.println("@Test -->Google Title Test");
	}
	
	@Test
	public void SearchTest() {
		System.out.println("@Test--> Search Test");
	}
	
	@Test
	public void GooglelogoTest() {
		System.out.println("@Test-->GooglelogoTest");
	}
	
	//Post-Conditions annotations --Starting with @After
	@AfterMethod
	public void LogOut() {
		System.out.println("@AfterMethod-->Logout from app");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("@AfterClass--> Close Browser");
	}
	
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("@AfterTest--> deleteAllCookies");
	}
	
	@AfterSuite
	public void generateTestReport() {
		System.out.println("@AFterSuite-->generateTestReport");
	}
	
}
