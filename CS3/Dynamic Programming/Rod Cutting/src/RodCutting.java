import java.io.IOException;
import java.util.Scanner;

public class RodCutting {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int[] prices = new int[length+1];
		for(int i = 0; i < length+1; i++) {
			prices[i] = scan.nextInt();
		}
		int[] dp = new int[length+1];
		dp(prices, dp, 1);
		System.out.println("Max value for rod of length " + length + " -> " + dp[length]);
	}
	/**
	 * Calculates the largest profit able to be made by cutting
	 * rods at a certain length where an index of prices is representative
	 * of the length cut at, and the value is representative of the price of
	 * cutting at index and the index of dp is representative of the length
	 * of a given rod, and the value is representative of the maximum
	 * profit able to be made for that length. 
	 * @param prices	The price of a certain length of rod
	 * @param dp		The maximum profit of a given length of rod
	 * @param index		The current length being explored
	 */
	public static void dp(int[] prices, int[] dp, int index) {
		if(index == dp.length) {
			return;
		}
		else if(index == 1) {
			dp[index] = prices[index];
			dp(prices, dp, index+1);
		}
		else {
			int max = Integer.MIN_VALUE;
			for(int i = 1; i <= index; i++) {
				max = Math.max(max, prices[i] + dp[index-i]);
			}
			dp[index] = max;
			dp(prices, dp, index+1);
		}
	}
}
