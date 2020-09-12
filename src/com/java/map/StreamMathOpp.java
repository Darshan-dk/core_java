package com.java.map;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMathOpp {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1,2,13,4,15,6,17,8,19);
		
		System.out.println(integers);
		
		IntSummaryStatistics stats = integers.stream() .mapToInt((x) -> x) .summaryStatistics();
		System.out.println("Highest  number in List : " + stats.getMax());
		System.out.println("Lowest  number in List : " + stats.getMin()); 
		System.out.println("Sum of all  numbers : " + stats.getSum()); 
		System.out.println("Average of all  numbers : " + stats.getAverage()); 
		
		List<Integer> sqr = integers.stream().map(sq->(sq*sq)).collect(Collectors.toList());
		System.out.println(sqr);

	}

}
//"Consider, List<Integer> integers = Arrays.asList(1,2,13,4,15,6,17,8,19); using streams find
//1. max num in the list
//2. min num 
//3. sum
//4. average
//5. square of the numbers in diff list"