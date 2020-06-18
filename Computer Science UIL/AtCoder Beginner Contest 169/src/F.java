import java.util.Scanner;

public class F {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long N = scan.nextInt();
		long S = scan.nextInt();
		scan.nextLine();
		long[] T = new long[(int) N];
		long[] A = new long[(int) N];
		
		String[] line = scan.nextLine().split(" ");
		int index = 0; 
		for(String temp : line) {
			A[index] = Long.parseLong(temp);
			T[index] = index;
			index++;
		}
		
		long fT = 0;
		for(int i = 0; i < T.length; i++) {
			fT += knapsack(S, 0, A, i);
		}
		System.out.println(fT % 998244353);
		
	}
	public static long knapsack(long S, int currentWeight, long[] weightArr, int index) {
		long iterationWeight = 0;
		currentWeight += weightArr[index];
		if(currentWeight == S) {
			return 1;
		}
		else {
			 index++;
			 for(int i = index; i < weightArr.length; i++) {
				 iterationWeight += knapsack(S, currentWeight, weightArr, i);
				 
			 }
		}
		return iterationWeight;
	}
}
