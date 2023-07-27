package com.assignment.mavenproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MyFirstProject {

	public static void main(String[] args) {
		/*
		 * WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.manage().deleteAllCookies();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		 * driver.get("https://tutorialsninja.com/demo/");
		 * driver.findElement(By.linkText("My Account")).click();
		 * driver.findElement(By.linkText("Login")).click();
		 * driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		 * driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		 * driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		 * driver.findElement(By.linkText("Logout")).click();
		 * driver.findElement(By.linkText("Continue")).click();
		 */
       //openEdge();
		openFirefox();
        
	}
        
	/*
	 * public static void openEdge() { WebDriver driver1 = new EdgeDriver();
	 * driver1.manage().window().maximize(); driver1.manage().deleteAllCookies();
	 * driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 * driver1.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	 * driver1.get("https://www.facebook.com/login/");
	 * driver1.findElement(By.linkText("Create new account")).click();
	 * driver1.findElement(By.name("firstname")).sendKeys("Md");
	 * driver1.findElement(By.name("lastname")).sendKeys("Munna");
	 * driver1.findElement(By.className("inputtext _58mg _5dba _2ph-")).sendKeys(
	 * "7184159380");
	 * driver1.findElement(By.className("inputtext _58mg _5dba _2ph-")).sendKeys(
	 * "Ud87067*");
	 */
        
        
        
        
		
		  public static void openFirefox() {
			  
		  
		  WebDriver driver2 = new FirefoxDriver();
		  driver2.manage().window().maximize(); 
		  driver2.manage().deleteAllCookies();
		  driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver2.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//		  driver2.get("https://www.flipkart.com/");
//		  driver2.switchTo().newWindow(WindowType.TAB);
//		  driver2.get("https://www.amazon.com/");
//		  driver2.switchTo().newWindow(WindowType.WINDOW);
//		  driver2.get("https://www.walmart.com/");
//		  driver2.navigate().to("https://www.costco.com/");
//		  driver2.navigate().back();
//		  driver2.get("https://www.target.com");
//		  driver2.switchTo().newWindow(WindowType.TAB);
//		  driver2.get("https://www.walmart.com");
//		  driver2.navigate().to("https://www.ebay.com");
//		  driver2.navigate().back();
//		  driver2.switchTo().newWindow(WindowType.WINDOW);
//		  driver2.navigate().to("https://www.amazon.com");
		  
		  driver2.get("https://tutorialsninja.com/demo/");
		  driver2.findElement(By.linkText("My Account")).click();
		  driver2.findElement(By.linkText("Register")).click();
		  driver2.findElement(By.cssSelector("input#input-firstname")).sendKeys("Md");
		  driver2.findElement(By.cssSelector("input#input-lastname")).sendKeys("zaman");
		  driver2.findElement(By.cssSelector("input#input-email")).sendKeys("zaman@gmail.com");
		  driver2.findElement(By.cssSelector("input#input-telephone")).sendKeys("455678990");
		  driver2.findElement(By.cssSelector("input#input-password")).sendKeys("mmm1234");
		  driver2.findElement(By.cssSelector("input#input-confirm")).sendKeys("mmm1234");
		  
		  
		 
        
	}
}



