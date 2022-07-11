package DataProvider;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestForPractice {
	String xyz;
	String xxx;
	
	@BeforeClass
	public void beforeMethod() throws EncryptedDocumentException, IOException {
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
			xyz= Parameterization.gatData("Sheet1", i, j);
			xxx= Parameterization.gatData("Sheet1", i, j);
			}
		}
		
		
	}
	
	
	
	
	@DataProvider(name ="TestData")
	public Object[][] getData(){
		return new Object[][] {{xyz , xxx}};
	}
	
	
	
	@Test(dataProvider ="TestData")
	public void list(String id,String pass) {
		System.out.print("ID: "+id);
		System.out.println();
		System.out.print("Password: "+pass);
		System.out.println();
	}
	
	
	
	
}
