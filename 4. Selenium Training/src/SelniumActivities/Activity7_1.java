package SelniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		driver.manage().window().maximize();
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		System.out.println("Page title is:" + driver.getTitle());
		
		//Find the username and password input fields. Type in the credentials: 
		driver.findElement(By.xpath("//input[starts-with(@class, 'username')]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[starts-with(@class, 'password')]")).sendKeys("password");
		
		//Click Login
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
    	
        System.out.println("Login message: " + loginMessage);
        
        driver.close();
		
		
	}

}
