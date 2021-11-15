package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {
	public static void main(String args[]) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "F:\\balaji\\L&T Training\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	 driver.get("https://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
     
     driver.findElement(By.xpath("//div[@id='content']/button")).click();
     Thread.sleep(5000);
     Alert alert=driver.switchTo().alert();
     
     System.out.println("Text in the Alert Box is: "+alert.getText());
     		alert.accept();//click ok
     		
     		Thread.sleep(5000);
     		
     driver.findElement(By.xpath("//div[@id='content']/button")).click();
      alert.dismiss();//click on cancel button
      
      driver.quit();

}}
