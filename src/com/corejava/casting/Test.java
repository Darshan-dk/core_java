package com.corejava.casting;

public class Test {

	public static void main(String[] args) {

		Transport trans = new RoadWayTransport();//up casting
		System.out.println("the value of the a during up casting is :" + trans.a);
		trans.travelling();
	}

}
/*in upcast we can only have runtime polymoprphism on method  not for variable*/