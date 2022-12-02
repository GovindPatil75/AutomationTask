package Test_2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrameHandleTest {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Dell/OneDrive/Documents/Iframe.html");
		driver.manage().window().maximize();
		
		// handle Iframe --> webpage which embbeded into another webpage -->  Iframe 
		// one html document embbeded into another html document --> Adv content other sources 
		

		//driver.switchTo().frame(1); // index 
		
		//driver.switchTo().frame("Selenium"); // Name or Id 
		
		WebElement Selenium_Frame=driver.findElement(By.xpath("//iframe[@name='Selenium']"));
		
		driver.switchTo().frame(Selenium_Frame); // Webelement 
		
		Thread.sleep(2000);
		WebElement menuBar=driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']"));
		menuBar.click();
		
		//
		driver.switchTo().defaultContent(); // switch Main Page 
		
		//driver.findElement(By.xpath("//a[text()=' Click here for Login FaceBook ']")).click();
		
		driver.switchTo().frame("MVN");

		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		
		
		
	}

}
