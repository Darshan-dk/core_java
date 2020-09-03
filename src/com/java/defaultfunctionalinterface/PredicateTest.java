package com.java.defaultfunctionalinterface;

import java.util.function.Predicate;

public class PredicateTest {
//	Predicate<T>
//	Represents a predicate (Boolean-valued function) of one argument.

	public static void main(String[] args) {
		
		Predicate<String> pred = (s) ->s.equalsIgnoreCase("hello");
		// using ternary opp ---{return s.equalsIgnoreCase("hello")? true:false;}; 
		
		System.out.println("the result is "+ pred.test("HELLO"));
		
		
		
		Predicate<Integer> intPred = (i) -> (i%2==0);
		//using ternary opp --
//		{
//			return (i%2==0)? true:false;
//		};
		
		System.out.println("the number is even "+intPred.test(13));
		
		
	}

}
