package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnRightClick {

	//RightClick action=contextClick
	
	public static void main(String[] args) {
		 // Launch the browser
		ChromeDriver driver =new ChromeDriver();
		
		//Loading the URL
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
        //Maximize the Browser
		driver.manage().window().maximize();
		
		//Adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Instantiate
		Actions rightClickElement=new Actions(driver);
		
		//Find the element
		WebElement element2 = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		rightClickElement.contextClick(element2).perform();
		

	}

}
