package Test_Testng;

import org.testng.annotations.Test;

public class TestA {
	
	@Test(groups= {"Sanity"})
	public void m1() {
		System.out.println("M1");
	}
	
	@Test(groups= {"Sanity"})
	public void m2() {
		System.out.println("M2");
	}
	
	@Test(groups= {"Regression"})
	public void m3() {
		System.out.println("M3");
	}
	
	@Test(groups= {"Regression"})
	public void m4() {
		System.out.println("M4");
	}
	
	@Test(groups= {"Regression"})
	public void m5() {
		System.out.println("M5");
	}

}
