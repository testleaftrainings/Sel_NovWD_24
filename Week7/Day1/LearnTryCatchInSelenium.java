package week7.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTryCatchInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
				ChromeDriver driver =new ChromeDriver();
				
				//Loading the URL
				driver.get("http://leaftaps.com/opentaps/control/main");
				
		        //Maximize the Browser
				driver.manage().window().maximize();
				
				//Enter the username
				try {
					driver.findElement(By.id("user")).sendKeys("Demosalesmanager");
				} catch (Exception e) {
					System.out.println(e);
				}
				finally {
					driver.close();
				}
				
				
	}

}
