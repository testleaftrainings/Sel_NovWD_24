package week2.day1;

public class Mobile {
	
  public void makeCall() {
		System.out.println("Make Call");
	}
	
	public void takePhoto() {
		System.out.println("Take Photo");
		
	}
	
    public void sendSms() {
		System.out.println("Send Sms");

	}
	
	
	public static void main(String[] args) {
		//ClassName ojectName=new ClassName();
		Mobile mobileActions=new Mobile();
		mobileActions.makeCall();
		mobileActions.takePhoto();
		mobileActions.sendSms();
	   }		
	}
	
	//Main method
	//Normal Method
	        //Method with arguments
	        //Method with return types
	//Types of methods
	//Main Method- to execute the program
	//Normal - to perform an action
    //Mobile-Class
	//Name of the method- like an action
	//makeCall, takePhoto, sendSms
	//Naming convetion- variables,method,Object -camelCase
	//object- to call the methods in a class
	//syntax a normal method


