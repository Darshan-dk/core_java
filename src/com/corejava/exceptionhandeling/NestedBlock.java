package com.corejava.exceptionhandeling;

public class NestedBlock {
//nested try block
	public static void main(String[] args) {
		arraymanipulation();

	}

	static void arraymanipulation() {

		try {

			try {
				int num = Integer.parseInt("a");
				System.out.println(num);
			} catch (ArithmeticException e) {
				System.out.println("enter the valid input");
			}

			int intArray[] = { 1, 2, 3, 4 };
			System.out.println("The fifthe element of the array is :" + intArray[64]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("the index you trying to access is not avilable");
		} catch (RuntimeException e) {
			System.out.println("run time exception found");
		} catch (Exception e) {
			System.out.println("exception found");
		}
	}
}
