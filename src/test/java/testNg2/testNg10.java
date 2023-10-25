package testNg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testNg10 {
	WebDriver driver;
	
	@Test
	public void testContactForm() {
		
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Lenovo//Desktop//chromedriver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		
		SoftAssert sf = new	SoftAssert();
		
		// validate title 
		String title = driver.getTitle();
		sf.assertEquals(title, "S Labs");
		// validate url 
		
		boolean avail = driver.getCurrentUrl().contains("v1");
		sf.assertTrue(avail);
		
		// validate login
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();
		driver.quit();
		
		sf.assertAll();
		
		
	}
	
	
	
	
	
}
