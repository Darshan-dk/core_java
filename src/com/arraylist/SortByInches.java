package com.arraylist;

import java.util.Comparator;

public class SortByInches implements Comparator<Television> {

	@Override
	public int compare(Television o1, Television o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getInches()-(o2.getInches()));

	}
}