package week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSweetAlert {

	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
		ChromeDriver driver =new ChromeDriver();
		
		//Loading the URL
		driver.get("https://leafground.com/alert.xhtml");
		
        //Maximize the Browser
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
  Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
	}

}
