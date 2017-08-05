package com.crm.appModules;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.crm.config.Constants;
import com.crm.utility.RepositoryParser;
import com.crm.pageObjects.LoginPage;
public  class Signin_Action {
	public static void execute_Login(WebDriver driver,String sUsername,String sPassword)throws Exception
	{
		LoginPage.txtbx_UserName(driver).sendKeys(sUsername);
		LoginPage.txtbx_PassWord(driver).sendKeys(sPassword);
		LoginPage.Btn_Login(driver).click(); 
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		if(!(LoginPage.Btn_Prev_Login(driver).isDisplayed()))
		{
			System.out.println("Logged In Successfully");
		}else
		{
			LoginPage.Btn_Prev_Login(driver).click();	
		}
		
	}
}