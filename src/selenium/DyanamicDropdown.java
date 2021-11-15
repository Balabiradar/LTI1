package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanamicDropdown {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\balaji\\L&T Training\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://rahulshettyacademy.com/dropdownsPractise/");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		d.findElement(By.xpath("//a[@value='AMD']")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//li[contains(@class,'city_selected')]//a[@value='IXG'][normalize-space()='Belagavi (IXG)']")).click();

}}
