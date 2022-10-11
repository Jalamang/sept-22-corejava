package coom.cognixia.jump.threads;

// class just to hold some sort of operation to do in thread
public class Numbers {
	
	
	//2 daemon threads scheduler and Garbage collector Plus the main main method
	// takes in a number max and prints from zero up until the max number
	// also tells which thread is printing
	static public void print(int max) {
		
		for (int i = 0; i < max; i++) {
			System.out.println("Thread " + Thread.currentThread().getId()
					+ ": " + i);
			
		}
		
	}

}
