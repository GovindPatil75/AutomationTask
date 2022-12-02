package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Library {

	public static String getTestData(String sheetname,int row,int cell) throws Exception {
		
		String path="C:\\Users\\Dell\\Desktop\\Visionfolder\\Batch_15\\TestData\\DataTest.xlsx";
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		String data1=wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue(); // Sheet1 --> 0,1

		return data1;
	}
	
	public static void ScrollToElement(WebDriver driver,WebElement element) {
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
}
