import java.util.LinkedList;
import java.util.Queue;

public class EvensFirst {
	/**
	 * Returns a Queue where the even numbers all appear at the beginning of the list while
	 * still maintaining order of the original elements within the categories.
	 * @param nums	The Queue indicating the numbers to sort
	 * @return		The sorted Queue where all even numbers appear at the beginning of the Queue
	 */
	Queue<Integer> putEvensFirst(Queue<Integer> nums) {
		Queue<Integer> evens = new LinkedList<Integer>();
		Queue<Integer> odds = new LinkedList<Integer>();
		while(!nums.isEmpty()) {
			Integer curr = nums.poll();
			boolean temp = curr%2 == 0 ? evens.add(curr) : odds.add(curr);
		}
		evens.addAll(odds);
		return evens;
	}
}
