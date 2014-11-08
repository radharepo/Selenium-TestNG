package appModule;

import org.openqa.selenium.WebDriver;

import pageObjects.HomePage;
import pageObjects.LoginPage;

public class Signin_Action {
	
	public static void Execute(WebDriver driver, String sEmail, String sPassword){
		HomePage.get_HomePage(driver);
		HomePage.navigateToLogin(driver).click();
		LoginPage.txtbx_email(driver).sendKeys(sEmail);
		LoginPage.txtbx_password(driver).sendKeys(sPassword);
		LoginPage.btn_clickOnLogin(driver).click();
	}

}
