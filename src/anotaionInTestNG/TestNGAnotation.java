package anotaionInTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnotation {

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	
	@BeforeClass
     public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@Test
	public void test1() {
		System.out.println("Test01");
	}
	
	@Test
	public void test2() {
		System.out.println("Test02");
	}
	
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
    public void afterMethod() {
		System.out.println("After Method");
	}
	
	@Test
	public void test3() {
		System.out.println("Test03");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
   
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	
	
}
