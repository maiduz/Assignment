package com.testNG.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class First_TestNG_Assignment {
	
	    //TutorialsNinja
		//Whole Login Page
		//Whole Register Page
		//each web element - I want 3 cssSelectors for each
	
	public WebDriver driver;
	
	@BeforeMethod
	public void commonFunction() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.cssSelector("a.dropdown-toggle > i + span.hidden-xs.hidden-sm.hidden-md")).click();
		
		
	}		

	@Test(priority = 2)
	public void registerTestCase1() {
		
		driver.findElement(By.cssSelector("ul.dropdown-menu.dropdown-menu-right >li:nth-of-type(1)>a")).click();
		driver.findElement(By.cssSelector("div.col-sm-10 >input#input-firstname")).sendKeys("Md");
		driver.findElement(By.cssSelector("div.col-sm-10 >input#input-lastname")).sendKeys("Munna");
		driver.findElement(By.cssSelector("div.col-sm-10 >input#input-email")).sendKeys("munna3@ninja.com");
		driver.findElement(By.cssSelector("div.col-sm-10 >input#input-telephone")).sendKeys("1234567");
		driver.findElement(By.cssSelector("div.col-sm-10 >input#input-password")).sendKeys("munna@123");
		driver.findElement(By.cssSelector("div.col-sm-10 >input#input-confirm")).sendKeys("munna@123");
		driver.findElement(By.cssSelector("label.radio-inline + label > input[name=newsletter]")).click();
		driver.findElement(By.cssSelector("a.agree + input")).click();
		driver.findElement(By.cssSelector("input[value=Continue]")).click();
		Assert.fail();

	}
	@Test(priority=1)
	public void registerTestCase2() {
		
		driver.findElement(By.cssSelector("ul.dropdown-menu.dropdown-menu-right >li:nth-of-type(1)>a")).click();
		driver.findElement(By.cssSelector("input[name=firstname]")).sendKeys("Md");
		driver.findElement(By.cssSelector("input[name=lastname]")).sendKeys("Munna");
		driver.findElement(By.cssSelector("input[name=email]")).sendKeys("munna2@ninja.com");
		driver.findElement(By.cssSelector("input[name=telephone]")).sendKeys("1234567");
		driver.findElement(By.cssSelector("input[name=password")).sendKeys("munna@123");
		driver.findElement(By.cssSelector("input[name=confirm")).sendKeys("munna@123");
		driver.findElement(By.cssSelector("label.radio-inline + label > input")).click();
		driver.findElement(By.cssSelector("input[type=checkbox]")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

    }
	@Test(priority=3 , dependsOnMethods = {"registerTestCase1", "registerTestCase2"})
	public void registerTestCase3() {
		
		driver.findElement(By.cssSelector("ul.dropdown-menu.dropdown-menu-right >li:nth-of-type(1)>a")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Md");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Munna");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("munna1@ninja.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("1234567");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("munna@123");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("munna@123");
		driver.findElement(By.cssSelector("label.radio-inline + label")).click();
		driver.findElement(By.cssSelector("input[name=agree]")).click();
		driver.findElement(By.cssSelector("input[value=Continue]")).click();
     }
	
	 @Test(priority =4)
     public void loginTestCase1(){
		 
		driver.findElement(By.cssSelector("ul.dropdown-menu.dropdown-menu-right  >li:nth-of-type(2) >a ")).click();	
	    driver.findElement(By.cssSelector("input#input-email")).sendKeys("munna1@ninja.com");
	    driver.findElement(By.cssSelector("input#input-password")).sendKeys("munna@123");
	    driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	    driver.findElement(By.cssSelector("div.list-group >a:nth-of-type(13)")).click();
	
    }
     @Test (priority=5)
     public void loginTestCase2(){
    	
       driver.findElement(By.cssSelector("ul.dropdown-menu.dropdown-menu-right  >li:nth-of-type(2) >a ")).click();	
	   driver.findElement(By.cssSelector("div.form-group >input[name=email]")).sendKeys("munna2@ninja.com");
	   driver.findElement(By.cssSelector("div.form-group > input[name=password]")).sendKeys("munna@123");
	   driver.findElement(By.cssSelector("input[value=Login]")).click();
	   driver.findElement(By.cssSelector("div.list-group >a:nth-of-type(13)")).click();
	
    }
    @Test(priority=6 , enabled = false)
    public void loginTestCase3(){
    
      driver.findElement(By.cssSelector("ul.dropdown-menu.dropdown-menu-right  >li:nth-of-type(2) >a ")).click();	
	  driver.findElement(By.cssSelector("div.form-group >input[type=text]")).sendKeys("munna3@ninja.com");
	  driver.findElement(By.cssSelector("div.form-group >label + input[name=password]")).sendKeys("munna@123");
	  driver.findElement(By.cssSelector("input[type=submit]")).click();
	  driver.findElement(By.cssSelector("div.list-group >a:nth-of-type(13)")).click();
	
    }
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
