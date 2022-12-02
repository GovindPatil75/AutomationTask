package Test_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_methods_Webelement {

	public static void main(String[] args) {

   WebDriverManager.chromedriver().setup();
   ChromeDriver driver=new ChromeDriver();
   driver.get("https://formy-project.herokuapp.com/checkbox");
   driver.manage().window().maximize();
   
//   // identify element ---> enabled ?
//   WebElement disabledelement=driver.findElement(By.id("disabledInput"));
//
//   boolean data=disabledelement.isEnabled();
//   System.out.println(data); // false
//   
//   WebElement element2=driver.findElement(By.id("input"));
//   System.out.println(element2.isEnabled());
//   
//   if(disabledelement.isEnabled()==true) {
//	   disabledelement.sendKeys("Test");
//   }else {
//	   System.out.println("Element is disabled");
//   }
   
   
   
   WebElement checkbox1=driver.findElement(By.id("checkbox-1"));
   
   if(checkbox1.isEnabled() && checkbox1.isDisplayed()) {
	   checkbox1.click();
   }
   
   System.out.println(checkbox1.isDisplayed());
   
   System.out.println(checkbox1.isSelected()); // false
   
   if(checkbox1.isSelected()==false) {
	   checkbox1.click();
   }else {
	   System.out.println("Checkbox is already selected ");
   }
   
   WebElement logo=driver.findElement(By.id("logo"));
   System.out.println(logo.getText());
   
   if(logo.getText().equals("FORMY1")) {
	   System.out.println("Test Case pass");
   }else {
	   System.out.println("Test case fail");
   }
   
   
   
	}

}
