package exercise_week2;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueCollection {

	public static void main(String[] args) {
		
		Queue<Integer> q = new ArrayBlockingQueue<Integer>(4);
		
		q.add(10);
		q.add(20);
		q.add(30);
		try {
			q.add(40);
		} catch (IllegalStateException e) {
			System.out.println("out of bounds");
		}
		System.out.println("head of queue " + q.peek());
		//removes, when empty returns exception
		q.remove();
		q.remove();
		q.remove();
		q.remove();
		
		q.add(10);
		q.add(20);
		q.add(30);
		System.out.println(q);
		
		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(4);
		for (Integer integer : q) {
			q2.offer(integer);
			
		}
		System.out.println(q2);
		//removes, when empty returns null
		q2.poll();
		System.out.println(q2.peek());
		System.out.println(q2.element());
		
		
	}

}
