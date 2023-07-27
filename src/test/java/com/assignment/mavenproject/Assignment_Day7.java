package com.assignment.mavenproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_Day7 {

	public static void main(String[] args) throws InterruptedException {
		// tutorialsninja.com

		// Register option all validations for all WebElements - this in one method
		// Login option all validations for all WebElement - this in another method

		// getTitle
		// getCurrentUrl
		// isEnabled()
		// isDisplayed()
		// isSelected()

		LoginValidation();
		RegisterValidation();

	}

	public static void LoginValidation() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");

		 WebElement clickOnMyAccount = driver.findElement(By.linkText("My Account"));
		 //Thread.sleep(2000);
		 WebElement clickOnLogin = driver.findElement(By.linkText("Login"));
		 //Thread.sleep(2000);
		 WebElement userNameTextBox = driver.findElement(By.id("input-email"));
		 WebElement passwordTextBox = driver.findElement(By.id("input-password"));
		 WebElement loginButton = driver.findElement(By.cssSelector("input.btn.btn-primary"));

		
		  if(clickOnMyAccount.isDisplayed() && clickOnLogin.isDisplayed() && 
				  userNameTextBox.isDisplayed()&& passwordTextBox.isDisplayed() && loginButton.isEnabled() ) {
			  clickOnMyAccount.click(); clickOnLogin.click(); userNameTextBox.sendKeys("seleniumpanda@gmail.com");
		      passwordTextBox.sendKeys("Selenium@123"); loginButton.click();
		  
		  }else { 
			  driver.quit(); }
		 

	}

	public static void RegisterValidation() throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");
		
		
		 //WebElement clickOnMyAccount = 
				 driver.findElement(By.linkText("My Account")).click();
		 //Thread.sleep(1000);
		 //WebElement clickOnRegister = 
				 driver.findElement(By.linkText("Register")).click();
		 ///Thread.sleep(1000);
		 //WebElement firstNameTextBox = 
				 driver.findElement(By.id("input-firstname")).sendKeys("Md");
		 //WebElement lastNameTextBox = 
				 driver.findElement(By.id("input-lastname")).sendKeys("Munna");
		 //WebElement emailTextBox = 
				 driver.findElement(By.id("input-email")).sendKeys("munnaalways@gmail.com");
		 //WebElement telephoneTextBox = 
				 driver.findElement(By.id("input-telephone")).sendKeys("7184159380");
		 //WebElement passwordTextBox = 
				 driver.findElement(By.id("input-password")).sendKeys("munna123");
		 //WebElement confirmPasswordTextBox = 
				 driver.findElement(By.id("input-confirm")).sendKeys("munna123");
		 //WebElement subscribeButton = 
				 driver.findElement(By.xpath("//input[@value='0']")).click();
		 //WebElement privacyCheckBox = 
				 driver.findElement(By.xpath("//input[@name='agree']")).click();
		 //WebElement continueButton = 
				 driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		 
		 
		 //clickOnMyAccount.click();
		 //clickOnRegister.click();
		 

		

	}
}


