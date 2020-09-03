package com.java.cons;

import java.util.Scanner;

public class CustomException {
	static void validate(int age, int weight) throws Exception {
		if (age<18)
			throw new IncorrectAge("wrong age");
		if(weight<50)
			throw new IncorecctWight("wrong weight");
		if ((age<18)||(weight<18))
			System.out.println("welcome");
	}
	

	public static void main(String[] args) throws Throwable  {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		System.out.println("enter the weight");
		int age=sc.nextInt();
		int weight= sc.nextInt();
		
			try {
				validate(age,weight);
			} catch (IncorrectAge e) {
				System.out.println(e);
			}catch(IncorecctWight e) {
				System.out.println("incorrect weight  "+e);
			}
			
		
		

	}

}
