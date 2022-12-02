package Test_Testng;

import org.testng.annotations.Test;

public class Test_E7 {
	
	@Test
	public void test1() {
		
		String s1="Test";
		String s2="test1";
		
		System.out.println(s2.equals(s1)); // false
		
		System.out.println(s1.equalsIgnoreCase(s2));// true
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Browser open ");
		}
		
	}

}
