package com.xworkz.corejava.publicmodifier;

public class DogTester {

	public static void main(String[] args) {
//		cannot access the private member of gog class;
//		outside the class
//		can use default member outside the pakage
		
		Dog outside=new Dog("german sheperd", 5);
		outside.age=5;
		outside.color="brown";
		outside.ismale=true;
		
		outside.barking();
	}

}
