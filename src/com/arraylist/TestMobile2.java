package com.arraylist;

import java.util.ArrayList;

import java.util.Iterator;

public class TestMobile2 {

	public static void main(String[] args) {
		ArrayList<Mobile> mb = new ArrayList<Mobile>();
		Mobile m1 = new Mobile(25000, "onePlus", "Android");
		Mobile m2 = new Mobile(35000, "samsung", "Android");
		Mobile m3 = new Mobile(15000, "MI", "Android");
		Mobile m4 = new Mobile(45000, "apple", "ios");
		Mobile m5 = new Mobile(45000, "Nokia", "windows");

		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		mb.add(m4);
		mb.add(m5);

		System.out.println("Printing using enahanced forloop");
		for (Mobile m : mb) {
			System.out.println(m);
		}
		System.out.println("Printing using forEach loop");
		mb.forEach(d -> System.out.println(d));

		System.out.println("printing using iterator");
		Iterator<Mobile> itr = mb.iterator();
		while (itr.hasNext()) {
			Mobile mobile = itr.next();
			System.out.println(mobile);
		}

	}

}
