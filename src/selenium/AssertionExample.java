package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {
	@Test
	public void testNgassert() {
	System.setProperty("webdriver.chrome.driver", "F:\\balaji\\L&T Training\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://mail.google.com/mail/u/0/#inbox");
	String expected="Gmail";
	System.out.println(driver.getTitle());
	Assert.assertEquals(driver.getTitle(), expected);
	driver.close();
	
}}
