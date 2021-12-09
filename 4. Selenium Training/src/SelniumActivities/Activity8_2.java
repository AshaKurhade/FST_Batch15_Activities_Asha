package SelniumActivities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		driver.manage().window().maximize();
		driver.get("https://training-support.net/selenium/tables");
		System.out.println("Page title is:" + driver.getTitle());
		
		////Use findElements() in combination with xpath() to find the number of columns and rows (not counting the table header) and print them.
		List <WebElement> rows = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr")) ;
		List <WebElement> cols = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr[1]/td"));
		
		System.out.println("Number of rows are:" + rows.size());
		System.out.println("Number of columns are:" + cols.size());
		
		//Find and print the cell value at the second row and second column.
		List <WebElement> secondrow= driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
		for(WebElement cellvalues : secondrow) {
			System.out.println("Before sorting second row value is:" + cellvalues.getText());
		}
		
		
		
		//Click the header of the first column to sort by name.
		driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr[1]/th[1]")).click();
		
		
		//Find and print the cell value at the second row and second column again.
		WebElement secondrowaf= driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
		System.out.println("After sorting second row value is:" + secondrowaf.getText());
		
		//Print the cell values of the table footer.
		List <WebElement> footer = driver.findElements(By.xpath("//table[@id='sortableTable']/tfoot/tr"));
		for (WebElement tablefooter : footer) {
			System.out.println("table footer row value is:" + tablefooter.getText());
		}
		//Close the browser
		driver. close();

	}

}
