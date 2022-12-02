package Test_Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestReader {

	public static void main(String[] args) throws Exception {


		String path="C:\\Users\\Dell\\Desktop\\Visionfolder\\Batch_15\\TestData\\Data.xlsx";
		
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook wb1=new XSSFWorkbook(file);
		double data =wb1.getSheet("Sheet1").getRow(0).getCell(0).getNumericCellValue();
		System.out.println(data);
		
		String data1=String.valueOf(data);
		
		System.out.println(data1); // 1.23456789E8 --> 123456789
		
		String data2=data1.replace(".", "").replace("E8", "");
		
		System.out.println(data2);
		
	}

}
