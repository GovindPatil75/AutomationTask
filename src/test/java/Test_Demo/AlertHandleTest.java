package Test_Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandleTest {

	
	public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.manage().window().maximize();
        
        // customedr id --identify 
        WebElement customerId=driver.findElement(By.xpath("//input[@name='cusid']"));
        customerId.sendKeys("12345");
        
        WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
        submit.click();
        
        //
        Alert alt=driver.switchTo().alert();
      //  Alert alt= getAlert(driver);
        System.out.println(alt.getText());
       // alt.dismiss(); //click cancel button
       alt.accept(); // ok click 
       System.out.println(alt.getText());
       alt.accept();
       
	}
	
//	public static Alert getAlert(WebDriver driver) {
//		
//		return driver.switchTo().alert();
//	}

}
