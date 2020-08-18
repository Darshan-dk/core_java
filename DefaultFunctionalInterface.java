package com.java.functionalinterfaace;

import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class DefaultFunctionalInterface {

	public static void main(String[] args) {
		Predicate<Integer> preInt = (a) -> (a > 0);
		System.out.println("the number is positive :" + preInt.test(-15));

		Consumer<String> sCons = (s) -> System.out.println("My Name is :" + s);
		sCons.accept("Darshan");

		Function<Integer, String> fun = (i) -> new String("the overall percentage is :" + i);
		fun.apply(87);

		Supplier<Integer> sI = () -> new Integer(1);
		System.out.println("the integer you entered :" + sI.get());

	}

}
