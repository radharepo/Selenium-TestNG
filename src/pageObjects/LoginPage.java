package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class LoginPage {
	
	private static WebElement element = null;
	
	public static WebElement txtbx_email(WebDriver driver){
		
		element = driver.findElement(By.id("email"));
		
		Log.info("email text field is found");
		
		return element;
	}
	
	public static WebElement txtbx_password(WebDriver driver){
		
		element = driver.findElement(By.id("password"));
		
		Log.info("Password text field is found");
		
		return element;
	}
	
	public static WebElement btn_clickOnLogin(WebDriver driver) {
		
		element = driver.findElement(By.className("btn-login"));
		
		Log.info("Login button is found");
		
		return element;
	}

}
