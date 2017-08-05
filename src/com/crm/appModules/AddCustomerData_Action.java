package com.crm.appModules;

import java.io.IOException;
import java.util.ArrayList;
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

import com.crm.config.Constants;
import com.crm.pageObjects.AddCustomerDataPage;
import com.crm.pageObjects.CRMDashboardPage;

public class AddCustomerData_Action {
 //	static Boolean  result_reset=false;
	static ArrayList<String> added_Actual=new ArrayList<String>();
	static ArrayList<String> viewed_Actual=new ArrayList<String>();
	static ArrayList<String> saved_Actual=new ArrayList<String>();
	static ArrayList<String>  Edited_Actual=new ArrayList<String>();
	static ArrayList<String> Edited_Reset_Actual=new ArrayList<String>();
	static ArrayList<String> saved_Reset_Actual=new ArrayList<String>();
	public static void Add_Customerdata(WebDriver driver,String ContactCategory,String CompanyName,String ContactType,String Title,String firstname,String LastName,
			String Designation,
			String Department,
			String Email,
			String AltEmail1,
			String AltEmail2,
			String Mob1,
			String Mob2,
			String Mob,
//			String Phone1,
//			String Phone2,
//			String Phone3,
//			String Phone4,
			String primary,String Account,String DepartmentName,String ContactName,String Status
			) throws IOException, InterruptedException
	{
		
		Thread.sleep(5000);
		if(!AddCustomerDataPage.Chk_add_ContactTitle(driver).isDisplayed())
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
//			AddCustomerDataPage.Drpdown_Contact_Category(driver).click();
//			Thread.sleep(5000);
//			System.out.println("Im in ContactCategory"+ ContactCategory);
			Select element1=new Select(AddCustomerDataPage.Drpdown_Contact_Category(driver));
			element1.selectByVisibleText(ContactCategory);
			driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
			Select element2=new Select(AddCustomerDataPage.Drpdown_CompanyName(driver));
			element2.selectByVisibleText(CompanyName);
//		    		}
			
			if(ContactType.equalsIgnoreCase("MFC Contact"))
			{
			System.out.println("This is an MFC Contact");
			driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
			Select element3=new Select(AddCustomerDataPage.Drpdown_ContactType(driver));
			element3.selectByVisibleText(ContactType);
			driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
			Select element4=new Select(AddCustomerDataPage.Drpdown_DepartmentName(driver));
			element4.selectByVisibleText(DepartmentName);
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
			Select element5=new Select(AddCustomerDataPage.Drpdown_ContactName(driver));
			element5.selectByVisibleText(ContactName);
			Select element6=new Select(AddCustomerDataPage.Drpdown_Status(driver));
			element6.selectByVisibleText(Status);
			driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
			 if(!(primary!="Enable"))
	            {
	            	System.out.println("They are Not an Primary Customer");
	            }
	            else
	            {
	            	System.out.println("They are Primary Customer");
	            	AddCustomerDataPage.Chkbx_Primary(driver).click();	
	            }
	            if(!(Account!="Enable"))
	            {
	            	System.out.println("They are Not an Account handler");
	            	
	            }
	            else
	            {
	            	System.out.println("They are Account handler");
	            	AddCustomerDataPage.Chkbx_IsAccountHandler(driver).click();	
	            }
	            Thread.sleep(5000);
	            AddCustomerDataPage.btn_Reset(driver).click();
	          }
			else
			{
			System.out.println("This is not an MFC Customer Contact");
			driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
			Select element3=new Select(AddCustomerDataPage.Drpdown_ContactType(driver));
			element3.selectByVisibleText(ContactType);
		    driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		    Thread.sleep(5000);
		    Select element4 = new Select(AddCustomerDataPage.Dropdown_Title(driver));
		    element4.selectByVisibleText(Title);
		    AddCustomerDataPage.txtbx_Firstname(driver).clear();
		    AddCustomerDataPage.txtbx_Firstname(driver).sendKeys(firstname);
            AddCustomerDataPage.txtbx_Lastname(driver).clear();
            AddCustomerDataPage.txtbx_Lastname(driver).sendKeys(LastName);
            AddCustomerDataPage.txtbx_Designation(driver).clear();
            AddCustomerDataPage.txtbx_Designation(driver).sendKeys(Designation);
            AddCustomerDataPage.txtbx_Department(driver).clear();
            AddCustomerDataPage.txtbx_Department(driver).sendKeys(Department);
            AddCustomerDataPage.txtbx_Email(driver).clear();
            AddCustomerDataPage.txtbx_Email(driver).sendKeys(Email);
            AddCustomerDataPage.txtbx_Alt_Email1(driver).clear();
            AddCustomerDataPage.txtbx_Alt_Email1(driver).sendKeys(AltEmail1);
            AddCustomerDataPage.txtbx_Alt_Email2(driver).clear();
            AddCustomerDataPage.txtbx_Alt_Email2(driver).sendKeys(AltEmail2);
            AddCustomerDataPage.txtbx_MobNationalCode(driver).clear();
            AddCustomerDataPage.txtbx_MobNationalCode(driver).sendKeys(Mob1);
            AddCustomerDataPage.txtbx_MobStandardCode(driver).clear();
            AddCustomerDataPage.txtbx_MobStandardCode(driver).sendKeys(Mob2);
            AddCustomerDataPage.txtbx_MobNo(driver).clear();
            AddCustomerDataPage.txtbx_MobNo(driver).sendKeys(Mob);
//            AddCustomerDataPage.txtbx_PhoneNationalCode(driver).clear();
//            Thread.sleep(1500);
//            AddCustomerDataPage.txtbx_PhoneNationalCode(driver).sendKeys(Phone1);
//            AddCustomerDataPage.txtbx_PhoneStandardCode(driver).clear();
//            Thread.sleep(1500);
//            AddCustomerDataPage.txtbx_PhoneStandardCode(driver).sendKeys(Phone2);
//            AddCustomerDataPage.txtbx_PhoneNO3(driver).clear();
//            Thread.sleep(1500);
//            AddCustomerDataPage.txtbx_PhoneNO3(driver).sendKeys(Phone3);
//            AddCustomerDataPage.txtbx_PhoneNo(driver).clear();
//            AddCustomerDataPage.txtbx_PhoneNo(driver).sendKeys(Phone4);
            String display=AddCustomerDataPage.txtbx_Display(driver).getAttribute("value");
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
            	AddCustomerDataPage.Chkbx_Primary(driver).click();	
            }
            if(!(Account!="Enable"))
            {
            	System.out.println("They are Not an Account handler");
            	
            }
            else
            {
            	System.out.println("They are Account handler");
            	AddCustomerDataPage.Chkbx_IsAccountHandler(driver).click();	
            }
            Thread.sleep(5000);
			}}
          
	}

	public static Boolean chk_resetFunctionality(WebDriver driver,Boolean  result_reset) throws IOException, InterruptedException {
		result_reset=false;
		System.out.println("Checking the result condition");
			    
			   if( !(AddCustomerDataPage.btn_Reset(driver).isDisplayed()))
			   {
				   System.out.println("Reset button is not displayed");
			   }
			   else
			   {
				   System.out.println("Entered into else part & also Reset button is displayed");
	           AddCustomerDataPage.btn_Reset(driver).click();
	           Thread.sleep(5000);
//	            String Actual_Contact_Category=AddCustomerDataPage.Drpdown_Contact_Category(driver).getAttribute("value");
//	          String Actual_Drpdown_CompanyName=AddCustomerDataPage.Drpdown_CompanyName(driver).getAttribute("value");
//	            String Actual_Drpdown_ContactType=AddCustomerDataPage.Drpdown_ContactType(driver).getAttribute("value");
//	            String Actual_Dropdown_Title=AddCustomerDataPage.Dropdown_Title(driver).getAttribute("value");
	            String Actual_Firstname= AddCustomerDataPage.txtbx_Firstname(driver).getAttribute("value");
	            String Actual_Lastname= AddCustomerDataPage.txtbx_Lastname(driver).getAttribute("Value");
	            String Actual_Designation=AddCustomerDataPage.txtbx_Designation(driver).getAttribute("value");
	            String Actual_Department= AddCustomerDataPage.txtbx_Department(driver).getAttribute("value");
	            String Actual_Email=AddCustomerDataPage.txtbx_Email(driver).getAttribute("value");
	            String Actual_Alt_Email1= AddCustomerDataPage.txtbx_Alt_Email1(driver).getAttribute("value");
	            String Actual_Alt_Email2=AddCustomerDataPage.txtbx_Alt_Email2(driver).getAttribute("value");
	            String Actual_MobNationalCode=AddCustomerDataPage.txtbx_MobNationalCode(driver).getAttribute("value");
	            String Actual_MobStandardCode=AddCustomerDataPage.txtbx_MobStandardCode(driver).getAttribute("value");
	            String Actual_MobNo=AddCustomerDataPage.txtbx_MobNo(driver).getAttribute("value");
//	            String Actual_PhoneNationalCode=AddCustomerDataPage.txtbx_PhoneNationalCode(driver).getAttribute("value");
//	            String Actual_PhoneStandardCode= AddCustomerDataPage.txtbx_PhoneStandardCode(driver).getAttribute("value");
//	            String Actual_PhoneNO3=AddCustomerDataPage.txtbx_PhoneNO3(driver).getAttribute("value");
	            String expected= " ";
//	            boolean element10=AddCustomerDataPage.Chkbx_Primary(driver).isSelected();
//	            boolean element11=AddCustomerDataPage.Chkbx_IsAccountHandler(driver).isSelected();
	      	    System.out.println("Actual_Firstname="+Actual_Firstname);
//	            System.out.println(element10);
//	            System.out.println(element11);
	         	if(!( expected.equalsIgnoreCase(Actual_Firstname))
	              	&& (expected.equalsIgnoreCase(Actual_Lastname)) && (expected.equalsIgnoreCase(Actual_Designation)) && (expected.equalsIgnoreCase(Actual_Department)) && (expected.equalsIgnoreCase(Actual_Email)) && (expected.equalsIgnoreCase(Actual_Alt_Email1)) && (expected.equalsIgnoreCase(Actual_Alt_Email2)) && 
	                (expected.equalsIgnoreCase(Actual_MobNationalCode)) && (expected.equalsIgnoreCase(Actual_MobStandardCode)) && (expected.equalsIgnoreCase(Actual_MobNo)) 
//	                && (expected.equalsIgnoreCase(Actual_PhoneNationalCode)) && (expected.equalsIgnoreCase(Actual_PhoneStandardCode))
//	                 && (expected.equalsIgnoreCase(Actual_PhoneNO3))
	                )           
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
		if( !(AddCustomerDataPage.btn_Save(driver).isDisplayed()))
		   {
			   System.out.println("Save button is not displayed");
		   }
		   else
		   {
			   System.out.println("Entered into else part & also Save button is displayed");
			   
			   AddCustomerDataPage.btn_Save(driver).click();
			   Thread.sleep(5000);
			   if(!(AddCustomerDataPage.Chk_saveConfirm(driver).isDisplayed()))
			   {
				   System.out.println("Save Confirm message box is not displayed");
			   }
			   else if(AddCustomerDataPage.Save_COnfirm_btnno(driver).isDisplayed())
			   {
				    Thread.sleep(5000);
				    String Actual_savedFirstname= AddCustomerDataPage.txtbx_Firstname(driver).getAttribute("value");
		            String Actual_savedLastname= AddCustomerDataPage.txtbx_Lastname(driver).getAttribute("Value");
		            String Actual_savedDesignation=AddCustomerDataPage.txtbx_Designation(driver).getAttribute("value");
		            String Actual_savedDepartment= AddCustomerDataPage.txtbx_Department(driver).getAttribute("value");
		            String Actual_savedEmail=AddCustomerDataPage.txtbx_Email(driver).getAttribute("value");
		            String Actual_savedAlt_Email1= AddCustomerDataPage.txtbx_Alt_Email1(driver).getAttribute("value");
		            String Actual_savedAlt_Email2=AddCustomerDataPage.txtbx_Alt_Email2(driver).getAttribute("value");
		            String Actual_savedMobNationalCode=AddCustomerDataPage.txtbx_MobNationalCode(driver).getAttribute("value");
		            String Actual_savedMobStandardCode=AddCustomerDataPage.txtbx_MobStandardCode(driver).getAttribute("value");
		            String Actual_savedMobNo=AddCustomerDataPage.txtbx_MobNo(driver).getAttribute("value");
//		            String Actual_savedPhoneNationalCode=AddCustomerDataPage.txtbx_PhoneNationalCode(driver).getAttribute("value");
//		            String Actual_savedPhoneStandardCode= AddCustomerDataPage.txtbx_PhoneStandardCode(driver).getAttribute("value");
//		            String Actual_savedPhoneNO3=AddCustomerDataPage.txtbx_PhoneNO3(driver).getAttribute("value");
		            
//				    saved_Actual=new String[]{ Actual_savedFirstname,Actual_savedLastname,Actual_savedDesignation,Actual_savedDepartment,Actual_savedEmail,Actual_savedAlt_Email1,
//				    		                Actual_savedAlt_Email2,Actual_savedMobNationalCode,Actual_savedMobStandardCode,Actual_savedMobNo,Actual_savedPhoneNationalCode,
//				    		                Actual_savedPhoneStandardCode,Actual_savedPhoneNO3 };
		            
		            added_Actual.add(Actual_savedFirstname );
		            added_Actual.add(Actual_savedLastname );
		            added_Actual.add(Actual_savedEmail );
		            added_Actual.add(Actual_savedDepartment );
		            added_Actual.add(Actual_savedDesignation);
		            AddCustomerDataPage.Save_COnfirm_btnno(driver).click();
			        Thread.sleep(5000);
//			        Assert.assertTrue(driver.getPageSource().contains(Actual_savedFirstname));
//			        result_save=true;
//			        driver.navigate().refresh();
//			        Thread.sleep(2500);     
//			    if(CRMDashboardPage.Btn_AddContact(driver).isDisplayed())
//			       {
//			    	   CRMDashboardPage.Btn_AddContact(driver).click();
//			    	   Thread.sleep(5000);
//			       }
			        if(!(AddCustomerDataPage.chk_Grid_CustomerTitle(driver).isDisplayed()))
			         {
			        	 System.out.println("Customer  Grid is not displayed");
			         }else
			         {
			        	 System.out.println("Customer Grid is Displayed");
//			             driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
//			             System.out.println("CompanyName="+CompanyName);
//			             Thread.sleep(5000);
//			             try
//			             {
//			             AddCustomerDataPage.Grid_CompanyName(driver).click();
//			             AddCustomerDataPage.Grid_CompanyName(driver).sendKeys(CompanyName);
//			             }
//			             catch(Exception err)
//			             {
//			            	 System.out.println("Error="+err);
//			             }
			             AddCustomerDataPage.Grid_ContactName(driver).sendKeys(Actual_savedFirstname);
			             AddCustomerDataPage.Grid_Email(driver).sendKeys(Actual_savedEmail);
			             AddCustomerDataPage.Grid_Department(driver).sendKeys(Actual_savedDepartment);
			            WebElement element15=AddCustomerDataPage.Grid_Designation(driver);
			            element15.sendKeys(Actual_savedDesignation);
//			            AddCustomerDataPage.Grid_CompanyName(driver).sendKeys(Grid_Country);
//			            AddCustomerDataPage.Grid_CompanyName(driver).sendKeys(Grid_City);
//			            AddCustomerDataPage.Grid_ContactType(driver).sendKeys(ContactType);
			             Thread.sleep(3000);
//			             WebElement element11=AddCustomerDataPage.Grid_Status(driver);
//			             element11.sendKeys(Status);
			             Actions act=new Actions(driver);
			             act.moveToElement(element15);
			             act.click();
			             act.sendKeys(Keys.TAB);
			   	       Thread.sleep(1500);
			   	       System.out.println("Tab");
			   	       act.sendKeys(Keys.TAB);
			   	       act.sendKeys(Keys.TAB);
//			   	       Thread.sleep(1500);
			   	       act.sendKeys(Keys.TAB);
			   	       act.sendKeys(Keys.TAB);
//			   	       Thread.sleep(1500);
			   	       act.sendKeys(Keys.TAB);
			   	       Thread.sleep(1500);
//			   	       act.sendKeys(Keys.TAB);
//			   	       act.sendKeys(Keys.TAB);
//			   	       act.sendKeys(Keys.TAB);
//			   	       Thread.sleep(3000);
			   	       act.sendKeys(Keys.ENTER);
			   	      
//			   	      element3.sendKeys(Keys.TAB);
//			   	      new Actions(driver).doubleClick().perform();
//			   	      WebElement activeElement = driver.switchTo().activeElement(); 
//			   	      activeElement.sendKeys(Keys.ENTER); 
//			   	      System.out.println("Enter");
			   	      act.build().perform();  
			   	    String Viewed_Actual_savedFirstname= AddCustomerDataPage.txtbx_Firstname(driver).getAttribute("value");
		            String Viewed_Actual_savedLastname= AddCustomerDataPage.txtbx_Lastname(driver).getAttribute("Value");
		            String Viewed_Actual_savedDesignation=AddCustomerDataPage.txtbx_Designation(driver).getAttribute("value");
		            String Viewed_Actual_savedDepartment= AddCustomerDataPage.txtbx_Department(driver).getAttribute("value");
		            String Viewed_Actual_savedEmail=AddCustomerDataPage.txtbx_Email(driver).getAttribute("value");
		            String Viewed_Actual_savedAlt_Email1= AddCustomerDataPage.txtbx_Alt_Email1(driver).getAttribute("value");
		            String Viewed_Actual_savedAlt_Email2=AddCustomerDataPage.txtbx_Alt_Email2(driver).getAttribute("value");
		            String Viewed_Actual_savedMobNationalCode=AddCustomerDataPage.txtbx_MobNationalCode(driver).getAttribute("value");
		            String Viewed_Actual_savedMobStandardCode=AddCustomerDataPage.txtbx_MobStandardCode(driver).getAttribute("value");
		            String Viewed_Actual_savedMobNo=AddCustomerDataPage.txtbx_MobNo(driver).getAttribute("value");
//		            String Viewed_Actual_savedPhoneNationalCode=AddCustomerDataPage.txtbx_PhoneNationalCode(driver).getAttribute("value");
//		            String Viewed_Actual_savedPhoneStandardCode= AddCustomerDataPage.txtbx_PhoneStandardCode(driver).getAttribute("value");
//		            String Viewed_Actual_savedPhoneNO3=AddCustomerDataPage.txtbx_PhoneNO3(driver).getAttribute("value");
		            String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
					String subWindowHandler = null;

					Set<String> handles = driver.getWindowHandles(); // get all window handles
					Iterator<String> iterator = handles.iterator();
					while (iterator.hasNext()){
					    subWindowHandler = iterator.next();
					}
					driver.switchTo().window(subWindowHandler); // switch to popup window
					System.out.println("Im in view Pop_Up Window");
					Thread.sleep(5000);
		            viewed_Actual.add(Viewed_Actual_savedFirstname );
		            viewed_Actual.add(Viewed_Actual_savedLastname );
		            viewed_Actual.add(Viewed_Actual_savedEmail );
		            viewed_Actual.add(Viewed_Actual_savedDepartment );
		            viewed_Actual.add(Viewed_Actual_savedDesignation);
		            int added_Actual_count=added_Actual.size();
		            int viewed_Actual_count=viewed_Actual.size();
		            System.out.println(added_Actual_count);
		            System.out.println(viewed_Actual_count);
		          
//		            for(int i=0;i<added_Actual_count;i++)
//		            {
//		          	  System.out.println("Values of Edited Actual are" +added_Actual.get(i) );
//		          	  System.out.println("Values of saved Actual are" +viewed_Actual.get(i));
//		            }
//		            System.out.println(added_Actual_count);
//		            System.out.println(viewed_Actual_count);
		            for(int i=0;i<added_Actual_count;i++)
		            {
		        	  System.out.println("First");
		         	  System.out.println(added_Actual_count);
		         	   for(int j=0;j<viewed_Actual_count;j++)
		          	{
		          		 System.out.println("Second");
		          	     System.out.println(viewed_Actual_count);
		          		 String Actual=added_Actual.get(i);
//		          		 System.out.println(added_Actual.get(i));
		          		 String Expected=viewed_Actual.get(j);
//		          		 System.out.println("Actual"+added_Actual.get(i));
//		          		 System.out.println("Expected"+viewed_Actual.get(j));
		         	         if(Expected.equals(Actual))
		          		 {
		         			 System.out.println("Values as added successfully");
		         			  result_save=true;	
		          		 }
		         	     else
		          		 {
		          		 System.out.println("Values as not added successfully");
		          		 }
		            	}
		                  }
//		            if(added_Actual.equals(viewed_Actual))
//		            {
//		          	  System.out.println("Pass");
//		            }
		           }
		           }}
		           return result_save;
			         }
		
         public static Boolean chk_EditFunctionality(WebDriver driver,String ContactCategory,String  CompanyName,String  Firstname,String  Email,String  Department,String  Designation,String  ContactType,String Status,Boolean result_Edit) throws IOException, InterruptedException
         {
         result_Edit=false;
//         Thread.sleep(2500);
//         driver.navigate().back();
//         Thread.sleep(4000);
//         driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
        	 Thread.sleep(4000);
         if(!(AddCustomerDataPage.Grid_ContactCategory_dropdown(driver).isDisplayed()))
         {
        	 System.out.println("Contact category is not displayed");
         }else
         {
        	 Thread.sleep(3000);
         Select element1=new Select(AddCustomerDataPage.Grid_ContactCategory_dropdown(driver));
         element1.selectByVisibleText(ContactCategory);
         if(!(AddCustomerDataPage.chk_Grid_CustomerTitle(driver).isDisplayed()))
         {
        	 System.out.println("Customer  Grid is not displayed");
         }else
         {
        	 System.out.println("Customer Grid is Displayed");
//             driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
             System.out.println("CompanyName="+CompanyName);
             Thread.sleep(5000);
             try
             {
             AddCustomerDataPage.Grid_CompanyName(driver).click();
             AddCustomerDataPage.Grid_CompanyName(driver).sendKeys(CompanyName);
             }
             catch(Exception err)
             {
            	 System.out.println("Error="+err);
             }
             AddCustomerDataPage.Grid_ContactName(driver).sendKeys(Firstname);
             AddCustomerDataPage.Grid_Email(driver).sendKeys(Email);
             AddCustomerDataPage.Grid_Department(driver).sendKeys(Department);
             AddCustomerDataPage.Grid_Designation(driver).sendKeys(Designation);
//           AddCustomerDataPage.Grid_CompanyName(driver).sendKeys(Grid_Country);
//           AddCustomerDataPage.Grid_CompanyName(driver).sendKeys(Grid_City);
             AddCustomerDataPage.Grid_ContactType(driver).sendKeys(ContactType);
             Thread.sleep(3000);
             WebElement element11=AddCustomerDataPage.Grid_Status(driver);
             element11.sendKeys(Status);
             Actions act=new Actions(driver);
             act.moveToElement(element11);
             act.click();
             act.sendKeys(Keys.TAB);
   	         Thread.sleep(5000);
   	         System.out.println("Focus on the edit Icon");
   	         act.sendKeys(Keys.ENTER);
   	         act.build().perform();
   	         Thread.sleep(5000);
   	      String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
			String subWindowHandler = null;

			Set<String> handles = driver.getWindowHandles(); // get all window handles
			Iterator<String> iterator = handles.iterator();
			while (iterator.hasNext()){
			    subWindowHandler = iterator.next();
			}
			driver.switchTo().window(subWindowHandler); // switch to popup window
			System.out.println("Im in Edit Pop_Up Window");
			Thread.sleep(5000);
   	      String Actual_EditedFirstname= AddCustomerDataPage.txtbx_Firstname(driver).getAttribute("value");
          String Actual_EditedLastname= AddCustomerDataPage.txtbx_Lastname(driver).getAttribute("Value");
          String Actual_EditedDesignation=AddCustomerDataPage.txtbx_Designation(driver).getAttribute("value");
          String Actual_EditedDepartment= AddCustomerDataPage.txtbx_Department(driver).getAttribute("value");
          String Actual_EditedEmail=AddCustomerDataPage.txtbx_Email(driver).getAttribute("value");
          String Actual_EditedAlt_Email1= AddCustomerDataPage.txtbx_Alt_Email1(driver).getAttribute("value");
          String Actual_EditedAlt_Email2=AddCustomerDataPage.txtbx_Alt_Email2(driver).getAttribute("value");
          String Actual_EditedMobNationalCode=AddCustomerDataPage.txtbx_MobNationalCode(driver).getAttribute("value");
          String Actual_EditedMobStandardCode=AddCustomerDataPage.txtbx_MobStandardCode(driver).getAttribute("value");
          String Actual_EditedMobNo=AddCustomerDataPage.txtbx_MobNo(driver).getAttribute("value");
//          String Actual_EditedPhoneNationalCode=AddCustomerDataPage.txtbx_PhoneNationalCode(driver).getAttribute("value");
//          String Actual_EditedPhoneStandardCode= AddCustomerDataPage.txtbx_PhoneStandardCode(driver).getAttribute("value");
//          String Actual_EditedPhoneNO3=AddCustomerDataPage.txtbx_PhoneNO3(driver).getAttribute("value");
//        Edited_Actual=new String[]{ Actual_EditedFirstname,Actual_EditedLastname,Actual_EditedDesignation,Actual_EditedDepartment,Actual_EditedEmail,Actual_EditedAlt_Email1,
//	      Actual_EditedAlt_Email2,Actual_EditedMobNationalCode,Actual_EditedMobStandardCode,Actual_EditedMobNo,Actual_EditedPhoneNationalCode,
//	      Actual_EditedPhoneStandardCode,Actual_EditedPhoneNO3 };
          System.out.println(Actual_EditedFirstname);
          Edited_Actual.add(Actual_EditedFirstname);
          Edited_Actual.add(Actual_EditedEmail );
          Edited_Actual.add(Actual_EditedDepartment );
          Edited_Actual.add(Actual_EditedDesignation);
          saved_Actual.add(Firstname);
          saved_Actual.add(Email);
          saved_Actual.add(Department);
          saved_Actual.add(Designation);
          int Edited_Actual_count=Edited_Actual.size();
          int saved_Actual_count=saved_Actual.size();
          System.out.println(Edited_Actual_count);
          System.out.println(saved_Actual_count);
        
//          for(int i=0;i<Edited_Actual_count;i++)
//          {
//        	  System.out.println("Values of Edited Actual are" +Edited_Actual.get(i) );
//        	  System.out.println("Values of saved Actual are" +saved_Actual.get(i));
//          }
//          System.out.println(Edited_Actual_count);
          System.out.println(saved_Actual_count);
          for(int i=0;i<Edited_Actual_count;i++)
          {
      	  System.out.println("First");
       	  System.out.println(Edited_Actual_count);
       	   for(int j=0;j<saved_Actual_count;j++)
        	{
        		 System.out.println("Second");
        	     System.out.println(saved_Actual_count);
        		 String Actual=Edited_Actual.get(i);
//        		 System.out.println(Edited_Actual.get(i));
        		 String Expected=saved_Actual.get(j);
//        		 System.out.println("Actual"+Edited_Actual.get(i));
//        		 System.out.println("Expected"+saved_Actual.get(j));
       	         if(Expected.equals(Actual))
        		 {
       			 System.out.println("Values as saved are appeared");
        		 result_Edit=true;
        		 }
        		 else
        		 {
        		 System.out.println("Values as saved are not appeared");
        		 }
          	}
                }
//          if(Edited_Actual.equals(saved_Actual))
//          {
//        	  System.out.println("Pass");
//          }
         }
         }
         return result_Edit;
                  }
      public static Boolean chk_EditresetFunctionality(WebDriver driver,Boolean  result_Edit_reset) throws IOException, InterruptedException {
     		result_Edit_reset=false;
     		System.out.println("Checking the result condition");
     			    
     			   if( !(AddCustomerDataPage.btn_Reset(driver).isDisplayed()))
     			   {
     				   System.out.println("Reset button is not displayed");
     			   }
     			   else
     			   {
     				   System.out.println("Entered into else part & also Reset button is displayed");
        	            String saved_EditresetFirstname= AddCustomerDataPage.txtbx_Firstname(driver).getAttribute("value");
         	            String saved_EditresetEmail=AddCustomerDataPage.txtbx_Email(driver).getAttribute("value");
         	            String saved_resetDepartment= AddCustomerDataPage.txtbx_Department(driver).getAttribute("value");
         	            String saved_EditresetDesignation=AddCustomerDataPage.txtbx_Designation(driver).getAttribute("value");
     				   AddCustomerDataPage.btn_Reset(driver).click();
     	           Thread.sleep(5000);
//     	            String Actual_Contact_Category=AddCustomerDataPage.Drpdown_Contact_Category(driver).getAttribute("value");
//     	          String Actual_Drpdown_CompanyName=AddCustomerDataPage.Drpdown_CompanyName(driver).getAttribute("value");
//     	            String Actual_Drpdown_ContactType=AddCustomerDataPage.Drpdown_ContactType(driver).getAttribute("value");
//     	            String Actual_Dropdown_Title=AddCustomerDataPage.Dropdown_Title(driver).getAttribute("value");
     	            String Actual_EditresetFirstname= AddCustomerDataPage.txtbx_Firstname(driver).getAttribute("value");
     	            String Actual_EditresetLastname= AddCustomerDataPage.txtbx_Lastname(driver).getAttribute("Value");
     	            String Actual_EditresetDesignation=AddCustomerDataPage.txtbx_Designation(driver).getAttribute("value");
     	            String Actual_EditresetDepartment= AddCustomerDataPage.txtbx_Department(driver).getAttribute("value");
     	            String Actual_EditresetEmail=AddCustomerDataPage.txtbx_Email(driver).getAttribute("value");
     	            String Actual_EditresetAlt_Email1= AddCustomerDataPage.txtbx_Alt_Email1(driver).getAttribute("value");
     	            String Actual_EditresetAlt_Email2=AddCustomerDataPage.txtbx_Alt_Email2(driver).getAttribute("value");
     	            String Actual_EditresetMobNationalCode=AddCustomerDataPage.txtbx_MobNationalCode(driver).getAttribute("value");
     	            String Actual_EditresetMobStandardCode=AddCustomerDataPage.txtbx_MobStandardCode(driver).getAttribute("value");
     	            String Actual_EditresetMobNo=AddCustomerDataPage.txtbx_MobNo(driver).getAttribute("value");
//     	            String Actual_EditresetPhoneNationalCode=AddCustomerDataPage.txtbx_PhoneNationalCode(driver).getAttribute("value");
//     	            String Actual_EditresetPhoneStandardCode= AddCustomerDataPage.txtbx_PhoneStandardCode(driver).getAttribute("value");
//     	            String Actual_EditresetPhoneNO3=AddCustomerDataPage.txtbx_PhoneNO3(driver).getAttribute("value");
     	            Edited_Reset_Actual.add(Actual_EditresetFirstname);
     	            Edited_Reset_Actual.add(Actual_EditresetEmail );
     	            Edited_Reset_Actual.add(Actual_EditresetDepartment );
     	            Edited_Reset_Actual.add(Actual_EditresetDesignation);
     	            saved_Reset_Actual.add(saved_EditresetFirstname);
     	            saved_Reset_Actual.add(saved_EditresetEmail);
     	            saved_Reset_Actual.add(saved_resetDepartment);
     	            saved_Reset_Actual.add(saved_EditresetDesignation);
//     	            boolean element10=AddCustomerDataPage.Chkbx_Primary(driver).isSelected();
//     	            boolean element11=AddCustomerDataPage.Chkbx_IsAccountHandler(driver).isSelected();
     	      	    System.out.println("Actual_Firstname="+Actual_EditresetFirstname);
//     	            System.out.println(element10);
//     	            System.out.println(element11);
     	      	  int Edited_resetActual_count=Edited_Reset_Actual.size();
     	          int saved_resetActual_count=saved_Reset_Actual.size();
     	          System.out.println(Edited_resetActual_count);
     	          System.out.println(saved_resetActual_count);
     	        
//     	          for(int i=0;i<Edited_Actual_count;i++)
//     	          {
//     	        	  System.out.println("Values of Edited Actual are" +Edited_Actual.get(i) );
//     	        	  System.out.println("Values of saved Actual are" +saved_Actual.get(i));
//     	          }
//     	          System.out.println(Edited_Actual_count);
     	          System.out.println(saved_resetActual_count);
     	          for(int i=0;i<Edited_resetActual_count;i++)
     	          {
     	      	  System.out.println("First");
     	       	  System.out.println(Edited_resetActual_count);
     	       	   for(int j=0;j<saved_resetActual_count;j++)
     	        	{
     	        		 System.out.println("Second");
     	        	     System.out.println(saved_resetActual_count);
     	        		 String Actual=Edited_Reset_Actual.get(i);
//     	        		 System.out.println(Edited_Actual.get(i));
     	        		 String Expected=saved_Reset_Actual.get(j);
//     	        		 System.out.println("Actual"+Edited_Actual.get(i));
//     	        		 System.out.println("Expected"+saved_Actual.get(j));
     	       	         if(Expected.equals(Actual))
     	        		 {
     	       			 System.out.println("Values are reset");
     	       			result_Edit_reset=true;
     	        		 }
     	        		 else
     	        		 {
     	        		 System.out.println("Values are not reset");
     	        		 }
     	          	}
     	                }
//     	          if(Edited_Actual.equals(saved_Actual))
//     	          {
//     	        	  System.out.println("Pass");
//     	          }
     	         }
     	         
     	         return result_Edit_reset;
     	  			   }
         
}


//Actual_Contact_Category.equals(expected) && Actual_Drpdown_ContactType.equals(expected) && Actual_Dropdown_Title.equals(expected) && && element10==false && element11==true