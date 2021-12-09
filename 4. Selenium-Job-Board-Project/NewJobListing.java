package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class NewJobListing {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		//Navigate to ‘https://alchemy.hguy.co/jobs’.
		driver.get("https://alchemy.hguy.co/jobs");
		
		//Locate the navigation menu and click the menu item that says “Post a Job”
		driver.findElement(By.linkText("Post a Job")).click();
		
		//Fill in the necessary details and click the button that says “Preview”.
		driver.findElement(By.id("create_account_email")).sendKeys("askk1@gmail.com");
		driver.findElement(By.name("job_title")).sendKeys("Mainframe Testing");
		driver.findElement(By.name("job_location")).sendKeys("Pune");
		
		
		WebElement jobtype = driver.findElement(By.name("job_type"));
				Select select = new Select(jobtype);
		select.selectByIndex(1);
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("tinymce")).sendKeys("Mainframe testing jobs");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.name("application")).sendKeys("askk1@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("IB");
		
		driver.findElement(By.xpath("//input[@name='submit_job']")).click();
		
		//Click on the button that says “Submit Listing”.
		driver.findElement(By.id("job_preview_submit_button")).click();
		
		//Verify that the job listing was posted by visiting the jobs page.

		driver.findElement(By.linkText("Jobs")).click();
		driver.findElement(By.id("search_keywords")).sendKeys("Mainframe");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.close();
		
	}

}
