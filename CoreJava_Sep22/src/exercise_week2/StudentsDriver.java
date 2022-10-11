package exercise_week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StudentsDriver {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		int[] arr = {3, 7};
		System.out.println(Arrays.toString(swapVariables(arr)));
		
		palindrome("Peep");
		palindrome("hello");
		
		int indx = 0;
		
		Scanner sc;
		Scanner stud;
		Scanner addStud;
		
		
		List<String> students = new ArrayList<String>();
		students.add("John");
		students.add("Alhagie");
		students.add("Muhammed");
		students.add("Lary");

		System.out.println("\n********** Check for a student at an index **********");
		
		try {
			sc = new Scanner(System.in);
			System.out.println("Please enter and index -integer to retrieve a student from that index : ");
			indx = sc.nextInt();

			System.out.println("The student at that index is " + students.get(indx));

		} catch (IndexOutOfBoundsException e) {
			System.out.println("Index " + indx + " out of bounds for length " + students.size());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("\n********** Look for student by name **********");
		
		try {
			stud = new Scanner(System.in);
			System.out.println("Please type to look for a student by name : ");
			String search = stud.nextLine();
			boolean found = false;

			for (String string : students) {
				if (string.equalsIgnoreCase(search)) {
					found = true;
					System.out.println(found + "," + string + " is among the list ");
				}

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		
		System.out.println("\n********** Add a student **********");
		try {
			addStud = new Scanner(System.in);
			System.out.println("Please type to add a student to the list : ");
			students.add(addStud.nextLine());
			
			System.out.println(students);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		//revisit
//		 sc.close();;
//		 stud.close();;
//		 addStud.close();
	}
	
//	static void swapVariables(int x, int y) {
////		x = 3 y = 7
//		System.out.println("x  = " + x + ", y =  " + y);
//		
//		
//		x = x + y; // summing x and y; x = 10, y = 7
//		y = x - y; // x = 10,  y = 3
//		x = x - y; // x = 7, y = 3
//		
//		System.out.println("x is now = " + x + " and y is now =  " + y);
//	}
	
	static int[] swapVariables(int[] arr) {
		System.out.println("********** Swapping a value of variables **********\n");
//		x = 3 y = 7
//		System.out.println("x  = " + arr + ", y =  ");
		
		//adding 
		arr[0] = arr[0] + arr[1] ; // summing x and y; x = 10, y = 7
		arr[1] = arr[0] - arr[1]; // x = 10,  y = 3
		arr[0] = arr[0] - arr[1]; // x = 7, y = 3
		
		System.out.println("ar[0] is now = " + arr[0] + " and arr[1] is now =  " + arr[1]);
	return arr;
	}
	
	

	static void palindrome(String string) {
		System.out.println("\n********** Palindrome **********");
		 String reversedString = "";
		 
		for (int i = string.length() - 1; i >= 0; i--) {
				reversedString += string.charAt(i);
			 
		}
		
		//Checks if the string is the same as after reversing
		if(reversedString.equalsIgnoreCase(string)) {
			 System.out.println(string + " is a palindrome");
		} else {
			 System.out.println(string + " is not a palindrome");
		}

	}

}
//1. Write a program that stores a list of strings, and the Strings are Student names.  Make a list of at least 5 names.
//- the class list is already generated by an admin (you make the list).
//- have a user menu to input a index of a student, and check to see what the student name is, at that index.
//- have exception handling in place, for the case that the index is out of bounds.
//- Bonus: be able to look up a student (a String) in the list by name.
//- Bonus: be able to take user input to add a student to the already existing list.
//2. Write a program that has two numbers, x and y.  Be able to assign values to x and y, and then swap their values so that x is now y, and y is now x.  Do this without using a third, temporary variable. HINT - this is purely math.
//3. Palindrome - word if reversed still has the same spelling as it would be forward, ie. "wow".  Write a method that takes in a String, and returns true or false if that input String is a palindrome.  Make it so case sensitivity does NOT matter.