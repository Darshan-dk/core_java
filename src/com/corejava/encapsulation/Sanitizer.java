package com.corejava.encapsulation;

public class Sanitizer {
	public String brand;
	private double price = 100;
	protected String quantity;

	void setBrand(String inbrand) {
		brand = inbrand;

	}

	void getBrand() {
		System.out.println("the brand of sanitizer is :" + brand);
	}

	void setQuantity(String inquantity) {
		quantity = inquantity;
	}

	void getQuantity() {
		System.out.println("the quantity is :" + quantity);
		System.out.println("te price is :" + price);
	}
}
