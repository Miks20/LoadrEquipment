package testexecution;

import org.testng.annotations.Test;

import base.Basetest;
import objects.Objects;

public class maintest extends Basetest {
	
	@Test
	public void execute() {
		
		
		Objects obj = new Objects(driver);
		
		obj.login("admin@1go.ph", "vmsi123!");
		
		
	}

}
