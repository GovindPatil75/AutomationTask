package Test_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {

	public static void main(String[] args) {
		// Browser Open
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
				
		// Element -- Actions 
				
		WebElement txt_FirstName=driver.findElement(By.xpath("//input[@name='firstName']"));
		txt_FirstName.sendKeys("Test");
				
		WebElement txt_LastName=driver.findElement(By.xpath("//input[@name='lastName']"));
		txt_LastName.sendKeys("Bug");
				
	}

}
