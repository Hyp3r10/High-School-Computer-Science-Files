import java.util.LinkedList;
import java.util.Queue;

public class Queues102 {
	public static void main(String[] args) {
		Queue<String> names = new LinkedList<String>();
		
		names.add("David");
		names.add("Nick");
		System.out.println(names.add("Raymond"));
		System.out.println(names.add("Nhat-The"));
		System.out.println(names.add("Ari!!!"));
		
		System.out.println("\nNumber of elements: " + names.size());
		
		// Cant use a normal for loop because there is no get method 
		System.out.println("Printing queue with loop"); 
		for(String name : names) {
			System.out.println(name);
		}
		System.out.println();
		
		///////////////////////////////////////////////////////
		
		System.out.println("The element at the front of the queue is: " + names.peek());
		
		// isEmpty returns true if there is noting in the queue
		System.out.println("-* Dequeuing until (!isEmpty()) *-\n");
		while(!names.isEmpty()) {
			System.out.println("Removing " + names.remove() + " from head of the empty queue.\nEmpty Queue: " + names.isEmpty() + "\n");
		}
		
		//Empty Queue
		System.out.println("\n" + names + "\n");
		System.out.println(names.peek());
		
		// remove() throws an exception if the queue is empty.
		//System.out.println(names.remove());
	}
}
