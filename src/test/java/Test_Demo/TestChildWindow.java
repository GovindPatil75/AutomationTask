package Test_Demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestChildWindow {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/popup.php");
        driver.manage().window().maximize();
		
		String parentid=driver.getWindowHandle(); // parent window id --> string 
		System.out.println(parentid);
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> AllId=driver.getWindowHandles(); // Set<String> --> parent and child window Id
		
		Iterator<String> IT=AllId.iterator();

		while(IT.hasNext()) {
			
			String CID=IT.next();
			
			if(!parentid.equals(CID)) {
				driver.switchTo().window(CID);
				driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Test@gamil.com");
				
			}
		}
	}

}
