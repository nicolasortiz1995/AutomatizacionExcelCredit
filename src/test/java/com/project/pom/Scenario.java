package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Scenario extends Base{
	
	By addToCartLocator = By.className("ajax_add_to_cart_button");
	By continueShoppingLocator = By.className("continue");
	
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
	String cartUrl = "http://automationpractice.com/index.php?controller=order";
	
	By summaryProducts = By.id("summary_products_quantity");

	
	public Scenario(WebDriver driver) {
		super(driver);
	}
	
	public void testPage() {
		//T-SHIRTS
		visit(tShirtsUrl);
		click(addToCartLocator);
		click(continueShoppingLocator);
		//BLOUSES
		visit(blousesUrl);
		click(addToCartLocator);
		click(continueShoppingLocator);
		//CASUAL DRESSES
		visit(casualDressesUlr);
		click(addToCartLocator);
		click(continueShoppingLocator);
		//EVENING DRESSES
		visit(eveningDressesUrl);
		click(addToCartLocator);
		click(continueShoppingLocator);
		//SUMMER DRESSES
		visit(summerDressesUrl);
		click(addToCartLocator);
		click(continueShoppingLocator);
		//Adding the third product
		click(addToCartLocator2);
		click(continueShoppingLocator);
		getText(summaryProducts);
		
	}
	
	
}
