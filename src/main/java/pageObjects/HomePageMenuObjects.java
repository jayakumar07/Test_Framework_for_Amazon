package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class HomePageMenuObjects  extends TestBase{
	public HomePageMenuObjects() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"nav-xshop\"]/a[1]")
	WebElement link_bestsellers;

}
