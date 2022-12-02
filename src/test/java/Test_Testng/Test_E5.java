package Test_Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.LoginPom;

public class Test_E5 extends BaseClass{
	
	
    @Test
    public void Test_1() {
    	
    	LoginPom login=PageFactory.initElements(driver, LoginPom.class);
    	login.getTxt_email().sendKeys("test");
    	login.getTxt_password().sendKeys("12345678");
    	login.getbtn_login().click();
  
   }
	
	
}
