package com.corejava.priorityqueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq =new PriorityQueue<>();
		pq.add(15);
		pq.offer(258);
		pq.add(24);
		pq.offer(58);
		pq.offer(255);
		pq.offer(244);
		pq.offer(22);
		
		Iterator<Integer> it =pq.iterator();
		while(it.hasNext()) {
			Integer itr = it.next();
			System.out.println(itr);
		}
		System.out.println(pq.peek()+" peek");
		System.out.println(pq.poll()+" poll");
		System.out.println(pq.element());
	}

}
//"Create a PriorityQueue<Double> and perform the following operations:
//1. add 8-10 elements using all the add operations. (offer, add .. etc)
//2. Traverse through PQ using iterator 
//3. use the methods peek, poll, element, offer.."