package com.java.equalsandhashcode;

import java.util.HashSet;

public class TraineeTester {
	public static void main(String[] args) {
		
	 Trainee t1= new Trainee(1, "ramesh");
	 Trainee t2= new Trainee(1, "ramesh");
	 Trainee t3= new Trainee(2, "suresh");
	 
	 //usually .equals method check for hashCode
	 /* to make .equals need to compare id and name instead of hash code we have to override hashCode and 
	 equals method in object class */
	 System.out.println(t1.equals(t2));
	 
	 HashSet<Trainee> traineeSet = new HashSet<>();
	 traineeSet.add(t1);
	 traineeSet.add(t2);
	 traineeSet.add(t3);
	 
	 System.out.println("set is"+traineeSet);
	 
	}

}
