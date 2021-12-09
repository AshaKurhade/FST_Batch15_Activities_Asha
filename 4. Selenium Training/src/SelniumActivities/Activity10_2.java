package SelniumActivities;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Activity10_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		driver.manage().window().maximize();
		driver.get("https://www.training-support.net/selenium/input-events");
		System.out.println("Page title is:" + driver.getTitle());
		
		Actions action = new Actions(driver);
		WebElement pressedkey= driver.findElement(By.id("keyPressed"));
		
		 //Press the key of your first name in caps
		action.sendKeys("A").build().perform();
		System.out.println("Pressed key is:" +pressedkey.getText());
		
		
	    /*Press CTRL+a and the CTRL+c to copy all the text on the page.
	    (Paste the text in a text editor to verify results.)*/
		action.keyDown(Keys.CONTROL).sendKeys("A").sendKeys("C").keyUp(Keys.CONTROL)
				.build().perform();
		
		pressedkey.sendKeys(Keys.chord(Keys.CONTROL, "V"));
		String s = pressedkey.getText();
		System.out.println("Pressed Key is:" + s);
		
				

	   

	}

}
