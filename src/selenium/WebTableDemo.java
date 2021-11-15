package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {public static void main(String args[]) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "F:\\balaji\\L&T Training\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	d.manage().window().maximize();
	d.manage().deleteAllCookies();
	d.get("https://demoqa.com/webtables");
	String value=d.findElement(By.className("rt-resizable-header-content")).getText();
	System.out.println(value);
	//count the no of row
	List<WebElement> rown= d.findElements(By.className("rt-tr-group"));
	System.out.println("No of row is"+rown.size());
	//get rows which has data
    List<WebElement> rowsWithData=d.findElements(By.xpath("//div[@class='rt-td' and text()]/ancestor::div[@class='rt-tr-group']"));
    System.out.println("Total no of rows with Data are: "+rowsWithData.size());
    
    System.out.println("Data of 2nd row: "+rowsWithData.get(1).getText()); //prints 2nd row
    
    //For Columns
    List<WebElement> colsWithData=d.findElements(By.xpath("//div[@class='rt-td' and text()][2]"));
    System.out.println("Data in the 2nd Column");
    for(int i=0;i<colsWithData.size();i++) {
 	   System.out.println(colsWithData.get(i).getText());
    }
    
    //Dynamic Table
    d.findElement(By.id("searchBox")).sendKeys("Alden");
    List<WebElement> rowsWithData2=d.findElements(By.xpath("//div[@class='rt-td' and text()]/ancestor::div[@class='rt-tr-group']"));
    System.out.println("No of rows after the search: "+rowsWithData2.size());
    
}}
