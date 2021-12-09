package TestNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;


public class Activity6 {
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void BeforeClass() {
		  System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			wait = new WebDriverWait(driver, 10);
			driver.manage().window().maximize();
			driver.get("https://www.training-support.net/selenium/login-form");
	  }
	
	@Test
	@Parameters({ "username", "password" })
	public void login(String username, String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		String message = driver.findElement(By.id("action-confirmation")).getText();
		Assert.assertEquals("Welcome Back, admin", message);
	}
	@AfterClass
	public void afterclassmethod() {
		driver.close();
	}
}
