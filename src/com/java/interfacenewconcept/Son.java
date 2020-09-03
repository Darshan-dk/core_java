package com.java.interfacenewconcept;

public class Son extends Brother implements Father, Mother  {


	@Override
	public void cooking() {
		System.out.println("son is cooking");
	}

	@Override
	public void working() {
		System.out.println("son is working");
	}

//	@Override
//	public void singing() {
//		// this is a default method u can alter the method
//		Father.super.singing();
//	}
	/*note- if we extends and implements to class which having same method eg:singing();
	in the test class JVM always prefer to run the method which present in the class(i.e brother class)
	 if we need method from interface we need to explicitly over ride in son class.
	 */
	
//	@Override
//	public void singing() {
//		System.out.println("son is singing");  // Customized method.
//	}

}
