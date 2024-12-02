package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebdriverMethods2 {

	public static void main(String[] args) {
		        // Launch the browser
				ChromeDriver driver =new ChromeDriver();
				
				//Loading the URL
				driver.get("https://www.leafground.com/link.xhtml");
				
		        //Maximize the Browser
				driver.manage().window().maximize();
				
				//To get the text present in a webelement -getText
				//Use this url for this method: https://www.leafground.com/input.xhtml
				//String textPresent = driver.findElement(By.xpath("//h5[text()='Type your name']")).getText();
                //System.out.println("Actual text is : "+textPresent);
                
                //getAttribute - To retreive the already typed text in an input field
                //             - To get the hyperlink without click the link
                String attribute1 = driver.findElement(By.id("j_idt88:j_idt91")).getAttribute("value");
                System.out.println("Attribute value is : "+attribute1);
				
				String attribute2 = driver.findElement(By.linkText("Find the URL without clicking me.")).getAttribute("href");
	               System.out.println("Link is : "+attribute2);
	}

}
