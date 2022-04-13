package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basetest {
	protected WebDriver driver;
	
	
	
	@BeforeMethod
	public void setup() {
		
		driver = new ChromeDriver();
		
		driver.get("http://shuttle.1go-load.com/login");
		
	}
	
	
	@AfterMethod
	public void exit() {
		
		driver.quit();
	}
	

}
