package DCTCFeb.TestMavenFeb;

import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hierarchy_of_annotations {

	@BeforeSuite
	public void Test_Before_Suite()
	{
		System.out.println("before suit");
	}
	
	@BeforeTest
	public void Test_Before_Test()
	{
		System.out.println("before test");
	}
	
	@BeforeClass
	public void Test_Before_class()
	{
		System.out.println("before class");
	}
	
	@BeforeMethod
	public void Test_Before_Method()
	{
		System.out.println("before method");
	}
	
	@Test(invocationCount=2,priority=-1)
	public void Test1()
	{
		System.out.println("test1");
	}
	
	/*@Test(enabled=false)//it will not considered as test case and it will be skipped
	public void Test2()
	{
		System.out.println("test2");
	}*/                //by dafault priority of all test case is zero 
	@Test(priority=-2)//this will execute first and then test1 will execute as priority of test2 is less than test1
	public void Test2()//if priority is same for multiple methods then alphabetically methods will get executed 
	{
		System.out.println("test2");
		//Assert.assertTrue(false);//if false is written here and test 3 is dependant on this test then test2 will be failed and test3 will be skipped
	}                            //false keyword will fail the test case
	
	@Test(dependsOnMethods={"Test2","Test1"})//both test case should be paas otherwise it will not execute test3
	public void Test3()
	{
		System.out.println("test3");
	}
	
	
	@AfterMethod
	public void Test_After_Method()
	{
		System.out.println("after method");
	}
	
	@AfterClass
	public void Test_After_class()
	{
		System.out.println("After class");
	}
	
	@AfterTest
	public void Test_After_Test()
	{
		System.out.println("after test");
	}

	@AfterSuite
	public void Test_After_Suite()
	{
		System.out.println("after suite");
	}
}

