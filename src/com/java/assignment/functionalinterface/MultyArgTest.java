package com.java.assignment.functionalinterface;

public class MultyArgTest {
	public static void main(String[] args) {
		
	
	MultipleArgs addString=(a,b)->{
		String d= a+b;
		
		System.out.println("the concatination of a and b is "+d);
		return d;
		
	};		addString.concatinate("darhan", "poojary");


}
}