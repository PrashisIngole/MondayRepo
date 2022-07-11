package waits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import CurrentReferance.Browser;
import POM.KiteZerodhaLoginPage;

public class Implicit_wait {
    WebDriver driver;
    
    @BeforeClass
    public void boferClass() 
    {
    	driver=Browser.openBrowser("https://kite.zerodha.com");
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    }
	
	@Test
	public void demo() 
	{
		KiteZerodhaLoginPage kiteZerodhaLoginPage=new KiteZerodhaLoginPage(driver);
		kiteZerodhaLoginPage.enterUserID("OKP335");
		kiteZerodhaLoginPage.enterPassword("QAZ123456", driver);
		kiteZerodhaLoginPage.clickOnLoginButton();
		kiteZerodhaLoginPage.enterPin("456789",driver);
		driver.close();
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofMillis(2000));
		wait.until(ExpectedConditions.visibilityOf(null));
		
		FluentWait<WebDriver> wait1 =new FluentWait<WebDriver>(driver);
		wait1.withTimeout(Duration.ofMillis(2000));
		wait1.pollingEvery(Duration.ofMillis(100));
		wait1.ignoring(Exception.class);
		wait1.until(ExpectedConditions.visibilityOf(null));
		
	}
}
