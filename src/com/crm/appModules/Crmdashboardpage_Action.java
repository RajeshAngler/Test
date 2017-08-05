package com.crm.appModules;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.crm.pageObjects.CRMDashboardPage;

public class Crmdashboardpage_Action {
	public static void Check_CRMDashboardPage(WebDriver driver) throws IOException
	{
		if(CRMDashboardPage.CRM_Logo_Image(driver).isDisplayed() && CRMDashboardPage.chk_PROFILEELEMENTVisiblity(driver).isDisplayed() && CRMDashboardPage.chk_MasterELEMENTVisiblity(driver).isDisplayed() && CRMDashboardPage.chk_ActivitiesELEMENTVisiblity(driver).isDisplayed() && CRMDashboardPage.chk_ReportELEMENTVisiblity(driver).isDisplayed())
		{
	      System.out.println("Entered into CRM Dashboard Page");
	      
		}
		else
		{
			System.out.println("Entered into CRM Dashboard Page is Failed");
		}
	}
}