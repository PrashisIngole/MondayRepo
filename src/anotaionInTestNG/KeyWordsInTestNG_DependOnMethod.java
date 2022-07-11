package anotaionInTestNG;

import org.testng.annotations.Test;

public class KeyWordsInTestNG_DependOnMethod {

	@Test
	public void test1()
	{
		System.out.println("Test1");
	}
	
	@Test (timeOut=2000)
	public void test2() throws InterruptedException {
		Thread.sleep(4000);
		System.out.println("test2");
	}
	
	@Test(dependsOnMethods = {"test2"})//Its depends upon the other test (This testCase will skip because the test2 is fail)
	public void test3()
	{
		System.out.println("Test3");
	}
	
	@Test(dependsOnMethods = {"test1"})//Its depends upon the other test (This testCase will run because the test1 is pass)
	public void test4()
	{
		System.out.println("Test4");
	}
	
	
}
