package Test_Demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementScreenshotTest {

	public static void main(String[] args) throws Exception {

   WebDriverManager.chromedriver().setup();
   WebDriver driver=new ChromeDriver();
   driver.get("https://www.facebook.com/login/");
   driver.manage().window().maximize();
   
   
   // screenshot -- element
   WebElement logo=driver.findElement(By.xpath("//img[@alt='Facebook']"));
   File src=logo.getScreenshotAs(OutputType.FILE);
   File destn=new File("C:\\Users\\Dell\\Desktop\\Visionfolder\\Batch_15\\ScreenShot\\Logo.png");
   FileUtils.copyFile(src, destn);
   
	}

}
