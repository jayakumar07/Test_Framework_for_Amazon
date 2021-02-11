package homePageTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import testBase.TestBase;

public class VerifySignInErrorMessage  extends TestBase{
	
	@Test
	public void signinError()  {
		homePageHeaderObjects.clickOncontainer_signin();
		homePageHeaderObjects.sendKeysToEmailTextBox();
		test.log(Status.PASS,"Email textbox received data");
		homePageHeaderObjects.clickOnContinueButton();
		String Actualerrortext=homePageHeaderObjects.verifyAlertHeader();
		String expectederrortext="There was a problem";
		Assert.assertEquals(Actualerrortext, expectederrortext);
		
	
	}
	@Test
	public void signinError1()  {
		homePageHeaderObjects.clickOncontainer_signin();
		homePageHeaderObjects.sendKeysToEmailTextBox();
		test.log(Status.PASS,"Email textbox received data");
		homePageHeaderObjects.clickOnContinueButton();
		String Actualerrortext=homePageHeaderObjects.verifyAlertHeader();
		String expectederrortext="There ";
		Assert.assertEquals(Actualerrortext, expectederrortext,"error message is not expected");
		
	
	}
	

	
}
