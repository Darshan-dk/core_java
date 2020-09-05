package com.corejava.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet<Character> lhs = new LinkedHashSet<>();
		lhs.add('d');
		lhs.add('a');
		lhs.add('r');
		lhs.add('s');
		lhs.add('h');
		
		lhs.forEach((c)->System.out.println(c));
		
		Iterator<Character> itr = lhs.iterator();
		while(itr.hasNext()) {
			Character it = itr.next();
			System.out.println(it);
		}
		

	}

}
//"Create a LinkedHashset<Character> and do the following:
//1. Add items .
//2. Traverse using foreach() and print elements
//3. Traverse and print elements using iterator"