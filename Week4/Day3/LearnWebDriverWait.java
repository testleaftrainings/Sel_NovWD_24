package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWebDriverWait {

	public static void main(String[] args) throws InterruptedException {
		        // Launch the browser
				ChromeDriver driver =new ChromeDriver();
				
				//Loading the URL
				driver.get("https://leafground.com/waits.xhtml");
				
		        //Maximize the Browser
				driver.manage().window().maximize();
				
				//Adding implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	
				//Instantiate WebDriverWait
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
				
				//Applying wait
				WebElement firstClickButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Click']")));
				firstClickButton.click();
				
				//Visibility condition
				WebElement iAmHereButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));
				
				//Thread.sleep(10000);
				//WebElement iAmHereButton = driver.findElement(By.xpath("//span[text()='I am here']"));
			      boolean displayed = iAmHereButton.isDisplayed();
				  System.out.println("Visibility status is: "+displayed);
				
				//Invisibility of an element
				driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();
	             Boolean invisibilityElement = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='I am about to hide']")));
	             System.out.println("Invisibility element: "+invisibilityElement);
	}

}
