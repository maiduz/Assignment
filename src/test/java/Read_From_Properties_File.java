

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_From_Properties_File {
	
	public static WebDriver driver;
	public static Properties prod;
	

	public static void main(String[] args) throws Exception {
		
		prod = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\com\\excercise\\config.properties");
		System.out.println(System.getProperty("user.dir"));
		prod.load(ip);
		Read_From_Properties_File.TNLogin();
		
	}
	
	public static void TNLogin() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prod.getProperty("url"));
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(prod.getProperty("validEmail"));
		driver.findElement(By.id("input-password")).sendKeys(prod.getProperty("validPassword"));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}


}
