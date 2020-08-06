package com.corejava.objectclassmethod;

public class ObjecClassMethod {

	public static void main(String[] args) {
		ObjecClassMethod inst1 = new ObjecClassMethod();
		ObjecClassMethod inst2 = new ObjecClassMethod();
		ObjecClassMethod inst3 = inst1;

		boolean eqality = inst1.equals(inst2);
		System.out.println(eqality);

		boolean eqality1 = inst1.equals(inst3);
		System.out.println(eqality1);

		int hashcodeofinst = inst1.hashCode();
		System.out.println(hashcodeofinst);

		int hashcodeofinst1 = inst2.hashCode();
		System.out.println(hashcodeofinst1);

		int hashcodeofinst3 = inst3.hashCode();
		System.out.println(hashcodeofinst3);

	}

}
