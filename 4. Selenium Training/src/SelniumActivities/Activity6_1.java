package SelniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		driver.manage().window().maximize();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		System.out.println("Page title is:" + driver.getTitle());
		
		WebDriverWait wait= new WebDriverWait(driver, 10);
		
		//find checkbox and remove checkbox button
		WebElement checkbox = driver.findElement(By.xpath("//input[@type = 'checkbox']")) ;
		WebElement button = driver.findElement(By.xpath("//button[contains(text(), 'Remove checkbox')]"));
		
		//click on removecheckbox
		button.click();
		
		//wait for checkbox to disappear
		wait.until(ExpectedConditions.invisibilityOf(checkbox));
		
		//click toggle button again
		button.click();
		
		//wait for checkbox to appear
		wait.until(ExpectedConditions.visibilityOf(checkbox));
		checkbox.click();
		
		driver.close();
		
		
		
	}

}
