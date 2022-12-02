package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	
	// Encapsulation : 
	// Element repo
	
	@FindBy(how=How.XPATH,using="//input[@name='email']")
	private WebElement txt_email;
	
	@FindBy(how=How.XPATH,using="//input[@name='pass']")
	private WebElement txt_password;

	@FindBy(how=How.XPATH,using="//button[@id='loginbutton']")
	private WebElement btn_login;
	
	//getter for txt_email
	public WebElement getTxt_email() {
		return txt_email;
	}

	
     // getter for txt_password
	public WebElement getTxt_password() {
		return txt_password;
	}

   public WebElement getbtn_login() {
	   return btn_login;
   }
	
}
