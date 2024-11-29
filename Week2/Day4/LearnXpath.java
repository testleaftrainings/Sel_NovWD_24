package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		        // TODO Auto-generated method stub
		        // Launch the browser
				ChromeDriver driver =new ChromeDriver();
				
				//Loading the URL
				driver.get("http://leaftaps.com/opentaps/control/main");
				
		        //Maximize the Browser
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
				
				//Enter the password
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
				
				//Click the login button
				driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();

	}

}
