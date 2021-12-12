package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.LogStatus;

import loginTest.BaseTest;

public class OmecenListener implements ITestListener{
	BaseTest bTest = new BaseTest();
	@Override
	public void onTestStart(ITestResult result) {
		//System.out.println("This is the test name " + result.getTestName());
		System.out.println(result.getName() + " method just started....");
		bTest.test.log(LogStatus.INFO, result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() + " method just pass....");
		bTest.test.log(LogStatus.PASS, result.getName());
		
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName() + " method just started fail....");
		bTest.takeScreenShot();
		bTest.test.log(LogStatus.FAIL, result.getName());
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName() + " method just started skip....");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println(result.getName() + " method Failed But Within Success Percentage  ");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println(result.getName() + " method just failed  for timeOut ");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println(context.getName() + " suites just started.");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println(context.getName() + " suites just finished.");
		bTest.driver.quit();
		bTest.writeReports();
	}


}
