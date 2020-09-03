package com.java.defaultfunctionalinterface;

import java.util.function.Consumer;


public class ConsumerTest {
//	Consumer<T>
//	Represents an operation that accepts a single input argument and returns no result.

	public static void main(String[] args) {
		Consumer<Double> cons = (d) -> System.out.println("The double value enterd is :"+d);
		cons.accept(56.7879);
	}

}
