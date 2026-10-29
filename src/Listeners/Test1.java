package Listeners;

import org.testng.Assert;

public class Test1 {
	
	@Test
	void loginByEmail()
	{
		System.out.println("Login by Email");
		Assert.assertEquals("Abdul", "Abdul"); 
	}
	
	
}
