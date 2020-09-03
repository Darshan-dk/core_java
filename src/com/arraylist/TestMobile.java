package com.arraylist;

import java.util.ArrayList;

public class TestMobile {

	public static void main(String[] args) {
		ArrayList<Mobile> mb = new ArrayList<Mobile>();
		Mobile m1 = new Mobile(25000, "onePlus", "Android");
		Mobile m2 = new Mobile(35000, "samsung", "Android");
		Mobile m3 = new Mobile(15000, "MI", "Android");
		Mobile m4 = new Mobile(45000, "apple", "ios");
		Mobile m6 = new Mobile(45000, "Nokia", "windows");

		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		mb.add(m4);
		
		System.out.println("Printing using enhanced for loop");
		for(Mobile m:mb) {
			System.out.println(m);
		}
		System.out.println("printing using foreach loop");
		mb.forEach(t-> System.out.println(t));
		
		System.out.println("Displaying the last element");
		Mobile m5= mb.get(mb.size()-1);
		System.out.println(m5);
		
		mb.set(2, m4);
		System.out.println(mb);
		
		mb.set(0, m6);
		System.out.println(mb);
		

	}

}
