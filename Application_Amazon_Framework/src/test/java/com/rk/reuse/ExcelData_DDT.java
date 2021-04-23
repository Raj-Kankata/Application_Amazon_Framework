package com.rk.reuse;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import com.rk.config.StartBrowser;
import com.rk.reuse.CommonFunctions;

public class ExcelData_DDT extends StartBrowser {
   public void Login_Excel() throws Exception{
	  
	  CommonFunctions cfs = new CommonFunctions();
	  Fillo f = new Fillo();
	  Connection con = f.getConnection("TestData/TestData.xlsx");
	  String strQuery = "Select * from TC02";
	  Recordset rs = con.executeQuery(strQuery);
	  while (rs.next()) {
		  cfs.loginDDT(rs.getField("UserName"), rs.getField("Password"));
		
	}

	  
  }
}
