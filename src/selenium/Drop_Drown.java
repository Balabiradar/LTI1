package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Drown {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\balaji\\L&T Training\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("https://www.calculator.net/interest-calculator.html");
		Select Dropdrown = new Select(d.findElement(By.cssSelector("#ccompound")));
		
		//selectbyvisibleText
		//Dropdrown.selectByVisibleText("biweekly");
		
		//selectbyvalue
		//Dropdrown.selectByValue("monthly");
		
		//selectbyindex
		Dropdrown.selectByIndex(2);
		

}}
