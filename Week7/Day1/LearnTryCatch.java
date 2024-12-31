package week7.day1;

public class LearnTryCatch {

	public static void main(String[] args) {
		int number=10;
		
		int num[]= {1,2,3};
		
		try {
			System.out.println(num[2]);
		} catch (Exception e1) {
			System.out.println(e1);
		}
		
		try {
		System.out.println(number/0);
		}
		catch(Exception e){
			System.out.println(e);
			}
		
		System.out.println("Done");

	}

}
