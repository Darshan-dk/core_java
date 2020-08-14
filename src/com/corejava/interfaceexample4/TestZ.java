package com.corejava.interfaceexample4;

public class TestZ {

	public static void main(String[] args) {
		Android mobile=new MobileZ(); //UPCASTING
		mobile.openGoogleChrome();
		mobile.openMap();
		mobile.openPlayStore();
		
		Ios mobile1=new MobileZ(); //UPCASTING
		mobile1.openStore();
		mobile1.openMap();
		mobile1.openSuffari();
	}
	

}
