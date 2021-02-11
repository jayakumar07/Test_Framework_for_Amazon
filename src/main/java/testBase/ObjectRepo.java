package testBase;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pageObjects.HomePageHeaderObjects;

public class ObjectRepo {
	public static WebDriver driver;
	public  static HomePageHeaderObjects homePageHeaderObjects;
	public static ExtentReports extent;
	public static ExtentTest test;
	
}
