import java.util.LinkedList;
import java.util.Queue;

public class SieveOfEratos {
	/**
	 * Creates a Queue of prime integers less than the passed number, n.
	 * @param n	The number indicating the number to stop creating prime numbers at
	 * @return	A Queue of integers containing all prime numbers up until n.
	 */
	public Queue<Integer> getPrimeNumbers(int n) {
		if(n < 2) {
			throw new IllegalArgumentException();
		}
		Queue<Integer> original = new LinkedList<Integer>();
		// Fill a queue with the consecutive integers 2 through n inclusive
		for(int i = 2; i <= n; i++) {
			original.add(i);
		}
		Queue<Integer> primes = new LinkedList<Integer>();
		while(!original.isEmpty()) {
			// Add the first value in the queue (P, the next prime) to the queue of primes
			int P = original.remove();
			primes.add(P);
			// Iterate through the queue, eliminating numbers divisible by the P that 
			// can't be primes while leaving numbers not divisible by P
			Queue<Integer> temp = new LinkedList<Integer>();
			while(!original.isEmpty()) {
				Integer curr = original.poll();
				boolean trash = curr%P == 0 ? false : temp.add(curr);
			}
			original = temp;
		}
		return primes;
	}
}
