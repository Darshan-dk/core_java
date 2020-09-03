package com.java.collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortingOfCharArray {

	public static void main(String[] args) {
		ArrayList<Character> arrayList = new ArrayList<>();
		arrayList.add('A');
		arrayList.add('F');
		arrayList.add('B');
		arrayList.add('D');
		arrayList.add('C');
		arrayList.add('E');

		System.out.println("array list before sort" + arrayList);

		Collections.sort(arrayList);

		System.out.println("After sorting" + arrayList);

	}

}
