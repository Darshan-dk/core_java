package com.java.annonymusclass;

public class MathOperationTester {

	public static void main(String[] args) {
		MathOperationimpl test = new MathOperationimpl();
		test.add(5, 7);
		test.sub(10, 3);
		 
		MathOperation ann =new MathOperation() {
			@Override
			public void add(int a, int b) {
				int res =((a+b)+5);
				System.out.println(res);
			}

			@Override
			public void sub(int a, int b) {
				int res =((a-b)-5);
				System.out.println(res);
			}
			
		};
		ann.add(1, 2);
		ann.sub(25, 2);
		MathOperation annn =new MathOperation() {
			@Override
			public void add(int a, int b) {
				int res =((a+b)+10);
				System.out.println(res);
			}

			@Override
			public void sub(int a, int b) {
				int res =((a-b)-10);
				System.out.println(res);
			}
			
		};
		annn.add(1, 2);
		annn.sub(25, 2);
		
		

	}

}
