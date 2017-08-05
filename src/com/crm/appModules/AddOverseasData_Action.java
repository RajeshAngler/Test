package com.crm.appModules;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.crm.config.Constants;
import com.crm.pageObjects.AddAgentDataPage;
import com.crm.pageObjects.AddCustomerDataPage;
import com.crm.pageObjects.AddOverseasDataPage;
import com.crm.pageObjects.AddSupplierDataPage;
import com.crm.pageObjects.CRMDashboardPage;

public class AddOverseasData_Action {
	public static void Add_Overseasdata(WebDriver driver,String ContactCategory,String OverseasName,String ContactType,String Title,String firstname,String LastName,
			String Designation,
			String Department,
			String Email,
			String AltEmail1,
			String AltEmail2,
			String Mob1,
			String Mob2,
			String Mob,
			String Phone1,
			String Phone2,
			String Phone3,
			String Phone4,String primary,String DepartmentName,String ContactName
			) throws IOException, InterruptedException
	{
		/*
		for (String winHandle : driver.getWindowHandles()) {
		    driver.switchTo().window(winHandle); 
	*/
		//For Switching into pop-up
	/*String handle=driver.getWindowHandles().toArray()[1].toString();
	driver.switchTo().window(handle);*/
		/*String MainWindow=driver.getWindowHandle();
		 Set<String> s1=driver.getWindowHandles();		
	        Iterator<String> i1=s1.iterator();	
	        while(i1.hasNext())			
	        {		
	            String ChildWindow=i1.next();		
	            		
	            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
	            {    		
	                 
	                    // Switching to Child window
	                    driver.switchTo().window(ChildWindow);	}*/
		Thread.sleep(5000);
		if(!AddOverseasDataPage.Chk_add_ContactTitle(driver).isDisplayed())
		{
			System.out.println("Windows is not opened");
		}
		else
		{
			System.out.println("Im in Else Part");
			String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
			String subWindowHandler = null;

			Set<String> handles = driver.getWindowHandles(); // get all window handles
			Iterator<String> iterator = handles.iterator();
			while (iterator.hasNext()){
			    subWindowHandler = iterator.next();
			}
			driver.switchTo().window(subWindowHandler); // switch to popup window
			System.out.println("Im in Add Pop_Up Window");
			Thread.sleep(5000);
//			AddOverseasDataPage.Drpdown_Contact_Category(driver).click();
//			Thread.sleep(5000);
//			System.out.println("Im in ContactCategory"+ ContactCategory);
			Select element1=new Select(AddOverseasDataPage.Drpdown_Contact_Category(driver));
			element1.selectByVisibleText(ContactCategory);
			driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
			Select element2=new Select(AddOverseasDataPage.Drpdown_OverseasName(driver));
			element2.selectByVisibleText(OverseasName);
//		    		}
			if(ContactType.equalsIgnoreCase("MFC Contact"))
			{
			System.out.println("This is an MFC Contact");
			driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
			Select element3=new Select(AddOverseasDataPage.Drpdown_ContactType(driver));
			element3.selectByVisibleText(ContactType);
			driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
			Select element4=new Select(AddOverseasDataPage.Drpdown_DepartmentName(driver));
			element4.selectByVisibleText(DepartmentName);
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
			Select element5=new Select(AddOverseasDataPage.Drpdown_ContactName(driver));
			element5.selectByVisibleText(ContactName);
//			Select element6=new Select(AddOverseasDataPage.Drpdown_Status(driver));
//			element6.selectByVisibleText(Status);
//			driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
//			 if(!(primary!="Enable"))
//	            {
//	            	System.out.println("They are Not an Primary Customer");
//	            }
//	            else
//	            {
//	            	System.out.println("They are Primary Customer");
//	            	AddOverseasDataPage.Chkbx_Primary(driver).click();	
//	            }
//	            if(!(Account!="Enable"))
//	            {
//	            	System.out.println("They are Not an Account handler");
//	            	
//	            }
//	            else
//	            {
//	            	System.out.println("They are Account handler");
//	            	AddOverseasDataPage.Chkbx_IsAccountHandler(driver).click();	
//	            }
	            Thread.sleep(5000);
	            AddOverseasDataPage.btn_Reset(driver).click();
	            
			 }else
			 {
			driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
			Select element3=new Select(AddOverseasDataPage.Drpdown_ContactType(driver));
			element3.selectByVisibleText(ContactType);
		    driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		    Thread.sleep(5000);
		    Select element4 = new Select(AddOverseasDataPage.Dropdown_Title(driver));
		    element4.selectByVisibleText(Title);
		    AddOverseasDataPage.txtbx_Firstname(driver).sendKeys(firstname);
            AddOverseasDataPage.txtbx_Lastname(driver).sendKeys(LastName);
            AddOverseasDataPage.txtbx_Designation(driver).sendKeys(Designation);
            AddOverseasDataPage.txtbx_Department(driver).sendKeys(Department);
            AddOverseasDataPage.txtbx_Email(driver).sendKeys(Email);
            AddOverseasDataPage.txtbx_Alt_Email1(driver).sendKeys(AltEmail1);
            AddOverseasDataPage.txtbx_Alt_Email2(driver).sendKeys(AltEmail2);
            AddOverseasDataPage.txtbx_MobNationalCode(driver).sendKeys(Mob1);
            AddOverseasDataPage.txtbx_MobStandardCode(driver).sendKeys(Mob2);
            AddOverseasDataPage.txtbx_MobNo(driver).sendKeys(Mob);
            AddOverseasDataPage.txtbx_PhoneNationalCode(driver).sendKeys(Phone1);
            AddOverseasDataPage.txtbx_PhoneStandardCode(driver).sendKeys(Phone2);
            AddOverseasDataPage.txtbx_PhoneNO3(driver).sendKeys(Phone3);
            AddOverseasDataPage.txtbx_PhoneNo(driver).sendKeys(Phone4);
            String display=AddOverseasDataPage.txtbx_Display(driver).getAttribute("value");
            System.out.println(display);
            Assert.assertEquals(display,firstname+" "+LastName);
            if(true)
            {
            System.out.println("Displayed Name is correct");
            }
//            else
//            {
//            	System.out.println("Displayed Name is Not Correct");
//            }
            if(!(primary!="Enable"))
            {
            	System.out.println("They are Not an Primary Customer");
            }
            else
            {
            	System.out.println("They are Primary Customer");
            	AddOverseasDataPage.Chkbx_Primary(driver).click();	
            }
            Thread.sleep(3000);
            AddOverseasDataPage.btn_Reset(driver).click();
//          AddOverseasDataPage.btn_Save(driver).click();
            driver.switchTo().window(parentWindowHandler);  
            // switch back to parent window
		}}
	}
	public static Boolean chk_resetFunctionality(WebDriver driver,Boolean  result_reset) throws IOException, InterruptedException {
	       result_reset=false;
	       System.out.println("Checking the result condition");
		    
		   if( !(AddOverseasDataPage.btn_Reset(driver).isDisplayed()))
		   {
			   System.out.println("Reset button is not displayed");
		   }
		   else
		   {
			   System.out.println("Entered into else part & also Reset button is displayed");
     AddOverseasDataPage.btn_Reset(driver).click();
     Thread.sleep(5000);
//      String Actual_Contact_Category=AddOverseasDataPage.Drpdown_Contact_Category(driver).getAttribute("value");
//    String Actual_Drpdown_CompanyName=AddOverseasDataPage.Drpdown_CompanyName(driver).getAttribute("value");
//      String Actual_Drpdown_ContactType=AddOverseasDataPage.Drpdown_ContactType(driver).getAttribute("value");
//      String Actual_Dropdown_Title=AddOverseasDataPage.Dropdown_Title(driver).getAttribute("value");
      String Actual_Firstname= AddOverseasDataPage.txtbx_Firstname(driver).getAttribute("value");
      String Actual_Lastname= AddOverseasDataPage.txtbx_Lastname(driver).getAttribute("Value");
      String Actual_Designation=AddOverseasDataPage.txtbx_Designation(driver).getAttribute("value");
      String Actual_Department= AddOverseasDataPage.txtbx_Department(driver).getAttribute("value");
      String Actual_Email=AddOverseasDataPage.txtbx_Email(driver).getAttribute("value");
      String Actual_Alt_Email1= AddOverseasDataPage.txtbx_Alt_Email1(driver).getAttribute("value");
      String Actual_Alt_Email2=AddOverseasDataPage.txtbx_Alt_Email2(driver).getAttribute("value");
      String Actual_MobNationalCode=AddOverseasDataPage.txtbx_MobNationalCode(driver).getAttribute("value");
      String Actual_MobStandardCode=AddOverseasDataPage.txtbx_MobStandardCode(driver).getAttribute("value");
      String Actual_MobNo=AddOverseasDataPage.txtbx_MobNo(driver).getAttribute("value");
      String Actual_PhoneNationalCode=AddOverseasDataPage.txtbx_PhoneNationalCode(driver).getAttribute("value");
      String Actual_PhoneStandardCode= AddOverseasDataPage.txtbx_PhoneStandardCode(driver).getAttribute("value");
      String Actual_PhoneNO3=AddOverseasDataPage.txtbx_PhoneNO3(driver).getAttribute("value");
      String expected= " ";
//      boolean element10=AddOverseasDataPage.Chkbx_Primary(driver).isSelected();
//      boolean element11=AddOverseasDataPage.Chkbx_IsAccountHandler(driver).isSelected();
	    System.out.println("Actual_Firstname="+Actual_Firstname);
//      System.out.println(element10);
//      System.out.println(element11);
	     if(!( expected.equalsIgnoreCase(Actual_Firstname))
  	&& (expected.equalsIgnoreCase(Actual_Lastname)) && (expected.equalsIgnoreCase(Actual_Designation)) && (expected.equalsIgnoreCase(Actual_Department)) && (expected.equalsIgnoreCase(Actual_Email)) && (expected.equalsIgnoreCase(Actual_Alt_Email1)) && (expected.equalsIgnoreCase(Actual_Alt_Email2)) && 
    (expected.equalsIgnoreCase(Actual_MobNationalCode)) && (expected.equalsIgnoreCase(Actual_MobStandardCode)) && (expected.equalsIgnoreCase(Actual_MobNo)) && (expected.equalsIgnoreCase(Actual_PhoneNationalCode)) && (expected.equalsIgnoreCase(Actual_PhoneStandardCode))
     && (expected.equalsIgnoreCase(Actual_PhoneNO3)))           
      {
	    	 System.out.println("Fail"); 
	    	 
      }
	     else
      { 
	    	 System.out.println("Pass");
	       	result_reset= true;
   	       }
	 }
		   System.out.println(result_reset);
		   return result_reset; 
		   }
	
	public static Boolean chk_saveFunctionality(WebDriver driver,Boolean  result_save) throws IOException, InterruptedException
	{
		result_save=false;
		System.out.println("Checking the save condition");
		if( !(AddOverseasDataPage.btn_Save(driver).isDisplayed()))
		   {
			   System.out.println("Save button is not displayed");
		   }
		   else
		   {
			   System.out.println("Entered into else part & also Save button is displayed");
			   AddOverseasDataPage.btn_Save(driver).click();
			   Thread.sleep(5000);
			   if(!(AddOverseasDataPage.Chk_saveConfirm(driver).isDisplayed()))
			   {
				   System.out.println("Save Confirm message box is not displayed");
			   }else if(AddOverseasDataPage.Save_COnfirm_btnno(driver).isDisplayed())
			   {
				   AddOverseasDataPage.Save_COnfirm_btnno(driver).click();
				   
			       Thread.sleep(5000);
			       result_save=true;
			       driver.navigate().refresh();
			    if(CRMDashboardPage.Btn_AddContact(driver).isDisplayed())
			       {
			    	   CRMDashboardPage.Btn_AddContact(driver).click();
			    	   Thread.sleep(5000);
						       }
			   }
			}
		return result_save;}}
