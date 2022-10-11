package com.cognixia.jump.exceptionhandling;

import java.util.Scanner;

public class CustomExceptionDriver {
	static boolean isValid = false;
//look at it again 
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {

			do {
				Scanner input = new Scanner(System.in);
					System.out.println("Please enter you age : ");
					int UserInput = input.nextInt();
					
					int age = AgeException.getMinage();
					
						if(age > UserInput) {
							System.out.println("Please enter you age : ");
							 UserInput = input.nextInt();
							 isValid = true;
							throw new AgeException();
							
						} else {
							
							throw new Exception("You'r eligible to vote");
							
						}
					
		
		} while (isValid);


	}

}
