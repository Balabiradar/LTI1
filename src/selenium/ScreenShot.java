package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	public static void main(String args[]) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\balaji\\L&T Training\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		String path="F:\\balaji\\SAVESCREENSHOT.png";
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination =new File(path);
		FileHandler.copy(src, destination);
		
		

}}
