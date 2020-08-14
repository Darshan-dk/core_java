package com.assignment;

public class TestAnimal {

	public static void main(String[] args) {
		Animal test=new Animal();
		test.eat();
		test.run();
		System.out.println("weight = "+test.weight+ " lifeSpan = "+test.lifeSpan);
		
		Carnivorous test1=new Carnivorous();
		test1.eat();
		test1.run();
		System.out.println("weight = "+test1.weight+ " lifeSpan = "+test1.lifeSpan);
		
		Herbivorous test2=new Herbivorous();
		test2.eat();
		test2.run();
		System.out.println("weight = "+test2.weight+ " lifeSpan = "+test2.lifeSpan);
				
	}

}
