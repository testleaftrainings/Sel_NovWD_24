package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWaits {

	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
				ChromeDriver driver =new ChromeDriver();
				
				//Loading the URL
				driver.get("http://leaftaps.com/opentaps/control/main");
				
		        //Maximize the Browser
				driver.manage().window().maximize();
				
				//implicitwait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				
				//Enter the username
				Thread.sleep(5000);
				driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
				
		}

}
