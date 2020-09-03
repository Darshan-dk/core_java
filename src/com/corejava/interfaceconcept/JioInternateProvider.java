package com.corejava.interfaceconcept;

public class JioInternateProvider implements InternetProvider {

	@Override
	public void transmittingSpeed() {
		System.out.println("The maximum speed of internet is 100 Mb/s.");
	}

	@Override
	public void connectivityType() {
		System.out.println("connectivity type is optical fiber.");
	}

}
