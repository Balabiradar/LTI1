package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeExample {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\balaji\\L&T Training\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().deleteAllCookies();
		d.navigate().to("http://demo.guru99.com/test/guru99home/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		int size = d.findElements(By.tagName("iframe")).size();
		
		for(int i=0; i<=size; i++){
		    d.switchTo().frame(i);
		    int total=d.findElements(By.xpath("html/body/a/img")).size();
			System.out.println(total);
			d.switchTo().defaultContent();
		}
		
		d.switchTo().frame(0);
		d.findElement(By.xpath("/html/body/a/img")).click();
		Thread.sleep(5000);
		d.switchTo().defaultContent();
		
}
}