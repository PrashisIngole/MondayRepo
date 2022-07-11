package anotaionInTestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamtersInTestNG {

	
	@Test
	@Parameters({"a","b"})
	public void TestCase1(int a,int b) {
		
		System.out.println(a+b);
	}
	
	@Test
	@Parameters({"a","b"})
	public void TestCase2(int a,int b) {
		System.out.println(a-b);
	}
	
}
