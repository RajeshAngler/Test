package com.crm.config;

public class Constants 
{
    public static final String baseUrl="http://192.168.0.89/MFCUMSTesting/index.aspx";
	
	public static final String CHROME_DRIVER_EXEPATH ="E:\\Rajesh\\Selenium\\Selenium\\Chrome_driver\\chromedriver.exe";
	public static final String CHROME_DRIVER ="webdriver.chrome.driver";
	public static final int implicitWaitSec = 45;
	
	public static String getPath_TestData=System.getProperty("user.dir")+"\\src\\com\\crm\\dataEngine\\";
	public static final String Path_TestData = getPath_TestData.replace("\\", "\\\\");
	public static String getPath_ObjectRepo=System.getProperty("user.dir")+"\\ObjectRepo.properties";
	public static final String path_ObjectRepo=getPath_ObjectRepo.replace("\\", "\\\\");
    public static final String File_TestData = "TestData1.xls";
	public static final String File_CustomerTestsheet_name="CustomerData";	
	public static final String File_SupplierTestsheet_name="SupplierData";
	public static final String File_AgentTestsheet_name="AgentData";
	public static final String File_OverseasTestsheet_name="OverseasData";
	public static final String File_EditcustomerdataTestsheet_name="CustomerData_Edit";
	public static final String File_EditsupplierdataTestsheet_name="SupplierData_Edit";
}

