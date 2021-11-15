package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childwindow {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\balaji\\L&T Training\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("tabButton")).click();
		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("messageWindowButton")).click();
		String mainwindowhandle= driver.getWindowHandle();
		System.out.println("Main window handle:"+mainwindowhandle);
		Set<String> allchildwindow= driver.getWindowHandles();
		System.out.println("All child window are:"+allchildwindow);
		int count=allchildwindow.size();
		System.out.println(count);
		for(String b:allchildwindow) {
			if(!mainwindowhandle.equalsIgnoreCase(b));
			driver.switchTo().window(b);
			
		}
		
}}
