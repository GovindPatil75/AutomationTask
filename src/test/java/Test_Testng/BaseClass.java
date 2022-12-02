package Test_Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
public static WebDriver driver;
	

    @Parameters("BrowserName")
	@BeforeMethod
	public void setUp(String BrowserName) {
    	
    	if(BrowserName.equalsIgnoreCase("Chrome")) {
    		// Browser Open
    		WebDriverManager.chromedriver().setup();
    		driver=new ChromeDriver();
    	}
    	
    	else if(BrowserName.equalsIgnoreCase("Edge")) {
    		// Browser Open
    		WebDriverManager.edgedriver().setup();
    		driver=new EdgeDriver();
    	}
		
    	else if(BrowserName.equalsIgnoreCase("firefox")) {
    		// Browser Open
    		WebDriverManager.firefoxdriver().setup();
    		driver=new FirefoxDriver();
    	}
    	
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void tearDown() {
		// Browser close
		driver.close();
	}

}
