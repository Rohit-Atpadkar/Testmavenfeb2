package DCTCFeb.TestMavenFeb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Annotations_in_selenium {
  WebDriver driver;
  
      @BeforeTest
	 public void setup_browser()
     {
 	       System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	      
		   driver=new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  // driver.manage().window().maximize();
		   driver.get("https://demo.guru99.com/test/simple_context_menu.html");
     }  
	 
      @Test
	 public void action()
	 {
		 WebElement btn_double_click = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
		 Actions ac=new Actions(driver);
		 ac.doubleClick(btn_double_click).build().perform();
		 
		 Alert a1=driver.switchTo().alert();
		 System.out.println(a1.getText());
		 a1.accept();
		
		 WebElement btn_right_click = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		 ac.contextClick(btn_right_click).build().perform();
	 }
      @Test
      public void verify_title()
      {
    	  String Expected_title="Simple Context Menu";
    	  String Actual_title = driver.getTitle();
    	  Assert.assertEquals(Expected_title, Actual_title);
      }
      
      @AfterTest
      public void close()
      {
    	  driver.close();
      }
}
