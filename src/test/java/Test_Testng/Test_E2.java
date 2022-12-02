package Test_Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.LoginPom;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_E2 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void BrowserLaunch() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void Test1() {
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		login.getTxt_email().sendKeys("Test");
		login.getTxt_password().sendKeys("12345678");
		login.getbtn_login().click();
	}

	@Test
	public void Test2() {
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		login.getTxt_email().sendKeys("Test");
		login.getTxt_password().sendKeys("12345678");
		
	}
	
	@Test
	public void Test3() {
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		login.getTxt_email().sendKeys("Test");
		login.getTxt_password().sendKeys("12345678");
		
	}
	
	@Test
	public void Test4() {
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		login.getTxt_email().sendKeys("Test");
		login.getTxt_password().sendKeys("12345678");
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
