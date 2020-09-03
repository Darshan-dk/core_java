package com.arraylist;

public class Television implements Comparable<Television> {
	private String Brand;
	private double inches;
	private String type;

	public Television(String brand, double inches, String type) {
		super();
		Brand = brand;
		this.inches = inches;
		this.type = type;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public double getInches() {
		return inches;
	}
	public void setInches(double inches) {
		this.inches = inches;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Television [Brand=" + Brand + ", inches=" + inches + ", type=" + type + "]";
	}
	@Override
	public int compareTo(Television o) {
		// TODO Auto-generated method stub
		return (int) (this.inches-o.inches);
	}
	
	
	

}
//Create an ArrayList of 'Television' object containing fields: {brand, inches, type**} and perform the following:   (**Type is led, lcd etc).
//1. Add 4-5 elements to it.
//2. Display all the elements in the list using foreach method.
//3. Sort the elements by inches in ascending order.
//4. Sort the elements by brand in decending order.
//5. sort the elements by type in decending order. (All 3 using comparator )