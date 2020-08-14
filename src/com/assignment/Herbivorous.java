package com.assignment;

public class Herbivorous extends Animal {
	int weight=78;
	@Override
	void eat() {
		System.out.println("these are eat only herbs and grass'");
	}

	@Override
	void run() {
		System.out.println("these are rn usually to escape from Carnivorous");
	}
	

}
