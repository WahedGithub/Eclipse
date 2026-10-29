package TestNG;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;

public class RetryAnalyzer {
	
	//@Test(retryAnalyzer= Analyzer.RetryAnalyzer.class) // this method is very lengthy where we have to assign beside every test.
	
	@Test
	public void Test1()
	{
		Assert.assertEquals(false, true);
	}
	
	
	//@Test(retryAnalyzer= Analyzer.RetryAnalyzer.class)
	
	@Test
	public void Test2()
	{
		Assert.assertEquals(false, true);
	}
}
