package com.corejava.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CubeOfNumber {

	public static void main(String[] args) {
		int cube;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number upto which you need cube ");

		try {
			int n = scan.nextInt();
			if (n > 0) {
				for (int i = 0; i <= n; i++) {
					cube = i * i * i;
					System.out.println("cube of " + i + " is :" + cube);
				}
			} else {
				System.out.println("enter positive number");
			}

		} catch (InputMismatchException e) {
			System.out.println("pleace enter the integer");
		}
	}
}