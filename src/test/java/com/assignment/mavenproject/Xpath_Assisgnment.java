package com.assignment.mavenproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Assisgnment {

	public static void main(String[] args) {
	

		SignInValidation();
	}
	public static void SignInValidation(){

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.rediff.com/");
		driver.navigate().to("https://www.walmart.com/");
		driver.navigate().back();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://target.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.w3schools.com/sql/");
		
		


}
}
