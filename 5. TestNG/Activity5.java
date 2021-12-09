package TestNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity5 {
	private WebDriver driver;
		
	@BeforeTest (alwaysRun = true)
	public void BeforeTest() {
		  System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			//Also use the get() method to open the browser with https://www.training-support.net/selenium/target-practice
			driver.get("https://www.training-support.net/selenium/target-practice");
	  }
	
	@Test (groups = {"HeaderTests", "ButtonTests"})
	public void pagetitle() {
		String title = driver.getTitle();
		  System.out.println("Page title is:" + title);
		  Assert.assertEquals("Target Practice", title);
	}
	
	@Test (dependsOnMethods = {"pagetitle"},groups= {"HeaderTests"})
	public void HeaderTest1() {
		String thirdheadertext= driver.findElement(By.cssSelector("h3#third-header")).getText();
		Assert.assertEquals("Third header", thirdheadertext);
	}
	
	@Test (dependsOnMethods ={"pagetitle"},groups= {"HeaderTests"})
	public void HeaderTest2() {
		WebElement fifthheader= driver.findElement(By.cssSelector("h5.green"));
		Assert.assertEquals("rgb(33, 186, 69)" , fifthheader.getCssValue("color"));
	}
	
	@Test (dependsOnMethods ={"pagetitle"},groups= {"ButtonTests"})
	public void ButtonTests1() {
		String olivebutton = driver.findElement(By.cssSelector("button.olive")).getText();
		Assert.assertEquals("Olive", olivebutton);
	}
	
	@Test (dependsOnMethods ={"pagetitle"},groups= {"ButtonTests"})
	public void ButtonTests2() {
		WebElement firstbutton = driver.findElement(By.cssSelector("button.brown"));
		Assert.assertEquals("rgb(255, 255, 255)", firstbutton.getCssValue("color"));
	}
	
			@AfterTest (alwaysRun = true)
			public void afterclassmethod() {
				driver.close();
			}
}
