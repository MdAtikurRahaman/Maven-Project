package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base;


public class Verify_Employee_Subscription_Form_Heading extends Base {

	@Test
	public void verify_Employee_Subscription_Form_Heading_Test() {
		navigateURL("https://sit.skyschooling.com//sdet//selenium//xpath//index.html");
		
		String headingText = browser.findElement(By.tagName("h2")).getText();
		Assert.assertEquals(headingText, "Employee Subscription Form");
		
	}
	
	
	
	

}
