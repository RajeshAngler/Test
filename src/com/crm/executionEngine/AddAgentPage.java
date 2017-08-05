package com.crm.executionEngine;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.crm.appModules.AddAgentData_Action;
import com.crm.appModules.AddSupplierData_Action;
import com.crm.appModules.NavigatingtoContactMaster_Action;
import com.crm.config.Constants;
import com.crm.utility.ExcelUtils;

public class AddAgentPage extends ChromeLogin{
	String ContactCategory,AgentName,ContactType,Title,Firstname, 
    LastName,Designation,Department,Email,AltEmail1,AltEmail2,Mob1,
    Mob2,Mob,Phone1,Phone2,Phone3,Phone4,primary,DepartmentName,ContactName;
	boolean result_reset,result_Save;
	@Test
  @Parameters({"username","password"})
  public void AddAgent_reset(String username,String password) throws Exception 
  {
	  Login_Test.Valid_Login_Test(username, password);
	  NavigatingtoContactMaster_Action.Clk_ContactMaster(driver);
	  ExcelUtils.setExcelFile(Constants.Path_TestData+Constants.File_TestData, Constants.File_AgentTestsheet_name);
	  int rowNum=ExcelUtils.getRowCount(Constants.File_AgentTestsheet_name);
	  System.out.println(rowNum);
	  for(int i=1;i<rowNum;i++)
	  {
	  ContactCategory=ExcelUtils.getCellData(i, 0);
	  AgentName=ExcelUtils.getCellData(i, 1);
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
	  DepartmentName=ExcelUtils.getCellData(i, 19);
	  ContactName=ExcelUtils.getCellData(i, 20);
	  AddAgentData_Action.Add_Agentdata(driver, ContactCategory,AgentName,ContactType,Title,Firstname,LastName,Designation,Department,Email,AltEmail1,AltEmail2,Mob1,Mob2,Mob,Phone1,Phone2,Phone3,Phone4,primary,DepartmentName,ContactName);
	  AddAgentData_Action.chk_resetFunctionality(driver,result_reset);
	  if(!(Boolean.valueOf(result_reset)==true))
		  {
		  System.out.println("Expected result is Fail");
		  ExcelUtils.setCellData("Fail","Not Working as Expected", i, 21, 22);
		 
				  }else
					  {
					  System.out.println("Exepected result is Pass");
					   ExcelUtils.setCellData("Pass","Working as Expected", i, 21, 22); 
				  }
	  }
	  }
	@Test
	  @Parameters({"username","password"})
	  public void AddAgent_Save(String username,String password) throws Exception 
	  {
		  Login_Test.Valid_Login_Test(username, password);
		  NavigatingtoContactMaster_Action.Clk_ContactMaster(driver);
		  ExcelUtils.setExcelFile(Constants.Path_TestData+Constants.File_TestData, Constants.File_AgentTestsheet_name);
		  int rowNum=ExcelUtils.getRowCount(Constants.File_AgentTestsheet_name);
		  System.out.println(rowNum);
		  for(int i=1;i<rowNum;i++)
		  {
		  ContactCategory=ExcelUtils.getCellData(i, 0);
		  AgentName=ExcelUtils.getCellData(i, 1);
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
		  DepartmentName=ExcelUtils.getCellData(i, 19);
		  ContactName=ExcelUtils.getCellData(i, 20);
		  AddAgentData_Action.Add_Agentdata(driver, ContactCategory,AgentName,ContactType,Title,Firstname,LastName,Designation,Department,Email,AltEmail1,AltEmail2,Mob1,Mob2,Mob,Phone1,Phone2,Phone3,Phone4,primary,DepartmentName,ContactName);
		  AddAgentData_Action.chk_saveFunctionality(driver,result_Save);
		  if(!(Boolean.valueOf(result_Save)==true))
			  {
			  System.out.println("Expected result is Fail");
			  ExcelUtils.setCellData("Fail","Not Working as Expected", i, 23, 24);
			 
					  }else
						  {
						  System.out.println("Exepected result is Pass");
						   ExcelUtils.setCellData("Pass","Working as Expected", i, 23, 24); 
					  }
		  }
		  }
	 }