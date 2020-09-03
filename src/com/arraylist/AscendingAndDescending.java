package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AscendingAndDescending {

	public static void main(String[] args) {
		ArrayList<Double> ad= new ArrayList<Double>();
		ad.add(15.11);
		ad.add(21.11);
		ad.add(41.11);
		ad.add(31.11);
		ad.add(51.11);
		ad.add(71.11);
		ad.add(72.11);
		ad.add(81.11);
		ad.add(94.11);
		ad.add(101.11);
		
		Collections.sort(ad);
		System.out.println(ad);
		
		 Collections.sort(ad, Collections.reverseOrder());
		 System.out.println(ad);
		

	}

}
//create an ArrayList of double and do the following:
//1. Add 10 values. 
//2. Sort the list in ascending order.
//3. Sort the list in descending order.
