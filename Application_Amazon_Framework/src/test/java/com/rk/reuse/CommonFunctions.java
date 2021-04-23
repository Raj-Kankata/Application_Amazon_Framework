package com.rk.reuse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.rk.config.StartBrowser;
import com.rk.or.HomePage;
import com.rk.or.LoginPage;
import com.rk.or.SearchPage;
import com.rk.wdcmds.ActionDriver;

public class CommonFunctions {

	public ActionDriver aDriver;
	public WebDriver driver;
	
	public CommonFunctions()	{
		
		aDriver = new ActionDriver();
		driver = StartBrowser.driver;
	}
	
	public void login() {
		StartBrowser.childTest= StartBrowser.parentTest.createNode("Login to Application Amazon.com");
		aDriver.navigateToApplication("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		aDriver.type(LoginPage.txtUserName, "raj.kankata@gmail.com", "Email Address filed");
		aDriver.click(LoginPage.btnContinue, "Continue button");
		aDriver.type(LoginPage.txtPassword, "Raj@2106", "Password filed");
		aDriver.click(LoginPage.btnSignIn, "Sign In button");
	}
	
	public void login(String uName, String pwd) {
		StartBrowser.childTest= StartBrowser.parentTest.createNode("Login to Application Amazon.com");
		aDriver.navigateToApplication("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		aDriver.type(LoginPage.txtUserName, uName, "Email Address filed");
		aDriver.type(LoginPage.txtPassword, pwd, "Password filed");
		aDriver.click(LoginPage.btnSignIn, "Sign In button");
	}
	
	public void logout() {
		StartBrowser.childTest= StartBrowser.parentTest.createNode("Logout of Application Amazon.com");
		aDriver.mouseHover(HomePage.menuAccount, "Account Menu");
		aDriver.click(HomePage.lnkSignOut, "SignOut link");
	}
	
	public void serach() {
		StartBrowser.childTest= StartBrowser.parentTest.createNode("Search a Product");
		aDriver.type(SearchPage.txtSearch, "qa testing for beginners", "Search box");
		aDriver.click(SearchPage.btnSearch, "Search Button");
		aDriver.click(SearchPage.lnkProduct, "First Item");
		
		String price = driver.findElement(By.xpath("//span[@id='newBuyBoxPrice']")).getText();
		Assert.assertEquals("$47.49", price);
		aDriver.click(SearchPage.btnAddToCart, "AddToCart Button");
		String cartPrice = driver.findElement(By.xpath("//div[@class='a-row a-spacing-micro']//span[@class='a-color-price hlb-price a-inline-block a-text-bold'][normalize-space()='$47.49']")).getText();
		Assert.assertEquals("$47.49", cartPrice);
		
		aDriver.click(SearchPage.btnProceedToCheckOut, "Proceed to Checkout");
		String checkoutPrice = driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();
		Assert.assertEquals("$47.49", checkoutPrice);
		
		//		aDriver.type(SearchPage.txtSearch, Keys.ENTER, "Search Button");
//		driver.findElement(SearchPage.txtSearch).sendKeys(Keys.ENTER);
//		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	}
}
















