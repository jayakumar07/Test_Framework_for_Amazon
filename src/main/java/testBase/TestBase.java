package testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.HomePageHeaderObjects;
import reusableComponents.PropertiesOperation;

public class TestBase extends ObjectRepo {
	
	

	public void launchBrowserAndNavigate() throws Exception {
		String browser = PropertiesOperation.getPropertyValueByKey("browser");
		String url = PropertiesOperation.getPropertyValueByKey("url");
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		else if (browser.equalsIgnoreCase("InternetExplorer")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@BeforeMethod // it will execute before test method in this class

	public void setupMethod() throws Exception {
		launchBrowserAndNavigate();
		homePageHeaderObjects	=new HomePageHeaderObjects();
	}

}
