package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookForgotPasswordTest {

	
	@FindBy (xpath = "//a[text()='Forgotten password?']") private WebElement forgot;
	@FindBy (xpath="//input[@id='identify_email']")private WebElement email;
	@FindBy (xpath="//input[@id='identify_email']")private WebElement phone;
	@FindBy (xpath="//a[contains(@class,'_42ft _4jy0 _9n')]") private WebElement cancle;
	@FindBy (xpath="//button[@id='did_submit']") private WebElement search;
	
	
	public FacebookForgotPasswordTest(WebDriver driver)
	{
		PageFactory.initElements(driver ,this);
	}
	
	public void clickOnForgtPassword()
	{
		forgot.click();
	}

    public void enterEmailID(String emailID)
    {
    	email.sendKeys(emailID);
    }
    
    public void enterPhoneNumber(String phoneNumber)
    {
    	phone.sendKeys(phoneNumber);
    }
    
    public void clickOnCancelButton()
    {
    	cancle.click();
    }
    
    public void clickOnSearchButton()
    {
    	search.click();
    }

}
