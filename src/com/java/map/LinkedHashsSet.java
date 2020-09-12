package com.java.map;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHashsSet {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
		lhm.put(576113, "udupi");
		lhm.put(576001, "bangalore1");
		lhm.put(576005, "mahalakshmi layout");
		lhm.put(576119, "mangalore");
		
	Set<Entry<Integer, String>> entrySet = lhm.entrySet();
		
		for(Entry<Integer, String> e:entrySet)
			System.out.println("key :"+e.getKey()+ "value :"+e.getValue());
		
		

	}

}
//create a LinkedHashMap<Integer, String>  to store zipCode & AreaName. Display them 
//using getKey().