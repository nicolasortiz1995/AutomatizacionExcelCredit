package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Scenario extends Base{
	
	By addToCartLocator = By.className("ajax_add_to_cart_button");
	By continueShoppingLocator = By.className("continue");
	By searchBox = By.name("submit_search");
	//T-SHIRTS
	String tShirtsUrl = "http://automationpractice.com/index.php?id_category=5&controller=category";
	//BLOUSES
	String blousesUrl = "http://automationpractice.com/index.php?id_category=7&controller=category";
	//CASUAL DRESSES
	String casualDressesUlr = "http://automationpractice.com/index.php?id_category=9&controller=category";
	//EVENING DRESSES
	String eveningDressesUrl = "http://automationpractice.com/index.php?id_category=10&controller=category";
	//SUMMER DRESSES
	String summerDressesUrl = "http://automationpractice.com/index.php?id_category=11&controller=category";
	
	By addToCartLocator2  = By.cssSelector("[data-id-product='7']");
	By itemToSelect  = By.className("first-item-of-mobile-line");
	By itemToSelect2  = By.className("last-item-of-mobile-line");
	
	String cartUrl = "http://automationpractice.com/index.php?controller=order";
	
	By summaryProducts = By.id("summary_products_quantity");
	
	
	
	
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
			click(addToCartLocator);
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
