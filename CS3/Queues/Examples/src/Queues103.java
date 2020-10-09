import java.util.LinkedList;
import java.util.Queue;

public class Queues103 {
	public static void main(String[] args) {
		Queue<String> names = new LinkedList<String>();

		names.offer("David");
		names.offer("Nick");
		System.out.println(names.offer("Raymond"));
		System.out.println(names.offer("Nhat-The"));
		System.out.println(names.offer("Ari!!!"));

		System.out.println("\n" + names);
		names.poll();
		System.out.println("\n" + names);

		System.out.println(names.element());
		System.out.println("\n" + names);

		// isEmpty returns true if there is noting in the queue
		System.out.println("-* Dequeuing until (!isEmpty()) *-\n");
		while(!names.isEmpty()) {
			System.out.println("Removing " + names.poll() + " from head of the empty queue.\nEmpty Queue: " + names.isEmpty() + "\n");
		}
		System.out.println(names.poll());
		System.out.println(names.element());
	}
}
