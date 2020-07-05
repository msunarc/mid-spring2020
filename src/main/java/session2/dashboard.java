package session2;

import java.util.concurrent.TimeUnit;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dashboard {

	WebDriver driver;

			@Before
		public void open() {
			System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://www.techfios.com/ibilling/?ng=admin/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	
		@Test
		  public void user () {
			 driver.findElement(By.name("username")).sendKeys("demo@techfios.com");
			  driver.findElement(By.id("password")).sendKeys("abc123");
			  driver.findElement(By.name("login")).click();
		}

		@Test
public void test(){
{
driver.get("http://www.techfios.com//ibilling//?ng=admin");
String ActualTitle = driver.getTitle();
String ExpectedTitle = ("Dashboard");
Assert.assertEquals(ActualTitle, ExpectedTitle);
System.out.println("Assert passed");




	//	driver.close();

	}

}}



