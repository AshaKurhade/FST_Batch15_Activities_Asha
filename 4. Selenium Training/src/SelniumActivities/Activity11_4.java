package SelniumActivities;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11_4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
	
		driver.manage().window().maximize();
		driver.get("https://www.training-support.net/selenium/tab-opener");
		System.out.println("Page title is:" + driver.getTitle());
		
		//Print the Page Title and Handle of that tab.
		String parentwidnow= driver.getWindowHandle();
		System.out.println("window handle is: " + parentwidnow);
		
		//Find the button to open a new tab and click it.
		WebElement button = driver.findElement(By.linkText("Click Me!"));
		button.click();
		
		//Wait for the new tab to open.
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		//Print all the handles
		Set<String> handles= driver.getWindowHandles();	
		System.out.println("All window handles: " + handles);
		
		//loop through each handle
		for (String handle : handles) {
			driver.switchTo().window(handle);
		}
		
        //Print the handle of the current window
		System.out.println("Current window handle: " + driver.getWindowHandle());
		
        //Wait for page to load completely
		wait.until(ExpectedConditions.titleIs("Newtab"));
		
        //Print New Tab Title
		
        System.out.println("New Tab Title is: " + driver.getTitle());
        
        //Get heading on new page
        String newtabtext= driver.findElement(By.cssSelector("div.content")).getText();
        System.out.println("New Tab heading is: " + newtabtext);
        
        //Open Another Tab
    	driver.findElement(By.linkText("Open Another One!")).click();
    	wait.until(ExpectedConditions.numberOfWindowsToBe(3));
    	
        //Make sure the new tab's handle is part of the handles set
    	
        handles = driver.getWindowHandles();
        System.out.println("All window handles: " + handles);
	
 
        //Loop through the handles set till we get to the newest handle
	
        for (String handle : driver.getWindowHandles()) {
	
            driver.switchTo().window(handle);
	
        }
        
        //Print the handle of the current window
    	System.out.println("New tab handle: " + driver.getWindowHandle());
	
        //Wait for the newest tab to load completely
	    wait.until(ExpectedConditions.titleIs("Newtab2"));

	    //Print New Tab Title
		  System.out.println("New Tab Title is: " + driver.getTitle());
	
 
	
        //Get heading on new page
	      newtabtext = driver.findElement(By.cssSelector("div.content")).getText();
	      System.out.println("New tab heading is: " + newtabtext);
	
         //Close the browser
        driver.quit();
		
	}

}
