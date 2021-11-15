package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelExample {
	WebDriverWait wait;
	WebDriver driver;
	@BeforeClass
	public void testsetup() {
	System.setProperty("webdriver.chrome.driver", "F:\\balaji\\L&T Training\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	driver.manage().window().maximize();
	d.manage().deleteAllCookies();
	 wait=new WebDriverWait(d,10);
}
	@Test
	public void verifyInvalidlogin(String username, String password) {
		
	}
	@DataProvider(name="inputdata")
	public Object[][] getcelldata() throws IOException{
		
	//create the file
		FileInputStream file=new FileInputStream("");
		//create the workbool
		XSSFWorkbook wb =new XSSFWorkbook(file);
		XSSFSheet s=wb.getSheet("Sheet1");
		int rowcount =s.getLastRowNum()+1;
		int cellcount=s.getRow(0).getLastCellNum();
		Object data[][]=new Object[rowcount][cellcount];
		for(int i=0;i<rowcount;i++) {
			Row r=s.getRow(i);
			for(int j=0;j<rowcount;i++) {
				Cell c=r.getCell(j);
				data[i][j]=c.getStringCellValue();
		}}
		wb.close();
		return data;
		
		
	}
}
