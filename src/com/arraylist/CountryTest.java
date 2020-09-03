package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class CountryTest {
	public static void main(String[] args) {
		ArrayList<Country> country = new ArrayList<Country>();

		Country c1 = new Country(28, "INDIA", 91);
		Country c2 = new Country(50, "USA", 81);
		Country c3 = new Country(20, "JAPAN", 71);
		Country c4 = new Country(30, "AUSTRALIA", 61);
		Country c5 = new Country(25, "ISREL", 51);

		country.add(c1);
		country.add(c2);
		country.add(c3);
		country.add(c4);
		country.add(c5);

		country.forEach(c -> System.out.println(c));

		Collections.sort(country);

		System.out.println("................");
		country.forEach(c -> System.out.println(c));

		Collections.sort(country, Collections.reverseOrder());
		System.out.println("................");
		country.forEach(c -> System.out.println(c));

	}

}
//Create an ArrayList of 'Country' object containing fields: {noOfStates, name, countrycode} and perform the following:
//1. Add 5 elements to it
//2. Display all the elements in the list using foreach method.
//3. Sort the elements by noOf States (use Comparable).
//4. Sort the elements by noOf States in decending order.