package Test_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_FBLogin {

	public static void main(String[] args) {

     // Browser Open
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// Identify Webelement --Locators --> Id ---> Action
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("Test@gmail.com");
		
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("12345678");

		// Locator -name 
		WebElement loginbtn=driver.findElement(By.name("login"));
		loginbtn.click();
		
	}

}
