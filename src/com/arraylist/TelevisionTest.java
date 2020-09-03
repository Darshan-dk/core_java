package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class TelevisionTest {

	public static void main(String[] args) {
		ArrayList<Television> television = new ArrayList<Television>();
		Television tv1 = new Television("Samsung", 54, "LED");
		Television tv2 = new Television("LG", 54, "LCD");
		Television tv3 = new Television("MI", 58, "LED");
		Television tv4 = new Television("OnePlus", 45, "LCD");
		Television tv5 = new Television("Sony", 108, "LED");

		television.add(tv1);
		television.add(tv2);
		television.add(tv3);
		television.add(tv4);
		television.add(tv5);

		television.forEach(t -> System.out.println(t));

		Collections.sort(television);

		System.out.println("___________________________________________________________________");

		System.out.println("sort by inches");
		television.forEach(t -> System.out.println(t));

		Collections.sort(television, Collections.reverseOrder());
		System.out.println("___________________________________________________________________");

		System.out.println("sort by inches descending");
		television.forEach(t -> System.out.println(t));

		System.out.println("___________________________________________________________________");
		System.out.println("sort by brand name");

		System.out.println("sort by inches descending");
		Collections.sort(television, new SortByBrand()); // sorting by name
		television.forEach(t -> System.out.println(t));

		System.out.println("___________________________________________________________________");

		System.out.println("sort by inches ");
		Collections.sort(television, new SortByInches()); // sorting by inches
		television.forEach(t -> System.out.println(t));
		System.out.println("___________________________________________________________________");

		System.out.println("sort by type ");
		Collections.sort(television, new SortByType()); // sorting by type
		television.forEach(t -> System.out.println(t));
		System.out.println("___________________________________________________________________");

	}

}
//Create an ArrayList of 'Television' object containing fields: {brand, inches, type**} and perform the following:   (**Type is led, lcd etc).
//1. Add 4-5 elements to it.
//2. Display all the elements in the list using foreach method.
//3. Sort the elements by inches in ascending order.
//4. Sort the elements by brand in decending order.
//5. sort the elements by type in decending order. (All 3 using comparator )