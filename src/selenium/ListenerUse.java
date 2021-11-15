package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(selenium.ListenerTestNG.class)
public class ListenerUse {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "F:\\balaji\\L&T Training\\chromedriver.exe");
		 driver= new ChromeDriver();
	}
	@Test(priority=1)
	public void openbrowser() {
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		String expected="Gmail";
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), expected);
	}
	//Success Test
		@Test(priority=2)
		public void CloseBrowser() {
			driver.close();
			Reporter.log("Driver Closed After Testing");
		}
		
		
		//Skip Test
		@Test(priority=3)
		public void SkipTest() {
			throw new SkipException("Skipping the Test Method");
		}
	

}
