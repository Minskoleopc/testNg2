package testNg2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testNg7 {

	@Test
	public void testAddition() {
	    int result = 2 + 3;
	    Assert.assertEquals(result, 5, "Addition result is incorrect");
	}

	@Test
	public void testSubtraction() {
	    int result = 8 - 4;
	    Assert.assertTrue(result == 4, "Subtraction result is incorrect");
	}

	@Test
	public void testMultiplication() {
	    int result = 5 * 6;
	    Assert.assertTrue(result == 30, "Multiplication result is incorrect");
	}

	@Test
	public void testDivision() {
	    double result = 10.0 / 2.0;
	    Assert.assertEquals(result, 5.0, 0.001, "Division result is incorrect");
	}

	@Test
	public void testStringEquality() {
	    String str1 = "Hello";
	    String str2 = "Hello";
	    Assert.assertEquals(str1, str2, "Strings are not equal");
	}

	@Test
	public void testArrayEquality() {
	    int[] array1 = {1, 2, 3};
	    int[] array2 = {1, 2, 3};
	    Assert.assertEquals(array1, array2, "Arrays are not equal");
	}

	@Test
	public void testNullCheck() {
	    String text = null;
	    Assert.assertNull(text, "The text is not null");
	}

	@Test
	public void testNotNullCheck() {
	    String text = "TestNG";
	    Assert.assertNotNull(text, "The text is null");
	}

	@Test
	public void testTrueAssertion() {
	    boolean condition = true;
	    Assert.assertTrue(condition, "The condition is false");
	}

	@Test
	public void testFalseAssertion() {
	    boolean condition = false;
	    Assert.assertFalse(condition, "The condition is true");
	}

	

}
