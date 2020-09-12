package com.java.threadcocepts;

public class MultipleOfFive extends Thread {

	@Override
	public void run() {
	System.out.println("This is from zeroth thread");
	System.out.println("name of the thread is : "+Thread.currentThread().getName());
	System.out.println("id of the thread is :"+Thread.currentThread().getId());
	
	for(int i=0; i<5; i++) {
		int res =5*i;
		System.out.println("5 *"+i+ " = "+res);
	}
	System.out.println("thread zero is ended");
	}

}
