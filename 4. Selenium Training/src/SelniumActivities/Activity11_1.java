package SelniumActivities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		driver.manage().window().maximize();
		driver.get(" https://www.training-support.net/selenium/javascript-alerts");
		System.out.println("Page title is:" + driver.getTitle());
		
		/*Use findElement() to find the button to open a SIMPLE alert and click it.*/
		WebElement simplealert = driver.findElement(By.id("simple"));
		simplealert.click();
		
		/*Switch the focus from the main window to the Alert box and get the text in it and print it.*/
		Alert simplealert1=driver.switchTo().alert();
		System.out.println("Alert text is:" + simplealert1.getText());
		
		//Finally, close the alert with alert.accept() and close() the browser
		simplealert1.accept();
		
		driver.close();

	}

}
