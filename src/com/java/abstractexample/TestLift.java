package com.java.abstractexample;

public class TestLift {
	public static void main(String[] args) {
		Lift test = new Lift1();
		test.alarm();
		test.pressOne();
		test.pressTwo();
	}

}
/*only method and class can be abstract, constructor and variable cannot be abstractor*/