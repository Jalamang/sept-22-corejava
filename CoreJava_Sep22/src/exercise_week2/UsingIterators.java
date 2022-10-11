package exercise_week2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UsingIterators {

	public static void main(String[] args) {
	List<String> animals = new LinkedList<String>();
	
	animals.add("fox");
	animals.add("cat");
	animals.add("dog");
	animals.add("rabbit");
	
	Iterator<String> it = animals.iterator();
	
	while(it.hasNext()) {
		String value = it.next();
		if(value == "cat") {
			//you can use iterator/ListIterator while iterating to add or remove 
			it.remove();
		}
//		 System.out.println(value);
	}
	
	
	for (String string : animals) {
		 System.out.println(string);
		 
		 //you cannot use forEach while iterating to add or remove 
//		 it.remove();
	}
	
	
	
	
	}

}
