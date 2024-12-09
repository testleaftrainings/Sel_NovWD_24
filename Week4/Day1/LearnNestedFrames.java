package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrames {

	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver =new ChromeDriver();
		
		//Loading the URL
		driver.get("https://leafground.com/frame.xhtml");
		
        //Maximize the Browser
		driver.manage().window().maximize();
		
		//Adding wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

		//Handling nested frames
		//Switch to the outer frame
		WebElement outerframe = driver.findElement(By.xpath("//h5[contains(text(),'Inside Nested frame')]/following-sibling::iframe"));
		driver.switchTo().frame(outerframe);
		
		//Switch to the inner frame
	     driver.switchTo().frame("frame2");
		
		//Clicking the element
		driver.findElement(By.id("Click")).click();
		
		
		//Switching back to the main Webpage
		driver.switchTo().defaultContent();
		
		//Switching driver focus to immediate parent frame
		driver.switchTo().parentFrame();
		
	}

}
