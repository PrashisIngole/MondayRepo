package anotaionInTestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class KyewordsInTestNG_InvoCount {




	
	//invocation Count :- It is Run the test multiple times
	
	@Test(invocationCount =3)//5
	public void test3() {
		System.out.println("Test3");
	}
	
	@Test
	@Parameters ({"a","b"})
	public void test2(int a,int b) 
	{
		System.out.println(a+b);
	}
	
	@Test
	public void test1()
	{
		System.out.println("Test1");
	}
	
	@Test(enabled =false)  //Skip the test at the time of execution
	public void test4() {
		System.out.println("test4");
	}
	
	@Test(invocationCount =2)
	@Parameters({"a"})
	public void test6(int a) {
		System.out.println(a);
	}
	
	@Test//7
	public void test5() {
		System.out.println("test5");
	}
	
	@Test(priority=-1,invocationCount =2)//6
	public void test7() {
		System.out.println("test7");
	}


}
