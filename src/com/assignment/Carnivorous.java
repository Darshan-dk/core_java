package com.assignment;

public class Carnivorous extends Animal{
	int lifeSpan=40;
	
	@Override
	void eat() {
		
		System.out.println("this type of animal only consume meat as food.");
	}
	@Override
	void run() {
		System.out.println("this animal run for food");
		
	}

}
