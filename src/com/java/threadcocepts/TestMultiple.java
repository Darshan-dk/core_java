package com.java.threadcocepts;

public class TestMultiple {
	public static void main(String[] args) {
		System.out.println("this is from main thread");
		MultipleOfFive t1= new MultipleOfFive();
		t1.start();
		MultipleOfFive2 t2= new MultipleOfFive2();
		t2.start();
		System.out.println("end of the main thread");
		
	}

}
