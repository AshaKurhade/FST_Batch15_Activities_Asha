package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class websiteHeading {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		//Navigate to ‘https://alchemy.hguy.co/jobs’.
		driver.get("https://alchemy.hguy.co/jobs");
		
		//Get the heading of the webpage.
		String title = driver.findElement(By.cssSelector("h1.entry-title")).getText();
		System.out.println("heading of the page is:" + title);
		
		//Make sure it matches “Welcome to Alchemy Jobs” exactly- If it matches, close the browser.
		if (title.equals("Welcome to Alchemy Jobs")) {
			System.out.println("heading matches");
			driver.close();
		}
		else {
			System.out.println("invalid heading");	
		}
		
	}

}
