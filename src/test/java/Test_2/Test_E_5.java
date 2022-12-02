package Test_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.LoginPom;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_E_5 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// Email ,Password --> Actions 
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		
		login.getTxt_email().sendKeys("Test@gmail.com");
		login.getTxt_password().sendKeys("12345678");
		
		

	}

}
