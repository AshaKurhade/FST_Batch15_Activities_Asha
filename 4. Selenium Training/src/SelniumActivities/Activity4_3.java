package SelniumActivities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://www.training-support.net/selenium/target-practice");
		
		String pagetitle = driver.getTitle();
		System.out.println("Page title is:"+ pagetitle);
		
		WebElement th=driver.findElement(By.xpath("//div//h3[@id='third-header']"));
		System.out.println("Third Header text is " + th.getText());
		
		WebElement fh=driver.findElement(By.xpath("//h5"));
		String color1 = fh.getCssValue("color");
		System.out.println("Fifth Header color is" + color1);
		
		WebElement voilet=driver.findElement(By.xpath("//button[contains(text(), 'Violet']"));
		System.out.println("voilet button attribute is"+ voilet.getAttribute("class"));
		
		
		WebElement grey=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]"));
		System.out.println("grey button text is " + grey.getText());
		
		
		
		
		
		
		
		
		
	}

}
