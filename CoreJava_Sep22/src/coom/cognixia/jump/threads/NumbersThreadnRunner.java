package coom.cognixia.jump.threads;

// runner to test NumbersRun class
public class NumbersThreadnRunner {

	public static void main(String[] args) {

		// get the id for the main thread
		System.out.println("Main Thread ID: " + Thread.currentThread().getId());

//		int size = 3;
//		Thread[] threads = new Thread[size];
//		// use a loop to create and start multiple threads
//		for (int i = 0; i < size; i++) {
//			threads[i] = new NumThread();
//			threads[i].start(); // must create a Thread and pass in the object that
//		}											// implements Runnable to start the thread

//		Thread thread1 = new Thread( new NumbersRun());
//		Thread thread2 = new Thread( new NumbersRun());
		Thread thread = new Thread( new NumbersRun());
		thread.start();
//		thread1.start();
//		thread2.start();
		
		// Note: Your system determines the IDs for the threads, which is why
				// are not 2, 3, and 4, even if the main thread is 1.
	}

}
