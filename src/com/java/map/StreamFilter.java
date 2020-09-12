package com.java.map;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
	

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abc","", "jkl");
		System.out.println(strings);
		  List<String> result = strings.stream().filter(word -> word.length() == 3)
	                .collect(Collectors.toList());

	        System.out.println("String with three chareter "+result);
	        
	       List<String> result1 = strings.stream().filter(empty->empty.length()!=0)
	    		   .collect(Collectors.toList());
	     System.out.println("Non empty Strings are "+result1);
	     
	     long count =  strings.stream().filter(a->a.length() == 0).count();//one method
//	     long count =strings.stream().filter(d->d.isEmpty()).count();//another method
	     System.out.println("the number of empty strings are :"+count);
	    
}}
//"Consider, List<String> strings = Arrays.asList(""abc"", """", ""bc"", ""efg"", ""abcd"","""", ""jkl"");
//1. Using streams, filter only the non empty strings and return List.
//2. Return the number of Empty strings.
//3. print all the string with 3 char