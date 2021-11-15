package selenium;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTestNG implements ITestListener {
	public void onTestStart(ITestResult result) {
		System.out.println("New Test Started"+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess Method"+result.getName());
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure Method"+result.getName());
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped Method"+result.getName());
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result){
		System.out.println("onTestFailedButWithinSuccessPercentage Method"+result.getName());
	}
	
	public void onTestFailedWithTimeout(ITestResult result) {
		onTestFailure(result);
	}
	
	public void onStart(ITestContext context) {
		System.out.println("onTestStart Method");
	}
	
	public void onFinish(ITestContext context) {
		System.out.println("onTestFinish Method");
	}}
	