import java.util.ArrayList;
import java.util.Scanner;

public class OddDivisors {
	public static long values[];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int T = scan.nextInt();
		ArrayList<Number> numbers = new ArrayList<Number>();
		long bigestN = 0L;
		for(int i = 0; i < T; i++) {
			long N = scan.nextLong();
			long M = scan.nextLong();
			numbers.add(new Number(N, M));
			if(N >= bigestN) {
				bigestN = N;
			}
		}
		values = new long[(int) bigestN];
		getSum(bigestN);
		for(Number curr : numbers) {
			System.out.println(values[(int) (curr.N-1)] % curr.M);
		}
	}
	public static long getSum(long N) {
		long result = 0;
		for(long i = 1; i <= N; i++) {
			long curr = getGreatestOdd(i);
			result += curr;
		}
		return result;
	}
	public static long getGreatestOdd(long index) {
		long greatestOdd;
		if(index % 2 == 1) {
			greatestOdd = (index);
			
		}
		else {
			/*long mult = 1L;
			Long[] primeFactors = getPrimeFactors(index);
			for(int i = 0; i < primeFactors.length; i++) {
				if(primeFactors[i] % 2 == 1) {
					mult *= primeFactors[i];
				}
			}*/
			
			greatestOdd = values[(int) ((index-1)/2)];
		}
		values[(int) (index-1)] = greatestOdd; 
		return greatestOdd;
	}
	/*public static Long[] getPrimeFactors(long number) {
		ArrayList<Long> factors = new ArrayList<Long>();
		for(long i = 2; i < number; i++) {
			while(number%i == 0) {
				factors.add(i);
				number = number/i;
			}
		}
		factors.add(number);
		return factors.toArray(new Long[factors.size()]);
	}*/
 }
class Number {
	public long N;
	public long M;
	public Number(long N, long M) {
		this.N = N;
		this.M = M;
	}
}
