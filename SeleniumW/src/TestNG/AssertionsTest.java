package TestNG;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsTest {

	SoftAssert softAssert = new SoftAssert(); // declared globally
	
	@Test
	public void test1() {
		SoftAssert softAssert1 = new SoftAssert(); // declared locally
		System.out.println("Open Browser");
		
		Assert.assertEquals(true, true); // hard assertion
		
		System.out.println("enter Username");
		System.out.println("Enter Password");
		System.out.println("Click on sign in button");
		
		Assert.assertEquals(true, true);
		
		System.out.println("Validate Home Page");
		
		softAssert1.assertEquals(true, false, " Home page title is missing"); // soft assertion
		
		System.out.println("Go to deals Page");
		System.out.println("Create a deal");
		
		softAssert1.assertEquals(true, false, " not able to create a deal");
		
		System.out.println("got to contacts page");
		System.out.println("create a contact");
		
		softAssert1.assertEquals(true, false, "not able to create a contact");
		
		softAssert1.assertAll(); // this need to be given at the end of @Test to get the test failed if not the test will not mark as failed
	}
	
	@Test
	public void test2() {
		SoftAssert softAssert2 = new SoftAssert();
		System.out.println("logout");
		softAssert2.assertEquals(false, true);
		softAssert2.assertAll();
	}
}
