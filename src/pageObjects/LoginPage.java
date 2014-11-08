package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	private static WebElement element = null;
	
	public static WebElement txtbx_email(WebDriver driver){
		element = driver.findElement(By.id("email"));
		return element;
	}
	
	public static WebElement txtbx_password(WebDriver driver){
		element = driver.findElement(By.id("password"));
		return element;
	}
	
	public static WebElement btn_clickOnLogin(WebDriver driver) {
		element = driver.findElement(By.className("btn-login"));
		return element;
	}

}
