package com.corejava.SortingMultileFields;

import java.util.Comparator;

public class Student implements Comparable<Student> {
	private String name;
	private String address;
	private int age;
	public Student(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Student o) {
		
				
		    return Comparator.comparing(Student::getAge)
		              .thenComparing(Student::getName)
				              .compare(this, o);
		};

	
	
	

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