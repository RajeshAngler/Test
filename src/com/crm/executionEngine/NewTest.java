package com.crm.executionEngine;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.crm.appModules.NavigatingtoContactMaster_Action;
import com.crm.config.Constants;
import com.crm.pageObjects.AddCustomerDataPage;

public class NewTest extends ChromeLogin {
	  @Test
	 public void test() throws Exception
	  {
		  Login_Test.Valid_Login_Test("arunkumar.m@angleritech.com","angler*#1400");  
	      driver.findElement(By.xpath("//A[@id='e0_3']")).click();
	      driver.findElement(By.xpath("//A[@id='e0_8']")).click();
	      driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
	      WebElement element1=driver.findElement(By.xpath("//INPUT[@id='gs_CompanyNameco']"));
	      element1.sendKeys("China");
	      element1.sendKeys(Keys.TAB);
	      driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
          WebElement element2= driver.findElement(By.xpath("//INPUT[@id='gs_ContactNameco']"));
	      element2.sendKeys("Hari");
	      driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
	      driver.findElement(By.xpath("//INPUT[@id='gs_Emailco']")).sendKeys("hari");
	      WebElement element3= driver.findElement(By.xpath("//INPUT[@id='gs_Departmentco']"));
	      element3.sendKeys("Accounts");
//	      WebElement element3=driver.findElement(By.xpath("//INPUT[@id='gs_Statusco']"));  
//	      Thread.sleep(2000);
////	      driver.findElement(By.xpath("//INPUT[@id='gs_Statusco']")).sendKeys(Keys.TAB.ENTER);
//	      element3.sendKeys("Active");
	      
          Actions act=new Actions(driver);
          act.moveToElement(element3);
          act.click();
          act.sendKeys(Keys.TAB);
	       Thread.sleep(1500);
	       System.out.println("Tab");
	       act.sendKeys(Keys.TAB);
	       act.sendKeys(Keys.TAB);
//	       Thread.sleep(1500);
	       act.sendKeys(Keys.TAB);
	       act.sendKeys(Keys.TAB);
//	       Thread.sleep(1500);
	       act.sendKeys(Keys.TAB);
	       Thread.sleep(1500);
	       act.sendKeys(Keys.TAB);
//	       act.sendKeys(Keys.TAB);
//	       act.sendKeys(Keys.TAB);
//	       Thread.sleep(3000);
	       act.sendKeys(Keys.ENTER);
	      
//	      element3.sendKeys(Keys.TAB);
//	      new Actions(driver).doubleClick().perform();
//	      WebElement activeElement = driver.switchTo().activeElement(); 
//	      activeElement.sendKeys(Keys.ENTER); 
//	      System.out.println("Enter");
	      act.build().perform();     
	  }
	  }