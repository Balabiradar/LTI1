package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MousOverAction {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\balaji\\L&T Training\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://www.ebay.com/");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions a=new Actions(d);
		WebElement element1=d.findElement(By.linkText("Electronics"));
		a.moveToElement(element1).build().perform();
		 Thread.sleep(5000);
		 WebElement element2= d.findElement(By.linkText("Apple"));
		 a.moveToElement(element2).click().build().perform();
		
		

}}
