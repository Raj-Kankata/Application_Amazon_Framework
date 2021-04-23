package com.rk.wdcmds;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.rk.config.StartBrowser;

public class ActionDriver {

	public WebDriver driver;
	
	public ActionDriver() {
		driver = StartBrowser.driver;
	}
	
	/**
	 * Used to navigate to application
	 * @param url -- Application URL
	 */
	public void navigateToApplication(String url) {
		try {
			driver.get(url);
			StartBrowser.childTest.pass("Navigated to URL : "+url);
			
		} catch(Exception e) {
			StartBrowser.childTest.fail("Unable to Navigate to URL : "+url);
			
		}
	}
	
	/**
	 * Used to perform click on buttons, links, radio buttons and check boxes
	 * @param locator -- Get it from OR
	 * @param eleName - Name of the element
	 * @throws Exception
	 */
	public void click(By locator, String eleName) {
		
		try {
			driver.findElement(locator). click();
			StartBrowser.childTest.pass("Performed click action on : "+eleName);
		}catch(Exception e) {
			StartBrowser.childTest.fail("Unable to perform click action on : "+eleName,
			MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			StartBrowser.childTest.info(e);
			throw e;
			
		}
	}
	
	/**
	 * used to perform type action in text boxes and text area
	 * @param locator -- Get it from OR
	 * @param testData -- hard code or get it from excel
	 * @param eleName -- name of the element
	 * @throws Exception
	 */
	public void type(By locator, String testData, String eleName) {
		try {
			driver.findElement(locator).sendKeys(testData);
			StartBrowser.childTest.pass("Performed type action on : "+eleName + " With data : "+testData);
			
		} catch (Exception e) {
			StartBrowser.childTest.fail("Unable to perform type action on : "+eleName + " With data : "+testData,
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
					StartBrowser.childTest.info(e);
					throw e;
		}
	}
	/**
	 * used to perform mouseHover on elements
	 * @param locator -- Get it form OR
	 * @param eleName -- Name of the element
	 * @throws Exception
	 */
	public void mouseHover(By locator, String eleName) {
		try {
			Actions a = new Actions(driver);
		WebElement we =	driver.findElement(locator);
		a.click(we).perform();
//		a.moveToElement(we).perform();
		StartBrowser.childTest.pass("Performed mouseHover action on : "+eleName);
		} catch (Exception e) {
			StartBrowser.childTest.fail("Unable to Perform mouseHover action on : "+eleName,
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
					StartBrowser.childTest.info(e);
					throw e;
		}
	}
	public String screenShot() {
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
