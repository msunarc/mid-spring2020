package session2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public class LearnAssertions {

		WebDriver driver;

		@Before
		public void SetDriver() {

//Mention the location of ChromeDriver in localsystem
			System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
			driver = new ChromeDriver();// Object is created- Chrome browser is opened
			driver.manage().window().maximize();

		}

@Test
public void verifyTitle()
{
driver.get("https://www.amazon.com");
String ActualTitle = driver.getTitle();
String ExpectedTitle = ("Amazon.com: Online Shopping for Electronics, Apparel,Computers, Books, DVDs & more");
Assert.assertEquals(ActualTitle, ExpectedTitle);
System.out.println("Assert passed");
}

		@After
		public void closedriver() {

//closes the browser instance
			driver.close();

		}

	}}
