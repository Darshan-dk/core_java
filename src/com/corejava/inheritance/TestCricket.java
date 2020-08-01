package com.corejava.inheritance;

public class TestCricket {

	public static void main(String[] args) {
		Cricket ipl = new Cricket();
		String type = "T20";
		int overs = 20;

		ipl.activity("pysical");
		ipl.over();
		ipl.result();
		ipl.field();

		System.out.println("This is a " + type + "cricket, it has " + overs + " overs per innings.");

	}

}
