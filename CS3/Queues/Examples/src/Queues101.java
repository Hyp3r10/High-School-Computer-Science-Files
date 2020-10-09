import java.util.LinkedList;
import java.util.Queue;

public class Queues101 {
	public static void main(String[] args) {
		// A Queue is an interface
		// Linked list implements the Queue interface (i.e. A qeueue reference to a linked list) 
		Queue<Integer> queue = new LinkedList<Integer>();
		
		// Elements are added at the tail (back)of the queue 
		// To add an element is to "enqueue" it
		queue.add(42);
		queue.add(23);
		queue.add(90);
		queue.add(13);
		queue.add(21);
		
		System.out.println(queue);
		
		// Removing elements in a First In First Out (FIFO) order. 
		// remove() returns the element that was removed which is to dequeue
		queue.remove();
		
		System.out.println(queue);
		
		queue.remove();
		queue.remove();
		
		System.out.println(queue);
		
	}
}
