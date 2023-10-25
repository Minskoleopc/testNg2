package testNg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testNg9 {
	WebDriver driver ;
	
	@DataProvider(name="users")
	public Object [][] loginInfo(){
		return new Object[][] {
			
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			{"performance_glitch_user","secret_sauce"}
			
		};
		
	}
	
	
	@Test(dataProvider = "users")
	public void loginTestcase(String un , String pw) {
		System.setProperty("webdriver.chrome.driver", "C://Users//Lenovo//Desktop//chromedriver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.cssSelector("#user-name")).sendKeys(un);
		driver.findElement(By.cssSelector("#password")).sendKeys(pw);
		driver.findElement(By.cssSelector("#login-button")).click();
		driver.quit();
	}

	
}
