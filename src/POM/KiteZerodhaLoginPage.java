package POM;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KiteZerodhaLoginPage {

	@FindBy (xpath ="//input[@id='userid']")private WebElement userID;
	@FindBy (xpath= "//input[@id='password']") private WebElement password;
	@FindBy (xpath="//button[@type='submit']")private WebElement loginButton;
	@FindBy (xpath="//input[@id='pin']")private WebElement pin;
	@FindBy (xpath="//button[@type='submit']")private WebElement finalSubmitButton;
	@FindBy (xpath="//a[text()='Forgot user ID or password?']")private WebElement forgotIdAndPassword;
	
	
	public KiteZerodhaLoginPage(WebDriver driver) {
		PageFactory.initElements(driver ,this );
	}
	
	public void enterUserID(String UserId)
	{
		userID.sendKeys(UserId);
	}
	
	public void enterPassword(String Pass ,WebDriver driver) {

    WebDriverWait wait =new WebDriverWait(driver ,Duration.ofMillis(2000));
    wait.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys(Pass);
	}
	
	public void clickOnLoginButton ()
	{
		loginButton.click();
	}
	
	public void enterPin(String Pin ,WebDriver driver)
	{
		WebDriverWait wait =new WebDriverWait(driver , Duration.ofMillis(2000));
		wait.until(ExpectedConditions.visibilityOf(pin));
		pin.sendKeys(Pin);
	}
	
	public void clickOnFinalSubmitButton(WebDriver driver)
	{
		
		finalSubmitButton.click();
	}
	
	public void clickOnForgotIdAndPassword()
	{
		forgotIdAndPassword.click();
	}
	
	
}
