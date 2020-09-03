package com.java.interfacenewconcept;

public interface Mother {
	void cooking(); 
	default void singing() {          //using default keyword interface can have a complete method.
		System.out.println("the mother is singing");
	}
	

}
