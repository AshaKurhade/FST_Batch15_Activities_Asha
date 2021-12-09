package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class applyJob {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		//Navigate to ‘https://alchemy.hguy.co/jobs’.
		driver.get("https://alchemy.hguy.co/jobs");
		
		//Select the menu item that says “Jobs” and click it.
		driver.findElement(By.linkText("Jobs")).click();
		
		//Search for a particular job and wait for listings to show.
		driver.findElement(By.id("search_keywords")).sendKeys("Banking");
		//driver.findElement(By.id("search_location")).sendKeys("Pune");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@class='job_listings']")));
		
		//Click and open any one of the jobs listed.
		WebElement job1 = driver.findElement(By.xpath("//ul[@class='job_listings']/li/a/div/h3"));
		job1.click();
		
		//Click the apply button and print the email to the console.
		driver.findElement(By.xpath("//input[@type='button']")).click();
		String email = driver.findElement(By.cssSelector("a.job_application_email")).getText();
		
		System.out.println("Email id is: " + email);
		
		//Close the browser
		driver.close();
		
	}

}
