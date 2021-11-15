package facebook_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acestor_CSSLocator {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\balaji\\L&T Training\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.calculator.net/mortgage-calculator.html");
		System.out.println(d.findElement(By.cssSelector("label[for='caddoptional'] span[class='cbmark']")).isSelected());
		d.findElement(By.cssSelector("label[for='caddoptional'] span[class='cbmark']")).click();
}}
