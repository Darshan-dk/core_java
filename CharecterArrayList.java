package com.java.arraylist;

import java.util.*;

public class CharecterArrayList {

	public static void main(String[] args) {
		ArrayList<Character> charArray = new ArrayList<Character>();

		charArray.add('a');
		charArray.add('b');
		charArray.add('c');
		charArray.add('d');
		charArray.add('e');

		System.out.println("is list is empty " + charArray.isEmpty());
		for (char c : charArray)
			System.out.println(c);
		charArray.set(0, 'z');
		System.out.println(charArray);
		System.out.println("the fifth elemnt is " + charArray.get(4));
		charArray.remove(2);
		System.out.println("does list contain z " + charArray.contains('z'));
		charArray.remove(Character.valueOf('z'));
		System.out.println(charArray);

	}

}
