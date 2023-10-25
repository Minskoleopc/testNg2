package testNg2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testNg12 {

	@Test(groups = "login")
	public void testCaseFour() {
		System.out.println("Four testcase pass");
		Assert.assertEquals(true, true);
	}

	@Test(groups = "login")
	public void testCaseFive() {
		System.out.println("Five testcase pass");
		Assert.assertEquals(true, true);
	}

	@Test(groups = {"login","regression"})
	public void testCaseSix() {
		System.out.println("Six testcase pass");
		Assert.assertEquals(true, true);
	}

}
