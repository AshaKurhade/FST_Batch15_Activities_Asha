package TestNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity7 {
	WebDriver driver;
	
	@BeforeMethod
	public void BeforeClass() {
		  System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.training-support.net/selenium/login-form");
	  }
	
	@DataProvider (name = "Authentication")
	public static Object[][]credentials() {
		return new Object[][] {{"admin", "password"}};	
	}
	@Test (dataProvider = "Authentication")
	public void login(String username, String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		String message = driver.findElement(By.id("action-confirmation")).getText();
		Assert.assertEquals("Welcome Back, admin", message);	
	}
	@AfterMethod
	public void afterclassmethod() {
		driver.close();
	}
}
