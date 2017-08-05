package com.crm.executionEngine;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.crm.appModules.NavigatingtoContactMaster_Action;
import com.crm.utility.ExcelUtils;
import com.crm.config.Constants;
import com.crm.appModules.AddCustomerData_Action;;
public class AddCustomerPage extends ChromeLogin{
	String ContactCategory,CompanyName,ContactType,Title,Firstname, 
    LastName,Designation,Department,Email,AltEmail1,AltEmail2,Mob1,
    Mob2,Mob,Phone1,Phone2,Phone3,Phone4,primary,Account,DepartmentName,ContactName,Status;
	boolean result_reset,result_Save,result_Edit,result_Edited;
	@Test (priority=1)	
  @Parameters({"username","password"})
  public void AddCustomer_Chkreset(String username,String password) throws Exception 
  {
	  Login_Test.Valid_Login_Test(username, password);
	  NavigatingtoContactMaster_Action.Clk_ContactMaster(driver);
	  ExcelUtils.setExcelFile(Constants.Path_TestData+Constants.File_TestData, Constants.File_CustomerTestsheet_name);
	  int rowNum=ExcelUtils.getRowCount(Constants.File_CustomerTestsheet_name);
	  System.out.println(rowNum);
	  for(int i=1;i<rowNum;i++)
	  {
	  ContactCategory=ExcelUtils.getCellData(i, 0);
	  CompanyName=ExcelUtils.getCellData(i, 1);
	  ContactType=ExcelUtils.getCellData(i, 2);
	  Title=ExcelUtils.getCellData(i, 3);
	  Firstname=ExcelUtils.getCellData(i, 4);
	  LastName=ExcelUtils.getCellData(i, 5);
	  Designation=ExcelUtils.getCellData(i, 6);
	  Department=ExcelUtils.getCellData(i, 7);
	  Email=ExcelUtils.getCellData(i, 8);
	  AltEmail1=ExcelUtils.getCellData(i, 9);
	  AltEmail2=ExcelUtils.getCellData(i, 10);
	  Mob1=ExcelUtils.getCellData(i, 11);
	  Mob2=ExcelUtils.getCellData(i, 12);
	  Mob=ExcelUtils.getCellData(i, 13);
	  Phone1=ExcelUtils.getCellData(i, 14);
	  Phone2=ExcelUtils.getCellData(i, 15);
	  Phone3=ExcelUtils.getCellData(i, 16);
	  Phone4=ExcelUtils.getCellData(i, 17);
	  primary=ExcelUtils.getCellData(i, 18);
	  Account=ExcelUtils.getCellData(i, 19);
	  DepartmentName=ExcelUtils.getCellData(i, 20);
	  ContactName=ExcelUtils.getCellData(i, 21);
	  Status=ExcelUtils.getCellData(i, 22);
	  AddCustomerData_Action.Add_Customerdata(driver,ContactCategory,CompanyName,ContactType,Title,Firstname,LastName,Designation,Department,Email,AltEmail1,AltEmail2,Mob1,Mob2,Mob,
//			  Phone1,Phone2,Phone3,Phone4,
			  primary,Account,DepartmentName,ContactName,Status);
	  AddCustomerData_Action.chk_resetFunctionality(driver,result_reset);
	  if(!(Boolean.valueOf(result_reset)==true))
	  {
	  System.out.println("Expected result is Fail");
	  ExcelUtils.setCellData("Fail","Not Working as Expected", i, 23, 24);
	   }else
				  {
				  System.out.println("Exepected result is Pass");
				   ExcelUtils.setCellData("Pass","Working as Expected", i, 23, 24); 
			  }
	  }}
	
	  @Test(priority=2)	
	  @Parameters({"username","password"})
	  
