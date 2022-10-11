package exercise_week2;

public class IterableDriver {

	public static void main(String[] args) {
		
		UsingIterable urlLibrary = new UsingIterable();
//		

		
		for (String html : urlLibrary) {
//			System.out.println(html.length());
			System.out.println(html);
		}
	}

}
