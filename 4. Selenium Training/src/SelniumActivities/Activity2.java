package SelniumActivities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.training-support.net");
		
		String s = driver.getTitle();
		System.out.println("Page title is:"+ s);
		
		WebElement id = driver.findElement(By.id("about-link"));
		System.out.println("Test of an id element:"+ id.getText());
		
		WebElement class1 = driver.findElement(By.className("green"));
		System.out.println("Test of an class element:"+ class1.getText());
		
		WebElement lt1= driver.findElement(By.linkText("About Us"));
		System.out.println("Test of an linktest element:"+ lt1.getText());
		
		WebElement cn= driver.findElement(By.cssSelector(".green"));
		System.out.println("Test of an cssselector element:"+ id.getText());
		
		System.out.println(s);
				
		driver.close();

	}

}
