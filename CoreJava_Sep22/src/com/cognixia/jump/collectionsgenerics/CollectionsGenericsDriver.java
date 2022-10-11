package com.cognixia.jump.collectionsgenerics;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class CollectionsGenericsDriver {

	public static void main(String[] args) {

		// Showcasing Generics Method and VarArgs from Calculator
//		System.out.println(Calculator.sum(5, 2));
//		System.out.println(Calculator.sum(5.5, 2.7));
//		System.out.println(Calculator.sum(5, 2.7));
//		System.out.println(Calculator.sum(5, 2.7f, 6l, 9.9d));

		// For all collections,
		// CRUD
		// Create Data
		// Read Data
		// Update Data
		// Delete Data
		// *looping through the collection

		// List
		List<String> colors = new ArrayList<>();
//		
		colors.add("red");
		colors.add("blue");
//
		colors.add(0, "yellow");
		System.out.println(colors);
//		
		// Read element at index position 2
		System.out.println(colors.get(2));

		// using create and remove (delete) to update

		// will throw an exception - Index 8 out of bounds for length 3
		colors.remove(2);

//		System.out.println(colors.get(2));

		// using create and remove (delete) to update
		colors.add(2, "orange");
		System.out.println(colors.get(2));
		System.out.println(colors);

		// ArrayList vs LinkedList

		// Set

		Set<Integer> ints = new HashSet<>();
		Set<String> setColors = new HashSet<>(colors);

		setColors.add("Maroon");

		System.out.println(setColors);

		String search = "Maroone";
		boolean found = false;

		for (String string : setColors) {
			if (string.equalsIgnoreCase(search)) {
				found = true;
				System.out.println(found);
			}

		}

		Iterator<String> iterator = setColors.iterator();

		while (iterator.hasNext()) {

			System.out.println(iterator.next());

		}

		setColors.remove("Maroon");

		System.out.println(setColors);

		// Queue
		// Polymorphism with Interfaces

		List<String> listColors = new LinkedList<>(setColors);
		LinkedList<String> llColors = new LinkedList<String>(listColors);
		Queue<String> qColors = new LinkedList<>(llColors);
		Deque<String> dqColors = new LinkedList<>(llColors);

		System.out.println("\nLinked List prints:");
		System.out.println(listColors.get(1));
		System.out.println(llColors.getLast());
//		
		System.out.println(qColors.poll());
		System.out.println(qColors.poll());

		qColors.add("purple");
		dqColors.add("purple");
		System.out.println(dqColors.contains("purple"));
		System.out.println(qColors);

		// poll retrieve and remove the front value of the queue (polllast is back)
		// peek just want to view the data in front, but not remove

		qColors.add("Purple");
		System.out.println(qColors);

		// Map
		// Part of the collection framework but not stemming from the collection
		// interface
//HashMap doesn't maintain order
		Map<String, Double> coins = new HashMap<>();
		coins.put("Quarter", 0.25);
		coins.put("Dime", 0.10);
		coins.put("Nickle", 0.05);
		coins.put("Penny", 0.01);

		System.out.println(coins);
		System.out.println(coins.get("Dime"));

		// checks if a key is present
		System.out.print(coins.containsKey("Dimef"));

		// cannot loop thru a map directly
		// looping through the set of keys (not the map) and showing values
//		System.out.println(coins.get(key));
		for (String key : coins.keySet()) {

			// returns keys
			System.out.println(key);
			// returns values
			System.out.println(coins.get(key));
		}
		
		for (Map.Entry<String, Double> entry : coins.entrySet()) {
			String key = entry.getKey();
			Double val = entry.getValue();
			System.out.println(key + " Map ");
			System.out.println(val + " Map ");
		}

	}

}
