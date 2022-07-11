package anotaionInTestNG;

import org.testng.annotations.Test;

public class KeyWordsInTestNG_enabled {

	@Test
	public void test1()
	{
		System.out.println("Test1");
	}
	
	@Test(enabled =false)  //Skip the test at the time of execution
	public void test4() {
		System.out.println("test4");
	}
}
