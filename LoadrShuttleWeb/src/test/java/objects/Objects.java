package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Baseobject;

public class Objects extends Baseobject{
	
	private By username = By.name("email");
	private By password = By.name("password");
	private By loginbtn = By.xpath("//button[normalize-space()='Sign In']");
	
	
	public Objects(WebDriver driver) {
		super(driver);
		
	}
	
	public void login(String uname, String pword) {
		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).sendKeys(pword);
		driver.findElement(loginbtn).click();
		
		
	}

}
