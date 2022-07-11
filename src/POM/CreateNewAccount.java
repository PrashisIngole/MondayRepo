package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAccount {

		
	@FindBy (xpath ="//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")private WebElement creatNewAccount;
	@FindBy (xpath="//input[@name='firstname']")private WebElement  firstName;
    @FindBy (xpath="(//INPUT[@class='inputtext _58mg _5dba _2ph-'])[2]")private WebElement   surName;
	@FindBy (xpath="(//INPUT[@class='inputtext _58mg _5dba _2ph-'])[3]")private WebElement  emailOrPhoneNo;
	@FindBy (xpath="( //input[@class='inputtext _58mg _5dba _2ph-'])[4]")private WebElement  reEnterEmailOrPhoneNo;
	@FindBy (xpath="(//input[@type='password'])[2]")private WebElement  password;
	@FindBy (xpath= "//select[@aria-label='Day']")private WebElement dayInDropDown;
	@FindBy (xpath= "//select[@aria-label='Month']")private WebElement monthInDropDown;
	@FindBy (xpath ="//select[@aria-label='Year']") private WebElement yearDropDown;
	@FindBy (xpath="(//input[@name='sex'])[2]")private WebElement gender;
	@FindBy (xpath="(//button[@type='submit'])[2]")private WebElement signUp;
	
	public CreateNewAccount(WebDriver  driver)
	{
	    PageFactory.initElements(driver ,this);	
	}
	
	public void clickOnCreateNewAcc() {
		creatNewAccount.click();
	}
	
	public void enterFirstName(String name) {
		firstName.sendKeys(name);
	}
	
	public void enterSurname(String surname)
	{
		surName.sendKeys(surname);
	}
	public void enteremailOrPhoneNo(String email)
	{
		emailOrPhoneNo.sendKeys(email);
	}
	public void reEnteremailOrPhoneNo(String reEnterEmail)
	{
		reEnterEmailOrPhoneNo.sendKeys(reEnterEmail);
	}
	
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void selectDate(String date)
	{
		Select select =new Select(dayInDropDown);
		select.selectByVisibleText(date);
	}
	
	public void selectMonth(String month)
	{
		Select select =new Select(monthInDropDown);
		select.selectByVisibleText(month);
	}
	public void selectYear(String year)
	{
		Select select =new Select(yearDropDown);
		select.selectByVisibleText(year);
	}
	public void selectGender()
	{
		gender.click();
	}
	public void clickOnSubmitButon()
	{
	signUp.click();
	}
	
}
