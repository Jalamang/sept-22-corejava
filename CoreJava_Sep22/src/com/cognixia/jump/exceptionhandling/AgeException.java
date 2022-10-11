package com.cognixia.jump.exceptionhandling;

public class AgeException extends Exception {

	private static final long serialVersionUID = 1L;
	private static final int minAge = 18;
	
	public static int getMinage() {
		return minAge;
	}

	public AgeException() {
		super("You're too young to vote!.");
	}

	

}
