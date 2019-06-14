package com.test.MRA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BasePage {

	protected WebDriver driver = null;

	// open browser
	@BeforeMethod
	//@Parameters("browser")
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
	
		}

	// close driver
	@AfterMethod
	public void tesrDown() {
		driver.close();
	}

}
