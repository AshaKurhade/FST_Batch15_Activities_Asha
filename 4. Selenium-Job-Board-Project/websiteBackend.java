package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class websiteBackend {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//Navigate to ‘https://alchemy.hguy.co/jobs/wp-admin’.
		driver.get("https://alchemy.hguy.co/jobs/wp-admin");
		
		//Find the username field of the login form and enter the username into that field.
		driver.findElement(By.id("user-login")).sendKeys("asha");
		//Find the password field of the login form and enter the password into that field.
		driver.findElement(By.id("user-pass")).sendKeys("password");
		
		//Find the login button and click it.
		driver.findElement(By.id("wp-submit")).click();
		
		//Verify that you have logged in.
		System.out.println("used logged in");
		
		//Close the browser.
		driver.close();

	}

}
