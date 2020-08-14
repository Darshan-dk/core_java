package com.corejava.overriding;

public class TestOverride {

	public static void main(String[] args) {
		GrandFather test1 = new GrandFather();
		test1.marrage();
		test1.property();
		System.out.println("age is" + test1.age);

		Parent test2 = new Parent();
		test2.marrage();
		test2.property();
		System.out.println("age is" + test2.age);

		Child test = new Child();
		test.marrage();
		test.property();
		System.out.println("age is" + test.age);

	}

}
