package s195Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.HomePage;
import pageObjects.LoginPage;

public class s195_01_LoginTest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
	driver = new FirefoxDriver();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	HomePage.get_HomePage(driver);
	HomePage.navigateToLogin(driver).click();
	LoginPage.txtbx_email(driver).sendKeys("radhasel9@gmail.com");
	LoginPage.txtbx_password(driver).sendKeys("123456");
	LoginPage.btn_clickOnLogin(driver).click();
	
	System.out.println("Logged into the site successfully");
	
	driver.quit();
	
	}

}
