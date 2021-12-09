package TestNGTests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Activity9 {
WebDriver driver;
	
	@BeforeClass
	public void BeforeTest() {
		  System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			Reporter.log("Starting the test |");
			driver.manage().window().maximize();
			
			driver.get("https://www.training-support.net/selenium/javascript-alerts");
			Reporter.log("Browser opened and website home page appeared |");
	  }
	
	@BeforeMethod
	public void beforemethod() {
		Reporter.log("Test setup started |");
		driver.switchTo().defaultContent();
	}
	
	//Make three @Test methods - simpleAlertTestCase(), confirmAlertTestCase(), promptAlertTestCase().
	@Test (priority = 0)
	public void simpleAlertTestCase() {
		Reporter.log("Simple Alert test case started |");
		driver.findElement(By.id("simple")).click();
		Reporter.log("Simple Alert Opened");
		
		Alert alert = driver.switchTo().alert();
		Reporter.log("Simple alert text is:" + alert.getText());	
		Assert.assertEquals("This is a JavaScript Alert!", alert.getText());
		alert.accept();
		Reporter.log("Alert closed |");
		Reporter.log("Simple Alert Test case ended |");
	}
	@Test (priority = 1)
	public void confirmAlertTestCase() {
		Reporter.log("confirmAlertTestCase() started |");
		driver.findElement(By.id("confirm")).click();
		Reporter.log("Confirm Alert opened |");
		
		Alert alert = driver.switchTo().alert();
		Reporter.log("Switched foucs to alert |");
		Reporter.log("Alert text is: " + alert.getText()+ " |"); 
		Assert.assertEquals("This is a JavaScript Confirmation!", alert.getText());
		alert.accept();
        Reporter.log("Alert closed |");
        Reporter.log("Confirm Alert Test case ended |");
	}
	@Test (priority = 2)
	public void promptAlertTestCase() {
		Reporter.log("promptAlertTestCase() started |");
		driver.findElement(By.id("prompt")).click();
        Reporter.log("Prompt Alert opened |");
    	
        
		Alert alert = driver.switchTo().alert();
		Reporter.log("Switched foucs to alert |");
		
		System.out.println("prompt alert text is:" + alert.getText());
		Reporter.log("Alert text is: " + alert.getText() + " |");
		alert.sendKeys("test");
		Reporter.log("Text entered in prompt alert |");
		
		Assert.assertEquals("This is a JavaScript Prompt!", alert.getText());
		alert.dismiss();
        Reporter.log("Alert closed |");
        Reporter.log("Test case ended |");
	}

	@AfterClass 
	public void afterclassmethod() {
		Reporter.log("Ended Test |");
		driver.close();
	}
}
