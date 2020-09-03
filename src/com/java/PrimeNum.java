package com.java;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
	
		int rem=0;
		if((n==0)||(n==1))
			System.out.println("the number is not a prime number");
		else if (n%2==0) {
			System.out.println("not a prime number");
		}else   {
			for(int i=3;i<n;i++) {
				 rem=n%i; 
				if (rem==0) {
				
					System.out.println("the nuber isnot A prime number");
				
				
				break;
			}
		}if(rem!=0) System.out.println("its a prime number");
		
		
		
		
	}

}}
