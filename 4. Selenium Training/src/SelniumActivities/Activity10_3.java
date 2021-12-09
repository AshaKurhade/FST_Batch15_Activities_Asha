package SelniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10_3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		driver.manage().window().maximize();
		driver.get("https://training-support.net/selenium/drag-drop");
		System.out.println("Page title is:" + driver.getTitle());
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Actions action=new Actions(driver);
		
		//Find the ball and simulate a click and drag to move it into "Dropzone 1".
		WebElement balltodrag=driver.findElement(By.id("draggable"));
		WebElement dropzone1=driver.findElement(By.xpath("//div[contains(text(), 'Dropzone 1')]"));
		WebElement dropzone2=driver.findElement(By.id("dropzone2"));
		
		action.clickAndHold(balltodrag).moveToElement(dropzone1).release().build().perform();
		
		//Verify that the ball has entered Dropzone 1.
		wait.until(ExpectedConditions.attributeToBeNotEmpty(dropzone1, "background-color"));
		System.out.println("Ball enetered in dropzone1");
		
		//Once verified, move the ball into "Dropzone 2".
		action.dragAndDrop(balltodrag, dropzone2).build().perform();
		
		//Verify that the ball has entered Dropzone 2.
		wait.until(ExpectedConditions.attributeToBeNotEmpty(dropzone2,"background-color"));
		System.out.println("Ball enetered in dropzone2");
		System.out.println("text is:"+ dropzone2.getText());
		
		//Once verified, close the browser.
		driver.close();
	}

}
