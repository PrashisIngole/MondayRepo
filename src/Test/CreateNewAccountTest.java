package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import CurrentReferance.Browser;
import CurrentReferance.ScreenShot;
import POM.CreateNewAccount;

public class CreateNewAccountTest {

	
	
	public void TestCreatNewAccount() throws IOException, InterruptedException {
		WebDriver driver =Browser.openBrowser("https://www.facebook.com/");
		
		CreateNewAccount createNewAccount =new CreateNewAccount(driver);
		createNewAccount.clickOnCreateNewAcc();
		Thread.sleep(2000);
		createNewAccount.enterFirstName("Anjlai");
		createNewAccount.enterSurname("Ingole");
		createNewAccount.enteremailOrPhoneNo("anjali@gmail.com");
		Thread.sleep(1000);
		createNewAccount.reEnteremailOrPhoneNo("anjali@gmail.com");
		createNewAccount.enterPassword("Anjali@2021");
		Thread.sleep(1000);
		createNewAccount.selectDate("21");
		createNewAccount.selectMonth("Mar");
		createNewAccount.selectYear("1998");
		Thread.sleep(1000);
		createNewAccount.selectGender();
		Thread.sleep(1000);
		ScreenShot.takeScreenShot(driver, "Form Fill For Create New Account");
		createNewAccount.clickOnSubmitButon();
		driver.close();
	}
	
	
	public static void main(String[] args) throws IOException, InterruptedException  {
		CreateNewAccountTest createNewAccountTest=new CreateNewAccountTest();
		createNewAccountTest.TestCreatNewAccount();
		LoginPageTest loginPageTest =new LoginPageTest();
		loginPageTest.LoginTest();
		
	}
}
