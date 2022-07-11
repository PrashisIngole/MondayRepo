package testNG;

import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import CurrentReferance.Browser;
import CurrentReferance.ScreenShot;
import POM.FacebookLoginPage;

public class LoginPageTest {

	WebDriver driver;
	
		@BeforeMethod
		public void lunchBrowser() {
			 driver = Browser.openBrowser("https://www.facebook.com/");
		}

	   @Test
       public void LoginTest() throws InterruptedException, IOException {
		FacebookLoginPage facebookLoginPage =new FacebookLoginPage(driver);
		facebookLoginPage.enterEmailId("9960012548");
		facebookLoginPage.enterPassword("Parsha@1998");
		facebookLoginPage.clickOnLogin();
		
		}
		
		@Test
	    public void LoginWithOnlyUserIdTest() throws InterruptedException {
			
			FacebookLoginPage feacebookLoginPage =new FacebookLoginPage(driver);
			feacebookLoginPage.enterEmailId("9960012548");
			feacebookLoginPage.clickOnLogin();
		}
	    
		@Test
	    public void LoginWithOnlyPassTest() throws InterruptedException {
			
			FacebookLoginPage feacebookLoginPage =new FacebookLoginPage(driver);
			feacebookLoginPage.enterPassword("Parsha@1998");
			feacebookLoginPage.clickOnLogin();
		}
	    
		
		@Test
	    public void LoginWithoutUserIdPAssTest() throws InterruptedException {
			
			FacebookLoginPage feacebookLoginPage =new FacebookLoginPage(driver);
			feacebookLoginPage.clickOnLogin();
			
		}
	    
	    @AfterMethod
		public void afterMethos() throws IOException, InterruptedException {
	    	Thread.sleep(1000);
			ScreenShot.takeScreenShot(driver, "Login Page");
			driver.close();
		}
    
    
    
    
}
