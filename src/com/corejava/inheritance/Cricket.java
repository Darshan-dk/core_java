package com.corejava.inheritance;

public class Cricket extends Sport {
	public String type;
	static int overs;

	void field() {
		System.out.println("cricet is a outdoor game");
	}

	void over() {
		System.out.println("In cricket an over contain 6 balls");
	}
}
