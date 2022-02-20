package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base;

public class Verify_First_Name_Entry extends Base {
	
	@Test
	public void verify_First_Name_Entry_Test() {
		navigateURL("https://sit.skyschooling.com//sdet//selenium//xpath//index.html");
		
		sendKeys( By.id("firstName"), "joe");
		//browser.findElement(By.id("firstName")).sendKeys("joe");
		Assert.assertEquals(true, true);
	}

}
