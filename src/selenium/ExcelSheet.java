package selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String path = "F:\\balaji\\ecelfile\\Book1.xlsx";

		FileInputStream file = new FileInputStream(path);
		String val = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(val);
		
//		 double val = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getNumericCellValue();
//		System.out.println(val);
		
//		CellType t = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getCellType();
//	System.out.println(t);
	
		int t = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
	System.out.println(t);
	
	
//	for(int i=0; i<=10; i++) {
//		for(int j=0; j<=6; j++) {
//			FileInputStream File = new FileInputStream(path);
//			String val=WorkbookFactory.create(File).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
//			System.out.println(val);
//		}
//	}
	}
}

