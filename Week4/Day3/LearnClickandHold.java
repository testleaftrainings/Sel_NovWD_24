package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnClickandHold {

	public static void main(String[] args) {
		 // Launch the browser
		ChromeDriver driver =new ChromeDriver();
		
		//Loading the URL
		driver.get("https://jqueryui.com/selectable/");
		
        //Maximize the Browser
		driver.manage().window().maximize();
		
		//Adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.switchTo().frame(0);
		
		//Instantiate the Actions Class
		Actions clickElement =new Actions(driver);
		
		//Finding element1
		WebElement element1 = driver.findElement(By.xpath("//li[text()='Item 1']"));

		//Finding Element2
		WebElement element2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
	
	   //finding element3
		WebElement element3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
	
		clickElement.clickAndHold(element1).clickAndHold(element2).clickAndHold(element3).perform();
	  
	}

}
