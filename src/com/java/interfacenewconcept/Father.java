package com.java.interfacenewconcept;

public interface Father {
	void working();
	default void singing() {    //using default keyword interface can have a complete method.
		System.out.println("the father is singing");
	}
}
