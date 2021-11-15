package facebook_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FB_LOGIN_PAGE {
	public static void main(String args[]) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "F:\\balaji\\L&T Training\\chromedriver.exe");
//		WebDriver d= new ChromeDriver();
//		
		System.setProperty("webdriver.edge.driver", "F:\\balaji\\microsoftEdge\\msedgedriver.exe");
		WebDriver d= new EdgeDriver();
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		WebElement cre=d.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		cre.click();
		WebElement name=d.findElement(By.xpath("//input[@id='u_t_b_aO']"));
		name.sendKeys("BALAJI");
		d.findElement(By.cssSelector("#u_3_d_hq")).sendKeys("BIRADAR");
		d.findElement(By.id("u_3_g_v+")).sendKeys("8888350405");
		
//		WebElement userN = d.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
//		userN.sendKeys("balabiradar1995@mail.com");
//		WebElement Pass = d.findElement(By.id("pass"));
//		Pass.sendKeys("Poojabala@143");
//		Thread.sleep(3000);
//		WebElement login = d.findElement(By.name("login"));
//		login.click();
		
	}

}
