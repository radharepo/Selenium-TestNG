package appModule;

import org.openqa.selenium.WebDriver;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import utility.Log;

public class Signin_Action {
	
	public static void Execute(WebDriver driver, String sEmail, String sPassword){
		
		HomePage.get_HomePage(driver);
			
		HomePage.navigateToLogin(driver).click();
		
		Log.info("Page is navigated to Login page");
		
		LoginPage.txtbx_email(driver).sendKeys(sEmail);
		
		Log.info("Login credentials : Email" +sEmail);
		
		LoginPage.txtbx_password(driver).sendKeys(sPassword);
		
		Log.info("Login credentials :  Password" +sPassword);
		
		LoginPage.btn_clickOnLogin(driver).click();
		
		Log.info("Click action Performed on Login button");
	}

}
