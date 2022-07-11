package TestForKiteZerodha;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import CurrentReferance.Browser;
import CurrentReferance.ScreenShot;
import POM.KiteZerodhaLoginPage;

public class LoginPageTest {

	
	public void LoginTest() throws InterruptedException, IOException {
		WebDriver driver =Browser.openBrowser("https://kite.zerodha.com/");
		
		KiteZerodhaLoginPage kiteZerodhaLoginPage =new KiteZerodhaLoginPage(driver);
		kiteZerodhaLoginPage.enterUserID("OKP335");
		kiteZerodhaLoginPage.enterPassword("QAZ123456", driver);
		kiteZerodhaLoginPage.clickOnLoginButton();
		Thread.sleep(1000);
		kiteZerodhaLoginPage.enterPin("456789" ,driver);
		
		kiteZerodhaLoginPage.clickOnFinalSubmitButton(driver);
		
		ScreenShot.takeScreenShot(driver, "Kite Zerodha");
		
		//Thread.sleep(5000);
//		Alert a=driver.switchTo().alert();
//		Thread.sleep(5000);
//		a.accept();
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		LoginPageTest loginPageTest =new LoginPageTest();
		loginPageTest.LoginTest();
		
		
	}
}
