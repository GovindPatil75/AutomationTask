package Test_Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildWindowTest {

	public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/popup.php");
        driver.manage().window().maximize();
		
		String parentid=driver.getWindowHandle(); // parent window id --> string 
		System.out.println(parentid);
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> AllId=driver.getWindowHandles(); // Set<String> --> parent and child window Id
		
		System.out.println(AllId);
		
		List<String> listid=new ArrayList(AllId);
		
		driver.switchTo().window(listid.get(1));
		
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Test@gamil.com");
		
		driver.switchTo().window(listid.get(0));
		
	//	driver.close(); // current window close 
		driver.quit(); // current as well +open close 
		
		
	}

}
