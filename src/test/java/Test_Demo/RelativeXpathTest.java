package Test_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeXpathTest {

	public static void main(String[] args) throws Exception {


		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		
		// Identify element -- Relative Xpath
		
		WebElement email=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("Test123@gmail.com");
		
		WebElement password=driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		password.sendKeys("12345678");
		
		WebElement btnlogin=driver.findElement(By.xpath("//*[@id=\"loginbutton\"]"));
		btnlogin.click();
		
		Thread.sleep(5000); // 5 second
		
		driver.close(); // current window close 
		
		
	}

}
