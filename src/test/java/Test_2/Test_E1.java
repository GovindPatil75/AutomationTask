package Test_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.Library;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_E1 {

	public static void main(String[] args) throws Exception {
		
		// Browser Open
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// Identify Webelement --Locators --> Id ---> Action
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys(Library.getTestData("Sheet1", 0, 0));
		
		// Element identify
	
     System.out.println(Library.getTestData("Sheet1", 0, 0));
     System.out.println(Library.getTestData("Sheet2", 0, 1));

	}

}
