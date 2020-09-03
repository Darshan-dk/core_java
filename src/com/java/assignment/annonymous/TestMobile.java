package com.java.assignment.annonymous;

public class TestMobile {

	public static void main(String[] args) {
		Phone smartphone=new Phone() {
			
			@Override
			public void gaming() {
			System.out.println("Playing in smartphone");
			}
			
			@Override
			public void calling() {
				System.out.println("Calling in smartphone");
			}
		};
		smartphone.calling();
		smartphone.gaming();
		Phone keypadPhone=new Phone() {
			
			@Override
			public void gaming() {
			System.out.println("Playing in keypadPhone");
			}
			
			@Override
			public void calling() {
				System.out.println("Calling in keypadPhone");
			}
		};
		keypadPhone.calling();
		keypadPhone.gaming();


	}

}
