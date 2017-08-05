package com.crm.pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.crm.config.Constants;
import com.crm.utility.RepositoryParser;

public class CRMDashboardPage {
	public static RepositoryParser parser=new RepositoryParser();
	public static WebElement element=null;
	public static WebElement CRM_Logo_Image(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
	    element=driver.findElement(parser.getLocator("CRMLOGO")); 
		return element;
	}
	public static WebElement chk_PROFILEELEMENTVisiblity(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
	    element=driver.findElement(parser.getLocator("PROFILEELEMENT")); 
		return element;
}
	public static  WebElement chk_MasterELEMENTVisiblity(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
	    element=driver.findElement(parser.getLocator("Masterelement")); 
		return element;
}
	public static  WebElement chk_ActivitiesELEMENTVisiblity(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
	    element=driver.findElement(parser.getLocator("Activitieselement")); 
		return element;
}
	public static  WebElement chk_ReportELEMENTVisiblity(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
	    element=driver.findElement(parser.getLocator("ReportElement")); 
		return element;
}
	public static WebElement Master_Selection(WebDriver driver) throws IOException{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element=driver.findElement(parser.getLocator("MastersHoverDropDown"));
		return element;
		}
	public static WebElement clk_ContactMaster(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element=driver.findElement(parser.getLocator("Contacts"));
		return element;
	}
    public static WebElement Chl_FilterDropdown(WebDriver driver) throws IOException
    {
    	parser.RepositoryParser(Constants.path_ObjectRepo);
    	element=driver.findElement(parser.getLocator("CheckFilter"));
		return element;
    }
    public static WebElement Btn_AddContact(WebDriver driver) throws IOException
    {
    	parser.RepositoryParser(Constants.path_ObjectRepo);
    	element=driver.findElement(parser.getLocator("AddContactBtn"));
		return element;
    }
}
