package com.java.collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class TreeTester {

	public static void main(String[] args) {
		ArrayList<Tree> test = new ArrayList<Tree>();
		test.add(new Tree(50, 150, "mango"));
		test.add(new Tree(30, 40, "aruckenut"));
		test.add(new Tree(15, 20, "neem"));
		test.add(new Tree(100, 35, "peepal"));
		test.add(new Tree(40, 45, "coconut"));
		test.add(new Tree(400, 440, "redwood"));
	
//		System.out.println("the original list is :"+test);
		
		//we have another method in collection to print the list using for each loop.
		//this for each loop is of type consumer.

		test.forEach(t-> System.out.println(t));
		
		System.out.println("The sorted list is");
		
		/* for  implimentaion of sort method in user defined data type ex:tree
		we need to implements  the comparable interface in parent class */
		
		Collections.sort(test);
		test.forEach(t-> System.out.println(t));
		
        /* if we have two aspect for comparison, then we need to implements 
        comparator in another class	 */	
		System.out.println("sorting by name");

		Collections.sort(test, new SortByName()); // sorting by name
		test.forEach(t -> System.out.println(t));
		
		System.out.println("sorting by age");
		
		Collections.sort(test, new SortByAge());  // sorting by AGE
		test.forEach(t-> System.out.println(t));
		
		
		
	}

}
