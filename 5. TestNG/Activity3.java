package TestNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
	WebDriver driver;
	//In the @BeforeClass method, create the a driver instance for FirefoxDriver
	
	@BeforeClass
	public void BeforeClass() {
		  System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			//Also use the get() method to open the browser with https://www.training-support.net/selenium/login-form
			driver.get("https://www.training-support.net/selenium/login-form");
	  }
	
    //Find the login input fields - username and password
    
	@Test
	public void loginmethod() {
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		String message = driver.findElement(By.id("action-confirmation")).getText();
		Assert.assertEquals("Welcome Back, admin", message);
	}
	
	
	//In the @AfterClass method, use close() to close the browser once the test is done.
		@AfterClass
		public void afterclassmethod() {
			driver.close();
		}
}
