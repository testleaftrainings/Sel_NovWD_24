package week1.day2;

public class LearnOperators {

	public static void main(String[] args) {
		//Operators in Java
		
		//Arithmetic Operator
		//Comparison Operator
		//Assignment operator
		//Logical Operator
		
		//Assignment Operator (=)
		//Simple assignment operator
		  int number=7;
		
		  //complex assignment operator
		  //number=number+2;
		   number+=3;
		   System.out.println(number);
		
		   System.out.println("-----------");
		
		
		//Arithmetic Operator
		int a=3;
		int b=10;
		//Addition
		System.out.println(a+b);
		
		//Subraction
		System.out.println(b-a);
		
		//Multiplication
		System.out.println(a*b);
		
		//Division
		//To get the quotient (/)
		System.out.println(b/a);
		
		//To get the remainder (%)
		System.out.println(b%a);
		
		System.out.println("-----------");
		
		
		//Comparison (2 Values)
		//equalTo  (==)
		//notEqualTO (!=)
		//less than
		//less than
		//greaterThan
		//greaterThanEqualTO
		
		int c=8;
		int d=10;
		
		System.out.println(c==d);
		
		System.out.println(c!=d);
		
		System.out.println(c<d);
		
		System.out.println(c<=d);
		
         System.out.println(c>d);
		
		System.out.println(c>=d);
		
		System.out.println("--------------");
		
		//Logical Operators (2 Conditions)
		//And operator -Both the conditions should satisfy-true
		//Or Operator  -Either of the conditions satisfy - true
		//And Operator &&
		//Or Operator  ||
		
		int e=4;
		int f=6;
		
		System.out.println(e<f&&e==f);
		
		System.out.println(e<f&&e<=f);
		
		System.out.println(e==f||e<f);
		
		System.out.println("----------");
		
		//Increment & Decrement Operator
		//Increment - preIncrement & postIncrement
		//Decrement - preDecrement & postDecrement
		
		int p=7;
		//postIncrement (++) increase the value by 1
		System.out.println(p++);
		System.out.println(p);
		
		//preIncrement (++) increase the value by 1
		System.out.println(++p);
		
		//postDecrement (--) decrease the value by 1
		System.out.println(p--); 
		System.out.println(p); 
		
		//preDecrement (--) decrease the value by 1
		
		System.out.println(--p);
		
	}

}
