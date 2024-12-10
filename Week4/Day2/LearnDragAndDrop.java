package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDragAndDrop {

	public static void main(String[] args) {
		 // Launch the browser
		ChromeDriver driver =new ChromeDriver();
		
		//Loading the URL
		driver.get("https://jqueryui.com/droppable/");
		
        //Maximize the Browser
		driver.manage().window().maximize();
		
		//Adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.switchTo().frame(0);
		
		Actions dragAndDropElement=new Actions(driver);
		
		WebElement dragElement = driver.findElement(By.id("draggable"));
		
		WebElement dropElement = driver.findElement(By.id("droppable"));
		
		dragAndDropElement.dragAndDrop(dragElement, dropElement).perform();
		
		
		
		
		
	}

}
