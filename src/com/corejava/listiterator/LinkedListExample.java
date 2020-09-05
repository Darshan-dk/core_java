package com.corejava.listiterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.offer(1000); // last element
		list.addFirst(2154);
		list.addLast(7487);
		list.add(3, 5000);
		list.add(20);
		list.add(30);
		list.add(40);

		Iterator<Integer> itr = list.iterator(); // printing through Iterator.
		while (itr.hasNext()) {
			Integer iterat = itr.next();
			System.out.println(iterat);
		}
		list.forEach((a)->System.out.println(a));

		ListIterator<Integer> listitr = list.listIterator(); // list iterator.
		while (listitr.hasNext()) {
			Integer i = listitr.next();
			System.out.println("***" + i + " index " + listitr.nextIndex());
		}

		System.out.println("getting the 3rd index :" + list.get(3));
		System.out.println("getting the peek :" + list.peek());
		System.out.println("getting the first element :" + list.getFirst());
		System.out.println("getting the last element :" + list.getLast());

		System.out.println(list);

		System.out.println("removing the 3rd index :" + list.remove(3));
		System.out.println("removing the first :" + list.poll());
		System.out.println("removing the first element :" + list.pollFirst());
		System.out.println("removing the last element :" + list.pollLast());
		System.out.println("removing the all element " + list.removeAll(list));

	}
}
//"Create a linkedList<String> and perform the following operations:
//1. add 8 elements using all the add operations of Linked list. (offer, add, addfirst . etc)
//2. Traverse through LL using iterator and list iterators
//3. perform retrival operations using all retrival methods like peek, element, getFirst, getLast etc
//4. perform remove operations using all the remove methods like remove, removeall, poll, pollfirst,polllast etc."