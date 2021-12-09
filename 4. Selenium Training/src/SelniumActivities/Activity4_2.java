package SelniumActivities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://www.training-support.net/selenium/simple-form");
		
		String pagetitle = driver.getTitle();
		System.out.println("Page title is:"+ pagetitle);
		
		WebElement firstname = driver.findElement(By.xpath("//input[@id = 'firstName']"));
		firstname.sendKeys("Ash");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@id= 'lastName']"));
		lastname.sendKeys("kur");
		
		
		WebElement email = driver.findElement(By.xpath("//input[@type= 'email']"));
		email.sendKeys("ash@gmail.com");
		
		WebElement number = driver.findElement(By.xpath("//input[contains(@type,'tel')]"));
		number.sendKeys("9909090900");
		
		driver.findElement(By.xpath("//textarea")).sendKeys("Hello");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		

	}

}
