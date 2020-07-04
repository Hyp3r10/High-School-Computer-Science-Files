import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		long N = scan.nextLong();
		long[] A = new long[(int) N];
		for(int i = 0; i < N; i++) {
			A[i] = scan.nextLong();
		}
		long output = bubbleSort(A);
		System.out.println(output);
	}
	public static long bubbleSort(long[] A) {
		long count = 0;
		long N = A.length;
		boolean swapped = true;
		while(swapped != false) {
			swapped = false;
			count = count + 1; 
			for(int i = 0; i < N-1; i++) {
				if(A[i] > A[i+1]) {
					long temp = A[i];
					A[i] = A[i+1];
					A[i+1] = temp;
					swapped = true;
				}
			}
		}
		return count;
	}
}
