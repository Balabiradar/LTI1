package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyExample {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\balaji\\L&T Training\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://www.google.com/");
		WebElement element = d.findElement(By.name("q"));
		element.sendKeys("facebool");
		element.sendKeys(Keys.RETURN);
		
		
		
}}
