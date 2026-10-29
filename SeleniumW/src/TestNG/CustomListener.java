package TestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener extends ScreenShotBase implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Started");
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed");
		failed(result.getMethod().getMethodName()); // here the failed is being called from ScreenShotBase class
		//result.get
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped");
	}
	
}
