package com.assignment;

public class TestOverride {

	public static void main(String[] args) {
		GrandFather test1 = new Child();//up casting
		test1.marrage();//run time polymorphism or dynamic polymorphism
		test1.property();//run time polymorphism or dynamic polymorphism
		System.out.println("age is" + test1.age);


}
}