	  public void AddCustomer_ChkSave(String username,String password) throws Exception 
	  {
		  Login_Test.Valid_Login_Test(username, password);
		  NavigatingtoContactMaster_Action.Clk_ContactMaster(driver);
		  ExcelUtils.setExcelFile(Constants.Path_TestData+Constants.File_TestData, Constants.File_CustomerTestsheet_name);
		  int rowNum=ExcelUtils.getRowCount(Constants.File_CustomerTestsheet_name);
		  System.out.println(rowNum);
		  for(int i=1;i<rowNum;i++)
		  {
		  ContactCategory=ExcelUtils.getCellData(i, 0);
		  CompanyName=ExcelUtils.getCellData(i, 1);
		  ContactType=ExcelUtils.getCellData(i, 2);
		  Title=ExcelUtils.getCellData(i, 3);
		  Firstname=ExcelUtils.getCellData(i, 4);
		  LastName=ExcelUtils.getCellData(i, 5);
		  Designation=ExcelUtils.getCellData(i, 6);
		  Department=ExcelUtils.getCellData(i, 7);
		  Email=ExcelUtils.getCellData(i, 8);
		  AltEmail1=ExcelUtils.getCellData(i, 9);
		  AltEmail2=ExcelUtils.getCellData(i, 10);
		  Mob1=ExcelUtils.getCellData(i, 11);
		  Mob2=ExcelUtils.getCellData(i, 12);
		  Mob=ExcelUtils.getCellData(i, 13);
		  Phone1=ExcelUtils.getCellData(i, 14);
		  Phone2=ExcelUtils.getCellData(i, 15);
		  Phone3=ExcelUtils.getCellData(i, 16);
		  Phone4=ExcelUtils.getCellData(i, 17);
		  primary=ExcelUtils.getCellData(i, 18);
		  Account=ExcelUtils.getCellData(i, 19);
		  DepartmentName=ExcelUtils.getCellData(i, 20);
		  ContactName=ExcelUtils.getCellData(i, 21);
		  Status=ExcelUtils.getCellData(i, 22);
		  AddCustomerData_Action.Add_Customerdata(driver,ContactCategory,CompanyName,ContactType,Title,Firstname,LastName,Designation,Department,Email,AltEmail1,AltEmail2,Mob1,Mob2,Mob,
//				  Phone1,Phone2,Phone3,Phone4,
				  primary,Account,DepartmentName,ContactName,Status);
		  AddCustomerData_Action.chk_saveFunctionality(driver,result_Save);
          System.out.println("Result_save"+result_Save);
		  if(!(Boolean.valueOf(result_Save)!=true))
      {
     System.out.println("Expected result is Fail");
     ExcelUtils.setCellData("Fail","Not Working as Expected", i, 25, 26);
	  }else
			  {
			  System.out.println("Exepected result is Pass");
			  ExcelUtils.setCellData("Pass","Working as Expected", i, 25, 26); 
		  }
}
}
	  @Test (priority=3)	
	  @Parameters({"username","password"})
	  public void EditCustomer_chkData_Reset(String username,String password) throws Exception 
	  {	  
		  Login_Test.Valid_Login_Test(username, password);
		  NavigatingtoContactMaster_Action.Clk_ContactMaster(driver);
		driver.navigate().back();
		System.out.println("Entered into crm dashboard page");
		Thread.sleep(5000);
		ExcelUtils.setExcelFile(Constants.Path_TestData+Constants.File_TestData, Constants.File_CustomerTestsheet_name);
		  int rowNum=ExcelUtils.getRowCount(Constants.File_CustomerTestsheet_name);
		  System.out.println(rowNum);
		  for(int i=1;i<=1;i++)
		  {
		  ContactCategory=ExcelUtils.getCellData(1, 0);
		  CompanyName=ExcelUtils.getCellData(1, 1);
//		  ContactType=ExcelUtils.getCellData(i, 2);
//		  Title=ExcelUtils.getCellData(i, 3);
		  Firstname=ExcelUtils.getCellData(1, 4);
//		  LastName=ExcelUtils.getCellData(i, 5);
		  Email=ExcelUtils.getCellData(1, 8);
		  Department=ExcelUtils.getCellData(1, 7);
		  Designation=ExcelUtils.getCellData(1, 6);
		  ContactType=ExcelUtils.getCellData(1, 2);
		  Status=ExcelUtils.getCellData(1, 22);
		  AddCustomerData_Action.chk_EditFunctionality(driver,ContactCategory, CompanyName, Firstname, Email, Department, Designation, ContactType, Status, result_Edited);
		  if(!(Boolean.valueOf(result_Save)!=true))
	      {
	      System.out.println("Expected result is Fail");
	      ExcelUtils.setCellData("Fail","Not Working as Expected", i, 27, 28);
	      		  } 
		  else	  
		  {
			  System.out.println("Exepected result is Pass");
			  ExcelUtils.setCellData("Pass","Working as Expected", i, 27, 28); 
			  ExcelUtils.setExcelFile(Constants.Path_TestData+Constants.File_TestData, Constants.File_CustomerTestsheet_name);
			  int rowNum1=ExcelUtils.getRowCount(Constants.File_EditcustomerdataTestsheet_name);
			  System.out.println(rowNum1);
			  for(int k=1;k<rowNum1;k++)
			  {
			  ContactCategory=ExcelUtils.getCellData(k, 0);
			  CompanyName=ExcelUtils.getCellData(k, 1);
			  ContactType=ExcelUtils.getCellData(k, 2);
			  Title=ExcelUtils.getCellData(k, 3);
			  Firstname=ExcelUtils.getCellData(k, 4);
			  LastName=ExcelUtils.getCellData(k, 5);
			  Designation=ExcelUtils.getCellData(k, 6);
			  Department=ExcelUtils.getCellData(k, 7);
			  Email=ExcelUtils.getCellData(k, 8);
			  AltEmail1=ExcelUtils.getCellData(k, 9);
			  AltEmail2=ExcelUtils.getCellData(k, 10);
			  Mob1=ExcelUtils.getCellData(k, 11);
			  Mob2=ExcelUtils.getCellData(k, 12);
			  Mob=ExcelUtils.getCellData(k, 13);
			  Phone1=ExcelUtils.getCellData(k, 14);
			  Phone2=ExcelUtils.getCellData(k, 15);
			  Phone3=ExcelUtils.getCellData(k, 16);
			  Phone4=ExcelUtils.getCellData(k, 17);
			  primary=ExcelUtils.getCellData(k, 18);
			  Account=ExcelUtils.getCellData(k, 19);
			  DepartmentName=ExcelUtils.getCellData(k, 20);
			  ContactName=ExcelUtils.getCellData(k, 21);
			  Status=ExcelUtils.getCellData(k, 22);
			  AddCustomerData_Action.Add_Customerdata(driver,ContactCategory,CompanyName,ContactType,Title,Firstname,LastName,Designation,Department,Email,AltEmail1,AltEmail2,Mob1,Mob2,Mob,
             //Phone1,Phone2,Phone3,Phone4,
			  primary,Account,DepartmentName,ContactName,Status);
			  AddCustomerData_Action.chk_EditresetFunctionality(driver,result_reset);
			  if(!(Boolean.valueOf(result_reset)!=true))
			  {
			  System.out.println("Expected result is Fail");
			  ExcelUtils.setCellData("Fail","Not Working as Expected", i, 23, 24);
			   }
			  else
			    {
				  System.out.println("Exepected result is Pass");
				  ExcelUtils.setCellData("Pass","Working as Expected", i, 23, 24); 
			    }
			  
			  }
			  }
	}
	  }
	  @Test (priority=4)	
	  @Parameters({"username","password"})
	  public void EditCustomer_chkData_save(String username,String password) throws Exception 
	  {	  
		  Login_Test.Valid_Login_Test(username, password);
		  NavigatingtoContactMaster_Action.Clk_ContactMaster(driver);
		driver.navigate().back();
		System.out.println("Entered into crm dashboard page");
		Thread.sleep(5000);
		ExcelUtils.setExcelFile(Constants.Path_TestData+Constants.File_TestData, Constants.File_CustomerTestsheet_name);
		  int rowNum=ExcelUtils.getRowCount(Constants.File_CustomerTestsheet_name);
		  System.out.println(rowNum);
		  for(int i=1;i<=1;i++)
		  {
		  ContactCategory=ExcelUtils.getCellData(1, 0);
		  CompanyName=ExcelUtils.getCellData(1, 1);
//		  ContactType=ExcelUtils.getCellData(i, 2);
//		  Title=ExcelUtils.getCellData(i, 3);
		  Firstname=ExcelUtils.getCellData(1, 4);
//		  LastName=ExcelUtils.getCellData(i, 5);
		  Email=ExcelUtils.getCellData(1, 8);
		  Department=ExcelUtils.getCellData(1, 7);
		  Designation=ExcelUtils.getCellData(1, 6);
		  ContactType=ExcelUtils.getCellData(1, 2);
		  Status=ExcelUtils.getCellData(1, 22);
		  AddCustomerData_Action.chk_EditFunctionality(driver,ContactCategory, CompanyName, Firstname, Email, Department, Designation, ContactType, Status, result_Edited);
		  if(!(Boolean.valueOf(result_Save)!=true))
	      {
	      System.out.println("Expected result is Fail");
	      ExcelUtils.setCellData("Fail","Not Working as Expected", i, 27, 28);
	      		  } 
		  else	  
		  {
			  System.out.println("Exepected result is Pass");
			  ExcelUtils.setCellData("Pass","Working as Expected", i, 27, 28); 
			  ExcelUtils.setExcelFile(Constants.Path_TestData+Constants.File_TestData, Constants.File_CustomerTestsheet_name);
			  int rowNum1=ExcelUtils.getRowCount(Constants.File_EditcustomerdataTestsheet_name);
			  System.out.println(rowNum1);
			  for(int k=1;k<rowNum1;k++)
			  {
			  ContactCategory=ExcelUtils.getCellData(k, 0);
			  CompanyName=ExcelUtils.getCellData(k, 1);
			  ContactType=ExcelUtils.getCellData(k, 2);
			  Title=ExcelUtils.getCellData(k, 3);
			  Firstname=ExcelUtils.getCellData(k, 4);
			  LastName=ExcelUtils.getCellData(k, 5);
			  Designation=ExcelUtils.getCellData(k, 6);
			  Department=ExcelUtils.getCellData(k, 7);
			  Email=ExcelUtils.getCellData(k, 8);
			  AltEmail1=ExcelUtils.getCellData(k, 9);
			  AltEmail2=ExcelUtils.getCellData(k, 10);
			  Mob1=ExcelUtils.getCellData(k, 11);
			  Mob2=ExcelUtils.getCellData(k, 12);
			  Mob=ExcelUtils.getCellData(k, 13);
			  Phone1=ExcelUtils.getCellData(k, 14);
			  Phone2=ExcelUtils.getCellData(k, 15);
			  Phone3=ExcelUtils.getCellData(k, 16);
			  Phone4=ExcelUtils.getCellData(k, 17);
			  primary=ExcelUtils.getCellData(k, 18);
			  Account=ExcelUtils.getCellData(k, 19);
			  DepartmentName=ExcelUtils.getCellData(k, 20);
			  ContactName=ExcelUtils.getCellData(k, 21);
			  Status=ExcelUtils.getCellData(k, 22);
			  AddCustomerData_Action.Add_Customerdata(driver,ContactCategory,CompanyName,ContactType,Title,Firstname,LastName,Designation,Department,Email,AltEmail1,AltEmail2,Mob1,Mob2,Mob,
             //Phone1,Phone2,Phone3,Phone4,
			  primary,Account,DepartmentName,ContactName,Status);
			  AddCustomerData_Action.chk_saveFunctionality(driver,result_Save);
	          System.out.println("Result_save"+result_Save);
			  if(!(Boolean.valueOf(result_Save)!=true))
	         {
	          System.out.println("Expected result is Pass");
	          ExcelUtils.setCellData("Fail","Not Working as Expected", i, 25, 26);
	          driver.navigate().back();
		     }   else
				  {
				  System.out.println("Exepected result is fail");
				  ExcelUtils.setCellData("Pass","Working as Expected", i, 25, 26); 
				  driver.navigate().back();
			  }
	}
	}

}}}
