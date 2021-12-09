package SelniumActivities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		driver.manage().window().maximize();
		driver.get("https://training-support.net/selenium/selects");
		System.out.println("Page title is:" + driver.getTitle());
		
		//Use findElement() to find the dropdown WebElement on the page.
		WebElement dropdown= driver.findElement(By.id("single-select"));
		
		WebElement chosenvalue1=driver.findElement(By.id("single-value"));
		
		//Create a new Select class object with the WebElement
		Select select = new Select(dropdown);
		
		//On the dropdown - Select the second option using selectByVisibleText() 
		select.selectByVisibleText("Option 2");
		System.out.println("Selected text is:"+ chosenvalue1.getText());
		
		//Select the third option using selectByIndex()
		select.selectByIndex(4);
		System.out.println("Selected text is:"+ chosenvalue1.getText());
		
		
		//Select the fourth option using selectByValue()
		select.selectByValue("5");
		System.out.println("Selected text is:"+ chosenvalue1.getText());
		
		//Finally, get all the options in the dropdown and print them one by one.
		List <WebElement> Alloptions = select.getOptions();
		for (WebElement A: Alloptions) {
			System.out.println("All options are:" + A.getText());
		}

	}

}
