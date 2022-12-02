package Test_Testng;

import org.testng.annotations.Test;

public class TestB {

	@Test(groups= {"Sanity"})
	public void p1() {
		System.out.println("p1");
	}
	
	@Test(groups= {"Sanity"})
	public void p2() {
		System.out.println("p2");
	}
	
	@Test(groups= {"Regression"})
	public void p3() {
		System.out.println("p3");
	}
	
	@Test(groups= {"Regression"})
	public void p4() {
		System.out.println("p4");
	}
	
	@Test(groups= {"Regression"})
	public void p5() {
		System.out.println("p5");
	}

}
