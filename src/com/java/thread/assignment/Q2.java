package com.java.thread.assignment;

import java.util.ArrayList;

public class Q2 {
	public static void main(String[] args) {
		System.out.println("Thread name :"+Thread.currentThread().getName());
		Runnable r1 = ()->{
			ArrayList<String> al= new ArrayList<>();
			al.add("Hello");
			al.add("Welcome To");
			al.add("Java");
			al.add("Course");
			
			for(String a:al) {
				System.out.println(a);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			
		};
		Thread t1 = new Thread(r1);
		t1.start();
		
		Thread t2 = new Thread(r1);
		t2.start();
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("end of main thread");
	}

}
