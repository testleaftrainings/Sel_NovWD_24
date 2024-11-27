package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
	    //EdgeDriver driver=new EdgeDriver();
	    //SafariDriver driver=new SafariDriver();
		
		//Step1: Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Step2: Loading the url -get
		driver.get("http://leaftaps.com/opentaps/control/main");

		//Maximize the browser
		driver.manage().window().maximize();
		
		//Finding an element- findElement
		//Enter the username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		//Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click Login button
		driver.findElement(By.className("decorativeSubmit")).click();
	}

}
