import java.util.Iterator;
import java.util.PriorityQueue;
/** @author MatthewSheldon
 * 	A PriorityQueue is a First in First out (FIFO) data structure.
 * 	A PriorityQueue is very similar to a Queue, except it sorts the elements ONLY when it needs to do so.
 * 	AKA, when the added element is less than the first element.
 * 	For a deeper explanation of how this works, visit: https://stackoverflow.com/questions/25569625/sorting-priority-queue-in-java
 */
public class PriorityQueue101 {
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("C");
		queue.add("C++");
		queue.add("Java");
		queue.add("Python");
		
		// what does the top value contain?
		System.out.println("Top value = " + queue.peek());
		
		// Using an Iterator to print out the Queue
		System.out.println("\nAll elements: ");
		Iterator<String> iterator = queue.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//Using a toString to print out the queue
		System.out.println("\ntoString: " + queue.toString());
		
		// How is the queue effected after polling an element? 
		queue.poll();
		System.out.println("\ntoString: " + queue.toString());
		
		//PriorityQueue can search for an element and remove that element (without using an index)
		queue.remove("Java");
		System.out.println("\ntoString: " + queue.toString());
		
		//Priority Queue can check for an object specifically as well
		System.out.println("\nHas \"C\": " + queue.contains("C"));
	}
}
