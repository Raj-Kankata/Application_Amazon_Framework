package com.rk.or;

import org.openqa.selenium.By;

public class SearchPage {

	public static By txtSearch = By.xpath("//input[@id='twotabsearchtextbox']");
	public static By btnSearch = By.cssSelector("#nav-search-submit-button");
	public static By lnkProduct = By.xpath("//div[@data-component-type='sp-sponsored-result']//span[@class='a-size-base-plus a-color-base a-text-normal'][contains(text(),'Unit Testing Principles, Practices, and Patterns: ')]");
	public static By btnAddToCart = By.xpath("//input[@id='add-to-cart-button']");
	public static By btnProceedToCheckOut = By.xpath("//a[@id='hlb-ptc-btn-native']");
	
}
