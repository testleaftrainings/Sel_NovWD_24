package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		// Create an empty List
		List<String> learners=new ArrayList<String>();
	
		//Empty List
		System.out.println("List is: "+learners);
		
		//Adding an Element
		learners.add("Vinoth");
		System.out.println("Current List is: "+learners);
		
		//Adding multiple elements
		learners.add("Rajesh");
		learners.add("Venkatesh");
		learners.add("Bhuvanesh");
		System.out.println("Current list after multiple:"+learners);
		
		//Add an element using index
		learners.add(1, "Udai");
		System.out.println("List after adding Udai: "+learners);
		
		//To get the size of list
		int sizeOfList = learners.size();
		System.out.println("List size is: "+sizeOfList);
		
		//Add duplicate
		learners.add("Udai");
		System.out.println("List adding duplicate: "+learners);
		
		//remove an element
		learners.remove(1);
		System.out.println("List after removing index 1: "+learners);
		
		//To retrieve an element based on index - get
		String elementatIndex3 = learners.get(3);
		System.out.println("Element at 3rd index is: "+elementatIndex3);
		
		//Another List
		List<String> employees =new ArrayList<String>();
		System.out.println("Current employees List: "+employees);
		
		//addAll - will add all the data from 1 list to another list
		
		employees.addAll(learners);
		System.out.println("Employees list after adding all the elements: "+employees);
		
		//sorting method
		Collections.sort(employees);
		System.out.println("List after sorting: "+employees);
		
		
		//Clear all the data of a list
		learners.clear();
		System.out.println("Current list is: "+learners);
		
	}

}
