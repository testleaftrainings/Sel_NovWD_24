package week7.day1;

public class LearnFinally {

	public static void main(String[] args) {
		
		int number=2;
		
		int nums[]= {1,2};
		
		try {
			System.out.println(nums[2]);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		
		finally {
			System.out.println("done");
		}

	}

}
