package com.corejava.interfaceexample3;

public class Samsung extends Android {

	@Override
	public void accessInternet() {
		System.out.println("the samsung mobile is accessing internet");
	}

	@Override
	public void switchingOn() {
		System.out.println("the samsung mobile is Switching ON");
		
	}

	@Override
	public void switchingOff() {
		System.out.println("the samsung mobile is accessing internet");
		
	}

	@Override
	public void charge() {
		System.out.println("the samsung mobile is charging");
		
	}

	@Override
	public void openPlayStore() {
		System.out.println("the samsung mobile is accessing Play Store");
		
	}

	@Override
	public void openGoogleChrome() {
		System.out.println("the samsung mobile is accessing google chrome");
		
	}

	@Override
	public void openMap() {
		System.out.println("the samsung mobile is accessing map");
		
	}

}
