package com.rk.scripts;

import org.testng.annotations.Test;

import com.rk.config.StartBrowser;
import com.rk.reuse.CommonFunctions;
import com.rk.reuse.ExcelData_DDT;

public class TC01_Search extends StartBrowser {
  @Test
  public void Login_Search_Amazon() throws Exception {
	  
	  CommonFunctions cfs = new CommonFunctions();
	  ExcelData_DDT ddt = new ExcelData_DDT();
	  
	  ddt.Login_Excel();
	  cfs.serach();
//	  cfs.logout();
	  
  }
}
