package week6.day1;

import org.testng.annotations.Test;

public class LearnEnabled {
	@Test
	public void composeMessage() {
		System.out.println("Compose");

	}
	@Test
	public void openWhatsapp() {
		// TODO Auto-generated method stub
		System.out.println("Open");
	}
	@Test(priority=3,enabled=false)
	public void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("Send");
	}
}
