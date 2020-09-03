package com.java.assignment.annonymous;

public class TestCountry {
	public static void main(String[] args) {
		Country india = new Country() {

			@Override
			public void flag() {
				System.out.println("Indian flag is Tiranga");

			}

			@Override
			public void anthem() {
				System.out.println("Indian anthem is " + "ja na ga na ma na");
			}

			@Override
			public void animal() {
				System.out.println("Indian animal is Tiger");

			}
		};
		india.animal();
		india.anthem();
		india.flag();
	}

}
