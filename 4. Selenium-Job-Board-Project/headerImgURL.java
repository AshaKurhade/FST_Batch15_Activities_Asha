package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class headerImgURL {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		//Navigate to ‘https://alchemy.hguy.co/jobs’.
		driver.get("https://alchemy.hguy.co/jobs");
		
		//Get the url of the header image.
		String imageurl = driver.findElement(By.xpath("//img[contains(@class , 'attachment-large')]")).getAttribute("src");
		
		//Print the url to the console.
		System.out.println("Header image url is: " + imageurl);
		
		//Close the browser.
		driver.close();
	}

}
