package com.lamda;

public class MathTest {

	public static void main(String[] args) {
		MathOps mathAddition = (a, b) -> {
			return a + b;
		};
		MathOps mathSub = (a, b) -> a - b; 
			
		
		MathOps mathMult = (a, b) -> {
			return a * b;
		};
		MathOps mathDiv = (a, b) -> {
			return a / b;
		};

		System.out.println("the sum is " + mathAddition.mathOps(10, 12));
		System.out.println("the sub is " + mathSub.mathOps(10, 12));
		System.out.println("the mult is " + mathMult.mathOps(10, 12));
		System.out.println("the div is " + mathDiv.mathOps(10, 12));

	}

}
