package com.rk.scripts;

import org.testng.annotations.Test;

import com.rk.config.StartBrowser;
import com.rk.reuse.CommonFunctions;

public class TC01 extends StartBrowser {
  @Test
  public void Login_Logout_Amazon() {
	  
	  CommonFunctions cfs = new CommonFunctions();
	  cfs.login();
	  cfs.serach();
//	  cfs.logout();
	  
  }
}
