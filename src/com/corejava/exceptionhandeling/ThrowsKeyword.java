package com.corejava.exceptionhandeling;

public class ThrowsKeyword {
	public static void main(String[] args) {

		int a = 10, b = 0;
		ThrowsKeyword divopp = new ThrowsKeyword();

		try {
			int result = divopp.division(a, b);
			System.out.println("result is : " + result);

		} catch (ArithmeticException e) {
			System.out.println("somthing went wrong");
		}

	}

private	int division(int a, int b) throws ArithmeticException {
		int div = 0;
		div = a / b;
		return div;
	}

}
