package week2.day2;

public class LearnString {

	public static void main(String[] args) {
		
		//String Declaration using Literal
	     String str1="Testleaf";
		 String str3="Testleaf";
		
		//Instantaition
		String str2=new String("Testleaf");
		
		// ==      - It Compares reference address of 2 address
		//.equals  -It compares the exact of 2 Strings
        //boolean value - either true of false
		
		// ==
		System.out.println(str1==str3);
		System.out.println(str1==str2);
		
		//.equals
		System.out.println(str1.equals(str3));
		
		         
		String str="November";
		//To get the length of the string
		int lengthOfString = str.length();
		System.out.println(lengthOfString);
		
		//Contains - Compares the partial value
		System.out.println(str.contains("November"));
		
		//To convent into uppercase
		String upperCase = str.toUpperCase();
		System.out.println(upperCase);
		
		//charAT - to retrieve at Character of string based on index
		  System.out.println(str.charAt(2));
		
		//toCharArray - convert String to character array
		// November 24 - {N,o,v,e,m,b,e,r,,2,4}
		char[] character = str.toCharArray();
		System.out.println(character[1]);
		
		//subString - crop a String and convert into a smaller string
		//str=November
		String substring = str.substring(3);
		System.out.println(substring);
		
	    String substring2 = str.substring(2, 5);
		System.out.println(substring2);
		
		//Split - split a String into multiple Strings
		String batch="November2024";
		String[] splitOfString = batch.split(" ");
		//{"November","2024"}
		System.out.println(splitOfString[0]);
		
		//To replace a character
		String replaceAll = batch.replaceAll("[A-Za-z]", "");
		System.out.println(replaceAll);
		
		//parseInt
		
		int number1=10;
		int number2=20;
		System.out.println(number1+number2);
		
		String s1="Test";
		String s2="Leaf";
		System.out.println(s1+s2);
		
		System.out.println(s1+number1);
		
		String amount="100$";
		int rupees=100;
		System.out.println(amount+rupees);
		//Integer - parseInt
		//Convert string to int
		int amount1 = Integer.parseInt(amount);
		System.out.println(amount1+rupees);
		
    }

}
