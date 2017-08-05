package com.crm.pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.crm.utility.RepositoryParser;
import com.crm.config.Constants;

public class Homepage {
	public static RepositoryParser parser=new RepositoryParser();
	public static WebElement element=null;
	public static WebElement Logo_Image(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
	    element=driver.findElement(parser.getLocator("Logo")); 
		return element;
    }
    public static  WebElement btn_Crm(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
	    element=driver.findElement(parser.getLocator("btn_CRM")); 
		return element;
    }
    public static  WebElement btn_Logout(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
	    element=driver.findElement(parser.getLocator("Logout")); 
		return element;
}
}
