
package com.corejava.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		int sum = 0, temp = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a end number");
		try {

			int n = scan.nextInt();
			if (n > 0) {
				temp = n;
				do {
					sum += n;
					n--;
				} while (n > 0);
				System.out.println("The sum of natural number in between 0 to " + temp + " is " + sum);
			} else
				System.out.println("enter positive number");
		} catch (InputMismatchException e) {
			System.out.println("enter the  integer");
		}

	}

}
