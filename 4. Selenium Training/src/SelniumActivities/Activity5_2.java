package SelniumActivities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://training-support.net/selenium/dynamic-controls");
		
		System.out.println("Page title is:" + driver.getTitle());
		
		WebElement lable = driver.findElement(By.xpath("//input[@type = 'checkbox']")) ;
		boolean b = lable.isSelected();
		System.out.println("Checkbox is selected:" + b);
		
		driver.findElement(By.xpath("//input[@type = 'checkbox']")).click();
		
		System.out.println("Checkbox is selected:" + lable.isSelected());
		

	}

}
