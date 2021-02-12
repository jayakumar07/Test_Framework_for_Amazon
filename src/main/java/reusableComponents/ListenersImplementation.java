package reusableComponents;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import testBase.ObjectRepo;

public class ListenersImplementation extends ObjectRepo implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		 test=extent.createTest(result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test case:"+result.getMethod().getMethodName()+"is passed.");
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Test case:"+result.getMethod().getMethodName()+"is failed.");
		test.log(Status.FAIL, result.getThrowable());
		SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyy HH-mm-ss");
		Date date=new Date();
		String currentDateAndTime=dateformat.format(date);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//String screenshotPath=System.getProperty("user.dir")+"/Reports/Screenshots/report_"+currentDateAndTime+".jpeg";
		String screenshotPath=System.getProperty("user.dir")+File.separator+"Reports"+
		File.separator+"Screenshots"+File.separator+"report_"+currentDateAndTime+".jpeg";
		File des=new File(screenshotPath);
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(screenshotPath,"failure screenshot");
		
	} 

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "Test case:"+result.getMethod().getMethodName()+"is Skipped.");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	@Override
	public void onStart(ITestContext context) {
		extent=ExtentSetUp.setUpExtentReport();
		
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
		
	}

}
