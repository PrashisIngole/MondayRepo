package anotaionInTestNG;

import org.testng.annotations.Test;

public class KyewordsInTestNG_Priority {


		
		//TestPriority
		
		@Test(priority=1)//5
		public void test3() {
			System.out.println("Test3");
		}
		
		@Test
		public void test2() //4
		{
			System.out.println("Test2");
		}
		
		@Test(priority=-1)//3
		public void test1()
		{
			System.out.println("Test1");
		}
		
		@Test(priority=-2)
		public void test4() {//2
			System.out.println("test4");
		}
		
		@Test(priority=-3)//1
		public void test6() {
			System.out.println("test6");
		}
		
		@Test(priority=3)//7
		public void test5() {
			System.out.println("test5");
		}
		
		@Test(priority=2)//6
		public void test7() {
			System.out.println("test7");
		}
	
}
