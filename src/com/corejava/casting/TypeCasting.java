package com.corejava.casting;

public class TypeCasting {
	public static void main(String[] args) {
		//Auto Widening ->small size to bigger size
		int a=10;
		long b=a;
		
		int res= sum(a,b);
		System.out.println(res);
		
		//explicit narrowing -> bigger size data type into smaller size data type 
		long c = 10l;
		int d = (int) c;
		int res2 = sum((long) 10.00,c);
		/* here 10.00 is not long type so we explicitly 
		type cast double into float,but c is of int type it will get auto widening to the 
		double in the calling method
		*/
		System.out.println(res2);
	}
	static int sum(long a, double b) {
		int sum=(int) (a+b);
		return sum;
	}

}
