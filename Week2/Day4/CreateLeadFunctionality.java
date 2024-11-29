package week2.day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadFunctionality {

	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver =new ChromeDriver();
		
		//Loading the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
        //Maximize the Browser
		driver.manage().window().maximize();
		
		//Enter the username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		//Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click the login button
		driver.findElement(By.className("decorativeSubmit")).click();
	
	    //Click the CRMSFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click Leads link
		driver.findElement(By.linkText("Leads")).click();
		
		//Click create lead
		driver.findElement(By.linkText("Create Lead")).click();
		
		//driver.findElement(By.partialLinkText("Create")).click();
		
	    //To enter companyName
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	
	    //To enter first name
	
	      driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vineeth");
	    
	      //To enter lastname
	      
	      driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");
		
		
		
		//Handling dropdown
		//Step1: Finding the element
		WebElement sourceDropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		//Instantiate the Select Class
		  Select dropdown1=new Select(sourceDropdown);
		  
		  //dropdown1.selectByIndex(1);
		  //dropdown1.selectByValue("LEAD_DIRECTMAIL");
		  dropdown1.selectByVisibleText("Self Generated");
		  
		  //Click CreateLead button
		  driver.findElement(By.name("submitButton")).click();
		  
	}

}
