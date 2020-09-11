package com.java.thread.assignment;

import java.util.Arrays;
import java.util.List;

public class Qtn1 {
	public static void main(String[] args) {
		System.out.println("thread name :" + Thread.currentThread().getName());
		System.out.println("thread id :" + Thread.currentThread().getId());
		Runnable r1 = () -> {
			List<Integer> intAl = Arrays.asList(1, 5, 7, 7, 8, 9, 0, 7, 5);
			for (Integer a : intAl) {
				System.out.println(a);
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();

		Runnable r2 = () -> {
			List<String> strAl = Arrays.asList("audi", "bmw", "jaguar", "lambogini");
			for (String a : strAl) {
				System.out.println(a);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread t2 = new Thread(r2);
		t2.start();

		Runnable r3 = () -> {
			List<Double> dblAl = Arrays.asList(1.25, 1.659, 1.6599, 9.954516);
			for (Double a : dblAl) {
				System.out.println(a);
			}
		};
		Thread t3 = new Thread(r3);
		t3.start();
	}

}
//"write a program which creates 3 threads :
//1. looping through the ArrayList of integer
//2. looping through the ArrayList of Strings
//3. looping through the ArrayList of Double
//use Runnable interface"