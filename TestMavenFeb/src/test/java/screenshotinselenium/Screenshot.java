package screenshotinselenium;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;



public class Screenshot implements ITestListener {
   WebDriver driver;
   String projectpath;
   
   @Test
	public void setup_browser()
	{
		projectpath = System.getProperty("user.dir");
		String chromedriver_path = projectpath+"\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromedriver_path);
		
	    driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		String Expected_title="Facebook – log in or sign up";
		String Actual_title=driver.getTitle();
		Assert.assertEquals(Actual_title, Expected_title);
	}
     @AfterMethod
	public void onTestFailure(ITestResult result)
	{
		String screenshot_path = projectpath+"\\screenshot\\";
    	 
    	 if(ITestResult.FAILURE==result.getStatus())
		{
			Date d=new Date();
			SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
			
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try
			{
				FileUtils.copyFile(src, new File(screenshot_path+sd.format(d)+".png"));
			} catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
