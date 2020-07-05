package session2.copy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session {
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
		
		  driver.findElement(By.name("firstname")).sendKeys("sunita");
		  driver.findElement(By.name("lastname")).sendKeys("sivakumar");
		  driver.findElement(By.name("Password")).sendKeys("123");
		  //driver.findElement(By.id("sex-0")).click();
		  driver.findElement(By.id("sex-1")).click();
		  driver.findElement(By.id("exp-6")).click();
		  driver.findElement(By.id("datepicker")).sendKeys("06/25/2020"); //
		  driver.findElement(By.partialLinkText("TF-API")).click();
		  driver.findElement(By.id("profession-1")).click();
		  driver.findElement(By.className("input-xlarge")).sendKeys("Europe");
		  driver.findElement(By.id("tool-2")).click();
		 
		
		  Select testDropDown = new Select(driver.findElement(By.id("continents")));
		  testDropDown.selectByVisibleText("Australia"); Select testDropDown1 = new
		  Select(driver.findElement(By.className("input-file")));
		  testDropDown1.selectByVisibleText("Choose File"); testDropDown1.
		 
		WebElement uploadElement = driver.findElement(By.id("photo"));	
		uploadElement.sendKeys("C:\\ABC\\JAVA.fiile.txt");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.name("open")).click();
	}
		
		
	}

/*
 * @After public void Teardown() { driver.close(); driver.quit(); }
 * 
 * 
 */
