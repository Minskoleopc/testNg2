package testNg2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class test1 {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String yy = "2024";
		String mm = "March";
		String dd  = "22";
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Lenovo//Desktop//chromedriver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Datepicker/index.html");
		driver.findElement(By.id("datepicker")).click();
		SelectDate(driver,mm,yy,dd);
		boolean avail = driver.getCurrentUrl().contains("picker");
		if(avail) {
			System.out.println("Testcase pass");
		}
		else {
			System.out.println("Test case fail");
		}
		
	}
	
	
	public static void SelectDate(WebDriver driver , String mm , String yy , String dd) {
		String text = driver.findElement(By.cssSelector(".datepicker-switch")).getText();
		System.out.println(text); //["October","2023"]
		String amm = text.split(" ")[0];
		String ayy = text.split(" ")[1];
		System.out.println(amm);
		System.out.println(ayy);
		
		while(!(amm.equals(mm) && ayy.equals(yy))) {
			driver.findElement(By.className("next")).click();
			text = driver.findElement(By.cssSelector(".datepicker-switch")).getText();
			amm = text.split(" ")[0];
			ayy = text.split(" ")[1];
		}
		
		List<WebElement> days = driver.findElements(By.className("day"));
		
		for(int i = 0 ; i < days.size() ; i++) {
			if(days.get(i).getText().equals(dd)) {
				days.get(i).click();
				break;
			}
		}
		
	}
	
	

}
