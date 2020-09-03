package com.java.staticconcept;

public interface Person {
	void playing();
	static void walking() {
		System.out.println("person is walking");
	}
}
