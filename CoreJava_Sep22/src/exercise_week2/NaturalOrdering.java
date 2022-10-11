package exercise_week2;

import java.util.ArrayList;
import java.util.Collection;

import java.util.List;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

class Persona implements Comparable<Persona>{
	private String name;

	public Persona(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "person name = " + name ;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Persona person) {

//		return -name.compareTo(person.name);
		
		//compare by string length
		
		int len1 = name.length();
		int len2 = person.name.length();
		
		if(len1 > len2) {
			return 1;
		}

		else if(len1 < len2) {
			return -1;
		} else {
			return name.compareTo(person.name);
		}
		
		
	}
}
public class NaturalOrdering {

	public static void main(String[] args) {
List<Persona> list = new ArrayList<Persona>();
SortedSet<Persona> set = new TreeSet<Persona>();	


addElements(list);
addElements(set);
//Collections.sort(list, new Comparator);


showElements(list);
System.out.println();
showElements(set);

	}
	private static void addElements(Collection<Persona> col) {
		col.add(new Persona("Joe"));
		col.add(new Persona("Sue"));
		col.add(new Persona("Mike"));
		col.add(new Persona("Clark"));
		col.add(new Persona("Juliet"));
	}
	
	private static void showElements(Collection<Persona> col) {
		for (Persona string : col) {
			System.out.println(string);
		}
	}

}
