package com.corejava.set;

public class Mobile {
	
	private String name;
	private int price;
	private int display;
	public Mobile(String name, int price, int display) {
		super();
		this.name = name;
		this.price = price;
		this.display = display;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDisplay() {
		return display;
	}
	public void setDisplay(int display) {
		this.display = display;
	}
	@Override
	public String toString() {
		return "Mobile [name=" + name + ", price=" + price + ", display=" + display + "]";
	}
	


}
