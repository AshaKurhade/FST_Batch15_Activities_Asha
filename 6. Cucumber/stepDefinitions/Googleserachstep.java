package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Googleserachstep {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Given("^User is on Google Home Page$")
	public void givenFunction() throws Throwable {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 15);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		
	}
	
	@When("^User types in Cheese and hits ENTER$")
	public void whenFunction() throws Throwable {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Cheese", Keys.RETURN);		
		
	}
	
	@Then("^Show how many search results were shown$")
	public void thenFunction() throws Throwable {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("result-stats")));
		String resultcount=driver.findElement(By.id("result-stats")).getText();
		System.out.println("Number of results are" + resultcount);
	}

	@And("^Close the browse$")
	public void andFunction() {
		driver.close();
	}
	
}
