package com.corejava.interfaceexample;

public class CarTester {

	public static void main(String[] args) {
		Car bmw = new Bmw();
		bmw.applyAccelerator();
		bmw.applyBreak();
		bmw.steerToLeft();
		bmw.steerToRight();

		Car Audi = new Audi();
		Audi.applyAccelerator();
		Audi.applyBreak();
		Audi.steerToLeft();
		Audi.steerToRight();
	}

}
