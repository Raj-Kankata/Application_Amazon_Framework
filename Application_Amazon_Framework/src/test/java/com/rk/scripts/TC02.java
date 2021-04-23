package com.rk.scripts;

import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import com.rk.config.StartBrowser;
import com.rk.reuse.CommonFunctions;

public class TC02 extends StartBrowser {
  @Test
  public void Login_Logout_Excel() throws Exception{
	  
	  CommonFunctions cfs = new CommonFunctions();
	  Fillo f = new Fillo();
	  Connection con = f.getConnection("TestData/TestData.xlsx");
	  String strQuery = "Select * from TC02";
	  Recordset rs = con.executeQuery(strQuery);
	  while (rs.next()) {
		  cfs.login(rs.getField("UserName"), rs.getField("Password"));
		
	}
	  cfs.logout();
	  
  }
}
