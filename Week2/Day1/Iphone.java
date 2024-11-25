package week2.day1;

public class Iphone {
	
	public void takeHQphoto() {
		System.out.println("HQ image");

	}

	public static void main(String[] args) {
		Iphone obj=new Iphone();
		obj.takeHQphoto();
		
		Mobile mob=new Mobile();
		mob.takePhoto();
		mob.sendSms();
		mob.makeCall();
	}

}
