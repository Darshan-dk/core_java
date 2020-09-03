package com.java.collection.arraylist;

import java.util.Comparator;

public class SortByName implements Comparator<Tree> {

	@Override
	public int compare(Tree o1, Tree o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
