package com.crm.pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.crm.config.Constants;
import com.crm.utility.RepositoryParser;

public class AddOverseasDataPage {
	public static RepositoryParser parser=new RepositoryParser();
	public static WebElement element=null;
	public static WebElement Chk_add_ContactTitle(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("ADDContactTitle"));
	    return element;
	}
	public static WebElement Drpdown_Contact_Category(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("ContactCategory"));
	    return element;
	}
	public static WebElement Drpdown_OverseasName(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("OverseasName"));
	    return element;
}
	public static WebElement Drpdown_ContactType(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("ContactType"));
	    return element;	
	}
	public static WebElement Dropdown_Title(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Title"));
	    return element;	
	}
	public static WebElement txtbx_Firstname(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("FirstName"));
	    return element;	
	}
	public static WebElement txtbx_Lastname(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("lastName"));
	    return element;	
	}
	public static WebElement txtbx_Designation(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Designation"));
	    return element;	
	}
	public static WebElement txtbx_Department(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Department"));
	    return element;	
	}
	public static WebElement txtbx_Email(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Email"));
	    return element;	
	}
	public static WebElement txtbx_Alt_Email1(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("AltEmail1"));
	    return element;	
	}
	public static WebElement txtbx_Alt_Email2(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("AltEmail2"));
	    return element;	
	}
	public static WebElement txtbx_MobNationalCode(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("MobNationalCode"));
	    return element;	
	}
	public static WebElement txtbx_MobStandardCode(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("MobStandardCode"));
	    return element;	
	}
	public static WebElement txtbx_MobNo(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("MobNo"));
	    return element;	
	}
	public static WebElement txtbx_PhoneNationalCode(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("PhoneNationalCode"));
	    return element;	
	}
	public static WebElement txtbx_PhoneStandardCode(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("PhoneStandardCode"));
	    return element;	
	}
	public static WebElement txtbx_PhoneNo(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("PhoneNo"));
	    return element;	
	}
	public static WebElement txtbx_PhoneNO3(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("PhoneNO3"));
	    return element;	
	}
	public static WebElement txtbx_Display(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Display"));
	    return element;	
	}
	public static WebElement Chkbx_Primary(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("PrimaryContact"));
	    return element;	
	}
	public static WebElement btn_Save(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("SaveBtn"));
	    return element;	
	}
	public static WebElement btn_Reset(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Reset"));
	    return element;	
	}
	public static WebElement Drpdown_DepartmentName(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("DepartmentName"));
	    return element;
 }
	public static WebElement Drpdown_ContactName(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("ContactName"));
	    return element;
 }
	public static WebElement Drpdown_Status(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Status"));
	    return element;
 }
	public static WebElement Chk_saveConfirm(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element=driver.findElement(parser.getLocator("Save_Confirm"));
		return element;
	}
	public static WebElement Save_Confirm_btnyes(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element=driver.findElement(parser.getLocator("Save_Confirm_btnyes"));
		return element;
		
	}
	public static WebElement Save_COnfirm_btnno(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element=driver.findElement(parser.getLocator("Save_COnfirm_btnno"));
		return element;
		
	}
}