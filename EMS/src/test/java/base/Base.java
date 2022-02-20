package base;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver browser ;
	
	@BeforeSuite
	public void setup() {
		ChromeOptions option = new ChromeOptions(); 
		//option.setHeadless(false);
		WebDriverManager.chromedriver().setup();
		browser = new ChromeDriver(option);
		System.out.println(browser);
	}
	
	public static void click(By by) {
		browser.findElement( by ).click();
	}
	
	public static void sendKeys(By by, String value) {
		browser.findElement( by ).sendKeys( value );
	}
	
	public static boolean isDisplayed(By by){
		//WebElement element = browser.findElement( by );
		return browser.findElement( by ).isDisplayed();
	}
	
	public static boolean isEnabled(By by){
		//WebElement element = browser.findElement( by );
		return browser.findElement( by ).isEnabled();
	}
	
	public static String getText(By by){
		return browser.findElement(by).getText();
	}
	
	public static void navigateURL(String url) {
		browser.get( url );
	}
	
	@AfterSuite
	public void tearDown() {
		browser.close();
	}
	
}
