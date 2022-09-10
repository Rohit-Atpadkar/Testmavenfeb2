package groups_intestNG;

import org.testng.annotations.Test;

public class groups_in_testNG {
    
	
	@Test(groups="Smoke")
	public void test1()
	{
		System.out.println("Test1="+Thread.currentThread().getId());
	}
	
    @Test(groups="Smoke")
	public void test2()
	{
		System.out.println("Test2="+Thread.currentThread().getId());
	}
	
    @Test(groups="sanity")
	public void test3()
	{
		System.out.println("Test3="+Thread.currentThread().getId());
	}
	
    @Test(groups="sanity")
	public void test4()
	{
		System.out.println("Test4="+Thread.currentThread().getId());
	}
	
    @Test(groups="regression")
	public void test5()
	{
		System.out.println("Test5="+Thread.currentThread().getId());
	}
    
    
    @Test(groups="regression")
	public void test6()
	{
		System.out.println("Test6="+Thread.currentThread().getId());
	}
	
}
