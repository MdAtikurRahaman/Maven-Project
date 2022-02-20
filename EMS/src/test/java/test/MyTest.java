package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MyTest extends Base {
	
	@Test
	public void firstNameValidation(){	
		navigateURL("https://sit.skyschooling.com//sdet//selenium//xpath//index.html");
		
		String headingText = browser.findElement(By.tagName("//h2")).getText();
		Assert.assertEquals(headingText, "Employee Subscription Form");
		
		WebElement lName= browser.findElement(By.name("LastName"));
		lName.sendKeys("Biden");
		
		System.out.println("first name valid");
	}

}
