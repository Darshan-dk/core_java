package com.java;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("enter the number of rows");
		int n=sc.nextInt();
		System.out.println("enter the number of coloms");
		int m=sc.nextInt();
		int myArray[][]=new int[n][m];
		
		System.out.println("enter the values");
		for(int i=0;i<n;i++) {
			for (int j=0;j<m;j++) {
				myArray[i][j]=sc.nextInt();
			}
			
			
		}
		System.out.println("the matrix is :");
		for(int i=0;i<n;i++) {
			for (int j=0;j<m;j++) {
				System.out.print(myArray[i][j]+"\t");
			}
			System.out.println("");
			
	}

}}
