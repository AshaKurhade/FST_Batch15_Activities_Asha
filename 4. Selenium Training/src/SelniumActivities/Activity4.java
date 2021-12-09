package SelniumActivities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://www.training-support.net");
		
		String pagetitle = driver.getTitle();
		System.out.println("Page title is:"+ pagetitle);
		
		WebElement hp= driver.findElement(By.xpath("//a[@id= 'about-link']"));
		hp.click();
		
		String pagetitle1 = driver.getTitle();
		System.out.println("Page title is:"+ pagetitle1);
		

	}

}
