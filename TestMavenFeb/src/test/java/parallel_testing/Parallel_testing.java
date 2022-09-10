package parallel_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_testing {
   
	WebDriver driver;
	String project_path;
	
	@Test//(threadPoolSize=2, invocationCount=2)//threadpoolsize and invocation count will run perticular testscript with different thread ID 
	public void test1()//threadpoolsize is meaningless without invocationCount and if threadpoolsize is 2 and invocation count is 5 then this test script will be run for 5 times but with only two thread id and these two id will be repeated for this 5 tests
	{
		project_path = System.getProperty("user.dir");
		String chrome_path = project_path+"\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
	    driver=new ChromeDriver();
	    driver.get("https://facebook.com");
	    System.out.println("test 1="+Thread.currentThread().getId());
	}
	
	@Test
	public void test2()
	{
		project_path = System.getProperty("user.dir");
		String chrome_path = project_path+"\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
	    driver=new ChromeDriver();
	    driver.get("https://www.google.com/search?q=songs&oq=songs&aqs=chrome..69i57j0i19l9.3717j0j4&sourceid=chrome&ie=UTF-8");
	    System.out.println("test 2="+Thread.currentThread().getId());
	}
	/*@Test(groups="Smoke")
	public void test3()
	{
		System.out.println("test3="+Thread.currentThread().getId());
	}
	@Test(groups="regression")
	public void test4()
	{
		System.out.println("test4="+Thread.currentThread().getId());
	}*/
}
