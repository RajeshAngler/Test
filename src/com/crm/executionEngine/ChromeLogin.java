package com.crm.executionEngine;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.crm.config.Constants;
import com.crm.pageObjects.Homepage;
public class ChromeLogin {
	protected static WebDriver driver;
	@BeforeTest
  public void beforeclass() {
	  System.setProperty(Constants.CHROME_DRIVER,Constants.CHROME_DRIVER_EXEPATH);
       driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Constants.baseUrl);
  }
//@AfterTest
//	public void afterclass() throws IOException
//	{
//	driver.close();	
//	}
}
