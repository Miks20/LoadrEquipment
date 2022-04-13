package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Baseloadr {
	
	protected WebDriver driver;
	
	
	@BeforeTest
	public void setup() {
		
		
		driver = new ChromeDriver();
		
		driver.get("https://tstldr.1go-load.com/login");
		
		driver.manage().window().maximize();
		
		
		}
	
	@AfterTest
	  public void end() {
		  
		  
		  try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  driver.quit();
		  
	  }
	
}
