package SelniumActivities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		driver.manage().window().maximize();
		driver.get("https://training-support.net/selenium/tables");
		System.out.println("Page title is:" + driver.getTitle());
		
		//Use findElements() in combination with xpath() to find the number of columns and rows (not counting the table header) and print them.
				
		List <WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));
		List <WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr"));
		
		//number of rows and cols
		System.out.println("Number of rows are:" + rows.size());
		System.out.println("Number of cols are:" + cols.size());
		
		/*List <WebElement> thirdrow = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td"));*/
		List <WebElement> th= driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td"));
		for(WebElement cellvalue: th) {
			System.out.println("cell value is:" + cellvalue.getText());
		}
		

	}

}
