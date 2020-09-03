package com.java.defaultfunctionalinterface;

import java.util.function.Supplier;

public class SupplierTest {
//	Supplier<T>
//	Represents a supplier of results.


	public static void main(String[] args) {
		Supplier<String> sup = ()-> new String("hello");
		System.out.println("the recived string is :"+sup.get());
	}

}
