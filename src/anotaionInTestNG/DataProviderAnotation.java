package anotaionInTestNG;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import CurrentReferance.ParametrizationClass;

public class DataProviderAnotation {
	//String
	
	String value1;
	String value2;
	
	@BeforeClass    //Before Class for Fetch the data from ExcleSheet
	public void valuesFromSheet() throws EncryptedDocumentException, IOException
	{
		for(int i=0;i<=2;i++)
	    {
		   value1=ParametrizationClass.getData("Sheet1", i, 0);
	    }
	}
	
	@DataProvider (name ="UserName")
	public Object[][] dataProvider()
	{
		return new Object[][] {{value1} , {"Prashis"}};
	
	}
	
	@Test (dataProvider ="UserName")
	public void test2 (String name)
	{
		System.out.println(name);
		
	}
	
	
	//Integer
	
//	@DataProvider(name ="TestData")      //DataProvider with name
//	public Object[][] values(){
//		return new Object[][] {{5,6},{10,11},{5,4},{10,100},{100,20},{30,50}};
//	}
//	
//	
//	@Test (dataProvider ="TestData")
//	public void test1(int a,int b ) 
//	{
//		
//		System.out.println(a+b);
//	}
	
}
