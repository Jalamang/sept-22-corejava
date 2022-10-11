package coom.cognixia.jump.threads;

public class ElegantThreadRunning {

	public static void main(String[] args) {

		Thread th1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 7; i++) {
					System.out.println(i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		});

		th1.start();
	}

}
