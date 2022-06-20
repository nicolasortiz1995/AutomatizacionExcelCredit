package com.project.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Scenario_Test {
	
	private WebDriver driver;
	Scenario scenario;

	@Before
	public void setUp() throws Exception {
		scenario = new Scenario(driver);
		driver = scenario.chromeDriverConnection();
		scenario.visit("http://automationpractice.com/index.php");
		
		
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws Exception {
		scenario.testPage();
		assertEquals("6 Products", scenario.lastMessage());
	}

}
