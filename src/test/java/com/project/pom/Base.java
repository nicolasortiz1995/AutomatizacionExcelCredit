package com.project.pom;

import java.util.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	
	private WebDriver driver;
	
	public Base(WebDriver driver) {
		this.driver = driver;
	}
	public WebDriver chromeDriverConnection() {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}
	public List<WebElement> findElements(By locator){
		return driver.findElements(locator);
	}
	public String getText(WebElement element) {
		return element.getText();
	}
	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}
	public void type(String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
	}
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	public Boolean isDisplayed (By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		}catch(org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	public Boolean isBePresence(By locator) {
		try {
			WebDriverWait waiter = new WebDriverWait(driver, Duration.ofSeconds(10));
			//I use explicit wait, not implicit :D
			waiter.until(ExpectedConditions.elementToBeClickable(locator));
			return true;
		}catch(org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	public Boolean isNotPresence(By locator) {
		try {
			WebDriverWait waiter = new WebDriverWait(driver, Duration.ofSeconds(10));
			//I use explicit wait, not implicit :D
			waiter.until(ExpectedConditions.invisibilityOfElementLocated(locator));
			return true;
		}catch(org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	public void visit(String url) {
		driver.get(url);
	}
}
