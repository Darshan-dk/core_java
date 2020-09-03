package com.java.assignment.methodreference;

public class MethodReference {
	 public static void myName(){  
	        System.out.println("Hello, my name is Darshan");  
}
public static void main(String[] args) {  
    // Referring static method  
	Darshan darshan = MethodReference::myName;  
    // Calling interface method  
	darshan.name();  
}  
}  