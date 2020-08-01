package com.corejava.multilevelinheritance;

public class Tester {

	public static void main(String[] args) {
		Z900 test = new Z900();
		test.start();
		String engineCapacity = "900cc";
		boolean isSuperBike = true;
		String type = "twoWheeler";
		test.maxSpeed();
		test.type();

	}

}
