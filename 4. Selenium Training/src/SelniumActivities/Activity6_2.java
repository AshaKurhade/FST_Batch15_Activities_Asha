package SelniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		driver.manage().window().maximize();
		driver.get(" https://training-support.net/selenium/ajax");
		System.out.println("Page title is:" + driver.getTitle());
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		//Find and click the "Change content" button on the page
		WebElement changecontent = driver.findElement(By.xpath("//button[contains(text(), 'Change Content')]"));
		changecontent.click();
		
		//Wait for the text to say "HELLO!". Print the message that appears on the page.
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));
		
        //getText() and print it
		
        String ajaxText = driver.findElement(By.id("ajax-content")).getText();
	
        System.out.println("First message:"+ ajaxText);
        
        //Wait for the text to change to contain "I'm late!". Print the new message on the page.
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
        
        String NextText = driver.findElement(By.id("ajax-content")).getText();
    	
        System.out.println("Next message:"+ NextText);
        
		

	}

}
