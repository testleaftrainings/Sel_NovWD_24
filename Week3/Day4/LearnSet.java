package week3.day4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		//Declaration of set
		
		//HashSet
		//Set<String> mentors=new HashSet<String>();
		
		//TreeSet
		//Set<String> mentors=new TreeSet<String>();
		
		//LinkedHashSet
		Set<String> mentors=new LinkedHashSet<String>();
		
		mentors.add("Udai");
		mentors.add("Vinoth");
		mentors.add("Bhuvanesh");
		mentors.add("Saranya");
		
		
	   System.out.println("Current set is: "+mentors);
		
	   //Adding duplicate
	   mentors.add("Vinoth");
	   System.out.println("Duplicate set is: "+mentors);
	   
	   //[Udai, Vinoth, Bhuvanesh, Saranya]
       //[Bhuvanesh, Saranya, Udai,Vinoth]
	   
	   //Remove method
	   mentors.remove("Vinoth");
	   System.out.println("Set is: "+mentors);
	   
	   //To find the size
	   int sizeOfSet = mentors.size();
	   System.out.println("Set size is :"+sizeOfSet);
	   
	   //addAll
	   Set<String> trainers=new TreeSet<String>();
	   trainers.addAll(mentors);
	   System.out.println("New set is :"+trainers);
	   
	   //To retrieve a particular is allowed in set
	   //Convert Set into List
	   //retrieve the value in the List
	   
	   //Declare an empty List
	   List<String> employees =new ArrayList<String>(trainers);
	   System.out.println("Current List is :"+employees);
	   
	   //To retrieve a particular value
	   String elementAtIndex1 = employees.get(1);
	   System.out.println(elementAtIndex1);
	   
	}

}
