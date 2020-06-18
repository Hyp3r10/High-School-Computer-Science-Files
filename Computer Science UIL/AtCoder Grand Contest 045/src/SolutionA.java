import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SolutionA {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numTimes = scan.nextInt();
		for(int i = 0; i < numTimes; i++) {
			int N = scan.nextInt();
			long[] A = new long[N];
			for(int index = 0; index < N; index++) {
				A[index] = scan.nextLong();
			}
			scan.nextLine();
			BigInteger X = BigInteger.ZERO;
			String[] S = scan.nextLine().split("");
			
			X = getSolution(S, A);
			
			if(!X.equals(BigInteger.ZERO)) {
				System.out.println(1);
			}
			else {
				System.out.println(0);
			}
		}
	}
	public static BigInteger getSolution(String[] S, long[] A) {
		BigInteger X = BigInteger.ONE;
		
		Queue<Number> queue = new LinkedList<Number>();
		boolean found = false;
		queue.add(new Number(BigInteger.ZERO, 0L));
		

		while(queue.size() != 0 || found) {

			Number curr = queue.poll();
			BigInteger currA = curr.current;
			long currMoves = curr.numMoves;

			
			if(currA.equals(BigInteger.ZERO) && currMoves == (S.length)) {
				found = true;
				X = BigInteger.ZERO;
				break;
			}
			if(currMoves+1 <= S.length) {
				BigInteger optionOne = currA.xor(BigInteger.valueOf(A[(int) (currMoves)]));
				if(S[(int) currMoves].equals("1")) {
					if(!currA.equals(BigInteger.ZERO)) {
						queue.add(new Number(currA, currMoves+1));
					}
					else {
						if(!optionOne.equals(BigInteger.ZERO)) {
							queue.add(new Number(optionOne, currMoves+1));
						}
					}
				}
				else {
					queue.add(new Number(currA, currMoves+1));
					queue.add(new Number(optionOne, currMoves+1));
				}
			}
		}
		
		return X;
	}
}
class Number {
		public BigInteger current;
		public long numMoves;

		public Number(BigInteger current, long numMoves) {
			this.current = current;
			this.numMoves = numMoves;
		}
	}
