package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitingForWindows {
	
	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver =new ChromeDriver();
		
		//Loading the URL
		driver.get("https://leafground.com/window.xhtml");
		
        //Maximize the Browser
		driver.manage().window().maximize();
		
		//Adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		//Instantiate WebDriverWait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		
		
		
		//Click the button
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        System.out.println("Completed");
	}

}
