package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseOver {

	public static void main(String[] args) {
		 // Launch the browser
		ChromeDriver driver =new ChromeDriver();
		
		//Loading the URL
		driver.get("https://www.pvrcinemas.com/");
		
        //Maximize the Browser
		driver.manage().window().maximize();
		
		//Adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Instantiating Actions Class
		
		//mouseHover action=moveToElement
		
		Actions mouseHover=new Actions(driver);
		
		//Finding the element
		WebElement element1 = driver.findElement(By.xpath("//span[text()='More']"));
		mouseHover.moveToElement(element1).perform();
	}

}
