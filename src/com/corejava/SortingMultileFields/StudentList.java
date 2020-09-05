package com.corejava.SortingMultileFields;

import java.util.Collections;
import java.util.LinkedList;



public class StudentList {
	
	

	public static void main(String[] args) {
		
		
		LinkedList<Student> list=new LinkedList<>(); 
		list.add(new Student("Rohan", "JP nagar" , 16));
		list.add(new Student("Rahul", "RR nagar" , 16));
		list.add(new Student("Rekha", "Rajaji nagar" , 18));
		list.add(new Student("Ruhi", "Jayanagar" , 14));
		
//		Collections.sort(list, new SortByFields());
		Collections.sort(list);
		
		list.forEach((s)->System.out.println(s));

	}

}
//
//"Explore if we can sort based on two attribute at a time using comparator or comparable. 
//Ex: 
//Student{age, name , address}
//16, Rohan, J P nagar
//16, Rahul, RR nagar
//18, Reka, RajajiNagar
//14, Ruhi, Jayanagar
//
//In the above Example sort based on two attributes first, age, second on Name. 
//After performing sorting the output should look like this :
//14, Ruhi , Jayanagar
//16, Rahul, RR nagar
//16, Rohan, J P nagar
//18, Reka, RajajiNagar"