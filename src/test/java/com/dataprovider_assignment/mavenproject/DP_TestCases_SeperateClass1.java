package com.dataprovider_assignment.mavenproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DP_TestCases_SeperateClass1 {

     public WebDriver driver;
     
        @BeforeMethod
        public void commonMethod(){
        driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.cssSelector("a.dropdown-toggle > i + span.hidden-xs.hidden-sm.hidden-md")).click();
		driver.findElement(By.cssSelector("ul.dropdown-menu.dropdown-menu-right >li:nth-of-type(1)>a")).click();
        }
	@Test(priority=1 , dataProvider = "Tutorial Ninja" , dataProviderClass = DataProvider_TN_Register.class)
	public void registerTestCase1(String firstName, String lastName, String email, String phoneNumber, String password, String confirmPassword) {
		
		driver.findElement(By.cssSelector("div.col-sm-10 >input#input-firstname")).sendKeys(firstName);
		driver.findElement(By.cssSelector("div.col-sm-10 >input#input-lastname")).sendKeys(lastName);
		driver.findElement(By.cssSelector("div.col-sm-10 >input#input-email")).sendKeys(email);
		driver.findElement(By.cssSelector("div.col-sm-10 >input#input-telephone")).sendKeys(phoneNumber);
		driver.findElement(By.cssSelector("div.col-sm-10 >input#input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("div.col-sm-10 >input#input-confirm")).sendKeys(confirmPassword);
		driver.findElement(By.cssSelector("label.radio-inline + label > input[name=newsletter]")).click();
		driver.findElement(By.cssSelector("a.agree + input")).click();
		driver.findElement(By.cssSelector("input[value=Continue]")).click();	
   }
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
