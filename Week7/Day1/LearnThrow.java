package week7.day1;

public class LearnThrow {

	public static void main(String[] args) {
		int age=-2;
		
		//age=-1
		if(age<1) {
			throw new ArithmeticException("Age is Invalid");
		}
		else {
			System.out.println("Valid age");
		}

	}

}
