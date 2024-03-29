package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class HomePage {
	
	private static WebElement element = null;
	
	public static void get_HomePage(WebDriver driver) {
		
		driver.get("http://s195:s195@s195.qa1.mobile.sport195.com");
		
		Log.info("Home Page link element found");
	}
	
	public static WebElement navigateToLogin(WebDriver driver) {
		
		element = driver.findElement(By.linkText("Log In"));
		
		Log.info("Login element is found");
		
		return element;
	}

}
