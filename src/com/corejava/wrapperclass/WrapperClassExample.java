package com.corejava.wrapperclass;

public class WrapperClassExample {
	public static void main(String[] args) {

		int a = 10;// primitive data
		Integer b = new Integer(a);// boxing
		Integer c = 10;// auto boxing

		char d = 'A';
		Character e = new Character(d);// boxing
		Character f = d;

		int unboxedint = b.intValue();// unboxing
		int autoUnboxing = b;// auto unboxing
	}
}
