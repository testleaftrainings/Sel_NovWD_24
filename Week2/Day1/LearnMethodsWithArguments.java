package week2.day1;

public class LearnMethodsWithArguments {
	
	
	
	public void makeCall(String str) {
		System.out.println(str);
	}
	
	
	public void sendSms(String name, String sms) {
		System.out.println(name+sms);
	
	}
	
	public static void main(String[] args) {
		LearnMethodsWithArguments obj=new LearnMethodsWithArguments();	
	
	obj.makeCall("Vineeth");
	obj.sendSms("Vineeth", "Message1");
	obj.sendSms("Saranya", "Message2");
	}
	

}
