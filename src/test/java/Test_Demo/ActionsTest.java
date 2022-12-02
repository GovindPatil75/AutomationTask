package Test_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsTest {

	public static void main(String[] args) {

     WebDriverManager.chromedriver().setup();
     ChromeDriver driver=new ChromeDriver();
     driver.get("https://demo.guru99.com/test/simple_context_menu.html");
     driver.manage().window().maximize();
     
     // mouse hover 
     Actions act=new Actions(driver);
     
    // WebElement element=driver.findElement(By.xpath("//a[text()='Selenium']"));
    // act.moveToElement(element).click().build().perform();
     
     
     // WebElement -- right click --> context click 
     
//     WebElement RightClick=driver.findElement(By.xpath("//span[text()='right click me']"));
//     
//     WebElement Quit=driver.findElement(By.xpath("//span[text()='Quit']"));
//     
//     act.contextClick(RightClick).click(Quit).build().perform();
     
     // double click --> 
     WebElement doubleclick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
     act.doubleClick(doubleclick).build().perform();
     
     
     
	}

}
