package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginTestSteps {
	WebDriver driver;
	WebDriverWait wait;
	
	@Given("^User is on Login page$")
	public void openloginpage() {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 15);
		driver.manage().window().maximize();
		driver.get("https://www.training-support.net/selenium/login-form");
	}
	@When("^User enters username and password$")
	public void entercredentials() {
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
	}
	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void parametertest(String username, String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}
	
	@Then("^Read the page title and confirmation message$")
	public void pagetitle() {
		String newtitle = driver.getTitle();
		  System.out.println("Page title after clicking is:" + newtitle);
	}
	 @And("^Close the Browser$")
	 public void closebrowser() {
			driver.close();
		}

	
	
	
}
