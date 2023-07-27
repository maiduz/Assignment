package com.assignment.mavenproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
		
		
		driver.findElement(By.xpath("//a[@class='signin']")).click();


}
}
