package Test_2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_3_E {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//
		WebElement txt_email=driver.findElement(By.xpath("//input[@name='email']"));
		
		// without using sendkeys method --> element value 
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='BugSpotter'", txt_email);
		
		// xyz
		
		//js.executeScript("arguments[0].click();", element);
		
		
		
		
		
		
		
	}

}
