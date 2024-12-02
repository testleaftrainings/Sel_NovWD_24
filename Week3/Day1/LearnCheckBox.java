package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnCheckBox {

	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver =new ChromeDriver();
		
		//Loading the URL
		driver.get("https://www.leafground.com/checkbox.xhtml");
		
        //Maximize the Browser
		driver.manage().window().maximize();
		
		//isSelected
		boolean selected = driver.findElement(By.xpath("//span[text()='Basic']")).isSelected();
         System.out.println(selected);
	}

}
