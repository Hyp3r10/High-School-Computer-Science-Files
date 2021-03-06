import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues101 {
	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<Integer>();
		q.offer(2);
		q.offer(3);
		q.offer(6);
		q.offer(1);
		q.offer(8);
		q.offer(4);
		q.offer(5);
		q.offer(9);
		System.out.println("Head: " + q.peek());
		
		// Not PQ order
		System.out.println(q);
		
		// Not PQ order
		for(Integer temp : q) {
			System.out.print(temp + " ");
		}
		System.out.println(); 
		
		// PQ order
		while(!q.isEmpty()) {
			System.out.print(q.poll() + " ");
		}
	} 
}
