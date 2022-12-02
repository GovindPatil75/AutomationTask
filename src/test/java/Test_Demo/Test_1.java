package Test_Demo;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_1 {

	public static void main(String[] args) throws Exception  {

       WebDriverManager.chromedriver().setup();
       ChromeDriver driver=new ChromeDriver();
       driver.get("https://www.facebook.com/");
       driver.manage().window().maximize();
       
       String title=driver.getTitle();
       System.out.println(title);
              
       String Curl=driver.getCurrentUrl();
       System.out.println(Curl);
       
       //
       
       driver.navigate().to("https://mvnrepository.com/");
       
       Thread.sleep(4000);
       driver.navigate().back(); // back click
       
       Thread.sleep(4000);
       driver.navigate().forward();
       
       Thread.sleep(4000);
       // refresh
       driver.navigate().refresh();
       
       
       
       
	}

}
