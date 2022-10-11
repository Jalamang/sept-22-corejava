package exercise_week2;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ComplexDataStructure {

	public static String[] vehicles = { "Ambulance", "Helicopter", "Lifeboat" };
	public static String[][] drivers = { 
			{ "Fred", "Sue", "Pete" }, 
			{ "Sue", "Richard", "Bob", "Fred" },
			{ "Pete", "Mary", "Bob" },

	};

	public static void main(String[] args) {

		Map<String, Set<String>> personnel = new HashMap<>();
		
		
		for (int i = 0; i < vehicles.length; i++) {
			String vehicle = vehicles[i];
			String[] driversList = drivers[i];
			
			Set<String> driverSet = new LinkedHashSet<String>();
			
			for (String driver : driversList) {
				driverSet.add(driver);
//				System.out.println(driver);
			}
			
			personnel.put(vehicle, driverSet);
			
		}
		
		Set<String> driversList = personnel.get("Helicopter");
	
		for (String driver : driversList) {
			System.out.println(driver);
		}
		
		for (Entry<String, Set<String>> entry : personnel.entrySet()) {
			String key = entry.getKey();
			Set<String> val = entry.getValue();
			for (String vl : val) {
				System.out.println(key + " : " + vl);	
			}
			
			
		}
		
	}

}
