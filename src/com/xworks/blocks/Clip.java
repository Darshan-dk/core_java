package com.xworks.blocks;

public class Clip {
	String material;
	int price;
	{
		material="plastic";
		price=10;
	}
	
	Clip (String inmaterial, int inprice){
		System.out.println("material :"+ material+" price :"+price);

		
		material=inmaterial;
		price=inprice;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
