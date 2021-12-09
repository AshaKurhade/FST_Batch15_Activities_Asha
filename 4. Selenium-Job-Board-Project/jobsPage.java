package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class jobsPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		//Navigate to ‘https://alchemy.hguy.co/jobs’.
		driver.get("https://alchemy.hguy.co/jobs");
		
		//Find the navigation bar.
		//Select the menu item that says “Jobs” and click it.
		driver.findElement(By.linkText("Jobs")).click();
		
		//Read the page title and verify that you are on the correct page.
		String jobtitle = driver.getTitle();
	
		if (jobtitle.equals("Jobs – Alchemy Jobs")) {
			System.out.println("You are on correct page!");
		}
		else {
			System.out.println("You are on wrong page");	
		}
		//Close the browser.

	}

}
