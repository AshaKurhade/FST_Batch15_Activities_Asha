package SelniumActivities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		driver.manage().window().maximize();
		driver.get(" https://www.training-support.net/selenium/javascript-alerts");
		System.out.println("Page title is:" + driver.getTitle());
		
		//Use findElement() to find the button to open a CONFIRM alert and click it.
		WebElement confirmbutton=driver.findElement(By.id("confirm"));
		confirmbutton.click();
		
		//Switch the focus from the main window to the Alert box and get the text in it and print it.
		Alert cb= driver.switchTo().alert();
		System.out.println("Alert text is:" +cb);
		
		//Close the alert once with alert.accept() and again with alert.dismiss()
		cb.accept();
		System.out.println( "alert accepeted");
		
		confirmbutton.click();
		Alert cb1= driver.switchTo().alert();
		
		cb1.dismiss();
		System.out.println( "alert dismissed");
		
		//Finally, close() the browser
		driver.close();
	}

}
