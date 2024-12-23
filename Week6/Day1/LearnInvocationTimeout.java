package week6.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnInvocationTimeout {

	@Test(invocationCount = 3,invocationTimeOut = 1)
	public void createAccount() {
		//System.out.println(1/0);
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
        System.out.println("Account Created");
        
	}
}
