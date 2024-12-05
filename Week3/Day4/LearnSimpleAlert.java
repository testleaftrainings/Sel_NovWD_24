package week3.day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSimpleAlert {

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
				
		        //to transfer the driver focus to ALert box
				Alert simpleAlert = driver.switchTo().alert();
				String simpleAlertText = simpleAlert.getText();
				System.out.println(simpleAlertText);
				simpleAlert.accept();
			

	}

}
