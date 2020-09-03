package com.java.collection.arraylist;

public class PowerBank {
	
	private int batteryCapasity;
	private int noOfPorts;
	private String brand;
	private double price;
	
	public PowerBank(int batteryCapasity, int noOfPorts, String brand, double price) {
		super();
		this.batteryCapasity = batteryCapasity;
		this.noOfPorts = noOfPorts;
		this.brand = brand;
		this.price = price;
	}

	public int getBatteryCapasity() {
		return batteryCapasity;
	}

	public void setBatteryCapasity(int batteryCapasity) {
		this.batteryCapasity = batteryCapasity;
	}

	public int getNoOfPorts() {
		return noOfPorts;
	}

	public void setNoOfPorts(int noOfPorts) {
		this.noOfPorts = noOfPorts;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "PrivateBank [batteryCapasity=" + batteryCapasity + ", noOfPorts=" + noOfPorts + ", brand=" + brand
				+ ", price=" + price + "]";
	}
	
	

}
