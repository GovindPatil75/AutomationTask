package Test_Demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class ScrrenShoTest {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/popup.php");
        driver.manage().window().maximize();
        
        String RM=RandomString.make(5); // abd ,7yt
		
        // Scrrenshot - Full Page Screenshot 
        
        TakesScreenshot ts=(TakesScreenshot) driver;
        File src=ts.getScreenshotAs(OutputType.FILE);
        File destn =new File("C:\\Users\\Dell\\Desktop\\Visionfolder\\Batch_15\\ScreenShot\\"+RM+".png");
        FileUtils.copyFile(src, destn);
        
       
	}
	
}
