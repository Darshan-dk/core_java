package com.corejava.interfaceexample;

public class Audi implements Car {

	@Override
	public void applyAccelerator() {
		System.out.println("Audi is applying accelerator");

	}

	@Override
	public void applyBreak() {
		System.out.println("Audi is applying break");

	}

	@Override
	public void steerToRight() {
		System.out.println("Audi is steerToRight");

	}

	@Override
	public void steerToLeft() {
		System.out.println("Audi is steerToRight");

	}

}
