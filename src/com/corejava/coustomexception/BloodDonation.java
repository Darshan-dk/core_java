package com.corejava.coustomexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BloodDonation {

	static void Inspection(int age, double weight) throws ImpropperWeightException {
		if ((age < 18))

			throw new ImproperAgeException("for blood donation you are must have 18+ age");
		else if (weight < 50)

			throw new ImpropperWeightException("you weight is too less to donate blood");

		if ((age > 18) || (weight > 50))
			System.out.println("you are eligible");

	}

	public static void main(String[] args) throws ImpropperWeightException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		try {
			int age = sc.nextInt();
			System.out.println("enter your weight");
			double weight = sc.nextDouble();
			Inspection(age, weight);

		} catch (ImproperAgeException e) {
			System.out.println("Age error occured" + e);
		} catch (ImpropperWeightException e) {
			System.out.println("Weight error occured" + e);
		} catch (InputMismatchException e) {
			System.out.println("pleace enter valid input" + e);
		}
	}

}
