package TestNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity10 {
	WebDriver driver;
	Actions action;
	
	@BeforeClass 
	public void BeforeTest() {
		  System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			action = new Actions(driver);
			driver.manage().window().maximize();	
			driver.get("https://www.training-support.net/selenium/sliders");
	  }
	
	@Test
	public void middlevalue() {
		WebElement slider = driver.findElement(By.id("slider"));
		//Clicking on the slider element moves it to the middle
		slider.click();
		String valuemid= driver.findElement(By.cssSelector("span#value")).getText();
        Reporter.log("Mid volume: " + valuemid);
        Assert.assertEquals(valuemid, "50");
	}
	@Test
	public void maxvalue() {
		WebElement slider = driver.findElement(By.id("slider"));
		action.clickAndHold(slider).moveByOffset(75, 0).release().build().perform();
		String valuemax= driver.findElement(By.cssSelector("span#value")).getText();
        Reporter.log("Max volume: " + valuemax);
        Assert.assertEquals(valuemax, "100");
	}
	@Test
	public void minvalue() {
		WebElement slider = driver.findElement(By.id("slider"));
		action.clickAndHold(slider).moveByOffset(-75, 0).release().build().perform();
		String valuemin= driver.findElement(By.cssSelector("span#value")).getText();
        Reporter.log("Max volume: " + valuemin);
        Assert.assertEquals(valuemin, "0");
	}
	@Test
	public void thirtyvalue() {
		WebElement slider = driver.findElement(By.id("slider"));
		action.clickAndHold(slider).moveByOffset(-30, 0).release().build().perform();
		String valuethr= driver.findElement(By.cssSelector("span#value")).getText();
        Reporter.log("Max volume: " + valuethr);
        Assert.assertEquals(valuethr, "30");
		
	}
	@Test
	public void eightyvalue() {
		WebElement slider = driver.findElement(By.id("slider"));
		action.clickAndHold(slider).moveByOffset(44, 0).release().build().perform();
		String valueeighty= driver.findElement(By.cssSelector("span#value")).getText();
        Reporter.log("Max volume: " + valueeighty);
        Assert.assertEquals(valueeighty, "80");
		
	}
	
	
	@AfterClass 
	public void afterclassmethod() {
		driver.close();
	}
	
}
