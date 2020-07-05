package session2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ' {
	WebDriver driver;

	@Before
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://objectspy.space/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@Test
	public void test() {
		
		/*
		 * driver.findElement(By.name("firstname")).sendKeys("sunita");
		 * driver.findElement(By.name("lastname")).sendKeys("sivakumar");
		 * driver.findElement(By.name("Password")).sendKeys("123");
		 * //driver.findElement(By.id("sex-0")).click();
		 * driver.findElement(By.id("sex-1")).click();
		 * driver.findElement(By.id("exp-6")).click();
		 * driver.findElement(By.id("datepicker")).sendKeys("06/25/2020"); //
		 * driver.findElement(By.partialLinkText("TF-API")).click();
		 * driver.findElement(By.id("profession-1")).click();
		 * driver.findElement(By.className("input-xlarge")).sendKeys("Europe");
		 * driver.findElement(By.id("tool-2")).click();
		 * 
		 * 
		 * Select testDropDown = new Select(driver.findElement(By.id("continents")));
		 * testDropDown.selectByVisibleText("Australia");
		 */
		
		WebElement uploadElement = driver.findElement(By.className("input-file"));	
		uploadElement.sendKeys("C:\\Users\\Siva J\\Desktop\\");
		uploadElement.click();
		//driver.findElement(By.xpath("//input[@id='photo']"));
		
	
		/*
		 * WebElement uploadfile = driver.findElement(By.className("input-file"));
		 * uploadfile.sendKeys("C:\\techfios\\jason example.txt");
		 * Thread.sleep(2000);//explicit//
		 * driver.findElement(By.xpath("//input[@id='photo']"));
		 */

	
	
	
	
	
	
	}
		
		
	}


/*
 * @After public void Teardown() { driver.close(); driver.quit(); }
 * 
 * 
 */
