package com.crm.appModules;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.crm.pageObjects.CRMDashboardPage;

public class NavigatingtoContactMaster_Action {
	public static String parenthandle;
public static void Clk_ContactMaster(WebDriver driver) throws IOException
{
	CRMDashboardPage.Master_Selection(driver).click();
	CRMDashboardPage.clk_ContactMaster(driver).click();
	if(CRMDashboardPage.Chl_FilterDropdown(driver).isDisplayed() && CRMDashboardPage.Btn_AddContact(driver).isDisplayed())
	{
		System.out.println("Entered into Master Page");
		CRMDashboardPage.Btn_AddContact(driver).click();
		System.out.println("Entered into Add Contact Master Page");
		 //parenthandle=driver.getWindowHandle();
	}else
	{
		System.out.println("Entered into Add Contact Master Page is Failed");
	}
}
}
