package SelniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		driver.manage().window().maximize();
		driver.get("https://www.training-support.net/selenium/input-events");
		System.out.println("Page title is:" + driver.getTitle());
		
		//On the page, perform -Left click and print the value of the side in the front.
		Actions action= new Actions (driver);
		WebElement cube= driver.findElement(By.id("wrapD3Cube"));
		
		//Single click
		action.click(cube);
		WebElement cubev= driver.findElement(By.className("active"));
		System.out.println("Side value is: " + cubev.getText());
		
		Thread.sleep(3000);
	    //Double click to show a random side and print the number.
		action.doubleClick(cube).perform();
		cubev= driver.findElement(By.className("active"));
		System.out.println("Side value is: " + cubev.getText());
		
		Thread.sleep(3000);
	    //Right click and print the value shown on the front of the cube.
		action.contextClick(cube).perform();
		cubev= driver.findElement(By.className("active"));
		System.out.println("Side value is: " + cubev.getText());

	//Finally, close the browser.

	}

}
	