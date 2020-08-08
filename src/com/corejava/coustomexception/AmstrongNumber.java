package com.corejava.coustomexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number you want check");
		try {
			int numb = sc.nextInt();
			CountDigit(numb);
		} catch (InCorrectDigitException e) {
			System.out.println("error occured  " + e);
		} catch (InputMismatchException e) {
			System.out.println("Pleace enter the integer  " + e);
		}
	}

	static void CheckAmstrongNumber(int n) {
		int temp, a, c = 0;
		temp = n;
		while (n > 0) {
			a = n % 10;
			n = n / 10;// taking out last digit//
			c += a * a * a;
		}
		if (c == temp) {
			System.out.println("the number is amstrong number");
		} else
			System.out.println("this number is not a amstrong number");
	}

	static void CountDigit(int n) {
		int count = 0;
		if (n > 0) {
			do {
				n = n / 10;
				count++;

			} while (n > 0);
		}
		if (count == 3)
			CheckAmstrongNumber(count);
		else
			throw new InCorrectDigitException("Pleace enter three digit number");

	}
}
