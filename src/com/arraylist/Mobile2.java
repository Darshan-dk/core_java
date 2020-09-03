package com.arraylist;

public class Mobile2 {
	private int price;
	private String brand;
	private String type;

	public Mobile2(int price, String brand, String type) {
		super();
		this.price = price;
		this.brand = brand;
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Mobile [price=" + price + ", brand=" + brand + ", type=" + type + "]";
	}

}

//Create an ArrayList of CustomObject of your choice. Perform the following:
//1. Add 4 elements in to the ArrayList.
//2. Traverse the elements using enhanced for loop.
//3. traverse the elements using for each() of collection.
//4. Display the last element.
//5. update the 3rd element with a new object.
//6. Add a new object at the index 0.