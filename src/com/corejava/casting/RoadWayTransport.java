package com.corejava.casting;

public class RoadWayTransport extends Transport {
	int a=20000;
	int b;

	@Override
	void travelling() {
		System.out.println("Road way travelig");
	}

	void road() {
		System.out.println("Req road");
	}
}