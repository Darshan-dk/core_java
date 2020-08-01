package com.corejava.encapsulation;

public class Laptop {
	private String adminName;
	private String password;
	private String model = "workbook123";

	void setUserName(String inadminName) {
		adminName = inadminName;
	}

	void getUserName() {
		System.out.println("the user name is :" + adminName);
	}

	void setUserPassword(String inpassword) {
		password = inpassword;

	}

	void getUserPassword() {
		System.out.println("the user password is :" + password);
		System.out.println("the model of laptop is :" + model);
	}
}
