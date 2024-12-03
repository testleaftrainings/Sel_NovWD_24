package week3.day2;

public class LearnMethodOverloading {
	
	//Addition module of Calculator
	public void additionOfNumbers(int a,int b) {
		System.out.println(a+b);

	}
	
	public void additionOfNumbers(int a, int b, int c) {
		// TODO Auto-generated method stub
        System.out.println(a+b+c);
	}
	
	//float+int
	public void additionOfNumbers(int a, float b) {
		System.out.println(a+b);

	}
	
	
 public static void main(String[] args) {
	 LearnMethodOverloading overload=new LearnMethodOverloading();
	 overload.additionOfNumbers(3, 4.5f);
	 overload.additionOfNumbers(3, 4);
	 overload.additionOfNumbers(1, 2, 3);
	}

}
