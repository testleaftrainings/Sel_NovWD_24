package week6.day1;

import org.testng.annotations.Test;

public class LearnDependsOnMethod {

	@Test(dependsOnMethods = "createAccount", alwaysRun = true)
	public void login() {
		System.out.println("Loggedin Successful");

	}
	@Test
	public void createAccount() {
		System.out.println(1/0);
		// TODO Auto-generated method stub
        System.out.println("Account Created");
        
	}
}
