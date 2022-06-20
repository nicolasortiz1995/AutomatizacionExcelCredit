package com.project.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Scenario_Test_Firefox {
	
	private WebDriver driver;
	Scenario scenario;

	@Before
	public void setUp() throws Exception {
		scenario = new Scenario(driver);
		driver = scenario.chromeDriverConnectionFirefox();
		driver.manage().window().maximize();
		scenario.visit("http://automationpractice.com/index.php");		
		System.out.println("Opening: FireFox");
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
