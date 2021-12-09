package SelniumActivities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		driver.manage().window().maximize();
		driver.get("https://training-support.net/selenium/selects");
		System.out.println("Page title is:" + driver.getTitle());
		
		//Use findElement() to find the multi-select WebElement on the page.
		WebElement multiselect = driver.findElement(By.id("multi-select"));
		
		//Create a new Select class object with the WebElement.
		Select select= new Select (multiselect);
		
		//chosen values are as below-
		WebElement chosen = driver.findElement(By.id("multi-value"));
		
		//Check if the HTML element is a multi-list. Proceed with other actions if it is.
		if(select.isMultiple()) {
			//Select the 'JavaScript' option by visible text.
			select.selectByVisibleText("Javascript");
			System.out.println(chosen.getText());
			
			//Select the 'NodeJS' option by value.
			select.selectByValue("node");
			System.out.println(chosen.getText());
			
			//Select the 4th, 5th, and the 6th options by index.
            for(int i=4; i<=6; i++) {
            	
                select.selectByIndex(i);
	
            }
			System.out.println(chosen.getText());
			
			//Deselect the 'NodeJS' option by value attribute.
			select.deselectByValue("node");
			System.out.println(chosen.getText());
			
			// Deselect the 7th option by index.
			select.deselectByIndex(6);
			System.out.println(chosen.getText());
			
			//Print the first selected option.
			WebElement s = select.getFirstSelectedOption();
			System.out.println("First selected option is:" + s.getText());
			
			//Print all selected options one by one and deselect all options.
			List <WebElement> selectedoptions = select.getAllSelectedOptions();
			for(WebElement selop : selectedoptions) {
				System.out.println("All selected options are:"+ selop.getText());
			}
			
			select.deselectAll();
			System.out.println(chosen.getText());
			
		}
	}

}
