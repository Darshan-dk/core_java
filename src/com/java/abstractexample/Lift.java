package com.java.abstractexample;

public abstract class Lift {
	 abstract void pressOne();
	 abstract void pressTwo();
		 
	 void stop() {
		 System.out.println("Stop the lift");
	 }
	 void alarm() {
		 System.out.println("do alarm");
	 }


}
