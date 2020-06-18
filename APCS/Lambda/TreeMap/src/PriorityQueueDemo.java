import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<String> list = new PriorityQueue<String>();
		list.offer("Hello");
		list.offer("My");
		list.offer("Name");
		list.offer("is");
		list.offer("jUan");
		list.offer("whaT");
		list.offer("is");
		list.offer("yours?");
		System.out.println(list);
		while(list.size() > 0) {
			System.out.println(list.poll());
		}
	}
}
