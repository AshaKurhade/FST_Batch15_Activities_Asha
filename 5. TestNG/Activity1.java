package TestNGTests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
	private WebDriver driver;
	//In the @BeforeMethod method, create a driver instance for FirefoxDriver
	@BeforeMethod
	  public void Beforemethod() {
		  System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.training-support.net");
			
	  }
	 
  @Test
  public void Testmethod() {
	  //Use getTitle() to get and print the title of the page.
	  String title = driver.getTitle();
	  System.out.println("Page title is:" + title);
	  
	  //Make an assertion using assertEquals() to make sure the title of the page is "Training Support".
	  Assert.assertEquals("Training Support", title);
	  
	  //Use findElement() to find the "About Us" Button on the page and click it.
	  driver.findElement(By.id("about-link")).click();
	  
	  //Get and print the title of the new page
	  String newtitle = driver.getTitle();
	  System.out.println("Page title after clicking is:" + newtitle);
	  
	  //Assert the title of the new page.
	  Assert.assertEquals("About Training Support", newtitle);
	    
  }
  
  //In the @AfterMethod method, use close() to close the browser once the test is done.
  @AfterMethod
  public void aftermethod() {
	  
	 driver.close(); 
	   
	  
	  
	  
  }
}
