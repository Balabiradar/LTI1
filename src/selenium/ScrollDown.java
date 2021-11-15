package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\balaji\\L&T Training\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://en.wikipedia.org/wiki/Wikipedia");
		JavascriptExecutor j=((JavascriptExecutor)d);
		j.executeScript("scroll(0,500)");

}}
