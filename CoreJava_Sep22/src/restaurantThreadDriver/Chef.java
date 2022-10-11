package restaurantThreadDriver;

public class Chef implements Runnable {

	private Orders orders;

	public Chef(Orders orders) {
		this.orders = orders;
	}

	@Override
	public void run() {

		// ADD CODE HERE

		String name = Thread.currentThread().getName();

		synchronized (orders) {
			System.out.println(name + " waiting for an order to prepare");
			try {
				Thread.sleep(3000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			orders.notifyAll();
			
			if (orders.getMenuItems().isEmpty()) {
			System.out.println("No orders to take, " + Thread.currentThread().getName() + " can rest");
		}
		}

		

//		String completedOrder = " ";
//
//		synchronized (orders) {
//			if (orders.nextOrder() != null) {
//				completedOrder = orders.nextOrder();
//				System.out.println(name + " received order for " + completedOrder);
//			}
//			try {
//
//				Thread.sleep(3000);
//
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//
//			orders.notify();
//		}
		System.out.println(Thread.currentThread().getName() + " completed order for " +  orders.nextOrder());
	}

}
