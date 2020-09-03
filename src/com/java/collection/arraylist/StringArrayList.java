package com.java.collection.arraylist;
import java.util.ArrayList;
public class StringArrayList {

	public static void main(String[] args) {
		ArrayList<String> bike = new ArrayList<String>();
		bike.add("Yamaha");
		bike.add("Honda");
		bike.add("Hero");
		bike.add("Kawasaki");
		bike.add("BMW");
		bike.add("Suzuki");
		bike.add("Yamaha");
		
		System.out.println("Does bike list is empty? "+bike.isEmpty());
		
		System.out.println(bike);
		
		System.out.println("********************************************************************");

		
		for(String b:bike)  //printing by use of enhanced for loop.
			System.out.println(b);
		System.out.println("size of the list is "+bike.size());
		
		bike.add(6, "Ducati");
		System.out.println(bike);
		System.out.println("********************************************************************");

		
		ArrayList<String> subBike = new ArrayList<String>();
		subBike.add("R1");
		subBike.add("CBR");
		subBike.add("IMPULSE");
		subBike.add("NINJA");
		subBike.add("S1000RR");
		subBike.add("HYABUSA");
		subBike.add("Yamaha");
		
		bike.addAll(subBike);
		System.out.println(bike);
		
		System.out.println("********************************************************************");
		
		System.out.println("Does bike list contain ninja "+bike.contains("NINJA"));
		System.out.println("INDEX OF THE HYABUSA IS :"+bike.indexOf("HYABUSA"));
		System.out.println("The last index of the yamaha is :"+bike.lastIndexOf("Yamaha"));
		System.out.println("********************************************************************");

		System.out.println(bike);
		bike.remove(2);//remove index of
		System.out.println(bike);
		bike.remove("Yamaha");
		System.out.println(bike);
		bike.removeAll(subBike);
		System.out.println(bike);
		System.out.println(bike.get(0));
		System.out.println(bike);
		System.out.println("removing the last element in list");
		bike.remove(bike.size()-1);
		System.out.println(bike);

	}

}
