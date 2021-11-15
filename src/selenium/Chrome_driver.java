package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Chrome_driver {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","F:\\balaji\\geckodriver.exe\\" );
		WebDriver driver= new FirefoxDriver();
		driver.get("https://petstore.octoperf.com/actions/Account.action?signonForm=");
		driver.findElement(By.name("username")).sendKeys("BALAJI");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).clear();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("Balabiradar@0109");
		Thread.sleep(3000);
		driver.findElement(By.name("signon")).click();
	Thread.sleep(5000);
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	System.out.println(driver.getPageSource());
		//driver.close();
		
		
	}

}
