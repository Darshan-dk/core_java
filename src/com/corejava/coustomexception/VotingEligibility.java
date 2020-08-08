package com.corejava.coustomexception;

public class VotingEligibility {
	static void validate(int age) throws CustomExceptionName {
		if (age < 18)
			throw new CustomExceptionName("wrong input you cannot vote");
		else
			System.out.println("welcome to vote");
	}

	public static void main(String args[]) {
		try {
			validate(13);
		} catch (Exception e) {
			System.out.println("Exception occured: " + e);
		}

		System.out.println("rest of the code...");
	}

}
