package com.java;

public class Fibonasi {

	public static void main(String[] args) {
		int n1=1,n2=2,n3=0;
		int range=10;
		for(int i=0;i<=range;i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(","+n3);
		}
		

	}

}
