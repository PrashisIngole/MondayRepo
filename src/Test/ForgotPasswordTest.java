package Test;

import org.openqa.selenium.WebDriver;

import CurrentReferance.Browser;
import POM.FacebookForgotPasswordTest;
import POM.FacebookLoginPage;

public class ForgotPasswordTest {

	public void forgotPassTest() {
		WebDriver driver =Browser.openBrowser("https://www.facebook.com/");
		
		FacebookForgotPasswordTest forgotPasswordTest =new FacebookForgotPasswordTest(driver);
		forgotPasswordTest.clickOnForgtPassword();
		forgotPasswordTest.enterEmailID("parsha@gamil.com");
		forgotPasswordTest.clickOnSearchButton();
		
	}
	
	public static void main(String[] args) {
		
		ForgotPasswordTest forgotPasswordTest =new ForgotPasswordTest();
		forgotPasswordTest.forgotPassTest();
		
		
		
	}
}
