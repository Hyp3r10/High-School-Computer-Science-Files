import java.util.PriorityQueue;

public class PriorityQueue102 {
	public static void main(String[] args) {
		PriorityQueue<Student> pq = new PriorityQueue<Student>();
		Student michael = new Student(10011, "Michael", 11, 3.5);
		Student ari = new Student(10042, "Ari", 9, 3.5);
		Student nick = new Student(100069, "Nick", 10, 3.5);
		pq.offer(michael);
		pq.offer(ari);
		pq.offer(nick);
		System.out.println(pq);
		
		int count = 1;
		while(!pq.isEmpty()) {
			System.out.println("\nDequeue: " + count++ + " --> " + pq.poll());
		}
	}
}
