package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {
	
	@DataProvider
	public String[][] sendData() {
		String[][] data=new String[2][3];
		data[0][0]="TestLeaf";
        data[0][1]="Vineeth";
        data[0][2]="Rajendran";
        
        data[1][0]="TL";
        data[1][1]="Hari";
        data[1][2]="R";
        
        return data;
	}
	
	@Test(dataProvider = "sendData")
	public void runCreateLead(String cName, String fName, String lName) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.name("submitButton")).click();
		
}
}
