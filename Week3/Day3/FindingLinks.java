package week3.day3;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingLinks {

	public static void main(String[] args) {
		       // Launch the browser
				ChromeDriver driver =new ChromeDriver();
				
				//Loading the URL
				driver.get("https://www.facebook.com/");
				
		        //Maximize the Browser
				driver.manage().window().maximize();
				
				//To find the multiple elements
				List<WebElement> allLinks = driver.findElements(By.tagName("a"));
				int sizeOfList = allLinks.size();
				System.out.println("List size: "+sizeOfList);
				
				//To print all the links
				List<String> allStrings=new ArrayList<String>();
				for (int i = 0; i <sizeOfList ; i++) {
					String text = allLinks.get(i).getText();
					allStrings.add(text);
					
			}
   System.out.println(allStrings);
	}

}
