package testNg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testNg8 {
	WebDriver driver;
	@Parameters({"username","password"})
	@Test
	public void login(String un , String pw) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Lenovo//Desktop//chromedriver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.cssSelector("#user-name")).sendKeys(un);
		driver.findElement(By.cssSelector("#password")).sendKeys(pw);
		driver.findElement(By.cssSelector("#login-button")).click();
		driver.quit();
		
	}
	
	
	

}
