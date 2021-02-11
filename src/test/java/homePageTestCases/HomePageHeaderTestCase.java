package homePageTestCases;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import testBase.TestBase;

public class HomePageHeaderTestCase extends TestBase{
	
	
	
	@Test
	public void verifyHeader()  {
		
		System.out.println(driver.getTitle());
		
	}
	

}
