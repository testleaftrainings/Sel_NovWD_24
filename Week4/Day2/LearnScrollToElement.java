package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnScrollToElement {

	
		public static void main(String[] args) {
			 // Launch the browser
			ChromeDriver driver =new ChromeDriver();
			
			//Loading the URL
			driver.get("https://www.amazon.in/");
			
	        //Maximize the Browser
			driver.manage().window().maximize();
			
			//Adding implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			Actions scrollElement=new Actions(driver);
			
			WebElement element3 = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
  
			scrollElement.scrollToElement(element3).perform();
			
			element3.click();
			
	}

}
