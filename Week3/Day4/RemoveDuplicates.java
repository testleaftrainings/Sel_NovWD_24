package week3.day4;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
    int numbers[] = {2,3,2,4,5,3};
    
    //Declare Set
    Set<Integer> uniqueNumbers=new TreeSet<Integer>();
    for (int i = 0; i < numbers.length; i++) {
    	uniqueNumbers.add(numbers[i]);
	}
		System.out.println("Current set is: "+uniqueNumbers);
	}

}
