package Utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listners extends Base implements ITestListener {
	ExtentTest test;

	ExtentReports extent = ExtendReporting.StartReport();

	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());

	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Passed");

	}

	public void onTestFailure(ITestResult result) {
		// test.fail(result.getThrowable());
		test.log(Status.FAIL, "Test Failed");

		String testMethodName = result.getMethod().getMethodName();
		//WebDriver driver = null;
		/*try {
			driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver")
					.get(result.getInstance()); // to access to any fields(driver) of a class

		} catch (Exception e) {
		}*/

		try {
			getscreenshotpath(testMethodName); // , driver
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) { // will run after all @Test will run
		extent.flush();

	}

}
