package seleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class websiteTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		//Navigate to ‘https://alchemy.hguy.co/jobs’.
		driver.get("https://alchemy.hguy.co/jobs");
		
		//Get the title of the website.
		String title = driver.getTitle();
		System.out.println("title of the page is:" + title);
		
		//Make sure it matches “Alchemy Jobs – Job Board Application” exactly- If it matches, close the browser.
		if (title.equals("Alchemy Jobs – Job Board Application")) {
			System.out.println("title matches");
			driver.close();
		}
		else {
			System.out.println("invalid title");	
		}
		
	}

}
