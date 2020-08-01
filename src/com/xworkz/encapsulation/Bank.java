package com.xworkz.encapsulation;

public class Bank {
	private String accountNo;
	private double balance = 55000;

	public Bank(String accountNo) {

		this.accountNo = accountNo;
	}

	void displaybal(String accountNo) {
		System.out.println("Your account number is :" + accountNo + " the avilable balance is :" + balance);

	}

	void deposit(double amount) {
		if (amount > 0)
			balance += amount;
		else
			System.out.println("enter the proper amount");
	}

}
