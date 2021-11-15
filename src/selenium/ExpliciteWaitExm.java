package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWaitExm {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\balaji\\L&T Training\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.navigate().to("https://demoqa.com/alerts");
		d.findElement(By.id("timerAlertButton")).click();
		WebDriverWait wait=new WebDriverWait(d,10);
		Alert alert=wait.until(ExpectedConditions.alertIsPresent());
        Thread.sleep(10000);
        alert.accept();
        Thread.sleep(10000);
        System.out.println("Alert is accepted");
        d.close();

}}
