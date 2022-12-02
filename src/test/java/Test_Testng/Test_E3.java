package Test_Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_E3 {
	
	@Test(priority=-1)
	public void testa() {
		System.out.println("Test A");
		Assert.assertTrue(false); // fail 
	}
	
	@Test(priority=0,dependsOnMethods="testa")
	public void testz() {
		System.out.println("Test Z");
	}
	
	@Test(priority=3,enabled=false)
	public void testb() {
		System.out.println("Test b");
	}
	
	
	@Test(priority=4,invocationCount=2)
	public void testg() {
		System.out.println("Test G");
	}
}
