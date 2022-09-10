package DCTCFeb.TestMavenFeb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testmaven {

	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testmaven a=new Testmaven();
		a.setup_browser();
		a.action();
	}
	
	 public void setup_browser()
     {
 	       System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	      
		   driver=new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  // driver.manage().window().maximize();
		   driver.get("https://demoqa.com/buttons");
     }  
	 
	 public void action()
	 {
		 Actions ac=new Actions(driver);
		 WebElement btn_double_click = driver.findElement(By.id("doubleClickBtn"));
		 ac.moveToElement(btn_double_click).doubleClick().build().perform();
		 ac.doubleClick(btn_double_click).build().perform();//we can write like this also as alternative for above line and its example of polymorphism
		
		 WebElement btn_right_click = driver.findElement(By.id("rightClickBtn"));
		 ac.moveToElement(btn_right_click).contextClick().build().perform();
		 ac.contextClick(btn_right_click).build().perform();//this is also alternative
		 
		 WebElement btn_click = driver.findElement(By.xpath("//button[starts-with(text(),'Click Me')]"));
		 ac.moveToElement(btn_click).click().build().perform();
		 
	 }

}
