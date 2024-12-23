package week6.day1;

import org.testng.annotations.Test;

public class LearnPriority {

	//adding priority
	//sending message in whatsapp
	//openWhatsapp, composeMessage, sendMessage
	//0 -2 -3 
	//-3 -2 0
	@Test(priority=-2)
	public void composeMessage() {
		System.out.println("Compose");

	}
	@Test
	public void openWhatsapp() {
		// TODO Auto-generated method stub
		System.out.println("Open");
	}
	@Test(priority=-2)
	public void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("Send");
	}
	
	
}
