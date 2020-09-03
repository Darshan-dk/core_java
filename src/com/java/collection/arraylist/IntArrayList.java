package com.java.collection.arraylist;

import java.util.ArrayList;
public class IntArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> num= new ArrayList<Integer>();
		
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		
		System.out.println("the first element is :"+num.get(0));
		num.set(2,20);
		for(int n:num) {
			System.out.println(n);
		}
		num.remove(3);//while removing index 3
		num.remove(new Integer( 2));//while removing object 2 it applicable for integer type only.
		for(int n:num) {
			System.out.println(n);
		}
		
		System.out.println("index of 5 is"+num.indexOf(5));
		System.out.println("index of 5 is"+num.lastIndexOf(20));

	}
	

}
