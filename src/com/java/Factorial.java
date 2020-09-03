package com.java;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	System.out.println("enter the number you want to check");
	Scanner sc = new Scanner(System.in);
	int i=sc.nextInt();
	int fact=1;
	do {
		 fact=fact*i;
		i--;
		
	}while(i>0);
	System.out.println(fact);

	}

}
