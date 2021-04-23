package com.rk.or;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
	
	public static By menuAccount = By.xpath("//a[@id='nav-link-accountList']");
	public static By lnkSignOut = By.xpath("//span[text()='Sign Out']");


//Actions action = new Actions(driver);
//action.moveToElement(menuAccount).perform();
//action.moveToElement(lnkSignOut).click().perform();

}