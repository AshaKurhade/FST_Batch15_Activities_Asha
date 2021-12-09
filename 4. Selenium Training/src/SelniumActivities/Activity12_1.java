package SelniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
	
		driver.manage().window().maximize();
		driver.get("https://www.training-support.net/selenium/iframes");
		System.out.println("Page title is:" + driver.getTitle());
		
        		
		//Print the Heading of the 1st iframe.
		driver.switchTo().frame(0);
		String heading = driver.findElement(By.cssSelector("div.content")).getText();
				System.out.println("Page title is:" + heading);
		
		
		//Print the Button Text and color of the button in that frame.
		WebElement button = driver.findElement(By.id("actionButton"));
				System.out.println("button text is:" + button.getText());
				System.out.println("button color is:" + button.getCssValue("background-color"));
		
				
		//Click on the new button in that frame.
				button.click();
				
		//Print the new Button Text and color of the button.
		WebElement newbutton = driver.findElement(By.id("actionButton")); 		
		System.out.println("button text is:" + newbutton.getText());
		System.out.println("button color is:" + newbutton.getCssValue("background-color"));		
				
		//Repeat Steps 3-6 with the 2nd iframe.
		
		//Switch back to parent page
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
		
		driver.switchTo().frame(1);
		
		//Print the Heading of the 2nd iframe.
		String secondheading = driver.findElement(By.cssSelector("div.content")).getText();
		System.out.println("Page title is:" + secondheading);

		//Print the Button Text and color of the button in that frame.
		WebElement newframebutton = driver.findElement(By.id("actionButton"));
		System.out.println("button text is:" + newframebutton.getText());
		System.out.println("button color is:" + newframebutton.getCssValue("background-color"));
		
		//Click on the new button in that frame.
		newframebutton.click();
		
		
	}

}
