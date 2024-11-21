package week1.day2;

public class LearnContinue {
//It skips the current iteration and executes the remaining
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			if (i==3) {
				continue;
			}
			System.out.println(i);
		}

	}

}
