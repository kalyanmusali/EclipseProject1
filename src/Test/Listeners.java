package Test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	
	@Override
	public void onStart(ITestContext context) {
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		
		//System.out.println("listeners will successfully");
	}
	
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		
		System.out.println("listeners will failed"+result.getName());
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
		
		
	}
	
	
	@Override
	public void onFinish(ITestContext context) {
		
	}
	
}
