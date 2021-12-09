package SelniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		driver.manage().window().maximize();
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		System.out.println("Page title is:" + driver.getTitle());
		
		driver.findElement(By.xpath("//input[contains(@class, '-username')]")).sendKeys("ash");
		driver.findElement(By.xpath("//input[contains(@class, '-password') and (@type='password')]")).sendKeys("pwd");
		driver.findElement(By.xpath("//label[text()='Confirm Password'] /following::input")).sendKeys("pwd");
		driver.findElement(By.xpath("//label[contains(text(), 'mail')]/following-sibling::input")).sendKeys("a@gmail.co");
		
		//find signup button
		driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();
		
		//print login message
		String s= driver.findElement(By.id("action-confirmation")).getText();
		
        System.out.println("Login message: " + s);
    	
 
	
        driver.close();
		
	

	}

}
