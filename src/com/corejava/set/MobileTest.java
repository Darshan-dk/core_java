package com.corejava.set;

import java.util.HashSet;
import java.util.Iterator;

public class MobileTest {

	public static void main(String[] args) {
		HashSet<Mobile> hs = new HashSet<>();
		hs.add(new Mobile("Samsung", 25000, 5) );
		hs.add(new Mobile("onePlus", 45000, 6) );
		hs.add(new Mobile("Apple", 85000, 5) );
		hs.add(new Mobile("MI", 15000, 6) );
		
		hs.forEach((a)->System.out.println(a));
		
		Iterator<Mobile> itr = hs.iterator();
		while(itr.hasNext()) {
			Mobile it = itr.next();
			System.out.println(it);
		}
		

	}

}
//"Create a Hashset<CustomObject> of ur choice and do the following:
//1. Add items .
//2. Traverse using foreach() and print elements
//3. Traverse and print elements using iterator"