package com.corejava.exceptionhandeling;

class TryCatchBlock {
	
	public static void main(String[] args) {

		int a = 20, b = 2;
		try {
			int div = a / b;

			System.out.println(div);

			String name = null;
			int length = name.length();
		} catch (ArithmeticException e) {
			System.out.println("try enter valid input to divisor");

		} catch (NullPointerException e) {
			System.out.println("enter the input to the name");
		}
		Dog dog = null;
		try {
			dog.running();
		} catch (NullPointerException e) {
			System.out.println("initialize the object dog before using it");
		}
		dog = new Dog();
		dog.eat();

	}
}
