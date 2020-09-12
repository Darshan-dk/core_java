package com.java.map;

import java.util.HashMap;

public class TraineeTest {

	public static void main(String[] args) {
		HashMap<Trainee, Integer> hm= new HashMap<>();
		Trainee t1 = new Trainee(1, "krupa");
		Trainee t2 = new Trainee(2, "lokesh");
		Trainee t3 = new Trainee(3, "kiran");
		Trainee t4 = new Trainee(1, "krupa");
		
		hm.put(t1, 1);
		hm.put(t2, 1);
		hm.put(t3, 1);
		hm.put(t4, 2);
		
		System.out.println(hm);

		

	}

}
