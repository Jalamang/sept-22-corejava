package exercise_week2;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class SampleSet {

	public static void main(String[] args) {
		
		Set<String> list =  new HashSet<String>();
		list.add("Hen");
		list.add("Goat");
		list.add("Snake");
		
		Set<String> list2 =  new HashSet<String>();
		list2.add("Hen");
		list2.add("Cat");
		list2.add("Snake");
		list2.add("Hyena");
		
		
		Set<String> commonElements =  new HashSet<String>();
		
	for (String string : list2) {
		commonElements.add(string);
		
	}
	//looks for common elements
//	commonElements.retainAll(list);
	
	//looks for difference of elements in commonElements not in list
	commonElements.removeAll(list);
	
		System.out.println(commonElements);	
		
		
		Person p1 = new Person(0, "Bob");
		Person p2 = new Person(1, "Sue");
		Person p3 = new Person(2, "Mike");
		Person p4 = new Person(1, "Sue");
		
	
		
		Map<Person, Integer> map = new LinkedHashMap<Person, Integer>();
		
		map.put(p1, 1);
		map.put(p2, 2);
		map.put(p3, 3);
		map.put(p4, 1);
		
		for (Person key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
		
		
		Set<Person> set = new LinkedHashSet<Person>();
		
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		
System.out.println(set);
	}

}
class Person {
	private String name;
	private int id;
	
	Person(int id, String name){
		this.id = id;
		this.name = name;
		 
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	public String toString() {
		return id + " : " + name;
	}
}
