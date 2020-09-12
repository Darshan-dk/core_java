package com.java.map;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample{
	public static void main(String[] args) {
		TreeMap<String, Integer> tm = new TreeMap<>();
		tm.put("Jan", 1);
		tm.put("Sep", 9);
		tm.put("Feb", 2);
		tm.put("Apl", 4);
		tm.put("Mar", 3);
		tm.put("Oct", 10);
		tm.put("May", 5);
		tm.put("Nov", 11);
		tm.put("Jun", 6);
		tm.put("Aug", 8);
		tm.put("Jul", 7);
		tm.put("Dec", 12);
		
		Set<Entry<String, Integer>> entrySet = tm.entrySet();
		for(Entry<String, Integer> a:entrySet) {
			System.out.println("key :"+a.getKey()+" value :"+a.getValue());
		}
		
	}

}
//create a TreeMap<String, Integer> to store month & NumOfDays and display each
//key value pair in different lines using EntrySet()