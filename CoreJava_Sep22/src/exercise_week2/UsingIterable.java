package exercise_week2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

public class UsingIterable implements Iterable<String> {

	private LinkedList<String> urls = new LinkedList<String>();

	// inner class
	private class UrlIterator implements Iterator<String> {

		private int index = 0;

		@Override
		public boolean hasNext() {
			return index < urls.size();
		}

		@Override
		public String next() {
			StringBuilder sb = new StringBuilder();
			try {
				URL url = new URL(urls.get(index));
				BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
				String line = null;
				
				while ((line = br.readLine()) != null) {
					sb.append(line);
					sb.append("\n");
				}
				br.close();
				
			} catch (Exception e) {

				e.printStackTrace();
			}
			index++;
			return sb.toString();
		}

//		@Override
		public void remove() {
			urls.remove(index);

		}

	}

	public UsingIterable() {
		urls.add("https://collabera.com/talent-solutions/");
		urls.add("https://www.guru99.com/er-diagram-tutorial-dbms.html");
		urls.add("https://www.sqlservertutorial.net/");
		urls.add("https://www.cnn.com/world");
	}

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return new UrlIterator();
	}

//	
//	@Override
//	public Iterator<String> iterator() {
//		return urls.iterator();
//	}

}
