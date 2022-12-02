package Test_Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown {
	
	public static void custom_HandleDrpDown(WebElement element,String text) {
		try {
			Select select=new Select(element);
			select.selectByVisibleText(text);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	

	public static void main(String[] args) {

    WebDriverManager.chromedriver().setup();
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://demo.guru99.com/test/newtours/register.php");
    driver.manage().window().maximize();
    
    //WebElement --identify
    
    WebElement drp_Country=driver.findElement(By.xpath("//select[@name='country']"));
    
    custom_HandleDrpDown(drp_Country,"ANTARCTICA");
    
    Select drp=new Select(drp_Country);
    
    System.out.println(drp.getFirstSelectedOption().getText());
    
    // 1 . selectByIndex --> int index
    drp.selectByIndex(10);
    
    // 2. selectByValue(String value)
    drp.selectByValue("ANTARCTICA");
    
    // 3. selectByVisibleText
    drp.selectByVisibleText("AUSTRALIA");
    
   
    
    // no of count -options
    
    List<WebElement> OptionsDrp=drp.getOptions();
    
    System.out.println(OptionsDrp.size()); // 264 
    
    // without using select class method - handle drop down 
    for(int i=0 ;i<OptionsDrp.size();i++) {
    	
    	System.out.println(OptionsDrp.get(i).getText());
    	
    	if(OptionsDrp.get(i).getText().equals("MALAYSIA")) {
    		OptionsDrp.get(i).click();
    		break;
    	}
      }
	}

}
