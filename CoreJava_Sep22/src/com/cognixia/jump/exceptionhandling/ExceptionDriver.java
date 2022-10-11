package com.cognixia.jump.exceptionhandling;

import java.util.Scanner;

public class ExceptionDriver {
	//This class serves to run example of try/catch, finally, try w/resource, propagation

	public static void main(String[] args) throws Exception {
		
		Scanner input = new Scanner(System.in);
		int inNum = 0;
	//try
		try {
			System.out.println("Input an integer ");
			 inNum = input.nextInt();
			 
			 int ans = 10/inNum;
			 System.out.println(ans);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
System.out.println("Your input was " + inNum);
	}

}
