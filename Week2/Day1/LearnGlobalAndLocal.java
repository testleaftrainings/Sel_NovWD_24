package week2.day1;

public class LearnGlobalAndLocal {
	
	
	//Global variable
	int b=20;
	
	
	
	public void normalMethod() {
		//Local variable
		int c=10;
		System.out.println(b);
	}
	
	public void normalMethod2() {
		System.out.println(b);
		//System.out.println(c);
	}
	
	public static void main(String[] args) {
		//Local Variable
		LearnGlobalAndLocal obj=new LearnGlobalAndLocal();
	
	System.out.println(obj.b);
		
	}
}
