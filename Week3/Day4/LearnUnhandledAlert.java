package week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnUnhandledAlert {

	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
		ChromeDriver driver =new ChromeDriver();
		
		//Loading the URL
		driver.get("https://leafground.com/alert.xhtml");
		
        //Maximize the Browser
		driver.manage().window().maximize();
		
		//To Click show button
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		Thread.sleep(3000);

		
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
	}

}
