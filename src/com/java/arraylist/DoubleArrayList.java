package com.java.arraylist;
import java.util.*;
public class DoubleArrayList {

	public static void main(String[] args) {
		ArrayList<Double> arrayDouble = new ArrayList<Double>();
		arrayDouble.add(15.2667);
		arrayDouble.add(16.2667);
		arrayDouble.add(17.2667);
		arrayDouble.add(18.2667);
		arrayDouble.add(19.2667);
		arrayDouble.add(20.2667);
		
		System.out.println("the size of list is :"+arrayDouble.size());
		System.out.println("********************************************************************");

		for(double d:arrayDouble)
			System.out.println(d);
		System.out.println("********************************************************************");

		arrayDouble.set(2, 56.23);
		System.out.println("the last element is :"+arrayDouble.get(arrayDouble.size()-1));
		System.out.println("********************************************************************");

		arrayDouble.remove(0);
		System.out.println(arrayDouble);
		System.out.println("********************************************************************");

		arrayDouble.remove(56.23);
		System.out.println(arrayDouble);
		
		System.out.println("********************************************************************");

		
		
	}

}
