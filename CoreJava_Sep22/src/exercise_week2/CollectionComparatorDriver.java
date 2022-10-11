package exercise_week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
//		int len1 = s1.length();
//		int len2 = s2.length();
//		if(len1 < len2) return 1;
//		if(len1 > len2) return -1;
//		return 0;
		//this defines natural order
		
		return -s1.compareTo(s2);
	}
	
}

class Perso {
	private int id ;
	public int getId() {
		return id;
	}
	public Perso(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name ;
	
	public String  toString() {
		return id + " : " + name ;
		
	}
}


public class CollectionComparatorDriver {

	public static void main(String[] args) {
		List<String> coins = new ArrayList<String>();
		coins.add("Quarter");
		coins.add("Dime");
		coins.add("Nickle");
		coins.add("Penny");
//Sorting strings 
//		Collections.sort(coins, new StringLengthComparator());
		
		//Alternatively, I can do this using unanimous object Comparator
		Collections.sort(coins, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// - reverses the logic
				return -o1.compareTo(o2);
			}
	
		});
		System.out.println(coins);
		
////// Sorting abitrary objects ////
		
		List <Perso> ppl = new ArrayList<Perso>();
		ppl.add(new Perso(1, "Joe"));
		ppl.add(new Perso(3, "Bob"));
		ppl.add(new Perso(4, "Clare"));
		ppl.add(new Perso(2 ,"Sue"));
		
		System.out.println(ppl);
		
		//this won't work
//		Collections.sort(ppl); instead you do below
		Collections.sort(ppl, new Comparator<Perso>() {

			@Override
			public int compare(Perso o1, Perso o2) {
//				if(o1.getId() > o2.getId()) {
//					return 1;
//				}
//				
//				if(o1.getId() < o2.getId()) {
//					return -1;
//				}
//				return 0;
				return -o1.getName().compareTo(o2.getName());
			}
			
		});
		for (Perso person : ppl) {
			System.out.println(person);
		}
		
	}

}
