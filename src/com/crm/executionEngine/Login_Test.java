package com.crm.executionEngine;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.crm.config.Constants;
import com.crm.appModules.Signin_Action;
import com.crm.appModules.Homepage_Action;
import com.crm.appModules.Crmdashboardpage_Action;
public class Login_Test extends ChromeLogin{
// public static WebDriver= null;
	@Test
    @Parameters({"username","password"})
  public static void Valid_Login_Test(String username,String password) throws Exception
  {
		Signin_Action.execute_Login(driver, username, password); 
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
	    Homepage_Action.Check_Homepage(driver);
	    {
	    	System.out.println("Entered into CRM Module");
	    }
	    Crmdashboardpage_Action.Check_CRMDashboardPage(driver);
	    }
}
