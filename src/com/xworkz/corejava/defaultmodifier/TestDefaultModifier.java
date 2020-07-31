package com.xworkz.corejava.defaultmodifier;

import com.xworkz.corejava.publicmodifier.Dog;

public class TestDefaultModifier {

	public static void main(String[] args) {
//		cannot access default and private outside class the package;
//		can access public member 
		
		Dog dog=new Dog("lab",0);
		
		dog.age=2;
		dog.ismale=false;
		 
		dog.barking();
	}

}
