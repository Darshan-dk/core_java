package com.java.assignment.functionalinterface;

public class TestOneArgs {
	public static void main(String[] args) {
		OneArgumentalFi add =(a) ->(a+5);
			System.out.println( "if a is added by 5 ="+add.addFive(10));
			
		
	}

}
