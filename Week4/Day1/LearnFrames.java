package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) {
		        // Launch the browser
				ChromeDriver driver =new ChromeDriver();
				
				//Loading the URL
				driver.get("https://leafground.com/frame.xhtml");
				
		        //Maximize the Browser
				driver.manage().window().maximize();
				
				//Adding implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//Handling the frame
				driver.switchTo().frame(0);
				
				//Frames count  1   2   3   4
				//Frames index  0   1   2   3
				
				//Click the element
				driver.findElement(By.xpath("//button[text()='Click Me']")).click();

	}

}
