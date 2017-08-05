package com.crm.pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.crm.utility.RepositoryParser;
import com.crm.config.Constants;

public class LoginPage {
	public static RepositoryParser parser=new RepositoryParser();
	public static WebElement element=null;
	public static WebElement txtbx_UserName(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element=driver.findElement(parser.getLocator("Username"));
		System.out.println(driver.findElement(parser.getLocator("Username")));
		return element;
		}
	public static WebElement txtbx_PassWord(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element=driver.findElement(parser.getLocator("Password"));
		return element;
		}
   public static WebElement Btn_Login(WebDriver driver) throws IOException
    {
	parser.RepositoryParser(Constants.path_ObjectRepo);
	element=driver.findElement(parser.getLocator("Btn_Login"));
	return element;
       }
   public static WebElement Btn_Prev_Login(WebDriver driver) throws IOException
   {
	   parser.RepositoryParser(Constants.path_ObjectRepo);
	   element=driver.findElement(parser.getLocator("Btn_Pre_Login"));
	   return element;
   }
  }