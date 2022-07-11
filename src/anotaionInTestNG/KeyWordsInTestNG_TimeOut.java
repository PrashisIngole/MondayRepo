package anotaionInTestNG;

import org.testng.annotations.Test;

public class KeyWordsInTestNG_TimeOut {

	@Test
	public void test1()
	{
		System.out.println("Test1");
	}
	
	@Test(timeOut =2000) //Fail the test if it takes more time than given time
	public void test4() throws InterruptedException {
		Thread.sleep(4000);
		System.out.println("test4");
	}
	
}
