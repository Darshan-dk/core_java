package com.corejava.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Consumer;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet();
		hs.add("hello");
		hs.add("World");
		hs.add("welcome");
		hs.add("java");

		hs.forEach((a) -> System.out.println(a));
		System.out.println("---------------------------------------------------------------");
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			String it = itr.next();
			System.out.println(it);
		}
	}

}
//"Create a Hashset<String> and do the following:
//1. Add items .
//2. Traverse using foreach() and print elements
//3. Traverse and print elements using iterator"