package com.corejava.interfaceexample;

public class Bmw implements Car {

	@Override
	public void applyAccelerator() {
		System.out.println("BMW is applying accelerator");
	}

	@Override
	public void applyBreak() {
		System.out.println("BMW is applying break");

	}

	@Override
	public void steerToRight() {
		System.out.println("BMW is steerToRight");

	}

	@Override
	public void steerToLeft() {
		System.out.println("BMW is steerToLeft");

	}

}
