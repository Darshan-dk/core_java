package com.corejava.coustomexception;

public class CostomException1 {
	public static void validate(int age) {
		if (age<18)
			throw new TooYoungException("you are too young to sign in");
		else if(age>60)
			throw new TooOldException("you are too old to sign in");
		else
			System.out.println("welcome to board");
			
	}
public static void main(String[] args) {
	try {
		validate(14);
	}catch(TooYoungException e) {
		System.out.println("Incorrect age"+e);
	}
	catch(TooOldException e) {
		System.out.println("Incorrect age"+e);
	}
}
}
