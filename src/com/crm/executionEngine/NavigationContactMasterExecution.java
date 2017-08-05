package com.crm.executionEngine;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.crm.executionEngine.Login_Test;
import com.crm.appModules.NavigatingtoContactMaster_Action;
public class NavigationContactMasterExecution  extends ChromeLogin {
  @Test
  @Parameters({"username","password"})
  public void ContactMaster(String username,String password ) throws Exception {
  Login_Test.Valid_Login_Test(username, password);
  NavigatingtoContactMaster_Action.Clk_ContactMaster(driver);
  }
}
