package com.xworkz.encapsulation;

public class College {
	private String IDno;
	private int markper=89;
	
	public College( String IDno) {
		IDno = IDno;
	}
	
	public void display (String IDno) {
		System.out.println("your id no id "+IDno+" your mark is "+markper+"%");
	}
	public void mark(int markper) {
		
	}

}
