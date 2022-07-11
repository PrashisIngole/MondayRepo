package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import CurrentReferance.Browser;
import CurrentReferance.ScreenShot;
import POM.FacebookLoginPage;

public class LoginPageTest {

	public void LoginTest() throws InterruptedException, IOException {
		
		WebDriver driver =Browser.openBrowser("https://www.facebook.com/");
		
		Thread.sleep(3000);
		FacebookLoginPage facebookLoginPage =new FacebookLoginPage(driver);
		facebookLoginPage.enterEmailId("9960012548");
		facebookLoginPage.enterPassword("Parsha@1998");
		facebookLoginPage.clickOnLogin();
		ScreenShot.takeScreenShot(driver, "Login Page");
		driver.close();
	}
	
    public void LoginWithOnlyUserTest() throws InterruptedException {
		
		WebDriver driver =Browser.openBrowser("https://www.facebook.com/");
		FacebookLoginPage feacebookLoginPage =new FacebookLoginPage(driver);
		feacebookLoginPage.enterEmailId("9960012548");
		feacebookLoginPage.clickOnLogin();
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		LoginPageTest loginPageTest =new LoginPageTest();
		loginPageTest.LoginTest();
		loginPageTest.LoginWithOnlyUserTest();
	}
}
