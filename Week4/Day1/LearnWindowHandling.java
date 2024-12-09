package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {

	public static void main(String[] args) {
		        // Launch the browser
				ChromeDriver driver =new ChromeDriver();
				
				//Loading the URL
				driver.get("https://leafground.com/window.xhtml");
				
		        //Maximize the Browser
				driver.manage().window().maximize();
				
				//Adding implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//Click the button
				driver.findElement(By.xpath("//span[text()='Open']")).click();
				
				//getWindowHandle - get the address of the window where driver focus is in
				//getWindowHandles -get the addresses of all the opened window
				
				//getWindowHandle
				String parentAddress = driver.getWindowHandle();
				System.out.println("Parent address is :"+parentAddress);
				
				//Verify the title
				String parentTitle = driver.getTitle();
				System.out.println("parent title is: "+parentTitle);
				
				//Step1:
				Set<String> allAddress = driver.getWindowHandles();
				System.out.println("Windows addresses are :"+allAddress);
				
				//Step2:
				//Converting set to list
				List<String> allWindowsAdrress = new ArrayList<String>(allAddress);
				System.out.println("List is: "+allWindowsAdrress);
				
				//Step3:To transfer the driver focus
				driver.switchTo().window(allWindowsAdrress.get(1));
				
                //title of page
				String childTitle = driver.getTitle();
				System.out.println("Child title is : "+childTitle);
				
				//close the driver
				driver.close();
				
				//transfer the focus to parent window
				driver.switchTo().window(allWindowsAdrress.get(0));
				
				//get title
				String childTitle1 = driver.getTitle();
				System.out.println(childTitle1);
				
				
	}

}
