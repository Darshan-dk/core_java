package xworks.corejava.staticmember;

public class Car {
	String model;
	double price;
	static String brand=" suzuki";

public Car(String model, double price) {
	
	this.model = model;
	this.price = price;
	
}
	 void display() {
		System.out.println("model of a car is "+model);
		System.out.println("price of car is"+price);
		
	}
}