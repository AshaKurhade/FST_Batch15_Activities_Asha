package SelniumActivities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		driver.manage().window().maximize();
		driver.get(" https://www.training-support.net/selenium/javascript-alerts");
		System.out.println("Page title is:" + driver.getTitle());
		
		//Also use findElement() to find the button to open a PROMPT alert and click it.
		WebElement promptbutton=driver.findElement(By.id("prompt"));
		promptbutton.click();
				
		//Switch the focus from the main window to the Alert box.
		Alert prompt= driver.switchTo().alert();
		System.out.println("alert text is:" + prompt.getText());
		
		//Use sendKeys() to type in "Yes, you are!".
		prompt.sendKeys("Yes, you are!");

		Thread.sleep(3000);
		//Close the alert with alert.accept().
		prompt.accept();
		
		//Finally, close() the browser.
		driver.close();
	}

}
