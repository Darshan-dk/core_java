package com.xworkz.encapsulation;

public class BankHacking {

	public static void main(String[] args) {
		Bank sbi = new Bank("SBI00012345");
		sbi.deposit(40000);
		sbi.displaybal("SBI00012345");
	}

}
