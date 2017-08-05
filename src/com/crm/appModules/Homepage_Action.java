package com.crm.appModules;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.crm.pageObjects.LoginPage;
import com.crm.pageObjects.Homepage;

public class Homepage_Action {
public static void Check_Homepage(WebDriver driver) throws IOException
{
	if(!Homepage.Logo_Image(driver).isDisplayed())
	{
		System.out.println("Not Entered into Home Page");	
		
	}else
	{
		System.out.println("Entered Into Home Page");
	     Homepage.btn_Crm(driver).click();
	}
}
}



