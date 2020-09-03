package com.arraylist;

import java.util.Comparator;

public class Country implements Comparable<Country> {

	private int states;
	private String name;
	private int contryCode;

	public Country(int states, String name, int contryCode) {
		super();
		this.states = states;
		this.name = name;
		this.contryCode = contryCode;
	}

	public int getStates() {
		return states;
	}

	public void setStates(int states) {
		this.states = states;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getContryCode() {
		return contryCode;
	}

	public void setContryCode(int contryCode) {
		this.contryCode = contryCode;
	}

	@Override
	public String toString() {
		return "Country [states=" + states + ", name=" + name + ", contryCode=" + contryCode + "]";
	}

	@Override
	public int compareTo(Country o) {

		return this.getStates() - o.getStates();
	}

}
//Create an ArrayList of 'Country' object containing fields: {noOfStates, name, countrycode} and perform the following:
//1. Add 5 elements to it
//2. Display all the elements in the list using foreach method.
//3. Sort the elements by noOf States (use Comparable).
//4. Sort the elements by noOf States in decending order.