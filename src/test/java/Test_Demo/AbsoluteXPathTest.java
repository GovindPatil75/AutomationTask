package Test_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AbsoluteXPathTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		
		// identify element -- Absolute Xpath -- /
		WebElement email=driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[1]/input"));
		email.sendKeys("Test@gmail.com");
		
		WebElement password=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[2]/div/div/input"));
		password.sendKeys("12345678");
		
		WebElement btnlogin=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[3]/button"));
		btnlogin.click();
		
	}

}
