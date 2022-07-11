package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GrowLoginPage {

	@FindBy (xpath = "(//div[@class='absolute-center btn51ParentDimension'])[1]") private WebElement loginOrRegisterButton;
	@FindBy (xpath = "//input[@id ='login_email1']") private WebElement email;
	@FindBy (xpath = "//div[@class='absolute-center btn51ParentDimension'][1]") private WebElement continueButton;
	@FindBy (xpath = "//input[@type='password']") private WebElement password;
	@FindBy (xpath = "//div[@class='absolute-center btn51ParentDimension']") private WebElement submitButton;
	@FindBy (xpath = "//div[text()='Forgot Password?']") private WebElement forgotPassword;
	
	public GrowLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}
	public void clickOnLoginOrRegisterButton() {
		loginOrRegisterButton.click();
	}
	public void enterEmail(String emailID)
	{
		email.sendKeys(emailID);
	}
	
	public void clickOnContinueButton() {
	continueButton.click();	
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickOnSubmitButton() {
		submitButton.click();
	}
	
	public void clickOnForgotPassword() {
		forgotPassword.click();
	}
	
	
	
}
