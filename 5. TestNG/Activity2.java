package TestNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;

public class Activity2 {
	WebDriver driver;
	//In the @BeforeClass method, create the a driver instance for FirefoxDriver
	
	@BeforeClass
	public void BeforeClass() {
		  System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			//Also use the get() method to open the browser with https://www.training-support.net/selenium/target-practice
			driver.get("https://www.training-support.net/selenium/target-practice");
	  }
	//Add 4 @Test methods.
	@Test (priority = 0)
	public void firsttest() {
		//In the first @Test method, use getTitle() to get and assert the title of the page.
		String title = driver.getTitle();
		  System.out.println("Page title is:" + title);
		  Assert.assertEquals("Target Practice", title);
	}
	
	@Test (priority = 1)
	public void secondtest() {
		//In the second @Test method, use findElement() to look for the black button
		WebElement blackbutton = driver.findElement(By.xpath("//button[contains(text(), 'Black')]"));
		Assert.assertTrue(blackbutton.isDisplayed());
		Assert.assertEquals(blackbutton.getText(), "black");
	}
	
	@Test (priority = 2, enabled = false)
	public void thirdtest() {
	//For the third @Test method, skip it by setting it's enabled parameter to false
		System.out.println("Third Method skipped");
	}
	@Test (priority = 3)
	public void fourthtest() {
	//For the fourth @Test method, skip it by throwing a SkipException inside the method. 
		throw new SkipException("Skip exception test case");
	}
	
	//In the @AfterClass method, use close() to close the browser once the test is done.
	@AfterClass
	public void afterclassmethod() {
		driver.close();
	}
}
