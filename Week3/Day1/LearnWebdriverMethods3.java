package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebdriverMethods3 {

	public static void main(String[] args) {
		        // Launch the browser
				ChromeDriver driver =new ChromeDriver();
				
				//Loading the URL
				driver.get("https://www.leafground.com/input.xhtml");
				
		        //Maximize the Browser
				driver.manage().window().maximize();
				
				
				//To get the size of the web element
				Dimension size = driver.findElement(By.xpath("//h5[text()='Type your name']")).getSize();
                System.out.println("Size is :"+size);
	
                  //To get the background color - getCss
                   String cssValue = driver.findElement(By.id("layout-config-button")).getCssValue("background-color");
                  System.out.println("Css Value is :"+cssValue);
                  
                  //isDisplayed
                 boolean displayed = driver.findElement(By.xpath("//h5[text()='Type your name']")).isDisplayed();
	            System.out.println(displayed);
	         
	         //isEnabled
	         boolean enabled = driver.findElement(By.id("j_idt88:j_idt91")).isEnabled();
	        System.out.println("Enabled field: "+enabled);
	
	      boolean enabled2 = driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
	      System.out.println("Disabled field: "+enabled2);
	}

}
