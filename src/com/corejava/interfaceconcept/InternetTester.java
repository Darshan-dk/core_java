package com.corejava.interfaceconcept;

public class InternetTester {

	public static void main(String[] args) {
		InternetProvider jio = new JioInternateProvider();// Up casting
		jio.connectivityType();
		jio.transmittingSpeed();
		/*In interface concept we cannot create instance of interface object
		 * We need up-cast interface object into class object 
		 * and every methods in interface object must to be override in their subclass.  */
	}

}
