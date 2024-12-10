package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebtables {

	public static void main(String[] args) {
		 // Launch the browser
		ChromeDriver driver =new ChromeDriver();
		
		//Loading the URL
		driver.get("https://leafground.com/table.xhtml");
		
        //Maximize the Browser
		driver.manage().window().maximize();
		
		//Adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//Locating the webtable
		WebElement table = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody"));
		
		//count the number of rows
		List<WebElement> row = table.findElements(By.tagName("tr"));
		int rowCount = row.size();
		System.out.println("Number of rows is: "+rowCount);
		
		//to count the columns
		List<WebElement> column = table.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]//th"));

		int columnCount = column.size();
		System.out.println("Row count is: "+columnCount);
		
		//Retrieve a particular row value
		List<WebElement> row2Data = table.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[2]/td"));
	
	   //System.out.println("Row 2 data is: "+row2Data);
	   for (int i = 0; i <row2Data.size() ; i++) {
		   String text = row2Data.get(i).getText();
		   System.out.println("Second rows data is: "+text);
		   }
	   
	   //To retrieve the entire table data
	   for (int i = 1; i <=rowCount; i++) {
		WebElement rowValue = table.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr["+i+"]"));
	   for (int j = 1; j <= columnCount; j++) {
		   WebElement alldata = rowValue.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr["+i+"]/td["+j+"]"));
	String allTableValues = alldata.getText();
	System.out.println("All data is: "+allTableValues);
	   }
	   }
		
	}
	}


