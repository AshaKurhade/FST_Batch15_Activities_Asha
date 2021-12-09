package SelniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12_3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
	
		driver.manage().window().maximize();
		driver.get(" https://www.training-support.net/selenium/popups");
		System.out.println("Page title is:" + driver.getTitle());
		
		//Find the Sign in button and hover over it. Print the tooltip message.
		WebElement button = driver.findElement(By.xpath("//button[contains(@class, 'orange')]"));
		Actions action = new Actions(driver);
		action.moveToElement(button).build().perform();
		
		System.out.println("tooltip message is:" + button.getAttribute("data-tooltip"));
		
		//Click the button to open the Sign in form.
		button.click();
		
        //Wait for modal to appear
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInModal")));
		
		/*Enter the credentials username: admin
		 * password: password */
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		
		    

		//Click login and print the message on the page after logging in.
		//Finally, close the browser.
		
		
		
		
		
	}

}
