package com.dataprovider_assignment.mavenproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DP_TestCases_SeperateClass2 {
	
	public WebDriver driver;
	
	
	@BeforeMethod 
		public void commonMethod() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();	
	}
	
		
		@Test(priority=1 , dataProvider = "TN" , dataProviderClass = DataProvider_TN_Register.class)
		public void login (String email, String password) {
		
		    driver.findElement(By.cssSelector("input#input-email")).sendKeys(email);
			driver.findElement(By.cssSelector("input#input-password")).sendKeys(password);
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		    driver.findElement(By.cssSelector("div.list-group >a:nth-of-type(13)")).click();
	   }
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
		

}
