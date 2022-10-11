package coom.cognixia.jump.threads;

public class SyncThreads extends Thread {

	private static int counter = 0;

	public static synchronized void increment() {
		counter++;
		System.out.println(" Thread " + Thread.currentThread().getId() + " : " + counter);
	}

	public static synchronized void incrementAndPrint() {
		counter++;
		System.out.println(" Thread " + Thread.currentThread().getId() + " : " + counter);
	}

	public static synchronized void staticBlockIncrement() {
		System.out.println("**************************************");
		synchronized (SyncThreads.class) {
			counter++;
			System.out.println(" Thread " + Thread.currentThread().getId() + " : " + counter);
		}

	}

	public void run() {
		for (int i = 0; i < 50; i++) {

			// increment
			increment();
			

//			//
//			incrementAndPrint();
//			System.out.println(" Thread " + Thread.currentThread().getId() + " : " + counter);

			//
//			staticBlockIncrement();
		}
	}

}
