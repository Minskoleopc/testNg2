package testNg2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testNg13 {
	
	@Test(groups = "regression")
	public void testCaseOne() {
		System.out.println("One testcase pass");
		Assert.assertEquals(true, true);
	}
	
	@Test(groups = "regression")
	public void testCaseTwo() {
		System.out.println("Two testcase pass");
		Assert.assertEquals(true, true);
	}

	
	@Test(groups = "regression")
	public void testCaseThree() {
		System.out.println("Three testcase pass");
		Assert.assertEquals(true, true);
	}


}
