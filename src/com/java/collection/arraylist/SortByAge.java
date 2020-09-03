package com.java.collection.arraylist;

import java.util.Comparator;

public class SortByAge implements Comparator<Tree> {

	@Override
	public int compare(Tree o1, Tree o2) {

		return o1.getAge() - o2.getAge();
	}

}
