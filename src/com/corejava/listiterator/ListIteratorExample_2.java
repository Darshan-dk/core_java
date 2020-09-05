package com.corejava.listiterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorExample_2 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.offer(1000); // last element
		list.addFirst(2154);
		list.addLast(7487);
		list.add(3, 5000);
		
		list.forEach(d->System.out.println(d));
		System.out.println("----------------------------------------------------------------------");
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			Integer a =itr.next();
			System.out.println(a);
		}
		System.out.println("----------------------------------------------------------------------");
		
		ListIterator<Integer> litr = list.listIterator();
		while(litr.hasNext()) {
			Integer g = litr.next();
			System.out.println(g);
		}
	}

}

//
//"Create an LinkedList<CustomObject> of your choice. Perform the following:
//1. Add 4-5 elements in to the LinkedList.
//2. Traverse the elements using foreach() of collection.
//3. Traverse the elements using iterator.
//4. Traverse the elements using ListIterator.