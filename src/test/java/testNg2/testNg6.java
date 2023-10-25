package testNg2;

import org.testng.annotations.Test;

public class testNg6 {
	
	@Test(priority = 0)
	public void Banana() {
		System.out.println("Test case Banana");
	}
	
	@Test(priority = -3)
	public void Apple() {
		System.out.println("Test case Apple");
	}
	
	@Test(priority = 2)
	public void Cat() {
		System.out.println("Test case Cat");
	}
//     - 3  -2  -1  0    1  2   3    4 
}
