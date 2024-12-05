package week3.day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPromptAlert {

	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver =new ChromeDriver();
		
		//Loading the URL
		driver.get("https://leafground.com/alert.xhtml");
		
        //Maximize the Browser
		driver.manage().window().maximize();
		
		//Clciking the button
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		
		//Transfer the focus
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Vineeth");
		promptAlert.accept();
		

	}

}
