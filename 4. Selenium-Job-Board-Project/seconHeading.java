package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seconHeading {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		//Navigate to ‘https://alchemy.hguy.co/jobs’.
		driver.get("https://alchemy.hguy.co/jobs");
		
		//Get the second heading of the webpage.
		String sheading = driver.findElement(By.xpath("//div[contains(@class , 'entry-content clear')]/h2")).getText();
		System.out.println("second heading of the page is:" + sheading);
		
		//Make sure it matches “Quia quis non” exactly.
		if (sheading.equals("Quia quis non")) {
			System.out.println("Second heading matches");
			driver.close();
		}
		else {
			System.out.println("invalid second heading");	
		}
	}

}
