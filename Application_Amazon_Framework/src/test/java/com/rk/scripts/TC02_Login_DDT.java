package com.rk.scripts;

import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import com.rk.config.StartBrowser;
import com.rk.reuse.CommonFunctions;
import com.rk.reuse.ExcelData_DDT;

@Test
public class TC02_Login_DDT extends StartBrowser {
  
	public void loginDDT() throws Exception {
	
	
	  ExcelData_DDT ddt = new ExcelData_DDT();
	  ddt.Login_Excel();

	  
  
}
}
