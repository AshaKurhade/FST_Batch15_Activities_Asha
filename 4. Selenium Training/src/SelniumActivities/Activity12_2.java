package SelniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
	
		driver.manage().window().maximize();
		driver.get("https://www.training-support.net/selenium/nested-iframes");
		System.out.println("Page title is:" + driver.getTitle());
		
		//Traverse into the iframe that is on the page.
		driver.switchTo().frame(0);
		System.out.println("This is the first frame");	
			
		//Traverse into the first iframe in that frame.
		driver.switchTo().frame(0);
				
		//Print the heading of that frame.
		String heading = driver.findElement(By.cssSelector("div.content")).getText();
		System.out.println("Page title is:" + heading);
		
        //Switch back to parent page
        driver.switchTo().defaultContent();
		
        //Switch to first iFrame on the page
        driver.switchTo().frame(0);
		
		//Navigate to the second iframe in that frame.
		driver.switchTo().frame(1);
		
		//Print the heading of that frame.
		String newheading = driver.findElement(By.cssSelector("div.content")).getText();
		System.out.println("Page title is:" + newheading);
		
	}

}
