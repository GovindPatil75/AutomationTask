package Test_Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test_E6 extends BaseClass{
	
	 @Test
	    public void Test_1() {
	    	// test cases steps 
		  WebElement txt_email=driver.findElement(By.xpath("//input[@name='email']"));
		  txt_email.sendKeys("Test@gmail.com");
		  
		  WebElement txt_password=driver.findElement(By.xpath("//input[@name='pass']"));
		  txt_password.sendKeys("12345678");
		  
		  WebElement btn_login=driver.findElement(By.xpath("//button[@id='loginbutton']"));
		  btn_login.click();
	   }
	
	 @Test
	    public void Test_2() {
	    	// test cases steps 
		  WebElement txt_email=driver.findElement(By.xpath("//input[@name='email']"));
		  txt_email.sendKeys("Test@gmail.com");
		  
		  WebElement txt_password=driver.findElement(By.xpath("//input[@name='pass']"));
		  txt_password.sendKeys("12345678");
		  
		  WebElement btn_login=driver.findElement(By.xpath("//button[@id='loginbutton']"));
		  btn_login.click();
	   }
}
