package DCTCFeb.TestMavenFeb;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Net_banking_project {

	 WebDriver driver;
	   String fetch_cust_id;
	   String project_path;
	   String chromedriver_path;
		@BeforeTest
	   public void setup_browser()
	    {
		    project_path = System.getProperty("user.dir") ;
		    chromedriver_path=project_path+"\\Driver\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",chromedriver_path);
		    driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			// driver.manage().window().maximize();
			driver.get("https://demo.guru99.com/V4/index.php");
	    }  
		@Test
		public void A()
		{
			driver.findElement(By.linkText("here")).click();
		    driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("shivajiatpadkar17@gmail.com");
		    driver.findElement(By.name("btnLogin")).submit();
		    driver.navigate().back();
		    driver.navigate().back();
		    driver.findElement(By.name("uid")).sendKeys("mngr417030");
		    driver.findElement(By.name("password")).sendKeys("ubumEba");
		    driver.findElement(By.name("btnLogin")).submit();
		}
		@Test
		public void B()
		{
		    driver.findElement(By.linkText("New Customer")).click();
		    driver.findElement(By.name("name")).sendKeys("Tanmay");
		    driver.findElement(By.name("rad1")).click();
		    driver.findElement(By.id("dob")).sendKeys("08-08-2004");
		    driver.findElement(By.name("addr")).sendKeys("Hajapur mangalwedha Solapur");
		    driver.findElement(By.name("city")).sendKeys("Mangalwedha");
		    driver.findElement(By.name("state")).sendKeys("Maharashtra");
		    driver.findElement(By.name("pinno")).sendKeys("413305");
		    driver.findElement(By.name("telephoneno")).sendKeys("9876543220");
		    driver.findElement(By.name("emailid")).sendKeys("Tanmaya1910@gmail.com");
		    driver.findElement(By.name("password")).sendKeys("ahdfg");
			driver.findElement(By.name("sub")).click();
		}
		 public void alert_handle()
		{
			Alert a1=driver.switchTo().alert();
			a1.accept();
		}
		 @Test
		 public void C() throws IOException, InterruptedException
		 {
			String file_path = project_path+"\\Driver\\test.properties";
			String custid = driver.findElement(By.xpath("//table//tbody//tr[4]//td[2]")).getText();
			System.out.println(custid);
			FileReader r=new FileReader(file_path);
			Properties p=new Properties();
			p.load(r);
			Thread.sleep(5000);
			FileWriter fw1=new FileWriter(file_path);
			p.setProperty("customer_id", custid);
			p.store(fw1, "customerid saving");
			Thread.sleep(3000);
		    fetch_cust_id = p.getProperty("customer_id");
			driver.findElement(By.linkText("Continue")).click();
		 }
		  @Test
		public void D()
		{
			driver.findElement(By.linkText("New Account")).click();
			driver.findElement(By.name("cusid")).sendKeys(fetch_cust_id);
			WebElement sel = driver.findElement(By.name("selaccount"));
			Select s1=new Select(sel);
			s1.selectByVisibleText("Savings");
			driver.findElement(By.name("inideposit")).sendKeys("10000");
			driver.findElement(By.name("button2")).click();
			
		}

}
