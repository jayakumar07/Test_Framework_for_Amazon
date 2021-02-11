package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class HomePageHeaderObjects extends TestBase {

	public HomePageHeaderObjects() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "nav-logo-sprites")
	WebElement link_logo;
	@FindBy(id = "nav-link-accountList-nav-line-1")
	WebElement container_signin;
	@FindBy(id = "ap_email")
	WebElement emailtextbox;
	@FindBy(id="continue")
	WebElement button_continue;
	@FindBy(xpath="//div[@class='a-box-inner a-alert-container'] /h4[@class='a-alert-heading']")
	WebElement alertHeader;

	public void clickOncontainer_signin() {
		container_signin.click();
	}
	public void sendKeysToEmailTextBox() {
		emailtextbox.sendKeys("asasdahbcdbkjdkskd");
	}
	public void clickOnContinueButton() {
		button_continue.click();
	}
	public String verifyAlertHeader() {
		return alertHeader.getText();
	
	}
}
