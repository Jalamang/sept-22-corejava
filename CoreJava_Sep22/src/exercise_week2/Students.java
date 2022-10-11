package exercise_week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Students {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < 100; i++) {
			list.add(i);
		}
//		
		
	System.out.print(list.stream().count());
//		list.parallelStream().forEach(System.out::println);
//		list.forEach(System.out::println);
	
	
	
	 // e.g. 1 -- Make a list from the Array
	List<Integer> numbers= Arrays.asList(2,4,6,6,2,4,12);
	// .reduce() will aggregate inputs (the stream) into a single output
	// which is the sum.  Also can work with Strings
	int sum = numbers.stream()
	                 .reduce(0, (num1, num2) -> num1 + num2);
	// e.g. 2 -- filter through all numbers in a range
	// and STORE into a Collection (using Collectors class)
	List<Integer> numbersRanged = numbers.stream()
	                          .filter( n -> ( n >= 0 && n < 11))
	.collect(Collectors.toList()); // Above will filter numbers to be between 0 and 12
	
	System.out.println(numbersRanged);
	}
		

}
