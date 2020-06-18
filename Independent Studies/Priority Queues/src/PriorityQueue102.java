import java.util.Comparator;
import java.util.PriorityQueue;
/** @author MatthewSheldon
 * PriorityQueues have an Overloaded constructor. One in which you can implement your own sorting algorithm
 * 	The default constructor uses a sorting algorithm based off of its ASCII values (AKA a dictionary)
 */
public class PriorityQueue102 {
	public static void main(String[] args) {
		Comparator<String> comparator1 = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		};
		
		
		PriorityQueue<String> queue = new PriorityQueue<String>(comparator1);
		queue.add("Lisa");
		queue.add("Robert");
		queue.add("John");
		queue.add("Chris");
		queue.add("Angelina");
		queue.add("Joe");
		
		while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
	}
}
