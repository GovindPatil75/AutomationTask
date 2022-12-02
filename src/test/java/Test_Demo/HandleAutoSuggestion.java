package Test_Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAutoSuggestion {

	public static void main(String[] args) throws Exception {

    WebDriverManager.chromedriver().setup();
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://www.google.co.in/");
    driver.manage().window().maximize();
    
    // identify -- search bar element
    WebElement SearchBar=driver.findElement(By.xpath("//input[@name='q']"));
    
    SearchBar.sendKeys("Maven");
    
    Thread.sleep(3000);
    
    List<WebElement> list=driver.findElements(By.xpath("//ul[@jsname='bw4e9b']//li"));
    System.out.println(list.size()); // 10
    
    
    for(int i=0;i<list.size();i++) {
    	
    	System.out.println(list.get(i).getText());
    	
    	if(list.get(i).getText().equals("maven surefire plugin")) {
    		list.get(i).click();
    		break;
    	}
    	
    }
    

	}

}
