package com.java.defaultfunctionalinterface;

import java.util.function.Function;

public class FunctionTest {

//	Function<T,R>
//	Represents a function that accepts one argument and return a result.

	public static void main(String[] args) {
		Function<Integer, String> fun = (i) -> new String("the number " + i);
		String res = fun.apply(125);
		System.out.println(res);
	}

}
