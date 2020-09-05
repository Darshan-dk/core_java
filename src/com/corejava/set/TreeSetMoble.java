
package com.corejava.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetMoble {

	public static void main(String[] args) {
		
		Comparator<Mobile> comp = (a1,a2)->a1.getName().compareTo(a2.getName());

		TreeSet<Mobile> tms = new TreeSet<>(comp);
		tms.add(new Mobile("realMe", 10000, 5));
		tms.add(new Mobile("samsung", 20000, 4));
		tms.add(new Mobile("mi", 15000, 6));
		tms.add(new Mobile("pixel", 30000, 5));
		tms.add(new Mobile("apple", 70000, 5));
		
		tms.forEach((t)->System.out.println(t));
		
		System.out.println("---------------------------------------------------------------------");
		
		Iterator<Mobile> itr = tms.iterator();
		while(itr.hasNext()) {
			Mobile it = itr.next();
			System.out.println(it);
		}
		

	}

}

//"Create a Treeset<CustomObject> of ur choice and do the following:
//1. Add items .
//2. Traverse using foreach() and print elements
//3. Traverse and print elements using iterator"