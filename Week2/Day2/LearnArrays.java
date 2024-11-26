package week2.day2;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		
        //Declaring Array using Instantiation
		int[] marks=new int[5];
		marks[0]=45;
		marks[1]=56;
		marks[2]=43;
		marks[3]=67;
		marks[4]=89;
				
	    //Declaring Arrays using Literal
		//Stores scores of a person
		
		
        //Array index //0   1  2  3  4
		int scores[]= {76,55,87,35,98};
		System.out.println(scores[3]);
		String string = Arrays.toString(scores);
		System.out.println("New Array is: "+string);
		
		//To find the length of an array
		int lengthOfArray=scores.length;
		System.out.println("length of array: "+lengthOfArray);
		
		//To retrieve a Value
	   System.out.println(scores[2]);
	
	   //Arrays sorting
       Arrays.sort(scores);
	   //After sorting:{35,55,76,87,98}
	   System.out.println("After sorting: "+scores[1]);
	  
	   //To retrieve the lowest value:
	   System.out.println("Lowest value is: "+scores[0]);
	   
	   //To retrieve the highest value
	    System.out.println("Highest values is: "+scores[lengthOfArray-1]);
	   
	   //To retrive all the values
	   // 0 1 2 3 4 5
	   for (int i = 0; i < scores.length; i++) {
		System.out.println(scores[i]);
	   }       
	   
	 }

}
