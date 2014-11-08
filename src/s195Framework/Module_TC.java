package s195Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import appModule.Signin_Action;

public class Module_TC {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Signin_Action.Execute(driver);		
		System.out.println("Logged into the site successfully from Module test case");
		
		driver.quit();
	}

}
