package testNg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNg4 {
	
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		// TODO Auto-generated method stub
		String yy = "2024";
		String mm = "March";
		String dd = "22";
		System.setProperty("webdriver.chrome.driver", "C://Users//Lenovo//Desktop//chromedriver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Datepicker/index.html");
		driver.findElement(By.id("datepicker")).click();
		test1.SelectDate(driver, mm, yy, dd);
	}

	@Test
	public void TestCasethree() {

		boolean avail = driver.getCurrentUrl().contains("picker");
		Assert.assertTrue(avail);

	}

	@Test
	public void TestCasefour() {
		boolean avail = driver.findElement(By.tagName("h1")).isDisplayed();
		Assert.assertTrue(avail);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
