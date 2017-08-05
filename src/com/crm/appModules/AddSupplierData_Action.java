package com.crm.appModules;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.crm.config.Constants;
import com.crm.pageObjects.AddAgentDataPage;
import com.crm.pageObjects.AddCustomerDataPage;
import com.crm.pageObjects.AddSupplierDataPage;
import com.crm.pageObjects.CRMDashboardPage;

public class AddSupplierData_Action {
	static ArrayList<String> added_Actual=new ArrayList<String>();
	static ArrayList<String> viewed_Actual=new ArrayList<String>();
	static ArrayList<String> saved_Actual=new ArrayList<String>();
	static ArrayList<String>  Edited_Actual=new ArrayList<String>();
	static ArrayList<String> Edited_Reset_Actual=new ArrayList<String>();
	static ArrayList<String> saved_Reset_Actual=new ArrayList<String>();
	public static void Add_SupplierData(WebDriver driver,String ContactCategory,String SupplierName,String ContactType,String Title,String firstname,String LastName,
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
			String primary,String DepartmentName,String ContactName
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
		if(!AddSupplierDataPage.Chk_add_ContactTitle(driver).isDisplayed())
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
//			AddSupplierDataPage.Drpdown_Contact_Category(driver).click();
//			Thread.sleep(5000);
//			System.out.println("Im in ContactCategory"+ ContactCategory);
			Select element1=new Select(AddSupplierDataPage.Drpdown_Contact_Category(driver));
			element1.selectByVisibleText(ContactCategory);
			driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
			Select element2=new Select(AddSupplierDataPage.Drpdown_SupplierName(driver));
			element2.selectByVisibleText(SupplierName);
//		    		}
			if(ContactType.equalsIgnoreCase("MFC Contact"))
			{
			System.out.println("This is an MFC Contact");
			driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
			Select element3=new Select(AddSupplierDataPage.Drpdown_ContactType(driver));
			element3.selectByVisibleText(ContactType);
			driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
			Select element4=new Select(AddSupplierDataPage.Drpdown_DepartmentName(driver));
			element4.selectByVisibleText(DepartmentName);
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
			Select element5=new Select(AddSupplierDataPage.Drpdown_ContactName(driver));
			element5.selectByVisibleText(ContactName);
//			Select element6=new Select(AddSupplierDataPage.Drpdown_Status(driver));
//			element6.selectByVisibleText(Status);
//			driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
//			 if(!(primary!="Enable"))
//	            {
//	            	System.out.println("They are Not an Primary Customer");
//	            }
//	            else
//	            {
//	            	System.out.println("They are Primary Customer");
//	            	AddSupplierDataPage.Chkbx_Primary(driver).click();	
//	            }
//	            if(!(Account!="Enable"))
//	            {
//	            	System.out.println("They are Not an Account handler");
//	            	
//	            }
//	            else
//	            {
//	            	System.out.println("They are Account handler");
//	            	AddSupplierDataPage.Chkbx_IsAccountHandler(driver).click();	
//	            }
	            Thread.sleep(5000);
	            AddSupplierDataPage.btn_Reset(driver).click();
	            
			 }else
			 {
			driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
			Select element3=new Select(AddSupplierDataPage.Drpdown_ContactType(driver));
			element3.selectByVisibleText(ContactType);
		    driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		    Thread.sleep(5000);
		    Select element4 = new Select(AddSupplierDataPage.Dropdown_Title(driver));
		    element4.selectByVisibleText(Title);
		    AddSupplierDataPage.txtbx_Firstname(driver).clear();
		    AddSupplierDataPage.txtbx_Firstname(driver).sendKeys(firstname);
            AddSupplierDataPage.txtbx_Lastname(driver).clear();
            AddSupplierDataPage.txtbx_Lastname(driver).sendKeys(LastName);
            AddSupplierDataPage.txtbx_Designation(driver).clear();
            AddSupplierDataPage.txtbx_Designation(driver).sendKeys(Designation);
            AddSupplierDataPage.txtbx_Department(driver).clear();
            AddSupplierDataPage.txtbx_Department(driver).sendKeys(Department);
            AddSupplierDataPage.txtbx_Email(driver).clear();
            AddSupplierDataPage.txtbx_Email(driver).sendKeys(Email);
            AddSupplierDataPage.txtbx_Alt_Email1(driver).clear();
            AddSupplierDataPage.txtbx_Alt_Email1(driver).sendKeys(AltEmail1);
            AddSupplierDataPage.txtbx_Alt_Email2(driver).clear();
            AddSupplierDataPage.txtbx_Alt_Email2(driver).sendKeys(AltEmail2);
            AddSupplierDataPage.txtbx_MobNationalCode(driver).clear();
            AddSupplierDataPage.txtbx_MobNationalCode(driver).sendKeys(Mob1);
            AddSupplierDataPage.txtbx_MobStandardCode(driver).clear();
            AddSupplierDataPage.txtbx_MobStandardCode(driver).sendKeys(Mob2);
            AddSupplierDataPage.txtbx_MobNo(driver).clear();
            AddSupplierDataPage.txtbx_MobNo(driver).sendKeys(Mob);
//            s
            String display=AddSupplierDataPage.txtbx_Display(driver).getAttribute("value");
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
            	AddSupplierDataPage.Chkbx_Primary(driver).click();	
            }
            Thread.sleep(3000);
//            AddSupplierDataPage.btn_Reset(driver).click();
////          AddSupplierDataPage.btn_Save(driver).click();
//            driver.switchTo().window(parentWindowHandler);  
//            // switch back to parent window
			 }}
	}

	public static Boolean chk_resetFunctionality(WebDriver driver,Boolean  result_reset) throws IOException, InterruptedException {
		       result_reset=false;
		       System.out.println("Checking the result condition");
			    
			   if( !(AddSupplierDataPage.btn_Reset(driver).isDisplayed()))
			   {
				   System.out.println("Reset button is not displayed");
			   }
			   else
			   {
				   System.out.println("Entered into else part & also Reset button is displayed");
	           AddSupplierDataPage.btn_Reset(driver).click();
	           Thread.sleep(5000);
//	            String Actual_Contact_Category=AddSupplierDataPage.Drpdown_Contact_Category(driver).getAttribute("value");
//	          String Actual_Drpdown_CompanyName=AddSupplierDataPage.Drpdown_CompanyName(driver).getAttribute("value");
//	            String Actual_Drpdown_ContactType=AddSupplierDataPage.Drpdown_ContactType(driver).getAttribute("value");
//	            String Actual_Dropdown_Title=AddSupplierDataPage.Dropdown_Title(driver).getAttribute("value");
	            String Actual_Firstname= AddSupplierDataPage.txtbx_Firstname(driver).getAttribute("value");
	            String Actual_Lastname= AddSupplierDataPage.txtbx_Lastname(driver).getAttribute("Value");
	            String Actual_Designation=AddSupplierDataPage.txtbx_Designation(driver).getAttribute("value");
	            String Actual_Department= AddSupplierDataPage.txtbx_Department(driver).getAttribute("value");
	            String Actual_Email=AddSupplierDataPage.txtbx_Email(driver).getAttribute("value");
	            String Actual_Alt_Email1= AddSupplierDataPage.txtbx_Alt_Email1(driver).getAttribute("value");
	            String Actual_Alt_Email2=AddSupplierDataPage.txtbx_Alt_Email2(driver).getAttribute("value");
	            String Actual_MobNationalCode=AddSupplierDataPage.txtbx_MobNationalCode(driver).getAttribute("value");
	            String Actual_MobStandardCode=AddSupplierDataPage.txtbx_MobStandardCode(driver).getAttribute("value");
	            String Actual_MobNo=AddSupplierDataPage.txtbx_MobNo(driver).getAttribute("value");
	            String Actual_PhoneNationalCode=AddSupplierDataPage.txtbx_PhoneNationalCode(driver).getAttribute("value");
	            String Actual_PhoneStandardCode= AddSupplierDataPage.txtbx_PhoneStandardCode(driver).getAttribute("value");
	            String Actual_PhoneNO3=AddSupplierDataPage.txtbx_PhoneNO3(driver).getAttribute("value");
	            String expected= " ";
//	            boolean element10=AddSupplierDataPage.Chkbx_Primary(driver).isSelected();
//	            boolean element11=AddSupplierDataPage.Chkbx_IsAccountHandler(driver).isSelected();
	      	    System.out.println("Actual_Firstname="+Actual_Firstname);
//	            System.out.println(element10);
//	            System.out.println(element11);
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
		if( !(AddSupplierDataPage.btn_Save(driver).isDisplayed()))
		   {
			   System.out.println("Save button is not displayed");
		   }
		   else
		   {
			   System.out.println("Entered into else part & also Save button is displayed");
			   
			   AddSupplierDataPage.btn_Save(driver).click();
			   Thread.sleep(5000);
			   if(!(AddSupplierDataPage.Chk_saveConfirm(driver).isDisplayed()))
			   {
				   System.out.println("Save Confirm message box is not displayed");
			   }
			   else if(AddSupplierDataPage.Save_COnfirm_btnno(driver).isDisplayed())
			   {
				    Thread.sleep(5000);
				    String Actual_savedFirstname= AddSupplierDataPage.txtbx_Firstname(driver).getAttribute("value");
		            String Actual_savedLastname= AddSupplierDataPage.txtbx_Lastname(driver).getAttribute("Value");
		            String Actual_savedDesignation=AddSupplierDataPage.txtbx_Designation(driver).getAttribute("value");
		            String Actual_savedDepartment= AddSupplierDataPage.txtbx_Department(driver).getAttribute("value");
		            String Actual_savedEmail=AddSupplierDataPage.txtbx_Email(driver).getAttribute("value");
		            String Actual_savedAlt_Email1= AddSupplierDataPage.txtbx_Alt_Email1(driver).getAttribute("value");
		            String Actual_savedAlt_Email2=AddSupplierDataPage.txtbx_Alt_Email2(driver).getAttribute("value");
		            String Actual_savedMobNationalCode=AddSupplierDataPage.txtbx_MobNationalCode(driver).getAttribute("value");
		            String Actual_savedMobStandardCode=AddSupplierDataPage.txtbx_MobStandardCode(driver).getAttribute("value");
		            String Actual_savedMobNo=AddSupplierDataPage.txtbx_MobNo(driver).getAttribute("value");
//		            String Actual_savedPhoneNationalCode=AddSupplierDataPage.txtbx_PhoneNationalCode(driver).getAttribute("value");
//		            String Actual_savedPhoneStandardCode= AddSupplierDataPage.txtbx_PhoneStandardCode(driver).getAttribute("value");
//		            String Actual_savedPhoneNO3=AddSupplierDataPage.txtbx_PhoneNO3(driver).getAttribute("value");
		            
//				    saved_Actual=new String[]{ Actual_savedFirstname,Actual_savedLastname,Actual_savedDesignation,Actual_savedDepartment,Actual_savedEmail,Actual_savedAlt_Email1,
//				    		                Actual_savedAlt_Email2,Actual_savedMobNationalCode,Actual_savedMobStandardCode,Actual_savedMobNo,Actual_savedPhoneNationalCode,
//				    		                Actual_savedPhoneStandardCode,Actual_savedPhoneNO3 };
		            
		            added_Actual.add(Actual_savedFirstname );
		            added_Actual.add(Actual_savedLastname );
		            added_Actual.add(Actual_savedEmail );
		            added_Actual.add(Actual_savedDepartment );
		            added_Actual.add(Actual_savedDesignation);
		            AddSupplierDataPage.Save_COnfirm_btnno(driver).click();
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
			        if(!(AddSupplierDataPage.chk_Grid_SupplierTitle(driver).isDisplayed()))
			         {
			        	 System.out.println("Supplier  Grid is not displayed");
			         }else
			         {
			        	 System.out.println("Supplier Grid is Displayed");
//			             driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
//			             System.out.println("SupplierName="+SupplierName);
//			             Thread.sleep(5000);
//			             try
//			             {
//			             AddSupplierDataPage.Grid_SupplierName(driver).click();
//			             AddSupplierDataPage.Grid_SupplierName(driver).sendKeys(SupplierName);
//			             }
//			             catch(Exception err)
//			             {
//			            	 System.out.println("Error="+err);
//			             }
			             AddSupplierDataPage.Grid_ContactName(driver).sendKeys(Actual_savedFirstname);
			             AddSupplierDataPage.Grid_Email(driver).sendKeys(Actual_savedEmail);
			             AddSupplierDataPage.Grid_Department(driver).sendKeys(Actual_savedDepartment);
			            WebElement element15=AddSupplierDataPage.Grid_Designation(driver);
			            element15.sendKeys(Actual_savedDesignation);
//			            AddSupplierDataPage.Grid_SupplierName(driver).sendKeys(Grid_Country);
//			            AddSupplierDataPage.Grid_SupplierName(driver).sendKeys(Grid_City);
//			            AddSupplierDataPage.Grid_ContactType(driver).sendKeys(ContactType);
			             Thread.sleep(3000);
//			             WebElement element11=AddSupplierDataPage.Grid_Status(driver);
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
			   	    String Viewed_Actual_savedFirstname= AddSupplierDataPage.txtbx_Firstname(driver).getAttribute("value");
		            String Viewed_Actual_savedLastname= AddSupplierDataPage.txtbx_Lastname(driver).getAttribute("Value");
		            String Viewed_Actual_savedDesignation=AddSupplierDataPage.txtbx_Designation(driver).getAttribute("value");
		            String Viewed_Actual_savedDepartment= AddSupplierDataPage.txtbx_Department(driver).getAttribute("value");
		            String Viewed_Actual_savedEmail=AddSupplierDataPage.txtbx_Email(driver).getAttribute("value");
		            String Viewed_Actual_savedAlt_Email1= AddSupplierDataPage.txtbx_Alt_Email1(driver).getAttribute("value");
		            String Viewed_Actual_savedAlt_Email2=AddSupplierDataPage.txtbx_Alt_Email2(driver).getAttribute("value");
		            String Viewed_Actual_savedMobNationalCode=AddSupplierDataPage.txtbx_MobNationalCode(driver).getAttribute("value");
		            String Viewed_Actual_savedMobStandardCode=AddSupplierDataPage.txtbx_MobStandardCode(driver).getAttribute("value");
		            String Viewed_Actual_savedMobNo=AddSupplierDataPage.txtbx_MobNo(driver).getAttribute("value");
//		            String Viewed_Actual_savedPhoneNationalCode=AddSupplierDataPage.txtbx_PhoneNationalCode(driver).getAttribute("value");
//		            String Viewed_Actual_savedPhoneStandardCode= AddSupplierDataPage.txtbx_PhoneStandardCode(driver).getAttribute("value");
//		            String Viewed_Actual_savedPhoneNO3=AddSupplierDataPage.txtbx_PhoneNO3(driver).getAttribute("value");
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
		           }
			           
		   }
		           return result_save;
		           
			         }
		
	 public static Boolean chk_EditFunctionality(WebDriver driver,String ContactCategory,
			 String  SupplierName,String  Firstname,String  Email,String  Department,
			 String  Designation,String  ContactType,Boolean result_Edit) throws IOException, InterruptedException
     {
     result_Edit=false;
//     Thread.sleep(2500);
//     driver.navigate().back();
//     Thread.sleep(4000);
//     driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
    	 Thread.sleep(4000);
     if(!(AddSupplierDataPage.Grid_ContactCategory_dropdown(driver).isDisplayed()))
     {
    	 System.out.println("Contact category is not displayed");
     }else
     {
    	 Thread.sleep(3000);
     Select element1=new Select(AddSupplierDataPage.Grid_ContactCategory_dropdown(driver));
     element1.selectByVisibleText(ContactCategory);
     Thread.sleep(5000);
     if(!(AddSupplierDataPage.chk_Grid_SupplierTitle(driver).isDisplayed()))
     {
    	 System.out.println("Supplier  Grid is not displayed");
     }else
     {
    	 System.out.println("Supplier Grid is Displayed");
//         driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
         System.out.println("SupplierName="+SupplierName);
         Thread.sleep(5000);
         try
         {
         AddSupplierDataPage.Grid_SupplierName(driver).click();
         AddSupplierDataPage.Grid_SupplierName(driver).sendKeys(SupplierName);
         }
         catch(Exception err)
         {
        	 System.out.println("Error="+err);
         }
         AddSupplierDataPage.Grid_ContactName(driver).sendKeys(Firstname);
         AddSupplierDataPage.Grid_Email(driver).sendKeys(Email);
         AddSupplierDataPage.Grid_Department(driver).sendKeys(Department);
         AddSupplierDataPage.Grid_Designation(driver).sendKeys(Designation);
//       AddSupplierDataPage.Grid_SupplierName(driver).sendKeys(Grid_Country);
//       AddSupplierDataPage.Grid_SupplierName(driver).sendKeys(Grid_City);
         WebElement element11=AddSupplierDataPage.Grid_ContactType(driver);
         element11.sendKeys(ContactType);
         Thread.sleep(3000);
//         WebElement element11=AddSupplierDataPage.Grid_Status(driver);
//         element11.sendKeys(Status);
         Actions act=new Actions(driver);
         act.moveToElement(element11);
         act.click();
         act.sendKeys(Keys.TAB);
	         Thread.sleep(5000);
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
	      String Actual_EditedFirstname= AddSupplierDataPage.txtbx_Firstname(driver).getAttribute("value");
      String Actual_EditedLastname= AddSupplierDataPage.txtbx_Lastname(driver).getAttribute("Value");
      String Actual_EditedDesignation=AddSupplierDataPage.txtbx_Designation(driver).getAttribute("value");
      String Actual_EditedDepartment= AddSupplierDataPage.txtbx_Department(driver).getAttribute("value");
      String Actual_EditedEmail=AddSupplierDataPage.txtbx_Email(driver).getAttribute("value");
      String Actual_EditedAlt_Email1= AddSupplierDataPage.txtbx_Alt_Email1(driver).getAttribute("value");
      String Actual_EditedAlt_Email2=AddSupplierDataPage.txtbx_Alt_Email2(driver).getAttribute("value");
      String Actual_EditedMobNationalCode=AddSupplierDataPage.txtbx_MobNationalCode(driver).getAttribute("value");
      String Actual_EditedMobStandardCode=AddSupplierDataPage.txtbx_MobStandardCode(driver).getAttribute("value");
      String Actual_EditedMobNo=AddSupplierDataPage.txtbx_MobNo(driver).getAttribute("value");
//      String Actual_EditedPhoneNationalCode=AddSupplierDataPage.txtbx_PhoneNationalCode(driver).getAttribute("value");
//      String Actual_EditedPhoneStandardCode= AddSupplierDataPage.txtbx_PhoneStandardCode(driver).getAttribute("value");
//      String Actual_EditedPhoneNO3=AddSupplierDataPage.txtbx_PhoneNO3(driver).getAttribute("value");
//    Edited_Actual=new String[]{ Actual_EditedFirstname,Actual_EditedLastname,Actual_EditedDesignation,Actual_EditedDepartment,Actual_EditedEmail,Actual_EditedAlt_Email1,
//      Actual_EditedAlt_Email2,Actual_EditedMobNationalCode,Actual_EditedMobStandardCode,Actual_EditedMobNo,Actual_EditedPhoneNationalCode,
//      Actual_EditedPhoneStandardCode,Actual_EditedPhoneNO3 };
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
    
//      for(int i=0;i<Edited_Actual_count;i++)
//      {
//    	  System.out.println("Values of Edited Actual are" +Edited_Actual.get(i) );
//    	  System.out.println("Values of saved Actual are" +saved_Actual.get(i));
//      }
//      System.out.println(Edited_Actual_count);
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
//    		 System.out.println(Edited_Actual.get(i));
    		 String Expected=saved_Actual.get(j);
//    		 System.out.println("Actual"+Edited_Actual.get(i));
//    		 System.out.println("Expected"+saved_Actual.get(j));
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
//      if(Edited_Actual.equals(saved_Actual))
//      {
//    	  System.out.println("Pass");
//      }
     }
     }
     return result_Edit;
              }
  public static Boolean chk_EditresetFunctionality(WebDriver driver,Boolean  result_Edit_reset) throws IOException, InterruptedException {
 		result_Edit_reset=false;
 		System.out.println("Checking the result condition");
 			    
 			   if( !(AddSupplierDataPage.btn_Reset(driver).isDisplayed()))
 			   {
 				   System.out.println("Reset button is not displayed");
 			   }
 			   else
 			   {
 				   System.out.println("Entered into else part & also Reset button is displayed");
    	            String saved_EditresetFirstname= AddSupplierDataPage.txtbx_Firstname(driver).getAttribute("value");
     	            String saved_EditresetEmail=AddSupplierDataPage.txtbx_Email(driver).getAttribute("value");
     	            String saved_resetDepartment= AddSupplierDataPage.txtbx_Department(driver).getAttribute("value");
     	            String saved_EditresetDesignation=AddSupplierDataPage.txtbx_Designation(driver).getAttribute("value");
 				   AddSupplierDataPage.btn_Reset(driver).click();
 	           Thread.sleep(5000);
// 	            String Actual_Contact_Category=AddSupplierDataPage.Drpdown_Contact_Category(driver).getAttribute("value");
// 	          String Actual_Drpdown_SupplierName=AddSupplierDataPage.Drpdown_SupplierName(driver).getAttribute("value");
// 	            String Actual_Drpdown_ContactType=AddSupplierDataPage.Drpdown_ContactType(driver).getAttribute("value");
// 	            String Actual_Dropdown_Title=AddSupplierDataPage.Dropdown_Title(driver).getAttribute("value");
 	            String Actual_EditresetFirstname= AddSupplierDataPage.txtbx_Firstname(driver).getAttribute("value");
 	            String Actual_EditresetLastname= AddSupplierDataPage.txtbx_Lastname(driver).getAttribute("Value");
 	            String Actual_EditresetDesignation=AddSupplierDataPage.txtbx_Designation(driver).getAttribute("value");
 	            String Actual_EditresetDepartment= AddSupplierDataPage.txtbx_Department(driver).getAttribute("value");
 	            String Actual_EditresetEmail=AddSupplierDataPage.txtbx_Email(driver).getAttribute("value");
 	            String Actual_EditresetAlt_Email1= AddSupplierDataPage.txtbx_Alt_Email1(driver).getAttribute("value");
 	            String Actual_EditresetAlt_Email2=AddSupplierDataPage.txtbx_Alt_Email2(driver).getAttribute("value");
 	            String Actual_EditresetMobNationalCode=AddSupplierDataPage.txtbx_MobNationalCode(driver).getAttribute("value");
 	            String Actual_EditresetMobStandardCode=AddSupplierDataPage.txtbx_MobStandardCode(driver).getAttribute("value");
 	            String Actual_EditresetMobNo=AddSupplierDataPage.txtbx_MobNo(driver).getAttribute("value");
// 	            String Actual_EditresetPhoneNationalCode=AddSupplierDataPage.txtbx_PhoneNationalCode(driver).getAttribute("value");
// 	            String Actual_EditresetPhoneStandardCode= AddSupplierDataPage.txtbx_PhoneStandardCode(driver).getAttribute("value");
// 	            String Actual_EditresetPhoneNO3=AddSupplierDataPage.txtbx_PhoneNO3(driver).getAttribute("value");
 	            Edited_Reset_Actual.add(Actual_EditresetFirstname);
 	            Edited_Reset_Actual.add(Actual_EditresetEmail );
 	            Edited_Reset_Actual.add(Actual_EditresetDepartment );
 	            Edited_Reset_Actual.add(Actual_EditresetDesignation);
 	            saved_Reset_Actual.add(saved_EditresetFirstname);
 	            saved_Reset_Actual.add(saved_EditresetEmail);
 	            saved_Reset_Actual.add(saved_resetDepartment);
 	            saved_Reset_Actual.add(saved_EditresetDesignation);
// 	            boolean element10=AddSupplierDataPage.Chkbx_Primary(driver).isSelected();
// 	            boolean element11=AddSupplierDataPage.Chkbx_IsAccountHandler(driver).isSelected();
 	      	    System.out.println("Actual_Firstname="+Actual_EditresetFirstname);
// 	            System.out.println(element10);
// 	            System.out.println(element11);
 	      	  int Edited_resetActual_count=Edited_Reset_Actual.size();
 	          int saved_resetActual_count=saved_Reset_Actual.size();
 	          System.out.println(Edited_resetActual_count);
 	          System.out.println(saved_resetActual_count);
 	        
// 	          for(int i=0;i<Edited_Actual_count;i++)
// 	          {
// 	        	  System.out.println("Values of Edited Actual are" +Edited_Actual.get(i) );
// 	        	  System.out.println("Values of saved Actual are" +saved_Actual.get(i));
// 	          }
// 	          System.out.println(Edited_Actual_count);
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
// 	        		 System.out.println(Edited_Actual.get(i));
 	        		 String Expected=saved_Reset_Actual.get(j);
// 	        		 System.out.println("Actual"+Edited_Actual.get(i));
// 	        		 System.out.println("Expected"+saved_Actual.get(j));
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
// 	          if(Edited_Actual.equals(saved_Actual))
// 	          {
// 	        	  System.out.println("Pass");
// 	          }
 	         }
 	         
 	         return result_Edit_reset;
 	  			   }
     
}

