package testNg2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testNg11 {
	//@Test(dependsOnMethods = "TestCaseFour") // cd
	@Test()
	public void TestCaseOne() {
		System.out.println("Testcase one pass");
		Assert.assertEquals(true,true);
	}
	
	@Test(dependsOnMethods ="TestCaseOne" )
	public void TestCaseTwo() {
		System.out.println("Testcase two pass");
		Assert.assertEquals(true,true);
	}
	
	@Test(dependsOnMethods ="TestCaseTwo")
	public void TestCaseThree() {
		System.out.println("Testcase Three pass");
		Assert.assertEquals(true,true);
	}
	
	@Test(dependsOnMethods ="TestCaseThree")
	public void TestCaseFour() {
		System.out.println("Testcase Four pass");
		Assert.assertEquals(true,true);
	}
	
	

}
