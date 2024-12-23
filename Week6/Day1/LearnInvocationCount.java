package week6.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnInvocationCount {

	//1 thread - threadPoolSize is not applicable default value is 0 
	//multithread - threadPoolSize will support
	
	@Test(invocationCount = 1)
	public void runLead() {
		ChromeDriver driver=new ChromeDriver();
		System.out.println("Lead is created");

	}
	
	
}
