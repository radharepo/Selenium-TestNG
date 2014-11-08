package s195Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.Constant;

import appModule.Signin_Action;

public class Global_var_tc {
	
private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		Signin_Action.Execute(driver, Constant.Username, Constant.Password);
		
		System.out.println("Logged into the site successfully from Global var TC test case");
		
		driver.quit();
	}

}
