package com.xworks.stringBuffer;

public class AlpaTest  {

	public static void main(String[] args) {
		 CheckForAlpha check = (a) -> {
			  
			        return ( a != null && a.matches("^[a-zA-Z]*$")); 

};

System.out.println( check.Check("hello"));

	}}
