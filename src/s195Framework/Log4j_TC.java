package s195Framework;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import appModule.Signin_Action;

import pageObjects.HomePage;
import utility.Constant;
import utility.Log;

public class Log4j_TC {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) throws Exception {
		
		DOMConfigurator.configure("log4j.xml");
		Log.startTestCase("Selenium_Test_001");

		driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Log.info("Implicit wait applied on the driver for 10 seconds");
		
		HomePage.get_HomePage(driver);
		
		Log.info("Web application launched");
		
		Signin_Action.Execute(driver, Constant.Username, Constant.Password);
		
		Log.info("Login Successfully, now it is the time to Log Off buddy");
		
		driver.quit();
		
		Log.info("Browser closed");
		
		Log.endTestCase("Selenium_Test_001");
		
}
	
	
}

	

