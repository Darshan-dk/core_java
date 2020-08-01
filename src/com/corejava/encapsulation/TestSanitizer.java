package com.corejava.encapsulation;

public class TestSanitizer {

	public static void main(String[] args) {
		Sanitizer test = new Sanitizer();
		test.setBrand("aqua");
		test.setQuantity("1Ltr.");
		test.getBrand();
		test.getQuantity();
	}

}
