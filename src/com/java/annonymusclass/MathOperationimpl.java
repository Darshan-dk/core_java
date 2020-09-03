package com.java.annonymusclass;

public class MathOperationimpl implements MathOperation {

	@Override
	public void add(int a, int b) {
		int res =a+b;
		System.out.println(res);
	}

	@Override
	public void sub(int a, int b) {
		int res =a-b;
		System.out.println(res);
	}

}
