import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeSet;

public class A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long numTimes = scan.nextLong();
		for(long i = 0; i < numTimes; i++) {
			long a = scan.nextLong(); long b = scan.nextLong();

			Queue<Number> queue = new LinkedList<>();
			TreeSet<Number> numbers = new TreeSet<Number>();
			queue.offer(new Number(a, b, 0));
			numbers.add(new Number(a, b, 0));
			boolean found = false;
			long numMoves = Long.MAX_VALUE;

			while(queue.size() != 0) {

				Number curr = queue.poll();
				long currA = curr.current;
				long currMoves = curr.numMoves;

				if(currA == b) {
					found = true;
					if(currMoves < numMoves) {
						numMoves = currMoves;
					}
				}

				if(currA > 0) {
					Number mult2 = new Number(currA * 2, b, currMoves+1);
					Number mult4 = new Number(currA * 4, b, currMoves+1);
					Number mult8 = new Number(currA * 8, b, currMoves+1);
					Number div2 = new Number(currA / 2, b, currMoves+1);
					Number div4 = new Number(currA / 4, b, currMoves+1);
					Number div8 = new Number(currA / 8, b, currMoves+1);
					if(!numbers.contains(mult2) && mult2.current < Long.MAX_VALUE) {
						queue.add(mult2);
						numbers.add(mult2);
					}
					if(!numbers.contains(mult4) && mult4.current < Long.MAX_VALUE) {
						queue.add(mult4);
						numbers.add(mult4);
					}
					if(!numbers.contains(mult8) && mult8.current < Long.MAX_VALUE) {
						queue.add(mult8);
						numbers.add(mult8);
					}
					if(currA % 2 == 0 && div2.current < Long.MAX_VALUE) {
						if(!numbers.contains(div2)) {
							queue.add(div2);
							numbers.add(div2);
						}
					}
					if(currA % 4 == 0 && div4.current < Long.MAX_VALUE) {
						if(!numbers.contains(div4)) {
							queue.add(div4);
							numbers.add(div4);
						}
					}
					if(currA % 8 == 0 && div8.current < Long.MAX_VALUE) {
						if(!numbers.contains(div8)) {
							queue.add(div8);
							numbers.add(div8);
						}
					}
				}
			}

			if(found) {
				System.out.println(numMoves);
			}
			else {
				System.out.println(-1);
			} 
		}
	}
}
class Number implements Comparable<Number>{
	public long current;
	public long goal;
	public long numMoves;

	public Number(long current, long goal, long numMoves) {
		this.current = current;
		this.goal = goal;
		this.numMoves = numMoves;
	}
	public int compareTo(Number o) {
		return Long.compare(this.current, o.current);
	}
}