package com.java.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class PowerBankTest {

	public static void main(String[] args) {
		
		ArrayList<PowerBank> powerBanksList= new ArrayList<PowerBank>();
		PowerBank pb1 = new PowerBank(10000, 2, "MI", 20000);
		PowerBank pb2 = new PowerBank(15000, 3, "samsung ", 3000);
		
		powerBanksList.add(pb1);
		powerBanksList.add(pb2);
		powerBanksList.add (new PowerBank(5000, 1, "intex ", 1000));
		
		System.out.println(powerBanksList);
		powerBanksList.remove(pb2);
		System.out.println(powerBanksList);
		
		for(int i=0;i<powerBanksList.size();i++)
			System.out.println("obj "+i+":"+powerBanksList.get(i));
		for(PowerBank temp:powerBanksList)
		{
			if(temp.getBatteryCapasity()==5000) {
				temp.setBrand("LG");
				System.out.println("new brand is :"+temp.getBrand());
			}
		}
		
		System.out.println(powerBanksList);
		
		powerBanksList.set(1,new PowerBank(1500, 3, "hp ", 3500));
		System.out.println(powerBanksList);
		
		//Removing the all the elements of MI
		Iterator<PowerBank> itr = powerBanksList.iterator();
		
		while(itr.hasNext()) {
			PowerBank pb=itr.next();
			System.out.println("The object is"+pb);
			if(pb.getBrand().equals("MI")) {
				itr.remove();
			}
		}
		System.out.println(powerBanksList);

	}

}
