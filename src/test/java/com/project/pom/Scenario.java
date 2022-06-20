package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Scenario extends Base{
	//Selectors
	By addToCartLocator = By.className("ajax_add_to_cart_button");
	By continueShoppingLocator = By.className("icon-chevron-left");
	By searchBox = By.name("submit_search");
	By addToCartLocator2  = By.xpath("//a[@data-id-product='7']");
	By itemToSelect  = By.className("first-item-of-mobile-line");
	By itemToSelect2  = By.className("last-item-of-mobile-line");
	By summaryProducts = By.id("summary_products_quantity");
	
	//URLS
	//T-Shirts
	String tShirtsUrl = "http://automationpractice.com/index.php?id_category=5&controller=category";
	//Blouses
	String blousesUrl = "http://automationpractice.com/index.php?id_category=7&controller=category";
	//Casual Dresses
	String casualDressesUlr = "http://automationpractice.com/index.php?id_category=9&controller=category";
	//Evening Dresses
	String eveningDressesUrl = "http://automationpractice.com/index.php?id_category=10&controller=category";
	//Summer Dresses
	String summerDressesUrl = "http://automationpractice.com/index.php?id_category=11&controller=category";
	//Cart Url
	String cartUrl = "http://automationpractice.com/index.php?controller=order";
	
	public Scenario(WebDriver driver) {
		super(driver);
	}
	
	public void testPage() throws InterruptedException {
		System.out.println(isBePresence(searchBox));
		if(isBePresence(searchBox)) {
			//T-SHIRTS
			visit(tShirtsUrl);
			click(itemToSelect);
			click(addToCartLocator);
			isBePresence(continueShoppingLocator);
			click(continueShoppingLocator);
			//BLOUSES
			visit(blousesUrl);
			click(itemToSelect);
			click(addToCartLocator);
			isBePresence(continueShoppingLocator);
			click(continueShoppingLocator);
			//CASUAL DRESSES
			visit(casualDressesUlr);
			click(itemToSelect);
			click(addToCartLocator);
			isBePresence(continueShoppingLocator);
			click(continueShoppingLocator);
			//EVENING DRESSES
			visit(eveningDressesUrl);
			click(itemToSelect);
			click(addToCartLocator);
			isBePresence(continueShoppingLocator);
			click(continueShoppingLocator);
			//SUMMER DRESSES
			visit(summerDressesUrl);
			click(itemToSelect);
			click(addToCartLocator);
			isBePresence(continueShoppingLocator);
			click(continueShoppingLocator);
			//Adding the third product
			click(itemToSelect2);
			click(addToCartLocator2);
			isBePresence(continueShoppingLocator);
			click(continueShoppingLocator);
		}else {
			System.out.println("Add to cart buttom was not present");
		}		
		
	}
	
	public String lastMessage() {
		visit(cartUrl);
		return getText(summaryProducts);
	}
	
	
}
