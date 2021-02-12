package reusableComponents;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testBase.ObjectRepo;

public class ExtentSetUp extends ObjectRepo{
	public static  ExtentReports setUpExtentReport() {
		SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyy HH:mm:ss");
		Date date=new Date();
		String currentDateAndTime=dateformat.format(date);
		
		//String reportPath=System.getProperty("user.dir")+"/Reports/report_"+currentDateAndTime+".html";
		String reportPath=System.getProperty("user.dir")+File.separator+"Reports"+File.separator+"report_"+currentDateAndTime+".html";
		ExtentSparkReporter sparkreporter= new ExtentSparkReporter(reportPath);
		extent = new ExtentReports();
		extent.attachReporter(sparkreporter);
		sparkreporter.config().setDocumentTitle("DocumentTitle");
		sparkreporter.config().setTheme(Theme.DARK);
		sparkreporter.config().setReportName("AmazonTestResult");
		return extent;
	}

}
