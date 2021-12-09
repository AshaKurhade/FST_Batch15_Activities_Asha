package SelniumActivities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://training-support.net/selenium/simple-form");
		
		String s = driver.getTitle();
		System.out.println("Page title is:"+ s);
		
		WebElement a=driver.findElement(By.id("firstname"));
		a.sendKeys("Asha");
		
		
		WebElement b=driver.findElement(By.id("lastname"));
		b.sendKeys("Kur");
		
		WebElement c=driver.findElement(By.id("email"));
		c.sendKeys("Ashakurhade@gmail.com");
		
		WebElement d=driver.findElement(By.id("number"));
		d.sendKeys("7709247273");
		
		WebElement submit=driver.findElement(By.id("ui.green.button"));
		submit.click();  
		
		driver.close();

	}

}
