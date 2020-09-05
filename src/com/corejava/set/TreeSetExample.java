package com.corejava.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		ts.add("darshan");
		ts.add("sony");
		ts.add("archana");
		ts.add("mahesh");
		ts.add("maveen");
		
		ts.forEach((t)-> System.out.println(t));
		System.out.println("-----------------------------------------------------");
		Iterator<String> itr = ts.iterator();
		while(itr.hasNext()) {
			String it = itr.next();
			System.out.println(it);
		}
		System.out.println(ts. descendingSet());//reverse order
		System.out.println(	ts.isEmpty());
		System.out.println(ts.pollFirst());
		System.out.println(ts.size());
		
		
		

	}

}
//"Create a Treeset<String> and do the following:
//1. Add items .
//2. Traverse using foreach() and print elements
//3. Traverse and print elements using iterator
//4. Use and explore all the remaining methods which where not done in class"