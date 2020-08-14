package com.corejava.overriding;

public class Parent extends GrandFather {

	int age = 45;

	@Override
	public void marrage() {
		System.out.println("love marrage");
	}

	@Override
	void property() {
		System.out.println("Comany");
	}

}
