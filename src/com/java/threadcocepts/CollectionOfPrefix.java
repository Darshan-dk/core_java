package com.java.threadcocepts;

import java.util.Arrays;
import java.util.List;

public class CollectionOfPrefix {

	public static void main(String[] args) {
		System.out.println("the main thread is running");

		Runnable r1 = () -> {
			Integer[] intArray = { 1, 3, 6, 8, 5 };
			List<Integer> intAl = Arrays.asList(intArray);
			for (Integer a : intAl) {
				System.out.println("*" + a);
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();

		Runnable r2 = () -> {
			Integer[] intArray = { 1, 3, 6, 8, 5 };
			List<Integer> intAl = Arrays.asList(intArray);
			for (Integer a : intAl) {
				System.out.println("**" + a);
				try {
					Thread.sleep(5000); // adding delay
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread t2 = new Thread(r2);
		t2.start();

		System.out.println("end of the thread " + Thread.currentThread().getName());
	}

}
