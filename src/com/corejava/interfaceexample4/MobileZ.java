package com.corejava.interfaceexample4;

public class MobileZ implements  Android,Ios{

	@Override
	public void openStore() {
		System.out.println("IOS mobile opening the play store");
	}

	@Override
	public void openSuffari() {
		System.out.println("IOS mobile opening the suffari");
		
	}

	@Override
	public void openPlayStore() {
		System.out.println("Android mobile opening the play store");
		
	}

	@Override
	public void openGoogleChrome() {
		System.out.println("Android mobile opening the Google chrome");
		
	}

	@Override
	public void openMap() {
		System.out.println("Z mobile opening the Map");
		
	}

}
