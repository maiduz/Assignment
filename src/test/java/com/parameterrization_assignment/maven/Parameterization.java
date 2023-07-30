package com.parameterrization_assignment.maven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	
	public WebDriver driver;
	
	
	@Test
	@Parameters ({"Browser","url", "email", "Password"})
	public void tnLogin(@Optional("Browser")String Browser,@Optional("https://tutorialsninja.com/demo/")String url,@Optional("email")String email,@Optional("password") String password) {
		    if(Browser.equals("Chrome")) {
		    	driver = new ChromeDriver();
		    }
		    else if(Browser.equals("Firefox")){
		    	driver = new FirefoxDriver();
		    }
		    driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(url);
			driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.linkText("Login")).click();	
			driver.findElement(By.cssSelector("input#input-email")).sendKeys(email);
			driver.findElement(By.cssSelector("input#input-password")).sendKeys(password);
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			
	}
	
	
	
	
}


