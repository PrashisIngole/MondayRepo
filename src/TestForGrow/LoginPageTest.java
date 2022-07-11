package TestForGrow;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import CurrentReferance.Browser;
import POM.GrowLoginPage;

public class LoginPageTest {

	@Test
	public void loginPage() throws InterruptedException {
		WebDriver driver =Browser.openBrowser("https://groww.in/");
		
		GrowLoginPage growLoginPage =new GrowLoginPage(driver);
		growLoginPage.clickOnLoginOrRegisterButton();
		Thread.sleep(1000);
		growLoginPage.enterEmail("prashisingole1998@gmail.com");
		growLoginPage.clickOnContinueButton();
		Thread.sleep(1000);
		growLoginPage.enterPassword("P9762886943");
		growLoginPage.clickOnSubmitButton();
	}
	
	
	
}
